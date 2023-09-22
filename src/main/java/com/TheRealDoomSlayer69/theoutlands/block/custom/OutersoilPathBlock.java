package com.TheRealDoomSlayer69.theoutlands.block.custom;

import com.TheRealDoomSlayer69.theoutlands.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.DirtPathBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

public class OutersoilPathBlock extends DirtPathBlock {

    public OutersoilPathBlock(Properties properties) {
        super(properties);
    }


    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return !this.defaultBlockState().canSurvive(context.getLevel(), context.getClickedPos()) ? ModBlocks.OUTERSOIL.get().defaultBlockState() : super.getStateForPlacement(context);
    }

    public static void turnToOutersoil(BlockState state, Level level, BlockPos pos) {
        level.setBlockAndUpdate(pos, pushEntitiesUp(state, ModBlocks.OUTERSOIL.get().defaultBlockState(), level, pos));
    }

    public boolean canSurvive(BlockState p_153148_, LevelReader p_153149_, BlockPos p_153150_) {
        BlockState blockstate = p_153149_.getBlockState(p_153150_.above());
        return !blockstate.getMaterial().isSolid() || blockstate.getBlock() instanceof FenceGateBlock;
    }


    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, Random random) {
        if (!state.canSurvive(level, pos)) {
            turnToOutersoil(state, level, pos);
        }

    }
}
