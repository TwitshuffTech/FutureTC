package net.ddns.twicusstumble.futuretc.block;

import net.ddns.twicusstumble.futuretc.FutureTC;
import net.ddns.twicusstumble.futuretc.event.IBlockRegisterEvent;
import net.ddns.twicusstumble.futuretc.init.BlockInit;
import net.ddns.twicusstumble.futuretc.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;

public class BlockStairBase extends BlockStairs implements IBlockRegisterEvent {
    private final String name;

    public BlockStairBase(String name, IBlockState modelState, float hardness, float resistance, SoundType sound) {
        super(modelState);

        this.name = name;
        this.setTranslationKey(this.name);
        this.setRegistryName(FutureTC.MOD_ID, this.name);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setSoundType(sound);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEM_BLOCKS.add((new ItemBlock(this)).setRegistryName(this.getRegistryName()));
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
