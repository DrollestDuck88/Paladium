package net.DrollestDuck88.Paladium.util;

import net.DrollestDuck88.Paladium.PaladiumMod;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static final TagKey<Block> NEEDS_PALADIUM_TOOL = createTag("needs_paladium_tool");
    public static final TagKey<Block> INCORRECT_FOR_PALADIUM_TOOL = createTag("incorrect_for_paladium_tool");

    public static final TagKey<Block> NEEDS_TITANE_TOOL = createTag("needs_titane_tool");
    public static final TagKey<Block> INCORRECT_FOR_TITANE_TOOL = createTag("incorrect_for_titane_tool");

    public static final TagKey<Block> NEEDS_AMETHYST_TOOL = createTag("needs_amethyst_tool");
    public static final TagKey<Block> INCORRECT_FOR_AMETHYST_TOOL = createTag("incorrect_for_amethyst_tool");

    public static final TagKey<Block> CONTAINERS = createTag("containers");

    private static TagKey<Block> createTag(String name) {
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath(PaladiumMod.MODID, name));
    }

    public static class Items {
        public static final TagKey<Item> PALADIUM_REPAIRABLE = createTag("paladium_repairable");


        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(PaladiumMod.MODID, name));
        }
    }
}