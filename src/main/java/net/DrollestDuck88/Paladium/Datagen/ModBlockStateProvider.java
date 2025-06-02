package net.DrollestDuck88.Paladium.Datagen;


import net.DrollestDuck88.Paladium.PaladiumMod;
import net.DrollestDuck88.Paladium.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PaladiumMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.ENDIUM_BLOCK);
        blockWithItem(ModBlocks.PALADIUM_GREEN_BLOCK);
        blockWithItem(ModBlocks.PALADIUM_BLOCK);
        blockWithItem(ModBlocks.TITANE_BLOCK);
        blockWithItem(ModBlocks.AMETHYST_BLOCK);
        blockWithItem(ModBlocks.FINDIUM_BLOCK);

        blockWithItem(ModBlocks.ENDIUM_ORE);
        blockWithItem(ModBlocks.PALADIUM_GREEN_ORE);
        blockWithItem(ModBlocks.PALADIUM_ORE);
        blockWithItem(ModBlocks.TITANE_ORE);
        blockWithItem(ModBlocks.AMETHYST_ORE);
        blockWithItem(ModBlocks.FINDIUM_ORE);

        blockWithItem(ModBlocks.DEEPSLATE_ENDIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_PALADIUM_GREEN_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_PALADIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TITANE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_AMETHYST_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_FINDIUM_ORE);

    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

}
