package net.ddns.twicusstumble.futuretc.block;

import net.ddns.twicusstumble.futuretc.FutureTC;
import net.ddns.twicusstumble.futuretc.event.IBlockRegisterEvent;
import net.ddns.twicusstumble.futuretc.init.BlockInit;
import net.ddns.twicusstumble.futuretc.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;

import java.util.Random;

public abstract class BlockSlabBase extends BlockSlab implements IBlockRegisterEvent {
    protected String name;
    protected BlockSlabBase halfSlab;

    public static final PropertyEnum<Variant> VARIANT = PropertyEnum.<Variant>create("variant", Variant.class);

    public BlockSlabBase(String name, BlockSlabBase halfSlab, float hardness, float resistance, SoundType sound) {
        super(Material.ROCK);
        this.name = name;
        this.halfSlab = halfSlab;

        this.setTranslationKey(this.name);
        this.setRegistryName(FutureTC.MOD_ID, this.name);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setSoundType(sound);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.useNeighborBrightness = !this.isDouble();

        IBlockState state = this.blockState.getBaseState();

        if (!this.isDouble()) {
            state = state.withProperty(HALF, EnumBlockHalf.BOTTOM);
        }

        this.setDefaultState(state.withProperty(VARIANT, Variant.DEFAULT));

        BlockInit.BLOCKS.add(this);
    }

    @Override
    public String getTranslationKey(int meta) {
        return super.getTranslationKey();
    }

    @Override
    public IProperty<?> getVariantProperty() {
        return VARIANT;
    }

    @Override
    public Comparable<?> getTypeForItem(ItemStack stack) {
        return Variant.DEFAULT;
    }

    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
        return new ItemStack(halfSlab);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        IBlockState state = this.getDefaultState().withProperty(VARIANT, Variant.DEFAULT);

        if (!this.isDouble()) {
            state = state.withProperty(HALF, (meta & 8) == 0 ? EnumBlockHalf.BOTTOM : EnumBlockHalf.TOP);
        }

        return state;
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        int i = 0;

        if (!this.isDouble() && state.getValue(HALF) == EnumBlockHalf.TOP) {
            i |= 8;
        }

        return i;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(halfSlab);
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return this.isDouble() ? new BlockStateContainer(this, new IProperty[] {VARIANT}) : new BlockStateContainer(this, new IProperty[] {HALF, VARIANT});
    }

    public static class Double extends BlockSlabBase {
        public Double(String name, BlockSlabBase halfSlab, float hardness, float resistance, SoundType sound) {
            super(name, halfSlab, hardness, resistance, sound);
        }

        public boolean isDouble() {
            return true;
        }
    }

    public static class Half extends BlockSlabBase {
        public Half(String name, BlockSlabBase halfSlab, BlockSlabBase doubleSlab, float hardness, float resistance, SoundType sound) {
            super(name, halfSlab, hardness, resistance, sound);

            ItemInit.ITEM_BLOCKS.add(new ItemSlab(this, this, doubleSlab).setRegistryName(this.getRegistryName()));
        }

        public boolean isDouble() {
            return false;
        }
    }

    public static enum Variant implements IStringSerializable
    {
        DEFAULT;

        public String getName()
        {
            return "default";
        }
    }

    @Override
    public void registerBlock(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(this);
    }

    @Override
    public void registerModel(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(new ResourceLocation(FutureTC.MOD_ID, this.name), "inventory"));
    }
}