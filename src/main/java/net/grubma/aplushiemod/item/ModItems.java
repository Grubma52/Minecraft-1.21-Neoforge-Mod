package net.grubma.aplushiemod.item;

import net.grubma.aplushiemod.APlushieMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(APlushieMod.MOD_ID);

    public static final DeferredItem<Item> SUSPICIOUS_SUBSTANCE = ITEMS.register("suspicious_substance",
        () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
