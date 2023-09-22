package com.TheRealDoomSlayer69.theoutlands.particle;

import com.TheRealDoomSlayer69.theoutlands.TheOutlands;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModParticleTypes {

public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
        DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, TheOutlands.MOD_ID);

public static final RegistryObject<SimpleParticleType> OUTLANDS_PORTAL_PARTICLE =
        PARTICLE_TYPES.register("outlands_portal_particle", () -> new SimpleParticleType(false));

public static void register(IEventBus eventBus) {
        PARTICLE_TYPES.register(eventBus);
        }
}



