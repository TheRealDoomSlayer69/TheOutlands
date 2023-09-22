package com.TheRealDoomSlayer69.theoutlands.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.PortalParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.particle.Particle;

public class OutlandsPortalParticle extends PortalParticle {

private OutlandsPortalParticle(ClientLevel level, double x, double y, double z, double motionX, double motionY, double motionZ) {
    super(level, x, y, z, motionX, motionY, motionZ);
}

    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public Provider(SpriteSet spriteSet) {
            this.spriteSet = spriteSet;
        }

        @Override
        public Particle createParticle(SimpleParticleType particleType, ClientLevel level, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            OutlandsPortalParticle portalParticle = new OutlandsPortalParticle(level, x, y, z, xSpeed, ySpeed, zSpeed);
            portalParticle.pickSprite(this.spriteSet);
            portalParticle.setColor(0.0F, 0.25F, 0.05F);
            return portalParticle;
        }
    }
}
