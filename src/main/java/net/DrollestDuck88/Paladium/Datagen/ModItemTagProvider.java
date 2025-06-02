package net.DrollestDuck88.Paladium.Datagen;

import net.DrollestDuck88.Paladium.PaladiumMod;
import net.DrollestDuck88.Paladium.item.ModItems;
import net.DrollestDuck88.Paladium.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, PaladiumMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {


        tag(ModTags.Items.PALADIUM_REPAIRABLE)
                .add(ModItems.PALADIUM_INGOT.get());


    }

}