package dev.intelligentcreations.glassware.common.util;

import dev.intelligentcreations.glassware.common.Glassware;
import dev.intelligentcreations.glassware.common.block.BlockInit;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Glassware.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Glassware.MOD_ID);
    public static final IEventBus EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();

    public static void register() {
        BlockInit.register();
        BLOCKS.register(EVENT_BUS);
        ITEMS.register(EVENT_BUS);
    }
}
