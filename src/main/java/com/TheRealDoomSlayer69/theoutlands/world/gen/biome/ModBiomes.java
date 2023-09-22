package com.TheRealDoomSlayer69.theoutlands.world.gen.biome;

import com.TheRealDoomSlayer69.theoutlands.TheOutlands;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.biome.OverworldBiomes;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomes {

    public static final DeferredRegister<Biome> BIOMES =
            DeferredRegister.create(ForgeRegistries.BIOMES, TheOutlands.MOD_ID);

    //Biomes
    public static final ResourceKey<Biome> OUTER_PLAINS = register("outer_plains");
    public static final ResourceKey<Biome> EXODENDRON_FOREST = register("exodendron_forest");

    public static final ResourceKey<Biome> OUTER_SWAMP = register("outer_swamp");


    public static void toDictionary() {
        BiomeDictionary.addTypes(OUTER_PLAINS, BiomeDictionary.Type.LUSH, BiomeDictionary.Type.PLAINS);

        BiomeDictionary.addTypes(EXODENDRON_FOREST, BiomeDictionary.Type.LUSH, BiomeDictionary.Type.DENSE, BiomeDictionary.Type.FOREST);

        BiomeDictionary.addTypes(OUTER_SWAMP, BiomeDictionary.Type.SWAMP, BiomeDictionary.Type.LUSH);
    }

    private static ResourceLocation name(String name) {
        return new ResourceLocation(TheOutlands.MOD_ID, name);
    }

    private static ResourceKey<Biome> register(String name) {
        BIOMES.register(name, OverworldBiomes::theVoid);
        return ResourceKey.create(Registry.BIOME_REGISTRY, name(name));
    }
}
