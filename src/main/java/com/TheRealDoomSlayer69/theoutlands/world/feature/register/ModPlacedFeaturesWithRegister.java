package com.TheRealDoomSlayer69.theoutlands.world.feature.register;

import com.TheRealDoomSlayer69.theoutlands.block.ModBlocks;
import com.TheRealDoomSlayer69.theoutlands.world.gen.ore.ModOrePlacement;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import com.TheRealDoomSlayer69.theoutlands.TheOutlands;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ModPlacedFeaturesWithRegister {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, TheOutlands.MOD_ID);

    public static final RegistryObject<PlacedFeature> PURE_OUTERIUM_ORE = PLACED_FEATURES.register("pure_outerium_ore", () -> {
        LOGGER.debug("Registering pure_outerium_ore feature.");
        return new PlacedFeature(ModConfiguredFeaturesWithRegister.PURE_OUTERIUM_ORE.getHolder().get(),
                ModOrePlacement.commonOrePlacement(10, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(12))));
    });

    public static final RegistryObject<PlacedFeature> EXODENDRON_TREE =
            PLACED_FEATURES.register("exodendron_tree", () -> new
                    PlacedFeature(ModConfiguredFeaturesWithRegister.EXODENDRON_TREE.getHolder().get(),
                    tree(8)));

    public static final RegistryObject<PlacedFeature> OUTERSOIL_ORE = PLACED_FEATURES.register("outersoil_ore", () -> {
        LOGGER.debug("Registering outersoil_ore feature.");
        return new PlacedFeature(ModConfiguredFeaturesWithRegister.OUTERSOIL_ORE.getHolder().get(),
                ModOrePlacement.commonOrePlacement(15, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(30), VerticalAnchor.aboveBottom(60))));
    });

    private static List<PlacementModifier> tree(int count) {
        LOGGER.debug("Creating tree placement with count: {}", count);
        return List.of(CountOnEveryLayerPlacement.of(count), BiomeFilter.biome(),
                BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(ModBlocks.EXODENDRON_SAPLING.get().defaultBlockState(), BlockPos.ZERO)));
    }




    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}