package net.DrollestDuck88.Paladium.Datagen;

import net.DrollestDuck88.Paladium.PaladiumMod;
import net.DrollestDuck88.Paladium.block.ModBlocks;
import net.DrollestDuck88.Paladium.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider  extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PaladiumMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.PALADIUM_BLOCK.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
        ;
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.PALADIUM_BLOCK.get());

        tag(ModTags.CONTAINERS)
                .add(Blocks.CHEST)
                .add(Blocks.BARREL)
                .add(Blocks.FURNACE)
                .add(Blocks.HOPPER)
                .add(Blocks.LECTERN)
                .add(Blocks.COMPOSTER)
                .add(Blocks.TRAPPED_CHEST)
                .add(Blocks.DISPENSER)
                .add(Blocks.CRAFTER)
                .add(Blocks.DROPPER)
                .add(Blocks.BLAST_FURNACE)
                .add(Blocks.SMOKER)
                .add(Blocks.ENDER_CHEST);

    }
}
