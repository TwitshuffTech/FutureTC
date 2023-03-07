package net.ddns.twicusstumble.futuretc.init;

import net.ddns.twicusstumble.futuretc.block.BlockSlabBase;
import net.ddns.twicusstumble.futuretc.block.BlockStairBase;
import net.ddns.twicusstumble.futuretc.event.IBlockRegisterEvent;
import net.minecraft.block.*;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<IBlockRegisterEvent> BLOCKS = new ArrayList<IBlockRegisterEvent>();

    public static final Block STONE_STAIRS = new BlockStairBase("stone_stairs", Blocks.STONE.getDefaultState(), 2.0F, 10.0F, SoundType.STONE);
    public static final Block GRANITE_STAIRS = new BlockStairBase("granite_stairs", Blocks.STONE.getStateFromMeta(1), 2.0F, 10.0F, SoundType.STONE);
    public static final Block POLISHED_GRANITE_STAIRS = new BlockStairBase("polished_granite_stairs", Blocks.STONE.getStateFromMeta(2), 2.0F, 10.0F, SoundType.STONE);
    public static final Block DIORITE_STAIRS = new BlockStairBase("diorite_stairs", Blocks.STONE.getStateFromMeta(3), 2.0F, 10.0F, SoundType.STONE);
    public static final Block POLISHED_DIORITE_STAIRS = new BlockStairBase("polished_diorite_stairs", Blocks.STONE.getStateFromMeta(4), 2.0F, 10.0F, SoundType.STONE);
    public static final Block ANDESITE_STAIRS = new BlockStairBase("andesite_stairs", Blocks.STONE.getStateFromMeta(5), 2.0F, 10.0F, SoundType.STONE);
    public static final Block POLISHED_ANDESITE_STAIRS = new BlockStairBase("polished_andesite_stairs", Blocks.STONE.getStateFromMeta(6), 2.0F, 10.0F, SoundType.STONE);
    public static final Block MOSSY_STONE_BRICKS_STAIRS = new BlockStairBase("mossy_stone_bricks_stairs", Blocks.STONEBRICK.getStateFromMeta(1), 2.0F, 10.0F, SoundType.STONE);
    public static final Block MOSSY_STONE_STAIRS = new BlockStairBase("mossy_stone_stairs", Blocks.MOSSY_COBBLESTONE.getDefaultState(), 2.0F, 10.0F, SoundType.STONE);
    public static final Block SMOOTH_SANDSTONE_STAIRS = new BlockStairBase("smooth_sandstone_stairs", Blocks.SANDSTONE.getStateFromMeta(2), 2.0F, 10.0F, SoundType.STONE);
    public static final Block SMOOTH_RED_SANDSTONE_STAIRS = new BlockStairBase("smooth_red_sandstone_stairs", Blocks.RED_SANDSTONE.getStateFromMeta(2), 2.0F, 10.0F, SoundType.STONE);
    public static final Block RED_NETHER_BRICKS_STAIRS = new BlockStairBase("red_nether_bricks_stairs", Blocks.RED_NETHER_BRICK.getDefaultState(), 2.0F, 10.0F, SoundType.STONE);
    public static final Block END_STONE_BRICKS_STAIRS = new BlockStairBase("end_stone_bricks_stairs", Blocks.END_BRICKS.getDefaultState(), 2.0F, 10.0F, SoundType.STONE);

    public static final Block DOUBLE_STONE_SLAB = new BlockSlabBase.Double("double_stone_slab", (BlockSlabBase) BlockInit.STONE_SLAB, 2.0F, 10.0F, SoundType.STONE);
    public static final Block STONE_SLAB = new BlockSlabBase.Half("stone_slab", (BlockSlabBase) BlockInit.STONE_SLAB, (BlockSlabBase) BlockInit.DOUBLE_STONE_SLAB, 2.0F, 10.0F, SoundType.STONE);
}
