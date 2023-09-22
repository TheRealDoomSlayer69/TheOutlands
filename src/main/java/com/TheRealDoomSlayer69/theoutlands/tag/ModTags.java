package com.TheRealDoomSlayer69.theoutlands.tag;


import com.TheRealDoomSlayer69.theoutlands.TheOutlands;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.ConfiguredStructureFeature;



public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> PORTAL_FRAME_BLOCKS
                = tag("portal_frame_blocks");

        public static final TagKey<Block> OUTERSTONE_ORE_REPLACEABLES
                = tag("outerstone_ore_replaceables");

        public static final TagKey<Block> EXODENDRON_LOGS
                = tag("exodendron_logs");


        private static TagKey<Block> tag(String name){ return
                BlockTags.create(new ResourceLocation(TheOutlands.MOD_ID, name));
        }
        private static TagKey<Block> forgeTag(String name){ return
                BlockTags.create(new ResourceLocation("forge", name));
        }
    }

}
