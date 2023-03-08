package net.ddns.twicusstumble.futuretc.util;

import com.google.common.collect.Lists;
import net.ddns.twicusstumble.futuretc.FutureTC;
import net.ddns.twicusstumble.futuretc.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;

import java.util.ArrayList;

public class CraftingHandler {
    public static void RegisterRecipes() {

    }

    public static void replaceRecipes(String registryName, ItemStack newOutput) {
        ForgeRegistry<IRecipe> recipeRegistry = (ForgeRegistry<IRecipe>) ForgeRegistries.RECIPES;
        ArrayList<IRecipe> recipes = Lists.newArrayList(recipeRegistry.getValues());

        for (IRecipe recipe: recipes) {
            if (registryName.equals(recipe.getRegistryName().toString())) {
                recipeRegistry.remove(recipe.getRegistryName());
                recipeRegistry.register(DummyRecipe.from(recipe, newOutput));
            }
        }
    }
}
