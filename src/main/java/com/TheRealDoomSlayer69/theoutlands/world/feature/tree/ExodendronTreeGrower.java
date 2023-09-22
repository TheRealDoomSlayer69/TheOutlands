package com.TheRealDoomSlayer69.theoutlands.world.feature.tree;

import com.TheRealDoomSlayer69.theoutlands.world.feature.register.ModConfiguredFeaturesWithRegister;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import javax.annotation.Nullable;
import java.util.Random;

public class ExodendronTreeGrower extends AbstractTreeGrower {

@Nullable
@Override
protected Holder<ConfiguredFeature<?,?>> getConfiguredFeature(Random pRandom, boolean pLargeHive) {
    return ModConfiguredFeaturesWithRegister.EXODENDRON_TREE.getHolder().get();
     }
}
