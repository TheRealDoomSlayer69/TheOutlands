package com.TheRealDoomSlayer69.theoutlands;


import com.TheRealDoomSlayer69.theoutlands.Item.ModItems;
import com.TheRealDoomSlayer69.theoutlands.block.ModBlocks;
import com.TheRealDoomSlayer69.theoutlands.block.ModWoodTypes;
import com.TheRealDoomSlayer69.theoutlands.block.entity.ModBlockEntities;
import com.TheRealDoomSlayer69.theoutlands.dimension.ModDimensions;
import com.TheRealDoomSlayer69.theoutlands.entity.ModEntityTypes;
import com.TheRealDoomSlayer69.theoutlands.particle.ModParticleTypes;
import com.TheRealDoomSlayer69.theoutlands.util.ModPOIs;
import com.TheRealDoomSlayer69.theoutlands.world.feature.register.ModConfiguredFeaturesWithRegister;
import com.TheRealDoomSlayer69.theoutlands.world.feature.register.ModPlacedFeaturesWithRegister;
import com.TheRealDoomSlayer69.theoutlands.world.gen.biome.ModBiomes;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;




@Mod(TheOutlands.MOD_ID)
public class TheOutlands {
    public static final String MOD_ID = "theoutlands";


    public TheOutlands() {
        // Register the setup method for modloading

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        //ModFluids.register(eventBus);
        ModEntityTypes.register(eventBus);
        ModBlockEntities.register(eventBus);
        //ModMenuTypes.register(eventBus);
        ModDimensions.register();
        ModPOIs.register(eventBus);
        ModParticleTypes.register(eventBus);
        ModConfiguredFeaturesWithRegister.register(eventBus);
        ModPlacedFeaturesWithRegister.register(eventBus);


        eventBus.addListener(this::setup);


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    public void setup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
        ModBiomes.toDictionary();
            BlockEntityRenderers.register(ModBlockEntities.SIGN_BLOCK_ENTITIES.get(), SignRenderer::new);
            Sheets.addWoodType(ModWoodTypes.EXODENDRON);
        });
    }


}









