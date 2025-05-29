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
       Translation is the same as texture's name with Capital Letters At The Begining Of Every Word (leave out the _ in the name)
     */

    public static final DeferredItem<Item> PALADIUM_INGOT = ITEMS.register("paladium", // paladium here is the translation key I'll show you how
            () -> new Item(new Item.Properties()));

/* put the next on the line just under and keep going but skip a line between each */



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }

}
