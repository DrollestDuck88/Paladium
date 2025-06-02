package net.DrollestDuck88.Paladium.Datagen;

import net.DrollestDuck88.Paladium.PaladiumMod;
import net.DrollestDuck88.Paladium.block.ModBlocks;
import net.DrollestDuck88.Paladium.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider  extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> PALADIUM_SMELTABLES = List.of(ModItems.RAW_PALADIUM,
                ModBlocks.PALADIUM_ORE, ModBlocks.DEEPSLATE_PALADIUM_ORE);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PALADIUM_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.PALADIUM_INGOT.get())
                .unlockedBy("has_bismuth", has(ModItems.PALADIUM_INGOT)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PALADIUM_INGOT.get(), 9)
                .requires(ModBlocks.PALADIUM_BLOCK)
                .unlockedBy("has_bismuth_block", has(ModBlocks.PALADIUM_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, PALADIUM_SMELTABLES, RecipeCategory.MISC, ModItems.PALADIUM_INGOT.get(), 0.25f, 200, "paladium");
        oreBlasting(recipeOutput, PALADIUM_SMELTABLES, RecipeCategory.MISC, ModItems.PALADIUM_INGOT.get(), 0.25f, 100, "paladium");

    }

        protected static void oreSmelting (RecipeOutput recipeOutput, List < ItemLike > pIngredients, RecipeCategory
        pCategory, ItemLike pResult,
        float pExperience, int pCookingTIme, String pGroup){
            oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                    pExperience, pCookingTIme, pGroup, "_from_smelting");
        }

        protected static void oreBlasting (RecipeOutput recipeOutput, List < ItemLike > pIngredients, RecipeCategory
        pCategory, ItemLike pResult,float pExperience, int pCookingTime, String pGroup){
            oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                    pExperience, pCookingTime, pGroup, "_from_blasting");
        }

        protected static <T extends AbstractCookingRecipe > void oreCooking (RecipeOutput
        recipeOutput, RecipeSerializer < T > pCookingSerializer, AbstractCookingRecipe.Factory < T > factory,
                List < ItemLike > pIngredients, RecipeCategory pCategory, ItemLike pResult,float pExperience,
        int pCookingTime, String pGroup, String pRecipeName){
            for (ItemLike itemlike : pIngredients) {
                SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                        .save(recipeOutput, PaladiumMod.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}