package com.TheRealDoomSlayer69.theoutlands.dimension;

import com.TheRealDoomSlayer69.theoutlands.TheOutlands;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;


public class ModDimensions {

    public static final ResourceKey<Level> OUTLANDS_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(TheOutlands.MOD_ID, "outlands"));

    public static final ResourceKey<DimensionType> OUTLANDS_TYPE =
            ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, OUTLANDS_KEY.getRegistryName());


    public static void register() {
        System.out.println("Registering ModDimensions for " + TheOutlands.MOD_ID);

    }
}
