package net.DrollestDuck88.Paladium.item;

import net.DrollestDuck88.Paladium.PaladiumMod;
import net.DrollestDuck88.Paladium.item.custom.ExcavatorItem;
import net.DrollestDuck88.Paladium.item.custom.HammerItem;
import net.minecraft.world.item.*;
import net.minecraft.world.item.Item.Properties;
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
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> PALADIUM_GREEN_INGOT = ITEMS.register("paladium_green_ingot",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> PALADIUM_INGOT = ITEMS.register("paladium_ingot",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> TITANE_INGOT = ITEMS.register("titane_ingot",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> AMETHYST_INGOT = ITEMS.register("amethyst_ingot",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> ENDIUM_NUGGET = ITEMS.register("endium_nugget",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> ENDIUM_FRAGMENT = ITEMS.register("endium_fragment",
            () -> new Item(new Properties()));

    //Compressed
    public static final DeferredItem<Item> COMPRESSED_PALADIUM = ITEMS.register("compressed_paladium",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> COMPRESSED_TITANE = ITEMS.register("compressed_titane",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> COMPRESSED_AMETHYST = ITEMS.register("compressed_amethyst",
            () -> new Item(new Properties()));

    //Other
    public static final DeferredItem<Item> PALADIUM_CORE = ITEMS.register("paladium_core",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> SPEED_ORB = ITEMS.register("speed_orb",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> STRENGHT_ORB = ITEMS.register("strenght_orb",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> SPEED_MODIFIER = ITEMS.register("speed_modifier",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> FORTUNE_MODIFIER = ITEMS.register("fortune_modifier",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> MORE_UPGRADE_MODIFIER = ITEMS.register("more_upgrade_modifier",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> SMELT_MODIFIER = ITEMS.register("smelt_modifier",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> VOIDSTONE = ITEMS.register("voidstone",
            () -> new Item(new Properties()));

    //Plants
    public static final DeferredItem<Item> ORANGEBLUE = ITEMS.register("orangeblue",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> KIWANO = ITEMS.register("kiwano",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> CHERVIL = ITEMS.register("chervil",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> EGGPLANT = ITEMS.register("eggplant",
            () -> new Item(new Properties()));

    //Seeds
    public static final DeferredItem<Item> ORANGEBLUE_SEEDS = ITEMS.register("orangeblue_seeds",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> KIWANO_SEEDS = ITEMS.register("kiwano_seeds",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> CHERVIL_SEEDS = ITEMS.register("chervil_seeds",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> EGGPLANT_SEEDS = ITEMS.register("eggplant_seeds",
            () -> new Item(new Properties()));

    //Pattern
    public static final DeferredItem<Item> SOCKET_PATTERN = ITEMS.register("socket_pattern",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> HAMMER_PATTERN = ITEMS.register("hammer_pattern",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> SHOVEL_PATTERN = ITEMS.register("shovel_pattern",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> BROADSWORD_PATTERN = ITEMS.register("broadsword_pattern",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> FASTSWORD_PATTERN = ITEMS.register("fastsword_pattern",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> PICKAXE_PATTERN = ITEMS.register("pickaxe_pattern",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> SWORD_PATTERN = ITEMS.register("sword_pattern",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> INGOT_PATTERN = ITEMS.register("ingot_pattern",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> BLOCK_PATTERN = ITEMS.register("block_pattern",
            () -> new Item(new Properties()));

    //Tool Head
    public static final DeferredItem<Item> AXE_HEAD = ITEMS.register("axe_head",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> HAMMER_HEAD = ITEMS.register("hammer_head",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> SHOVEL_HEAD = ITEMS.register("shovel_head",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> BROADSWORD_HEAD = ITEMS.register("broadsword_head",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> FASTSWORD_HEAD = ITEMS.register("fastsword_head",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> PICKAXE_HEAD = ITEMS.register("pickaxe_head",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> SWORD_HEAD = ITEMS.register("sword_head",
            () -> new Item(new Properties()));

    //Excavator
    public static final DeferredItem<ExcavatorItem> PALADIUM_EXCAVATOR = ITEMS.register("paladium_excavator",
            () -> new ExcavatorItem(ModToolTiers.PALADIUM, new Item.Properties()));
    public static final DeferredItem<ExcavatorItem> TITANE_EXCAVATOR = ITEMS.register("titane_excavator",
            () -> new ExcavatorItem(ModToolTiers.TITANE, new Item.Properties()));
    public static final DeferredItem<ExcavatorItem> AMETHYST_EXCAVATOR = ITEMS.register("amethyst_excavator",
            () -> new ExcavatorItem(ModToolTiers.AMETHYST, new Item.Properties()));

    //Hammer
    public static final DeferredItem<HammerItem> PALADIUM_HAMMER = ITEMS.register("paladium_hammer",
            () -> new HammerItem(ModToolTiers.PALADIUM, new Item.Properties()));
    public static final DeferredItem<HammerItem> TITANE_HAMMER = ITEMS.register("titane_hammer",
            () -> new HammerItem(ModToolTiers.TITANE, new Item.Properties()));
    public static final DeferredItem<HammerItem> AMETHYST_HAMMER = ITEMS.register("amethyst_hammer",
            () -> new HammerItem(ModToolTiers.AMETHYST, new Item.Properties()));

    //Armors

    //Endium

    //Paladium Green
    public static final DeferredItem<ArmorItem> PALADIUM_GREEN_HELMET = ITEMS.register("paladium_greem_helmet",
            () -> new ArmorItem(ModArmorMaterial.PALADIUM_GREEN_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredItem<ArmorItem> PALADIUM_GREEN_CHESTPLATE = ITEMS.register("paladium_gren_chestplate",
            () -> new ArmorItem(ModArmorMaterial.PALADIUM_GREEN_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredItem<ArmorItem> PALADIUM_GREEN_LEGGINGS = ITEMS.register("paladium_green_leggings",
            () -> new ArmorItem(ModArmorMaterial.PALADIUM_GREEN_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredItem<ArmorItem> PALADIUM_GREEN_BOOTS = ITEMS.register("paladium_green_boots",
            () -> new ArmorItem(ModArmorMaterial.PALADIUM_GREEN_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    //Paladium
    public static final DeferredItem<ArmorItem> PALADIUM_HELMET = ITEMS.register("paladium_helmet",
            () -> new ArmorItem(ModArmorMaterial.PALADIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredItem<ArmorItem> PALADIUM_CHESTPLATE = ITEMS.register("paladium_chestplate",
            () -> new ArmorItem(ModArmorMaterial.PALADIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredItem<ArmorItem> PALADIUM_LEGGINGS = ITEMS.register("paladium_leggings",
            () -> new ArmorItem(ModArmorMaterial.PALADIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredItem<ArmorItem> PALADIUM_BOOTS = ITEMS.register("paladium_boots",
            () -> new ArmorItem(ModArmorMaterial.PALADIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    //Titane


    //RAW
    public static final DeferredItem<Item> RAW_PALADIUM_GREEN = ITEMS.register("raw_paladium_green",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> RAW_PALADIUM = ITEMS.register("raw_paladium",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> RAW_TITANE = ITEMS.register("raw_raw_titane",
            () -> new Item(new Properties()));
    public static final DeferredItem<Item> RAW_AMETHYST = ITEMS.register("raw_amethyst",
            () -> new Item(new Properties()));

    //Tools

    //Endium
    public static final DeferredItem<HammerItem> ENDIUM_PICKAXE = ITEMS.register("endium_pickaxe",
            () -> new HammerItem(ModToolTiers.PALADIUM, new Item.Properties().attributes(HammerItem.createAttributes(ModToolTiers.PALADIUM, 9.3F, -2.8f))));
    public static final DeferredItem<AxeItem> ENDIUM_AXE = ITEMS.register("endium_axe",
            () -> new AxeItem(ModToolTiers.PALADIUM, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.PALADIUM, 10.3F, -3.2f))));

    //Paladium Green
    public static final DeferredItem<SwordItem> PALADIUM_GREEN_SWORD = ITEMS.register("paladium_green_pickaxe",
            () -> new SwordItem(ModToolTiers.PALADIUM, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.PALADIUM, 10.0F, -2.4f))));
    public static final DeferredItem<PickaxeItem> PALADIUM_GREEN_PICKAXE = ITEMS.register("paladium_green_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PALADIUM, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.PALADIUM, 8.0F, -2.8f))));
    public static final DeferredItem<AxeItem> PALADIUM_GREEN_AXE = ITEMS.register("paladium_green_axe",
            () -> new AxeItem(ModToolTiers.PALADIUM, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.PALADIUM, 9.0F, -3.2f))));
    public static final DeferredItem<ShovelItem> PALADIUM_GREEN_SHOVEL = ITEMS.register("paladium_green_shovel",
            () -> new ShovelItem(ModToolTiers.PALADIUM, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.PALADIUM, 7.0F, -3.0f))));

    //Paladium
    public static final DeferredItem<SwordItem> PALADIUM_SWORD = ITEMS.register("paladium_pickaxe",
            () -> new SwordItem(ModToolTiers.PALADIUM, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.PALADIUM, 10.0F, -2.4f))));
    public static final DeferredItem<PickaxeItem> PALADIUM_PICKAXE = ITEMS.register("paladium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PALADIUM, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.PALADIUM, 9.3F, -2.8f))));
    public static final DeferredItem<AxeItem> PALADIUM_AXE = ITEMS.register("paladium_axe",
            () -> new AxeItem(ModToolTiers.PALADIUM, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.PALADIUM, 10.3F, -3.2f))));
    public static final DeferredItem<ShovelItem> PALADIUM_SHOVEL = ITEMS.register("paladium_shovel",
            () -> new ShovelItem(ModToolTiers.PALADIUM, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.PALADIUM, 10.3F, -3.0f))));

    //Titane
    public static final DeferredItem<SwordItem> TITANE_SWORD = ITEMS.register("paladium_pickaxe",
            () -> new SwordItem(ModToolTiers.TITANE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.TITANE, 7.5F, -2.4f))));
    public static final DeferredItem<PickaxeItem> TITANE_PICKAXE = ITEMS.register("paladium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TITANE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.TITANE, 5.5F, -2.8f))));
    public static final DeferredItem<AxeItem> TITANE_AXE = ITEMS.register("paladium_axe",
            () -> new AxeItem(ModToolTiers.TITANE, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.TITANE, 6.5F, -3.2f))));
    public static final DeferredItem<ShovelItem> TITANE_SHOVEL = ITEMS.register("paladium_shovel",
            () -> new ShovelItem(ModToolTiers.TITANE, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.TITANE, 4.5F, -3.0f))));

    //Amethyst
    public static final DeferredItem<SwordItem> AMETHYST_SWORD = ITEMS.register("amethyst_pickaxe",
            () -> new SwordItem(ModToolTiers.AMETHYST, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.AMETHYST, 7.0F, -2.4f))));
    public static final DeferredItem<PickaxeItem> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AMETHYST, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.AMETHYST, 5.0F, -2.8f))));
    public static final DeferredItem<AxeItem> AMETHYST_AXE = ITEMS.register("amethyst_axe",
            () -> new AxeItem(ModToolTiers.AMETHYST, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.AMETHYST, 6.0F, -3.2f))));
    public static final DeferredItem<ShovelItem> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
            () -> new ShovelItem(ModToolTiers.AMETHYST, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.AMETHYST, 4.0F, -3.0f))));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}