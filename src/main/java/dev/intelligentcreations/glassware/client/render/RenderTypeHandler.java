package dev.intelligentcreations.glassware.client.render;

import dev.intelligentcreations.glassware.common.block.BlockInit;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RenderTypeHandler {
    @SubscribeEvent
    public static void onRenderTypeSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(BlockInit.GLASS_SLAB.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.GLASS_STAIRS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.WHITE_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGE_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.MAGENTA_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.LIGHT_BLUE_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.YELLOW_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.LIME_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.PINK_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.GRAY_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.LIGHT_GRAY_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.CYAN_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.PURPLE_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUE_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.BROWN_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.GREEN_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.RED_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACK_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.WHITE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.MAGENTA_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.LIGHT_BLUE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.YELLOW_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.LIME_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.PINK_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.GRAY_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.LIGHT_GRAY_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.CYAN_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.PURPLE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.BROWN_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.GREEN_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.RED_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACK_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        });
    }
}
