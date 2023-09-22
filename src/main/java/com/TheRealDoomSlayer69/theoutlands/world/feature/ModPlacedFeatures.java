package com.TheRealDoomSlayer69.theoutlands.world.feature;


import com.TheRealDoomSlayer69.theoutlands.world.gen.ore.ModOrePlacement;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;


import java.util.List;

public class ModPlacedFeatures {



    public static final Holder<PlacedFeature> OUTERIUM_ORE_PLACED = PlacementUtils.register("outerium_ore_placed",
            ModConfiguredFeature.OUTERIUM_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));




    }
