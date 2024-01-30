package dev.intelligentcreations.glassware.common.creativeTab;

import dev.intelligentcreations.glassware.common.block.BlockInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class GroupInit {
    public static CreativeModeTab glasswareMain = new CreativeModeTab("glassware_main") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.GLASS_STAIRS.get());
        }
    };
}
