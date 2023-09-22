package com.TheRealDoomSlayer69.theoutlands.Item;

import com.TheRealDoomSlayer69.theoutlands.Item.custom.CatalystItem;
import com.TheRealDoomSlayer69.theoutlands.Item.custom.ModBoatItem;
import com.TheRealDoomSlayer69.theoutlands.Item.tiers.ModArmorMaterial;
import com.TheRealDoomSlayer69.theoutlands.Item.tiers.ModItemTier;
import com.TheRealDoomSlayer69.theoutlands.TheOutlands;
import com.TheRealDoomSlayer69.theoutlands.block.ModBlocks;
import com.TheRealDoomSlayer69.theoutlands.entity.boat.ModBoatEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, TheOutlands.MOD_ID);

public static final RegistryObject<Item> OUTERIUM_INGOT =
        ITEMS.register("outerium_ingot", () ->
                new Item(new Item.Properties().tab(ModCreativeModeTab.THE_OUTLANDS)));

public static final RegistryObject<Item> OUTERIUM_NUGGET =
        ITEMS.register("outerium_nugget", () ->
                new Item(new Item.Properties().tab(ModCreativeModeTab.THE_OUTLANDS)));
//tools
public static final RegistryObject<Item> OUTERIUM_SWORD =
        ITEMS.register("outerium_sword", () ->
                new SwordItem(ModItemTier.OUTERIUM, 2, -2.4f,
                        new Item.Properties().tab(ModCreativeModeTab.THE_OUTLANDS)));

public static final RegistryObject<Item> OUTERIUM_BOW = ITEMS.register("outerium_bow",
        () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.THE_OUTLANDS).durability(1500)));

public static final RegistryObject<Item> OUTERIUM_PICKAXE =
        ITEMS.register("outerium_pickaxe", () ->
                new PickaxeItem(ModItemTier.OUTERIUM, -2, -2.8f,
                        new Item.Properties().tab(ModCreativeModeTab.THE_OUTLANDS)));

public static final RegistryObject<Item> OUTERIUM_SHOVEL =
        ITEMS.register("outerium_shovel", () ->
                new ShovelItem(ModItemTier.OUTERIUM, -3, -2.8f,
                        new Item.Properties().tab(ModCreativeModeTab.THE_OUTLANDS)));

public static final RegistryObject<Item> OUTERIUM_HOE =
        ITEMS.register("outerium_hoe", () ->
                new HoeItem(ModItemTier.OUTERIUM, -3, -2.0f,
                        new Item.Properties().tab(ModCreativeModeTab.THE_OUTLANDS)));

public static final RegistryObject<Item> OUTERIUM_AXE =
        ITEMS.register("outerium_axe", () ->
                new AxeItem(ModItemTier.OUTERIUM, 3, -3.1f,
                        new Item.Properties().tab(ModCreativeModeTab.THE_OUTLANDS)));

//Armor
public static final RegistryObject<Item> OUTERIUM_HELMET = ITEMS.register("outerium_helmet",
        () -> new ArmorItem(ModArmorMaterial.OUTERIUM, EquipmentSlot.HEAD,
                new Item.Properties().tab(ModCreativeModeTab.THE_OUTLANDS)));

public static final RegistryObject<Item> OUTERIUM_CHESTPLATE = ITEMS.register("outerium_chestplate",
        () -> new ArmorItem(ModArmorMaterial.OUTERIUM, EquipmentSlot.CHEST,
                new Item.Properties().tab(ModCreativeModeTab.THE_OUTLANDS)));

public static final RegistryObject<Item> OUTERIUM_LEGGINGS = ITEMS.register("outerium_leggings",
        () -> new ArmorItem(ModArmorMaterial.OUTERIUM, EquipmentSlot.LEGS,
                new Item.Properties().tab(ModCreativeModeTab.THE_OUTLANDS)));

public static final RegistryObject<Item> OUTERIUM_BOOTS = ITEMS.register("outerium_boots",
        () -> new ArmorItem(ModArmorMaterial.OUTERIUM, EquipmentSlot.FEET,
                new Item.Properties().tab(ModCreativeModeTab.THE_OUTLANDS)));

public static final RegistryObject<Item> OUTERIUM_HORSE_ARMOR = ITEMS.register("outerium_horse_armor",
        () -> new ShieldItem(
                new Item.Properties().tab(ModCreativeModeTab.THE_OUTLANDS)));

//public static final RegistryObject<Item> SOUL_BUCKET = ITEMS.register("soul_bucket",
        //() -> new BucketItem(ModFluids.LIQUID_SOULS,
                //new Item.Properties().tab(ModCreativeModeTab.THE_AWAKENING)));

   // public static final RegistryObject<Item> OUTERIUM_SHIELD = ITEMS.register("outerium_shield",
           // () -> new OuteriumShieldItem(new Item.Properties()
                    //.tab(ModCreativeModeTab.THE_AWAKENING)))

    public static final RegistryObject<Item> STAFF_OF_THE_OUTLANDS =
            ITEMS.register("staff_of_the_outlands", CatalystItem::new);

    public static final RegistryObject<Item> RAW_OUTERIUM =
            ITEMS.register("raw_outerium", () ->
                    new Item(new Item.Properties().tab(ModCreativeModeTab.THE_OUTLANDS)));

    public static final RegistryObject<Item> EXODENDRON_SIGN_ITEM = ITEMS.register("exodendron_sign",
            () -> new SignItem(new Item.Properties().tab(ModCreativeModeTab.THE_OUTLANDS).stacksTo(16),
                    ModBlocks.EXODENDRON_SIGN.get(), ModBlocks.EXODENDRON_WALL_SIGN.get()));


     public static final RegistryObject<Item> EXODENDRON_BOAT = ITEMS.register("exodendron_boat",
             () -> new ModBoatItem(new Item.Properties().tab(ModCreativeModeTab.THE_OUTLANDS), ModBoatEntity.Type.EXODENDRON));







    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
