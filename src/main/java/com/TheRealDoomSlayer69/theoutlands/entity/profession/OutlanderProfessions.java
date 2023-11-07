package com.TheRealDoomSlayer69.theoutlands.entity.outlander.profession;

import com.TheRealDoomSlayer69.theoutlands.registry.OutRegistry;
import com.TheRealDoomSlayer69.theoutlands.util.ModPOIs;
import com.google.common.collect.ImmutableSet;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistryEntry;

import javax.annotation.Nullable;

public class OutlanderProfessions extends ForgeRegistryEntry<OutlanderProfessions> {

    public static final OutlanderProfessions NONE;
    public static final OutlanderProfessions SOUL_MERCHANT;
    private final String name;
    private final PoiType jobPoiType;
    private final ImmutableSet<Item> requestedItems;
    private final ImmutableSet<Block> secondaryPoi;
    @Nullable
    private final SoundEvent workSound;

    public OutlanderProfessions(String pName, PoiType pJobPoiType, ImmutableSet<Item> pRequestedItems, ImmutableSet<Block> pSecondaryPoi, @Nullable SoundEvent pWorkSound) {
        this.name = pName;
        this.jobPoiType = pJobPoiType;
        this.requestedItems = pRequestedItems;
        this.secondaryPoi = pSecondaryPoi;
        this.workSound = pWorkSound;
    }

    public String getName() {
        return this.name;
    }

    public PoiType getJobPoiType() {
        return this.jobPoiType;
    }

    public ImmutableSet<Item> getRequestedItems() {
        return this.requestedItems;
    }

    public ImmutableSet<Block> getSecondaryPoi() {
        return this.secondaryPoi;
    }

    @Nullable
    public SoundEvent getWorkSound() {
        return this.workSound;
    }

    public String toString() {
        return this.name;
    }

    static OutlanderProfessions register(String pName, PoiType pJobPoiType, @Nullable SoundEvent pWorkSound) {
        return register(pName, pJobPoiType, ImmutableSet.of(), ImmutableSet.of(), pWorkSound);
    }

    static OutlanderProfessions register(String pName, PoiType pJobPoiType, ImmutableSet<Item> pRequestedItems, ImmutableSet<Block> pSecondaryPoi, @Nullable SoundEvent pWorkSound) {
        return (OutRegistry.OUTLANDER_PROFESSIONS.get()), new ResourceLocation(pName), new OutlanderProfessions(pName, pJobPoiType, pRequestedItems, pSecondaryPoi, pWorkSound));
    }

    static {
        NONE = register("none", PoiType.UNEMPLOYED, (SoundEvent)null);
        SOUL_MERCHANT = register("soul_merchant", ModPOIs.EXAMPLE.get(), SoundEvents.VILLAGER_WORK_TOOLSMITH);
    }
}

