package net.marmar.rotten_planks_and_logs.block;

import net.marmar.rotten_planks_and_logs.RottenPlanksAndLogs;
import net.marmar.rotten_planks_and_logs.block.custom.RottenLogsBlock;
import net.marmar.rotten_planks_and_logs.block.custom.RottenPlanksBlock;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;


import java.util.function.Supplier;

public class RPLBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(RottenPlanksAndLogs.MOD_ID);
    public static final DeferredRegister.Items BLOCK_ITEMS = DeferredRegister.createItems(RottenPlanksAndLogs.MOD_ID);

    //Acacia
    public static final DeferredBlock<Block> ROTTEN_ACACIA_LOG = registerBlockWithItem("rotten_acacia_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_LOG)));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_ACACIA_LOG = registerBlockWithItem("stripped_rotten_acacia_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_ACACIA_LOG)));
    public static final DeferredBlock<Block> ROTTEN_ACACIA_WOOD = registerBlockWithItem("rotten_acacia_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_ACACIA_WOOD = registerBlockWithItem("stripped_rotten_acacia_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_ACACIA_WOOD)));
    public static final DeferredBlock<Block> ROTTEN_ACACIA_PLANKS = registerBlockWithItem("rotten_acacia_planks",
            () -> new RottenPlanksBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)));
    public static final DeferredBlock<Block> ROTTEN_ACACIA_BUTTON = registerBlockWithItem("rotten_acacia_button",
            () -> new ButtonBlock(BlockSetType.ACACIA, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_BUTTON)));
    public static final DeferredBlock<Block> ROTTEN_ACACIA_PRESSURE_PLATE = registerBlockWithItem("rotten_acacia_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.ACACIA, BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PRESSURE_PLATE)));
    public static final DeferredBlock<Block> ROTTEN_ACACIA_SLAB = registerBlockWithItem("rotten_acacia_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_SLAB)));
    public static final DeferredBlock<Block> ROTTEN_ACACIA_STAIRS = registerBlockWithItem("rotten_acacia_stairs",
            () -> new StairBlock(ROTTEN_ACACIA_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_STAIRS)));
    public static final DeferredBlock<Block> ROTTEN_ACACIA_FENCE = registerBlockWithItem("rotten_acacia_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_FENCE)));
    public static final DeferredBlock<Block> ROTTEN_ACACIA_FENCE_GATE = registerBlockWithItem("rotten_acacia_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_FENCE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<Block> ROTTEN_ACACIA_DOOR = registerBlockWithItem("rotten_acacia_door",
            () -> new DoorBlock(BlockSetType.ACACIA, BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_DOOR).noOcclusion()));
    public static final DeferredBlock<Block> ROTTEN_ACACIA_TRAPDOOR = registerBlockWithItem("rotten_acacia_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.ACACIA, BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_TRAPDOOR).noOcclusion()));

    //Bamboo
    public static final DeferredBlock<Block> ROTTEN_BAMBOO_PLANKS = registerBlockWithItem("rotten_bamboo_planks",
            () -> new RottenPlanksBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<Block> ROTTEN_BAMBOO_BUTTON = registerBlockWithItem("rotten_bamboo_button",
            () -> new ButtonBlock(BlockSetType.OAK, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    public static final DeferredBlock<Block> ROTTEN_BAMBOO_PRESSURE_PLATE = registerBlockWithItem("rotten_bamboo_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<Block> ROTTEN_BAMBOO_SLAB = registerBlockWithItem("rotten_bamboo_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<Block> ROTTEN_BAMBOO_STAIRS = registerBlockWithItem("rotten_bamboo_stairs",
            () -> new StairBlock(ROTTEN_BAMBOO_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<Block> ROTTEN_BAMBOO_FENCE = registerBlockWithItem("rotten_bamboo_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<Block> ROTTEN_BAMBOO_FENCE_GATE = registerBlockWithItem("rotten_bamboo_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<Block> ROTTEN_BAMBOO_DOOR = registerBlockWithItem("rotten_bamboo_door",
            () -> new DoorBlock(BlockSetType.BAMBOO, BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_DOOR).noOcclusion()));
    public static final DeferredBlock<Block> ROTTEN_BAMBOO_TRAPDOOR = registerBlockWithItem("rotten_bamboo_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.BAMBOO, BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_TRAPDOOR).noOcclusion()));

    //Birch
    public static final DeferredBlock<Block> ROTTEN_BIRCH_LOG = registerBlockWithItem("rotten_birch_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_LOG)));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_BIRCH_LOG = registerBlockWithItem("stripped_rotten_birch_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_BIRCH_LOG)));
    public static final DeferredBlock<Block> ROTTEN_BIRCH_WOOD = registerBlockWithItem("rotten_birch_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_BIRCH_WOOD = registerBlockWithItem("stripped_rotten_birch_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_BIRCH_WOOD)));
    public static final DeferredBlock<Block> ROTTEN_BIRCH_PLANKS = registerBlockWithItem("rotten_birch_planks",
            () -> new RottenPlanksBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)));
    public static final DeferredBlock<Block> ROTTEN_BIRCH_BUTTON = registerBlockWithItem("rotten_birch_button",
            () -> new ButtonBlock(BlockSetType.BIRCH, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_BUTTON)));
    public static final DeferredBlock<Block> ROTTEN_BIRCH_PRESSURE_PLATE = registerBlockWithItem("rotten_birch_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.BIRCH, BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PRESSURE_PLATE)));
    public static final DeferredBlock<Block> ROTTEN_BIRCH_SLAB = registerBlockWithItem("rotten_birch_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_SLAB)));
    public static final DeferredBlock<Block> ROTTEN_BIRCH_STAIRS = registerBlockWithItem("rotten_birch_stairs",
            () -> new StairBlock(ROTTEN_BIRCH_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_STAIRS)));
    public static final DeferredBlock<Block> ROTTEN_BIRCH_FENCE = registerBlockWithItem("rotten_birch_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_FENCE)));
    public static final DeferredBlock<Block> ROTTEN_BIRCH_FENCE_GATE = registerBlockWithItem("rotten_birch_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_FENCE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<Block> ROTTEN_BIRCH_DOOR = registerBlockWithItem("rotten_birch_door",
            () -> new DoorBlock(BlockSetType.BIRCH, BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_DOOR).noOcclusion()));
    public static final DeferredBlock<Block> ROTTEN_BIRCH_TRAPDOOR = registerBlockWithItem("rotten_birch_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.BIRCH, BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_TRAPDOOR).noOcclusion()));

    //Cherry
    public static final DeferredBlock<Block> ROTTEN_CHERRY_LOG = registerBlockWithItem("rotten_cherry_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LOG)));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_CHERRY_LOG = registerBlockWithItem("stripped_rotten_cherry_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_CHERRY_LOG)));
    public static final DeferredBlock<Block> ROTTEN_CHERRY_WOOD = registerBlockWithItem("rotten_cherry_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_CHERRY_WOOD = registerBlockWithItem("stripped_rotten_cherry_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_CHERRY_WOOD)));
    public static final DeferredBlock<Block> ROTTEN_CHERRY_PLANKS = registerBlockWithItem("rotten_cherry_planks",
            () -> new RottenPlanksBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final DeferredBlock<Block> ROTTEN_CHERRY_BUTTON = registerBlockWithItem("rotten_cherry_button",
            () -> new ButtonBlock(BlockSetType.CHERRY, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_BUTTON)));
    public static final DeferredBlock<Block> ROTTEN_CHERRY_PRESSURE_PLATE = registerBlockWithItem("rotten_cherry_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PRESSURE_PLATE)));
    public static final DeferredBlock<Block> ROTTEN_CHERRY_SLAB = registerBlockWithItem("rotten_cherry_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_SLAB)));
    public static final DeferredBlock<Block> ROTTEN_CHERRY_STAIRS = registerBlockWithItem("rotten_cherry_stairs",
            () -> new StairBlock(ROTTEN_CHERRY_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_STAIRS)));
    public static final DeferredBlock<Block> ROTTEN_CHERRY_FENCE = registerBlockWithItem("rotten_cherry_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_FENCE)));
    public static final DeferredBlock<Block> ROTTEN_CHERRY_FENCE_GATE = registerBlockWithItem("rotten_cherry_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_FENCE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<Block> ROTTEN_CHERRY_DOOR = registerBlockWithItem("rotten_cherry_door",
            () -> new DoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_DOOR).noOcclusion()));
    public static final DeferredBlock<Block> ROTTEN_CHERRY_TRAPDOOR = registerBlockWithItem("rotten_cherry_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_TRAPDOOR).noOcclusion()));

    //Dark oak
    public static final DeferredBlock<Block> ROTTEN_DARK_OAK_LOG = registerBlockWithItem("rotten_dark_oak_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_DARK_OAK_LOG = registerBlockWithItem("stripped_rotten_dark_oak_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_DARK_OAK_LOG)));
    public static final DeferredBlock<Block> ROTTEN_DARK_OAK_WOOD = registerBlockWithItem("rotten_dark_oak_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_DARK_OAK_WOOD = registerBlockWithItem("stripped_rotten_dark_oak_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_DARK_OAK_WOOD)));
    public static final DeferredBlock<Block> ROTTEN_DARK_OAK_PLANKS = registerBlockWithItem("rotten_dark_oak_planks",
            () -> new RottenPlanksBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)));
    public static final DeferredBlock<Block> ROTTEN_DARK_OAK_BUTTON = registerBlockWithItem("rotten_dark_oak_button",
            () -> new ButtonBlock(BlockSetType.DARK_OAK, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_BUTTON)));
    public static final DeferredBlock<Block> ROTTEN_DARK_OAK_PRESSURE_PLATE = registerBlockWithItem("rotten_dark_oak_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.DARK_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<Block> ROTTEN_DARK_OAK_SLAB = registerBlockWithItem("rotten_dark_oak_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_SLAB)));
    public static final DeferredBlock<Block> ROTTEN_DARK_OAK_STAIRS = registerBlockWithItem("rotten_dark_oak_stairs",
            () -> new StairBlock(ROTTEN_DARK_OAK_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_STAIRS)));
    public static final DeferredBlock<Block> ROTTEN_DARK_OAK_FENCE = registerBlockWithItem("rotten_dark_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_FENCE)));
    public static final DeferredBlock<Block> ROTTEN_DARK_OAK_FENCE_GATE = registerBlockWithItem("rotten_dark_oak_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_FENCE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<Block> ROTTEN_DARK_OAK_DOOR = registerBlockWithItem("rotten_dark_oak_door",
            () -> new DoorBlock(BlockSetType.DARK_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_DOOR).noOcclusion()));
    public static final DeferredBlock<Block> ROTTEN_DARK_OAK_TRAPDOOR = registerBlockWithItem("rotten_dark_oak_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.DARK_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_TRAPDOOR).noOcclusion()));

    //Jungle
    public static final DeferredBlock<Block> ROTTEN_JUNGLE_LOG = registerBlockWithItem("rotten_jungle_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_LOG)));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_JUNGLE_LOG = registerBlockWithItem("stripped_rotten_jungle_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_JUNGLE_LOG)));
    public static final DeferredBlock<Block> ROTTEN_JUNGLE_WOOD = registerBlockWithItem("rotten_jungle_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_JUNGLE_WOOD = registerBlockWithItem("stripped_rotten_jungle_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_JUNGLE_WOOD)));
    public static final DeferredBlock<Block> ROTTEN_JUNGLE_PLANKS = registerBlockWithItem("rotten_jungle_planks",
            () -> new RottenPlanksBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)));
    public static final DeferredBlock<Block> ROTTEN_JUNGLE_BUTTON = registerBlockWithItem("rotten_jungle_button",
            () -> new ButtonBlock(BlockSetType.JUNGLE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_BUTTON)));
    public static final DeferredBlock<Block> ROTTEN_JUNGLE_PRESSURE_PLATE = registerBlockWithItem("rotten_jungle_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.JUNGLE, BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PRESSURE_PLATE)));
    public static final DeferredBlock<Block> ROTTEN_JUNGLE_SLAB = registerBlockWithItem("rotten_jungle_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_SLAB)));
    public static final DeferredBlock<Block> ROTTEN_JUNGLE_STAIRS = registerBlockWithItem("rotten_jungle_stairs",
            () -> new StairBlock(ROTTEN_JUNGLE_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_STAIRS)));
    public static final DeferredBlock<Block> ROTTEN_JUNGLE_FENCE = registerBlockWithItem("rotten_jungle_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_FENCE)));
    public static final DeferredBlock<Block> ROTTEN_JUNGLE_FENCE_GATE = registerBlockWithItem("rotten_jungle_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_FENCE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<Block> ROTTEN_JUNGLE_DOOR = registerBlockWithItem("rotten_jungle_door",
            () -> new DoorBlock(BlockSetType.JUNGLE, BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_DOOR).noOcclusion()));
    public static final DeferredBlock<Block> ROTTEN_JUNGLE_TRAPDOOR = registerBlockWithItem("rotten_jungle_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.JUNGLE, BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_TRAPDOOR).noOcclusion()));

    //Mangle
    public static final DeferredBlock<Block> ROTTEN_MANGROVE_LOG = registerBlockWithItem("rotten_mangrove_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_LOG)));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_MANGROVE_LOG = registerBlockWithItem("stripped_rotten_mangrove_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_MANGROVE_LOG)));
    public static final DeferredBlock<Block> ROTTEN_MANGROVE_WOOD = registerBlockWithItem("rotten_mangrove_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_MANGROVE_WOOD = registerBlockWithItem("stripped_rotten_mangrove_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_MANGROVE_WOOD)));
    public static final DeferredBlock<Block> ROTTEN_MANGROVE_PLANKS = registerBlockWithItem("rotten_mangrove_planks",
            () -> new RottenPlanksBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)));
    public static final DeferredBlock<Block> ROTTEN_MANGROVE_BUTTON = registerBlockWithItem("rotten_mangrove_button",
            () -> new ButtonBlock(BlockSetType.MANGROVE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_BUTTON)));
    public static final DeferredBlock<Block> ROTTEN_MANGROVE_PRESSURE_PLATE = registerBlockWithItem("rotten_mangrove_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PRESSURE_PLATE)));
    public static final DeferredBlock<Block> ROTTEN_MANGROVE_SLAB = registerBlockWithItem("rotten_mangrove_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_SLAB)));
    public static final DeferredBlock<Block> ROTTEN_MANGROVE_STAIRS = registerBlockWithItem("rotten_mangrove_stairs",
            () -> new StairBlock(ROTTEN_MANGROVE_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_STAIRS)));
    public static final DeferredBlock<Block> ROTTEN_MANGROVE_FENCE = registerBlockWithItem("rotten_mangrove_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_FENCE)));
    public static final DeferredBlock<Block> ROTTEN_MANGROVE_FENCE_GATE = registerBlockWithItem("rotten_mangrove_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_FENCE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<Block> ROTTEN_MANGROVE_DOOR = registerBlockWithItem("rotten_mangrove_door",
            () -> new DoorBlock(BlockSetType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_DOOR).noOcclusion()));
    public static final DeferredBlock<Block> ROTTEN_MANGROVE_TRAPDOOR = registerBlockWithItem("rotten_mangrove_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_TRAPDOOR).noOcclusion()));

    //Spruce
    public static final DeferredBlock<Block> ROTTEN_SPRUCE_LOG = registerBlockWithItem("rotten_spruce_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LOG)));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_SPRUCE_LOG = registerBlockWithItem("stripped_rotten_spruce_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_SPRUCE_LOG)));
    public static final DeferredBlock<Block> ROTTEN_SPRUCE_WOOD = registerBlockWithItem("rotten_spruce_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_SPRUCE_WOOD = registerBlockWithItem("stripped_rotten_spruce_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_SPRUCE_WOOD)));
    public static final DeferredBlock<Block> ROTTEN_SPRUCE_PLANKS = registerBlockWithItem("rotten_spruce_planks",
            () -> new RottenPlanksBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)));
    public static final DeferredBlock<Block> ROTTEN_SPRUCE_BUTTON = registerBlockWithItem("rotten_spruce_button",
            () -> new ButtonBlock(BlockSetType.SPRUCE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_BUTTON)));
    public static final DeferredBlock<Block> ROTTEN_SPRUCE_PRESSURE_PLATE = registerBlockWithItem("rotten_spruce_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PRESSURE_PLATE)));
    public static final DeferredBlock<Block> ROTTEN_SPRUCE_SLAB = registerBlockWithItem("rotten_spruce_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_SLAB)));
    public static final DeferredBlock<Block> ROTTEN_SPRUCE_STAIRS = registerBlockWithItem("rotten_spruce_stairs",
            () -> new StairBlock(ROTTEN_SPRUCE_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_STAIRS)));
    public static final DeferredBlock<Block> ROTTEN_SPRUCE_FENCE = registerBlockWithItem("rotten_spruce_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_FENCE)));
    public static final DeferredBlock<Block> ROTTEN_SPRUCE_FENCE_GATE = registerBlockWithItem("rotten_spruce_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_FENCE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<Block> ROTTEN_SPRUCE_DOOR = registerBlockWithItem("rotten_spruce_door",
            () -> new DoorBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_DOOR).noOcclusion()));
    public static final DeferredBlock<Block> ROTTEN_SPRUCE_TRAPDOOR = registerBlockWithItem("rotten_spruce_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_TRAPDOOR).noOcclusion()));

    //Oak
    public static final DeferredBlock<Block> ROTTEN_OAK_LOG = registerBlockWithItem("rotten_oak_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_OAK_LOG = registerBlockWithItem("stripped_rotten_oak_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> ROTTEN_OAK_WOOD = registerBlockWithItem("rotten_oak_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_OAK_WOOD = registerBlockWithItem("stripped_rotten_oak_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> ROTTEN_OAK_PLANKS = registerBlockWithItem("rotten_oak_planks",
            () -> new RottenPlanksBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<Block> ROTTEN_OAK_BUTTON = registerBlockWithItem("rotten_oak_button",
            () -> new ButtonBlock(BlockSetType.OAK, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    public static final DeferredBlock<Block> ROTTEN_OAK_PRESSURE_PLATE = registerBlockWithItem("rotten_oak_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<Block> ROTTEN_OAK_SLAB = registerBlockWithItem("rotten_oak_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<Block> ROTTEN_OAK_STAIRS = registerBlockWithItem("rotten_oak_stairs",
            () -> new StairBlock(ROTTEN_OAK_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<Block> ROTTEN_OAK_FENCE = registerBlockWithItem("rotten_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<Block> ROTTEN_OAK_FENCE_GATE = registerBlockWithItem("rotten_oak_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<Block> ROTTEN_OAK_DOOR = registerBlockWithItem("rotten_oak_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    public static final DeferredBlock<Block> ROTTEN_OAK_TRAPDOOR = registerBlockWithItem("rotten_oak_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));

    //Helper methods
    private static <T extends Block> DeferredBlock<T> registerBlockWithItem(String name, Supplier<T> block){
        DeferredBlock<T> ToReturn = BLOCKS.register(name, block);
        registerBlockItem(name, ToReturn);
        return ToReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        BLOCK_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
        BLOCK_ITEMS.register(eventBus);
    }
}
