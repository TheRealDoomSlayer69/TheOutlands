package com.TheRealDoomSlayer69.theoutlands.world.feature.register;

import com.TheRealDoomSlayer69.theoutlands.block.ModBlocks;
import com.TheRealDoomSlayer69.theoutlands.TheOutlands;
import com.TheRealDoomSlayer69.theoutlands.tag.ModTags;
import com.google.common.collect.ImmutableList;
import net.minecraft.core.Registry;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.level.levelgen.feature.Feature;

public class ModConfiguredFeaturesWithRegister {
    public static final RuleTest OUTERSTONE_ORE_REPLACEABLES =
            new TagMatchTest(ModTags.Blocks.OUTERSTONE_ORE_REPLACEABLES);
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, TheOutlands.MOD_ID);

    public static final RegistryObject<ConfiguredFeature<?, ?>> EXODENDRON_TREE =
            CONFIGURED_FEATURES.register("exodendron_tree", () -> new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.EXODENDRON_LOG.get()),
                                            new StraightTrunkPlacer(7, 8, 5),
                                            BlockStateProvider.simple(ModBlocks.EXODENRON_LEAVES.get()),
                                            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 6),
                                            new TwoLayersFeatureSize(4, 5, 4))
                                    .dirt(BlockStateProvider.simple(ModBlocks.LUSH_OUTERSOIL.get())).build()));

    public static final RegistryObject<ConfiguredFeature<?, ?>> PURE_OUTERIUM_ORE = CONFIGURED_FEATURES.register("pure_outerium_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ImmutableList.of(OreConfiguration.target(OUTERSTONE_ORE_REPLACEABLES,
                   ModBlocks.PURE_OUTERIUM_ORE.get().defaultBlockState()), OreConfiguration.target(OUTERSTONE_ORE_REPLACEABLES,
                    ModBlocks.PURE_OUTERIUM_ORE.get().defaultBlockState())), 4)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> OUTERSOIL_ORE =
            CONFIGURED_FEATURES.register("outersoil_ore", () ->
                    new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OUTERSTONE_ORE_REPLACEABLES,
                            ModBlocks.OUTERSOIL.get().defaultBlockState(), 33)));


    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}
