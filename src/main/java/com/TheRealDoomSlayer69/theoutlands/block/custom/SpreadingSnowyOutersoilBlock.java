package com.TheRealDoomSlayer69.theoutlands.block.custom;

import com.TheRealDoomSlayer69.theoutlands.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.SpreadingSnowyDirtBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.lighting.LayerLightEngine;
import net.minecraft.world.level.LevelReader;

import java.util.Random;

public class SpreadingSnowyOutersoilBlock extends SpreadingSnowyDirtBlock {
    public SpreadingSnowyOutersoilBlock(Properties properties) {
        super(properties);
    }


        private static boolean canBeGrass(BlockState pState, LevelReader pLevelReader, BlockPos pPos) {
            BlockPos blockpos = pPos.above();
            BlockState blockstate = pLevelReader.getBlockState(blockpos);
            if (blockstate.is(Blocks.SNOW) && blockstate.getValue(SnowLayerBlock.LAYERS) == 1) {
                return true;
            }
            else if (blockstate.getFluidState().getAmount() == 8) {
                return false;
            }
            else {
                int i = LayerLightEngine.getLightBlockInto(pLevelReader, pState, pPos, blockstate, blockpos, Direction.UP, blockstate.getLightBlock(pLevelReader, blockpos));
                return i < pLevelReader.getMaxLightLevel();
            }
        }

        private static boolean canPropagate(BlockState pState, LevelReader pLevel, BlockPos pPos) {
            BlockPos blockpos = pPos.above();
            return canBeGrass(pState, pLevel, pPos) && !pLevel.getFluidState(blockpos).is(FluidTags.WATER);
        }

        @Override
        public void randomTick(BlockState state, ServerLevel worldIn, BlockPos pos, Random random) {
            if (!canBeGrass(state, worldIn, pos)) {
                if (!worldIn.isAreaLoaded(pos, 3)) return;
                worldIn.setBlockAndUpdate(pos, ModBlocks.OUTERSOIL.get().defaultBlockState());
            }
            else {
                BlockState blockstate = this.defaultBlockState();

                for (int i = 0; i < 4; ++i) {
                    BlockPos blockpos = pos.offset(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                    if (worldIn.getBlockState(blockpos).is(ModBlocks.OUTERSOIL.get()) && canPropagate(blockstate, worldIn, blockpos)) {
                        worldIn.setBlockAndUpdate(blockpos, blockstate.setValue(SNOWY, worldIn.getBlockState(blockpos.above()).is(Blocks.SNOW)));
                    }
                }
            }
        }
    }

