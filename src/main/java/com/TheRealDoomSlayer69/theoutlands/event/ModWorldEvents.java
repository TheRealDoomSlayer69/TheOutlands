package com.TheRealDoomSlayer69.theoutlands.event;

import com.TheRealDoomSlayer69.theoutlands.TheOutlands;
import com.TheRealDoomSlayer69.theoutlands.world.gen.ore.ModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TheOutlands.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
   }
}
