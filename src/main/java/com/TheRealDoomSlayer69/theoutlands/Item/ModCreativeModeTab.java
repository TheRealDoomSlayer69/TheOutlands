package com.TheRealDoomSlayer69.theoutlands.Item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

public static final CreativeModeTab THE_OUTLANDS =
        new CreativeModeTab("the_outlands") {

           @Override
            public ItemStack makeIcon() {
                return (new ItemStack(ModItems.OUTERIUM_INGOT.get()));
            }
        };
}
