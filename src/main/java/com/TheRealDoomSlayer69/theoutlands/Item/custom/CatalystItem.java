package com.TheRealDoomSlayer69.theoutlands.Item.custom;

import com.TheRealDoomSlayer69.theoutlands.Item.ModCreativeModeTab;
import com.TheRealDoomSlayer69.theoutlands.block.ModBlocks;
import com.TheRealDoomSlayer69.theoutlands.block.custom.portal.OUTPortalBlock;
import com.TheRealDoomSlayer69.theoutlands.dimension.ModDimensions;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class CatalystItem extends Item {

    public CatalystItem() {
        super(new Properties()
                .tab(ModCreativeModeTab.THE_OUTLANDS)
                .stacksTo(1)
                .rarity(Rarity.EPIC)
        );
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        if(context.getPlayer() != null) {
            if(context.getPlayer().level.dimension() == ModDimensions.OUTLANDS_KEY
                    || context.getPlayer().level.dimension() == Level.OVERWORLD) {
                for(Direction direction : Direction.Plane.VERTICAL) {
                    BlockPos framePos = context.getClickedPos().relative(direction);
                    if(((OUTPortalBlock) ModBlocks.OUTLANDS_PORTAL.get()).trySpawnPortal(context.getLevel(), framePos)) {
                        context.getLevel().playSound(context.getPlayer(), framePos,
                                SoundEvents.PORTAL_TRIGGER, SoundSource.BLOCKS, 1.0F, 1.0F);
                        return InteractionResult.CONSUME;
                    }
                    else return InteractionResult.FAIL;
                }
            }
        }
        return InteractionResult.FAIL;
    }
}
