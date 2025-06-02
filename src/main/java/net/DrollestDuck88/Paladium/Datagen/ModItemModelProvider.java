package net.DrollestDuck88.Paladium.Datagen;

import net.DrollestDuck88.Paladium.PaladiumMod;
import net.DrollestDuck88.Paladium.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PaladiumMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        //Ingots
        basicItem(ModItems.ENDIUM_INGOT.get());
        basicItem(ModItems.PALADIUM_GREEN_INGOT.get());
        basicItem(ModItems.PALADIUM_INGOT.get());
        basicItem(ModItems.TITANE_INGOT.get());
        basicItem(ModItems.AMETHYST_INGOT.get());
        basicItem(ModItems.ENDIUM_NUGGET.get());
        basicItem(ModItems.ENDIUM_FRAGMENT.get());

        //Compressed
        basicItem(ModItems.COMPRESSED_PALADIUM.get());
        basicItem(ModItems.COMPRESSED_TITANE.get());
        basicItem(ModItems.COMPRESSED_AMETHYST.get());

        //Miscellaneous
        basicItem(ModItems.PALADIUM_CORE.get());
        basicItem(ModItems.VOIDSTONE.get());
        basicItem(ModItems.FORTUNE_MODIFIER.get());
        basicItem(ModItems.SMELT_MODIFIER.get());
        basicItem(ModItems.SPEED_ORB.get());
        basicItem(ModItems.SPEED_MODIFIER.get());
        basicItem(ModItems.MORE_UPGRADE_MODIFIER.get());
        basicItem(ModItems.STRENGHT_ORB.get());

        //Farming Fruits
        basicItem(ModItems.ORANGEBLUE.get());
        basicItem(ModItems.KIWANO.get());
        basicItem(ModItems.CHERVIL.get());
        basicItem(ModItems.EGGPLANT.get());

        //Seeds
        basicItem(ModItems.ORANGEBLUE_SEEDS.get());
        basicItem(ModItems.KIWANO_SEEDS.get());
        basicItem(ModItems.CHERVIL_SEEDS.get());
        basicItem(ModItems.EGGPLANT_SEEDS.get());

        //Patterns
        basicItem(ModItems.SOCKET_PATTERN.get());
        basicItem(ModItems.HAMMER_PATTERN.get());
        basicItem(ModItems.SHOVEL_PATTERN.get());
        basicItem(ModItems.BROADSWORD_PATTERN.get());
        basicItem(ModItems.FASTSWORD_PATTERN.get());
        basicItem(ModItems.PICKAXE_PATTERN.get());
        basicItem(ModItems.SWORD_PATTERN.get());
        basicItem(ModItems.INGOT_PATTERN.get());
        basicItem(ModItems.BLOCK_PATTERN.get());

        //Tool Heads
        basicItem(ModItems.AXE_HEAD.get());
        basicItem(ModItems.HAMMER_HEAD.get());
        basicItem(ModItems.SHOVEL_HEAD.get());
        basicItem(ModItems.BROADSWORD_HEAD.get());
        basicItem(ModItems.FASTSWORD_HEAD.get());
        basicItem(ModItems.PICKAXE_HEAD.get());
        basicItem(ModItems.SWORD_HEAD.get());

        //Hammer
        basicItem(ModItems.PALADIUM_HAMMER.get());
        basicItem(ModItems.TITANE_HAMMER.get());
        basicItem(ModItems.AMETHYST_HAMMER.get());

        //Excavator
        basicItem(ModItems.PALADIUM_EXCAVATOR.get());
        basicItem(ModItems.TITANE_EXCAVATOR.get());
        basicItem(ModItems.AMETHYST_EXCAVATOR.get());

    }
}
