package dev.intelligentcreations.glassware.common.block.base;

import dev.intelligentcreations.glassware.common.block.BlockInit;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

@SuppressWarnings("NullableProblems")
public class GlassStairBlock extends StairBlock {
    public GlassStairBlock() {
        super(
                Blocks.STONE::defaultBlockState,
                Properties.of(Material.GLASS)
                        .sound(SoundType.GLASS)
                        .strength(1f, 2f)
                        .noOcclusion().isRedstoneConductor((state, getter, pos) -> false)
        );
    }

    @Override
    public VoxelShape getVisualShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext ctx) {
        return Shapes.empty();
    }

    @Override
    public float getShadeBrightness(BlockState state, BlockGetter getter, BlockPos pos) {
        return 1.0f;
    }

    @Override
    public boolean propagatesSkylightDown(BlockState state, BlockGetter getter, BlockPos pos) {
        return true;
    }

    @Override
    public boolean skipRendering(BlockState state1, BlockState state2, Direction p_60534_) {
        return state2.is(this);
    }

    @Override
    public boolean useShapeForLightOcclusion(BlockState state) {
        return true;
    }
}
