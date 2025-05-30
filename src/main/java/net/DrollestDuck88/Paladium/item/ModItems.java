package net.DrollestDuck88.Paladium.item;

import net.DrollestDuck88.Paladium.PaladiumMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PaladiumMod.MODID);

    /*
    Template (this is used to make each item (mostly) for now stick to this)

    public static final DeferredItem<Item> *NAME* = ITEMS.register("*name*",
           () -> new Item(new Item.Properties()));

       Explanation:
       *NAME* is the name you give to the item you created and I want it to have "_INGOT" if the item is an ingot (go check the texture's name for indication if not sure)
       *name* is used for translation MUST BE IN LOWERCASE ONLY keep simple and look at the first one I did...
     */

    public static final DeferredItem<Item> ENDIUM_INGOT = ITEMS.register("endium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PALADIUM_GREEN_INGOT = ITEMS.register("paladium_green_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PALADIUM_INGOT = ITEMS.register("paladium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANE_INGOT = ITEMS.register("titane_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AMETHYST_INGOT = ITEMS.register("amethyst_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ENDIUM_NUGGET = ITEMS.register("endium_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ENDIUM_FRAGMENT = ITEMS.register("endium_fragment",
            () -> new Item(new Item.Properties()));

    //Compressed
    public static final DeferredItem<Item> COMPRESSED_PALADIUM = ITEMS.register("compressed_paladium",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COMPRESSED_TITANE = ITEMS.register("compressed_titane",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COMPRESSED_AMETHYST = ITEMS.register("compressed_amethyst",
            () -> new Item(new Item.Properties()));

    //Other
    public static final DeferredItem<Item> PALADIUM_CORE = ITEMS.register("paladium_core",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPEED_ORB = ITEMS.register("speed_orb",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STRENGHT_ORB = ITEMS.register("strenght_orb",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPEED_MODIFIER = ITEMS.register("speed_modifier",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FORTUNE_MODIFIER = ITEMS.register("fortune_modifier",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MORE_UPGRADE_MODIFIER = ITEMS.register("more_upgrade_modifier",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SMELT_MODIFIER = ITEMS.register("smelt_modifier",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VOIDSTONE = ITEMS.register("voidstone",
            () -> new Item(new Item.Properties()));

    //Plants
    public static final DeferredItem<Item> ORANGEBLUE = ITEMS.register("orangeblue",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KIWANO = ITEMS.register("kiwano",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHERVIL = ITEMS.register("chervil",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EGGPLANT = ITEMS.register("eggplant",
            () -> new Item(new Item.Properties()));

    //Seeds
    public static final DeferredItem<Item> ORANGEBLUE_SEEDS = ITEMS.register("orangeblue_seeds",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KIWANO_SEEDS = ITEMS.register("kiwano_seeds",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHERVIL_SEEDS = ITEMS.register("chervil_seeds",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EGGPLANT_SEEDS = ITEMS.register("eggplant_seeds",
            () -> new Item(new Item.Properties()));

    //Pattern
    public static final DeferredItem<Item> SOCKET_PATTERN = ITEMS.register("socket_pattern",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HAMMER_PATTERN = ITEMS.register("hammer_pattern",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHOVEL_PATTERN = ITEMS.register("shovel_pattern",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BROADSWORD_PATTERN = ITEMS.register("broadsword_pattern",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FASTSWORD_PATTERN = ITEMS.register("fastsword_pattern",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PICKAXE_PATTERN = ITEMS.register("pickaxe_pattern",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SWORD_PATTERN = ITEMS.register("sword_pattern",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INGOT_PATTERN = ITEMS.register("ingot_pattern",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLOCK_PATTERN = ITEMS.register("block_pattern",
            () -> new Item(new Item.Properties()));

    //Tool Head
    public static final DeferredItem<Item> AXE_HEAD = ITEMS.register("axe_head",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HAMMER_HEAD = ITEMS.register("hammer_head",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHOVEL_HEAD = ITEMS.register("shovel_head",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BROADSWORD_HEAD = ITEMS.register("broadsword_head",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FASTSWORD_HEAD = ITEMS.register("fastsword_head",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PICKAXE_HEAD = ITEMS.register("pickaxe_head",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SWORD_HEAD = ITEMS.register("sword_head",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }

}
