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

    public static final BlockSlab DOUBLE_STONE_SLAB = new BlockSlabBase.Double("double_stone_slab", 0, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab STONE_SLAB = new BlockSlabBase.Half("stone_slab", 0, BlockInit.DOUBLE_STONE_SLAB, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab DOUBLE_GRANITE_SLAB = new BlockSlabBase.Double("double_granite_slab", 1, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab GRANITE_SLAB = new BlockSlabBase.Half("granite_slab", 1, BlockInit.DOUBLE_GRANITE_SLAB, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab DOUBLE_POLISHED_GRANITE_SLAB = new BlockSlabBase.Double("double_polished_granite_slab", 2, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab POLISHED_GRANITE_SLAB = new BlockSlabBase.Half("polished_granite_slab", 2, BlockInit.DOUBLE_POLISHED_GRANITE_SLAB, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab DOUBLE_DIORITE_SLAB = new BlockSlabBase.Double("double_diorite_slab", 3, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab DIORITE_SLAB = new BlockSlabBase.Half("diorite_slab", 3, BlockInit.DOUBLE_DIORITE_SLAB, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab DOUBLE_POLISHED_DIORITE_SLAB = new BlockSlabBase.Double("double_polished_diorite_slab", 4, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab POLISHED_DIORITE_SLAB = new BlockSlabBase.Half("polished_diorite_slab", 4, BlockInit.DOUBLE_POLISHED_DIORITE_SLAB, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab DOUBLE_ANDESITE_SLAB = new BlockSlabBase.Double("double_andesite_slab", 5, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab ANDESITE_SLAB = new BlockSlabBase.Half("andesite_slab", 5, BlockInit.DOUBLE_ANDESITE_SLAB, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab DOUBLE_POLISHED_ANDESITE_SLAB = new BlockSlabBase.Double("double_polished_andesite_slab", 6, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab POLISHED_ANDESITE_SLAB = new BlockSlabBase.Half("polished_andesite_slab", 6, BlockInit.DOUBLE_POLISHED_ANDESITE_SLAB, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab DOUBLE_MOSSY_STONE_BRICKS_SLAB = new BlockSlabBase.Double("double_mossy_stone_bricks_slab", 7, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab MOSSY_STONE_BRICKS_SLAB = new BlockSlabBase.Half("mossy_stone_bricks_slab", 7, BlockInit.DOUBLE_MOSSY_STONE_BRICKS_SLAB, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab DOUBLE_MOSSY_STONE_SLAB = new BlockSlabBase.Double("double_mossy_stone_slab", 8, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab MOSSY_STONE_SLAB = new BlockSlabBase.Half("mossy_stone_slab", 8, BlockInit.DOUBLE_MOSSY_STONE_SLAB, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab DOUBLE_SMOOTH_SANDSTONE_SLAB = new BlockSlabBase.Double("double_smooth_sandstone_slab", 9, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab SMOOTH_SANDSTONE_SLAB = new BlockSlabBase.Half("smooth_sandstone_slab", 9, BlockInit.DOUBLE_SMOOTH_SANDSTONE_SLAB, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab DOUBLE_SMOOTH_RED_SANDSTONE_SLAB = new BlockSlabBase.Double("double_smooth_red_sandstone_slab", 10, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab SMOOTH_RED_SANDSTONE_SLAB = new BlockSlabBase.Half("smooth_red_sandstone_slab", 10, BlockInit.DOUBLE_SMOOTH_RED_SANDSTONE_SLAB, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab DOUBLE_RED_NETHER_BRICKS_SLAB = new BlockSlabBase.Double("double_red_nether_bricks_slab", 11, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab RED_NETHER_BRICKS_SLAB = new BlockSlabBase.Half("red_nether_bricks_slab", 11, BlockInit.DOUBLE_RED_NETHER_BRICKS_SLAB, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab DOUBLE_END_STONE_BRICKS_SLAB = new BlockSlabBase.Double("double_end_stone_bricks_slab", 12, 2.0F, 10.0F, SoundType.STONE);
    public static final BlockSlab END_STONE_BRICKS_SLAB = new BlockSlabBase.Half("end_stone_bricks_slab", 12, BlockInit.DOUBLE_END_STONE_BRICKS_SLAB, 2.0F, 10.0F, SoundType.STONE);
}
