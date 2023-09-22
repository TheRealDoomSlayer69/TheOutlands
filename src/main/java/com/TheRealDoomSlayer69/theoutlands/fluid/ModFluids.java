package com.TheRealDoomSlayer69.theoutlands.fluid;

import com.TheRealDoomSlayer69.theoutlands.Item.ModItems;
import com.TheRealDoomSlayer69.theoutlands.block.ModBlocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

//public class ModFluids {
    //public static final DeferredRegister<Fluid> FLUIDS   =
            //DeferredRegister.create(ForgeRegistries.FLUIDS, TheOutlands.MOD_ID);

    //public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    //public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    //public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

    //public static final RegistryObject<Fluid> LIQUID_SOULS =
            //FLUIDS.register("liquid_souls", () ->
                    //new ForgeFlowingFluid.Source(ModFluids.SOULS_PROPERTIES));

    //public static final RegistryObject<FlowingFluid> LIQUID_SOULS_FLOWING
           // = FLUIDS.register("liquid_souls_flowing",
            //() -> new ForgeFlowingFluid.Flowing(ModFluids.SOULS_PROPERTIES));


    //public static final ForgeFlowingFluid.Properties SOULS_PROPERTIES = new ForgeFlowingFluid.Properties(
            //() -> LIQUID_SOULS.get(), () -> LIQUID_SOULS_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            //.density(12).luminosity(5).viscosity(3).sound(SoundEvents.WATER_AMBIENT).overlay(WATER_OVERLAY_RL)
            //.color(203)).slopeFindDistance(2).levelDecreasePerBlock(2)
            //.block(() -> ModFluids.SOULS_BLOCK.get()).bucket(() -> ModItems.SOUL_BUCKET.get());

    //public static final RegistryObject<LiquidBlock> SOULS_BLOCK = ModBlocks.BLOCKS.register("souls",
            //() -> new LiquidBlock(() -> ModFluids.LIQUID_SOULS_FLOWING.get(), BlockBehaviour.Properties.of(Material.WATER)
                   // .noCollission().strength(100f).noDrops()));



   // public static void register(IEventBus eventBus) {
       // FLUIDS.register(eventBus);
   // }

//}
