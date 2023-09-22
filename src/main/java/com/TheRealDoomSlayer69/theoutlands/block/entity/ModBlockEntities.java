package com.TheRealDoomSlayer69.theoutlands.block.entity;


import com.TheRealDoomSlayer69.theoutlands.TheOutlands;
import com.TheRealDoomSlayer69.theoutlands.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, TheOutlands.MOD_ID);

   //public static final RegistryObject<BlockEntityType<SoulInfuserBlockEntity>> SOUL_INFUSER =
            //BLOCK_ENTITIES.register("soul_infuser", () ->
                    //BlockEntityType.Builder.of(SoulInfuserBlockEntity::new,
                            //ModBlocks.SOUL_INFUSER.get()).build(null));

    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> SIGN_BLOCK_ENTITIES =
            BLOCK_ENTITIES.register("sign_block_entity", () ->
                    BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            ModBlocks.EXODENDRON_SIGN.get(),
                            ModBlocks.EXODENDRON_WALL_SIGN.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
