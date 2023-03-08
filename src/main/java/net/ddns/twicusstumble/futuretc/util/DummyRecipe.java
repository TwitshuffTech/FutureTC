package net.ddns.twicusstumble.futuretc.util;

import net.minecraft.block.state.IBlockState;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class DummyRecipe extends IForgeRegistryEntry.Impl<IRecipe> implements IRecipe {
    private final IRecipe recipe;
    private final ItemStack newOutput;

    public DummyRecipe(IRecipe recipe, ItemStack newOutput) {
        this.recipe = recipe;
        this.newOutput = newOutput;
    }

    public static IRecipe from(IRecipe recipe, ItemStack newOutput) {
        return new DummyRecipe(recipe, newOutput).setRegistryName(recipe.getRegistryName());
    }

    @Override
    public boolean matches(InventoryCrafting inv, World worldIn) {
        return recipe.matches(inv, worldIn);
    }

    @Override
    public ItemStack getCraftingResult(InventoryCrafting inv) {
        return newOutput;
    }

    @Override
    public boolean canFit(int width, int height) {
        return recipe.canFit(width, height);
    }

    @Override
    public ItemStack getRecipeOutput() {
        return newOutput;
    }
}
