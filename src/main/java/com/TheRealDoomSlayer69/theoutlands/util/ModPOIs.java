package com.TheRealDoomSlayer69.theoutlands.util;

import com.TheRealDoomSlayer69.theoutlands.TheOutlands;
import com.TheRealDoomSlayer69.theoutlands.block.ModBlocks;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPOIs {

public static final DeferredRegister<PoiType> POI =
        DeferredRegister.create(ForgeRegistries.POI_TYPES, TheOutlands.MOD_ID);

    public static final RegistryObject<PoiType> OUTLANDS_PORTAL =
            POI.register("outlands_portal", () -> new PoiType("outlands_portal",
                    PoiType.getBlockStates(ModBlocks.OUTLANDS_PORTAL.get()), 0, 1));


    public static void register(IEventBus eventBus) {
        POI.register(eventBus);
    }
}
