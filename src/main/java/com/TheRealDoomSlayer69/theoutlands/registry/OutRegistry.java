package com.TheRealDoomSlayer69.theoutlands.registry;

import com.TheRealDoomSlayer69.theoutlands.TheOutlands;
import com.TheRealDoomSlayer69.theoutlands.entity.outlander.profession.OutlanderProfessions;
import com.TheRealDoomSlayer69.theoutlands.util.ModPOIs;
import com.google.common.collect.ImmutableSet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryBuilder;
import net.minecraftforge.registries.RegistryObject;

import java.util.Optional;
import java.util.function.Supplier;

public class OutRegistry {

    public static final DeferredRegister<OutlanderProfessions> OUTLANDER_PROFESSIONS_DEFFERED = DeferredRegister.create(new ResourceLocation(TheOutlands.MOD_ID, "outlander_professions"), TheOutlands.MOD_ID);
    public static final Supplier<IForgeRegistry<OutlanderProfessions>> OUTLANDER_PROFESSIONS = OUTLANDER_PROFESSIONS_DEFFERED.makeRegistry(() -> new RegistryBuilder<OutlanderProfessions>().allowModification());
	
	
	    public static final RegistryObject<OutlanderProfessions> SOUL_MERCHANT = OUTLANDER_PROFESSIONS_DEFFERED.register("soul_merchant",
            () -> new OutlanderProfessions("soul_merchant", ModPOIs.EXAMPLE.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_TOOLSMITH));


    public static void register(IEventBus eventBus) {
        OUTLANDER_PROFESSIONS_DEFFERED.register(eventBus);
    }
}
