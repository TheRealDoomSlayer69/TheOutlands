package com.TheRealDoomSlayer69.theoutlands.block;

import com.TheRealDoomSlayer69.theoutlands.Item.ModCreativeModeTab;
import com.TheRealDoomSlayer69.theoutlands.Item.ModItems;
import com.TheRealDoomSlayer69.theoutlands.block.custom.LushOutersoilBlock;
import com.TheRealDoomSlayer69.theoutlands.block.custom.ModFlammableRotatedPillarBlock;
import com.TheRealDoomSlayer69.theoutlands.block.custom.ModSaplingBlock;
import com.TheRealDoomSlayer69.theoutlands.block.custom.OutersoilPathBlock;
import com.TheRealDoomSlayer69.theoutlands.block.custom.portal.OUTPortalBlock;
import com.TheRealDoomSlayer69.theoutlands.block.custom.sign.ModStandingSignBlock;
import com.TheRealDoomSlayer69.theoutlands.block.custom.sign.ModWallSignBlock;
import com.TheRealDoomSlayer69.theoutlands.world.feature.tree.ExodendronTreeGrower;
import com.TheRealDoomSlayer69.theoutlands.TheOutlands;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TheOutlands.MOD_ID);

    public static final RegistryObject<Block> OUTERIUM_BLOCK = registerBlock("outerium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THE_OUTLANDS);

    public static final RegistryObject<Block> PURE_OUTERIUM_ORE = registerBlock("pure_outerium_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(4, 12)), ModCreativeModeTab.THE_OUTLANDS);

    public static final RegistryObject<Block> OUTERIUM_ORE = registerBlock("outerium_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)), ModCreativeModeTab.THE_OUTLANDS);

    public static final RegistryObject<Block> DEEPSLATE_OUTERIUM_ORE = registerBlock("deepslate_outerium_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops(),UniformInt.of(3,7)), ModCreativeModeTab.THE_OUTLANDS);

    public static final RegistryObject<Block>EXODENDRON_DOOR = registerBlock("exodendron_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).strength(2F)
                    .requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.THE_OUTLANDS);

    public static final RegistryObject<Block> OUTERIUM_PRESSURE_PLATE = registerBlock("outerium_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.THE_OUTLANDS);

    public static final RegistryObject<Block> OUTERIUM_BUTTON = registerBlock("outerium_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL).strength(3f)
                    .requiresCorrectToolForDrops().noCollission()), ModCreativeModeTab.THE_OUTLANDS);

    //public static final RegistryObject<Block> SOUL_INFUSER = registerBlock("soul_infuser",
           //() -> new SoulInfuserBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()),
            //ModCreativeModeTab.THE_AWAKENING);

    public static final RegistryObject<Block> OUTERSTONE = registerBlock("outerstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.THE_OUTLANDS);

    public static final RegistryObject<Block> OUTERSTONE_WALL = registerBlock("outerstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.THE_OUTLANDS);

    public static final RegistryObject<Block> COBBLED_OUTERSTONE = registerBlock("cobbled_outerstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.THE_OUTLANDS);

    public static final RegistryObject<Block> OUTERSTONE_BRICKS = registerBlock("outerstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.THE_OUTLANDS);

    public static final RegistryObject<Block> MOSSY_OUTERSTONE_BRICKS = registerBlock("mossy_outerstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.THE_OUTLANDS);

    public static final RegistryObject<Block> CRACKED_OUTERSTONE_BRICKS = registerBlock("cracked_outerstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.THE_OUTLANDS);
    public static final RegistryObject<Block> OUTERSOIL = registerBlock("outersoil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)), ModCreativeModeTab.THE_OUTLANDS);

    public static final RegistryObject<Block> OUTERSOIL_PATH = registerBlock("outersoil_path",
            () -> new OutersoilPathBlock(BlockBehaviour.Properties.copy(Blocks.DIRT_PATH)), ModCreativeModeTab.THE_OUTLANDS);

    public static final RegistryObject<Block> LUSH_OUTERSOIL = registerBlock("lush_outersoil",
            () -> new LushOutersoilBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)), ModCreativeModeTab.THE_OUTLANDS);

    public static final RegistryObject<Block> LUSH_OUTERSOIL_SNOW = registerBlock("lush_outersoil_snow",
            () -> new Block(BlockBehaviour.Properties.copy(ModBlocks.LUSH_OUTERSOIL.get())), ModCreativeModeTab.THE_OUTLANDS);


    public static final RegistryObject<Block> EXODENDRON_LOG = registerBlock("exodendron_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            ModCreativeModeTab.THE_OUTLANDS);
    public static final RegistryObject<Block> EXODENDRON_WOOD = registerBlock("exodendron_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
            ModCreativeModeTab.THE_OUTLANDS);
    public static final RegistryObject<Block> STRIPPED_EXODENDRON_LOG = registerBlock("stripped_exodendron_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
            ModCreativeModeTab.THE_OUTLANDS);
    public static final RegistryObject<Block> STRIPPED_EXODENDRON_WOOD = registerBlock("stripped_exodendron_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),
            ModCreativeModeTab.THE_OUTLANDS);

    public static final RegistryObject<Block> EXODENDRON_PLANKS = registerBlock("exodendron_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModeTab.THE_OUTLANDS);

    public static final RegistryObject<Block> EXODENRON_LEAVES = registerBlock("exodendron_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, ModCreativeModeTab.THE_OUTLANDS);

    public static final RegistryObject<Block> EXODENDRON_SAPLING = registerBlock("exodendron_sapling",
            () -> new ModSaplingBlock(new ExodendronTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING),
                    () -> ModBlocks.LUSH_OUTERSOIL.get()), ModCreativeModeTab.THE_OUTLANDS);


    public static final RegistryObject<Block> EXODENDRON_FENCE = registerBlock("exodendron_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.THE_OUTLANDS);
    public static final RegistryObject<Block> EXODENDRON_FENCE_GATE = registerBlock("exodendron_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.THE_OUTLANDS);

    public static final RegistryObject<Block> EXODENDRON_STAIRS = registerBlock("exodendron_stairs",
            () -> new StairBlock(() -> ModBlocks.EXODENDRON_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD)
                            .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.THE_OUTLANDS);

    public static final RegistryObject<Block> OUTERSTONE_BRICK_STAIRS = registerBlock("outerstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.OUTERSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.THE_OUTLANDS);

    public static final RegistryObject<Block> COBBLED_OUTERSTONE_STAIRS = registerBlock("cobbled_outerstone_stairs",
            () -> new StairBlock(() -> ModBlocks.COBBLED_OUTERSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.THE_OUTLANDS);
    public static final RegistryObject<Block> EXODENDRON_SLAB = registerBlock("exodendron_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.THE_OUTLANDS);

    public static final RegistryObject<Block> EXODENDRON_TRAPDOOR = registerBlock("exodendron_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.THE_OUTLANDS);




    public static final RegistryObject<Block> OUTLANDS_PORTAL = registerBlockWithoutBlockItem("outlands_portal",
            OUTPortalBlock::new);


    public static final RegistryObject<Block> EXODENDRON_SIGN = BLOCKS.register("exodendron_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD), ModWoodTypes.EXODENDRON));

    public static final RegistryObject<Block> EXODENDRON_WALL_SIGN = BLOCKS.register("exodendron_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD), ModWoodTypes.EXODENDRON));





    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab, String tooltipKey) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)){

        });
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    private static <T extends Block> RegistryObject<Block> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
