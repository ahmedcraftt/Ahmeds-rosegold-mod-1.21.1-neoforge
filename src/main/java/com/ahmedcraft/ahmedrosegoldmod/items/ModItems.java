package com.ahmedcraft.ahmedrosegoldmod.items;


import com.ahmedcraft.ahmedrosegoldmod.RosegoldMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RosegoldMod.MODID);

    public static final DeferredItem<Item> ROSEGOLD_INGOT = ITEMS.register("rosegold_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_AND_GOLD = ITEMS.register("copper_and_gold",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROSEGOLD_NUGGET = ITEMS.register("rosegold_nugget",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
