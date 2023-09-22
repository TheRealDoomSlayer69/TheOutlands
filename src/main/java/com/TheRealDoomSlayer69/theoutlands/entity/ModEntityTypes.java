package com.TheRealDoomSlayer69.theoutlands.entity;


import com.TheRealDoomSlayer69.theoutlands.TheOutlands;
import com.TheRealDoomSlayer69.theoutlands.entity.boat.ModBoatEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, TheOutlands.MOD_ID);

     public static final RegistryObject<EntityType<ModBoatEntity>> BOAT_ENTITY =
             ENTITY_TYPES.register("exodendron_boat", () -> EntityType.Builder.<ModBoatEntity>of(ModBoatEntity::new,
                             MobCategory.MISC).fireImmune().sized(1.375F, 0.5625F)
                     .setCustomClientFactory((spawnEntity, world) -> new ModBoatEntity(world, 0, 0, 0))
                     .build("exodendron_boat"));



    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
