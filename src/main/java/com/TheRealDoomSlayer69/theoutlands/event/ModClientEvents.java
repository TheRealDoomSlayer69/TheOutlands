package com.TheRealDoomSlayer69.theoutlands.event;


import com.TheRealDoomSlayer69.theoutlands.TheOutlands;
import com.TheRealDoomSlayer69.theoutlands.block.ModBlocks;
import com.TheRealDoomSlayer69.theoutlands.block.ModWoodTypes;
import com.TheRealDoomSlayer69.theoutlands.entity.ModEntityTypes;
import com.TheRealDoomSlayer69.theoutlands.entity.boat.ModBoatRenderer;
import com.TheRealDoomSlayer69.theoutlands.util.ModitemProperties;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.awt.*;

@Mod.EventBusSubscriber(modid = TheOutlands.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {

    private ModClientEvents(){

    }
@SubscribeEvent
    public static void clientSetup (FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EXODENDRON_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EXODENDRON_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OUTLANDS_PORTAL.get(), RenderType.translucent());
        WoodType.register(ModWoodTypes.EXODENDRON);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EXODENRON_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EXODENDRON_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LUSH_OUTERSOIL.get(), RenderType.cutoutMipped());

        ModitemProperties.addCustomItemProperties();
        EntityRenderers.register(ModEntityTypes.BOAT_ENTITY.get(), ModBoatRenderer::new);


    }

    @SubscribeEvent
    public static void registerBlockColors(ColorHandlerEvent.Block event) {
        BlockColors colors = event.getBlockColors();

        colors.register((state, tintGetter, pos, tint) ->
                        tintGetter != null && pos != null ? BiomeColors.getAverageGrassColor(tintGetter, pos) : new Color(74, 47, 154).getRGB(),
                ModBlocks.LUSH_OUTERSOIL.get()
        );

    }
    @SubscribeEvent
    public static void registerItemColors(ColorHandlerEvent.Item event) {
        BlockColors bColors = event.getBlockColors();
        ItemColors iColors = event.getItemColors();

        iColors.register((stack, tint) -> bColors.getColor(((BlockItem) stack.getItem()).getBlock().defaultBlockState(), null, null, 0),
                ModBlocks.LUSH_OUTERSOIL.get()

        );


    }
}
