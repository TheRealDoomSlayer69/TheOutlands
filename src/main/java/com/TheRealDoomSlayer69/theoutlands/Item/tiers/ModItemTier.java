package com.TheRealDoomSlayer69.theoutlands.Item.tiers;


import com.TheRealDoomSlayer69.theoutlands.Item.ModItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModItemTier {
    public static final ForgeTier OUTERIUM = new ForgeTier(16, 2000, 7f,
            5f, 15, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.OUTERIUM_INGOT.get()));

}

