package net.DrollestDuck88.Paladium.item;

import net.DrollestDuck88.Paladium.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {

    public static final Tier PALADIUM = new SimpleTier(ModTags.INCORRECT_FOR_PALADIUM_TOOL, 4999, 18f, 7f, 20, () -> Ingredient.of(ModItems.PALADIUM_INGOT));
    public static final Tier TITANE = new SimpleTier(ModTags.INCORRECT_FOR_TITANE_TOOL, 2999, 14f, 7f, 24, () -> Ingredient.of(ModItems.TITANE_INGOT));
    public static final Tier AMETHYST = new SimpleTier(ModTags.INCORRECT_FOR_AMETHYST_TOOL, 1999, 12f, 7f, 28, () -> Ingredient.of(ModItems.AMETHYST_INGOT));

}
