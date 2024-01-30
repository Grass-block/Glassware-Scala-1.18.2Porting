package dev.intelligentcreations.glassware.common.block.base;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.BeaconBeamBlock;
import org.jetbrains.annotations.NotNull;

public class StainedGlassStairsBlock extends GlassStairBlock implements BeaconBeamBlock {
    private final DyeColor color;

    public StainedGlassStairsBlock(DyeColor color) {
        this.color = color;
    }

    @Override
    public @NotNull DyeColor getColor() {
        return this.color;
    }
}
