package com.TheRealDoomSlayer69.theoutlands.event;



import com.TheRealDoomSlayer69.theoutlands.TheOutlands;
import com.TheRealDoomSlayer69.theoutlands.particle.ModParticleTypes;
import com.TheRealDoomSlayer69.theoutlands.particle.OutlandsPortalParticle;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TheOutlands.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerParticleFactories(final ParticleFactoryRegisterEvent event) {
        Minecraft.getInstance().particleEngine.register(ModParticleTypes.OUTLANDS_PORTAL_PARTICLE.get(),
                OutlandsPortalParticle.Provider::new);
    }
}
