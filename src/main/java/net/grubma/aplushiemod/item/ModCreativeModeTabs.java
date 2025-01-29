package net.grubma.aplushiemod.item;

import net.grubma.aplushiemod.APlushieMod;
import net.grubma.aplushiemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, APlushieMod.MOD_ID);

    public static final Supplier<CreativeModeTab> APLUSHIEMOD_ITEMS_TAB = CREATIVE_MODE_TAB.register("aplushiemod_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SUSPICIOUS_SUBSTANCE.get()))
                    .title(Component.translatable("creativetab.aplushiemod.aplushiemod"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SUSPICIOUS_SUBSTANCE);
                        output.accept(ModBlocks.BLOCK_OF_COZYNESS);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
