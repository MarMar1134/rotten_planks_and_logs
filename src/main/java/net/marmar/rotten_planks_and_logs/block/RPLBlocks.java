package net.marmar.rotten_planks_and_logs.block;

import net.marmar.rotten_planks_and_logs.RottenPlanksAndLogs;
import net.marmar.rotten_planks_and_logs.block.custom.RottenLogsBlock;
import net.marmar.rotten_planks_and_logs.block.custom.RottenPlanksBlock;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;


import java.util.function.Function;

public class RPLBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(RottenPlanksAndLogs.MOD_ID);
    public static final DeferredRegister.Items BLOCK_ITEMS = DeferredRegister.createItems(RottenPlanksAndLogs.MOD_ID);

    //Acacia
    public static final DeferredBlock<Block> ROTTEN_ACACIA_LOG = registerBlock("rotten_acacia_log",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_ACACIA_LOG = registerBlock("stripped_rotten_acacia_log",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_ACACIA_WOOD = registerBlock("rotten_acacia_wood",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_ACACIA_WOOD = registerBlock("stripped_rotten_acacia_wood",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_ACACIA_PLANKS = registerBlock("rotten_acacia_planks",
            (properties) -> new RottenPlanksBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_ACACIA_BUTTON = registerBlock("rotten_acacia_button",
            (properties) -> new ButtonBlock(BlockSetType.ACACIA, 10,properties.strength(2f)));
    public static final DeferredBlock<Block> ROTTEN_ACACIA_PRESSURE_PLATE = registerBlock("rotten_acacia_pressure_plate",
            (properties) -> new PressurePlateBlock(BlockSetType.ACACIA,properties.strength(2f)));
    public static final DeferredBlock<Block> ROTTEN_ACACIA_SLAB = registerBlock("rotten_acacia_slab",
            (properties) -> new SlabBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_ACACIA_STAIRS = registerBlock("rotten_acacia_stairs",
            (properties) -> new StairBlock(Blocks.ACACIA_PLANKS.defaultBlockState(), properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_ACACIA_FENCE = registerBlock("rotten_acacia_fence",
            (properties) -> new FenceBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_ACACIA_FENCE_GATE = registerBlock("rotten_acacia_fence_gate",
            (properties) -> new FenceGateBlock(properties.strength(2f).ignitedByLava(), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<Block> ROTTEN_ACACIA_DOOR = registerBlock("rotten_acacia_door",
            (properties) -> new DoorBlock(BlockSetType.ACACIA,properties.strength(2f).noOcclusion().ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_ACACIA_TRAPDOOR = registerBlock("rotten_acacia_trapdoor",
            (properties) -> new TrapDoorBlock(BlockSetType.ACACIA,properties.strength(2f).noOcclusion().ignitedByLava()));

    //Bamboo
    public static final DeferredBlock<Block> ROTTEN_BAMBOO_PLANKS = registerBlock("rotten_bamboo_planks",
            (properties) -> new RottenPlanksBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_BAMBOO_BUTTON = registerBlock("rotten_bamboo_button",
            (properties) -> new ButtonBlock(BlockSetType.OAK, 10, properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_BAMBOO_PRESSURE_PLATE = registerBlock("rotten_bamboo_pressure_plate",
            (properties) -> new PressurePlateBlock(BlockSetType.OAK,properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_BAMBOO_SLAB = registerBlock("rotten_bamboo_slab",
            (properties) -> new SlabBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_BAMBOO_STAIRS = registerBlock("rotten_bamboo_stairs",
            (properties) -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_BAMBOO_FENCE = registerBlock("rotten_bamboo_fence",
            (properties) -> new FenceBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_BAMBOO_FENCE_GATE = registerBlock("rotten_bamboo_fence_gate",
            (properties) -> new FenceGateBlock(properties.strength(2f).ignitedByLava(), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<Block> ROTTEN_BAMBOO_DOOR = registerBlock("rotten_bamboo_door",
            (properties) -> new DoorBlock(BlockSetType.BAMBOO,properties.strength(2f).noOcclusion().ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_BAMBOO_TRAPDOOR = registerBlock("rotten_bamboo_trapdoor",
            (properties) -> new TrapDoorBlock(BlockSetType.BAMBOO,properties.strength(2f).noOcclusion().ignitedByLava()));

    //Birch
    public static final DeferredBlock<Block> ROTTEN_BIRCH_LOG = registerBlock("rotten_birch_log",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_BIRCH_LOG = registerBlock("stripped_rotten_birch_log",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_BIRCH_WOOD = registerBlock("rotten_birch_wood",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_BIRCH_WOOD = registerBlock("stripped_rotten_birch_wood",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_BIRCH_PLANKS = registerBlock("rotten_birch_planks",
            (properties) -> new RottenPlanksBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_BIRCH_BUTTON = registerBlock("rotten_birch_button",
            (properties) -> new ButtonBlock(BlockSetType.BIRCH, 10,properties.strength(2f)));
    public static final DeferredBlock<Block> ROTTEN_BIRCH_PRESSURE_PLATE = registerBlock("rotten_birch_pressure_plate",
            (properties) -> new PressurePlateBlock(BlockSetType.BIRCH,properties.strength(2f)));
    public static final DeferredBlock<Block> ROTTEN_BIRCH_SLAB = registerBlock("rotten_birch_slab",
            (properties) -> new SlabBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_BIRCH_STAIRS = registerBlock("rotten_birch_stairs",
            (properties) -> new StairBlock(Blocks.BIRCH_PLANKS.defaultBlockState(), properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_BIRCH_FENCE = registerBlock("rotten_birch_fence",
            (properties) -> new FenceBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_BIRCH_FENCE_GATE = registerBlock("rotten_birch_fence_gate",
            (properties) -> new FenceGateBlock(properties.strength(2f).ignitedByLava(), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<Block> ROTTEN_BIRCH_DOOR = registerBlock("rotten_birch_door",
            (properties) -> new DoorBlock(BlockSetType.BIRCH,properties.strength(2f).noOcclusion().ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_BIRCH_TRAPDOOR = registerBlock("rotten_birch_trapdoor",
            (properties) -> new TrapDoorBlock(BlockSetType.BIRCH,properties.strength(2f).noOcclusion().ignitedByLava()));

    //Cherry
    public static final DeferredBlock<Block> ROTTEN_CHERRY_LOG = registerBlock("rotten_cherry_log",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_CHERRY_LOG = registerBlock("stripped_rotten_cherry_log",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_CHERRY_WOOD = registerBlock("rotten_cherry_wood",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_CHERRY_WOOD = registerBlock("stripped_rotten_cherry_wood",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_CHERRY_PLANKS = registerBlock("rotten_cherry_planks",
            (properties) -> new RottenPlanksBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_CHERRY_BUTTON = registerBlock("rotten_cherry_button",
            (properties) -> new ButtonBlock(BlockSetType.CHERRY, 10,properties.strength(2f)));
    public static final DeferredBlock<Block> ROTTEN_CHERRY_PRESSURE_PLATE = registerBlock("rotten_cherry_pressure_plate",
            (properties) -> new PressurePlateBlock(BlockSetType.CHERRY,properties.strength(2f)));
    public static final DeferredBlock<Block> ROTTEN_CHERRY_SLAB = registerBlock("rotten_cherry_slab",
            (properties) -> new SlabBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_CHERRY_STAIRS = registerBlock("rotten_cherry_stairs",
            (properties) -> new StairBlock(Blocks.CHERRY_PLANKS.defaultBlockState(), properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_CHERRY_FENCE = registerBlock("rotten_cherry_fence",
            (properties) -> new FenceBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_CHERRY_FENCE_GATE = registerBlock("rotten_cherry_fence_gate",
            (properties) -> new FenceGateBlock(properties.strength(2f).ignitedByLava(), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<Block> ROTTEN_CHERRY_DOOR = registerBlock("rotten_cherry_door",
            (properties) -> new DoorBlock(BlockSetType.CHERRY,properties.strength(2f).noOcclusion().ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_CHERRY_TRAPDOOR = registerBlock("rotten_cherry_trapdoor",
            (properties) -> new TrapDoorBlock(BlockSetType.CHERRY,properties.strength(2f).noOcclusion().ignitedByLava()));

    //Dark oak
    public static final DeferredBlock<Block> ROTTEN_DARK_OAK_LOG = registerBlock("rotten_dark_oak_log",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_DARK_OAK_LOG = registerBlock("stripped_rotten_dark_oak_log",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_DARK_OAK_WOOD = registerBlock("rotten_dark_oak_wood",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_DARK_OAK_WOOD = registerBlock("stripped_rotten_dark_oak_wood",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_DARK_OAK_PLANKS = registerBlock("rotten_dark_oak_planks",
            (properties) -> new RottenPlanksBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_DARK_OAK_BUTTON = registerBlock("rotten_dark_oak_button",
            (properties) -> new ButtonBlock(BlockSetType.DARK_OAK, 10,properties.strength(2f)));
    public static final DeferredBlock<Block> ROTTEN_DARK_OAK_PRESSURE_PLATE = registerBlock("rotten_dark_oak_pressure_plate",
            (properties) -> new PressurePlateBlock(BlockSetType.DARK_OAK,properties.strength(2f)));
    public static final DeferredBlock<Block> ROTTEN_DARK_OAK_SLAB = registerBlock("rotten_dark_oak_slab",
            (properties) -> new SlabBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_DARK_OAK_STAIRS = registerBlock("rotten_dark_oak_stairs",
            (properties) -> new StairBlock(Blocks.DARK_OAK_PLANKS.defaultBlockState(), properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_DARK_OAK_FENCE = registerBlock("rotten_dark_oak_fence",
            (properties) -> new FenceBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_DARK_OAK_FENCE_GATE = registerBlock("rotten_dark_oak_fence_gate",
            (properties) -> new FenceGateBlock(properties.strength(2f).ignitedByLava(), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<Block> ROTTEN_DARK_OAK_DOOR = registerBlock("rotten_dark_oak_door",
            (properties) -> new DoorBlock(BlockSetType.DARK_OAK,properties.strength(2f).noOcclusion().ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_DARK_OAK_TRAPDOOR = registerBlock("rotten_dark_oak_trapdoor",
            (properties) -> new TrapDoorBlock(BlockSetType.DARK_OAK,properties.strength(2f).noOcclusion().ignitedByLava()));

    //Jungle
    public static final DeferredBlock<Block> ROTTEN_JUNGLE_LOG = registerBlock("rotten_jungle_log",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_JUNGLE_LOG = registerBlock("stripped_rotten_jungle_log",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_JUNGLE_WOOD = registerBlock("rotten_jungle_wood",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_JUNGLE_WOOD = registerBlock("stripped_rotten_jungle_wood",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_JUNGLE_PLANKS = registerBlock("rotten_jungle_planks",
            (properties) -> new RottenPlanksBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_JUNGLE_BUTTON = registerBlock("rotten_jungle_button",
            (properties) -> new ButtonBlock(BlockSetType.JUNGLE, 10,properties.strength(2f)));
    public static final DeferredBlock<Block> ROTTEN_JUNGLE_PRESSURE_PLATE = registerBlock("rotten_jungle_pressure_plate",
            (properties) -> new PressurePlateBlock(BlockSetType.JUNGLE,properties.strength(2f)));
    public static final DeferredBlock<Block> ROTTEN_JUNGLE_SLAB = registerBlock("rotten_jungle_slab",
            (properties) -> new SlabBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_JUNGLE_STAIRS = registerBlock("rotten_jungle_stairs",
            (properties) -> new StairBlock(Blocks.JUNGLE_PLANKS.defaultBlockState(), properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_JUNGLE_FENCE = registerBlock("rotten_jungle_fence",
            (properties) -> new FenceBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_JUNGLE_FENCE_GATE = registerBlock("rotten_jungle_fence_gate",
            (properties) -> new FenceGateBlock(properties.strength(2f).ignitedByLava(), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<Block> ROTTEN_JUNGLE_DOOR = registerBlock("rotten_jungle_door",
            (properties) -> new DoorBlock(BlockSetType.JUNGLE,properties.strength(2f).noOcclusion().ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_JUNGLE_TRAPDOOR = registerBlock("rotten_jungle_trapdoor",
            (properties) -> new TrapDoorBlock(BlockSetType.JUNGLE,properties.strength(2f).noOcclusion().ignitedByLava()));

    //Mangle
    public static final DeferredBlock<Block> ROTTEN_MANGROVE_LOG = registerBlock("rotten_mangrove_log",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_MANGROVE_LOG = registerBlock("stripped_rotten_mangrove_log",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_MANGROVE_WOOD = registerBlock("rotten_mangrove_wood",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_MANGROVE_WOOD = registerBlock("stripped_rotten_mangrove_wood",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_MANGROVE_PLANKS = registerBlock("rotten_mangrove_planks",
            (properties) -> new RottenPlanksBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_MANGROVE_BUTTON = registerBlock("rotten_mangrove_button",
            (properties) -> new ButtonBlock(BlockSetType.MANGROVE, 10,properties.strength(2f)));
    public static final DeferredBlock<Block> ROTTEN_MANGROVE_PRESSURE_PLATE = registerBlock("rotten_mangrove_pressure_plate",
            (properties) -> new PressurePlateBlock(BlockSetType.MANGROVE,properties.strength(2f)));
    public static final DeferredBlock<Block> ROTTEN_MANGROVE_SLAB = registerBlock("rotten_mangrove_slab",
            (properties) -> new SlabBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_MANGROVE_STAIRS = registerBlock("rotten_mangrove_stairs",
            (properties) -> new StairBlock(Blocks.MANGROVE_PLANKS.defaultBlockState(), properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_MANGROVE_FENCE = registerBlock("rotten_mangrove_fence",
            (properties) -> new FenceBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_MANGROVE_FENCE_GATE = registerBlock("rotten_mangrove_fence_gate",
            (properties) -> new FenceGateBlock(properties.strength(2f).ignitedByLava(), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<Block> ROTTEN_MANGROVE_DOOR = registerBlock("rotten_mangrove_door",
            (properties) -> new DoorBlock(BlockSetType.MANGROVE,properties.strength(2f).noOcclusion().ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_MANGROVE_TRAPDOOR = registerBlock("rotten_mangrove_trapdoor",
            (properties) -> new TrapDoorBlock(BlockSetType.MANGROVE,properties.strength(2f).noOcclusion().ignitedByLava()));

    //Spruce
    public static final DeferredBlock<Block> ROTTEN_SPRUCE_LOG = registerBlock("rotten_spruce_log",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_SPRUCE_LOG = registerBlock("stripped_rotten_spruce_log",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_SPRUCE_WOOD = registerBlock("rotten_spruce_wood",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_SPRUCE_WOOD = registerBlock("stripped_rotten_spruce_wood",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_SPRUCE_PLANKS = registerBlock("rotten_spruce_planks",
            (properties) -> new RottenPlanksBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_SPRUCE_BUTTON = registerBlock("rotten_spruce_button",
            (properties) -> new ButtonBlock(BlockSetType.SPRUCE, 10,properties.strength(2f)));
    public static final DeferredBlock<Block> ROTTEN_SPRUCE_PRESSURE_PLATE = registerBlock("rotten_spruce_pressure_plate",
            (properties) -> new PressurePlateBlock(BlockSetType.SPRUCE,properties.strength(2f)));
    public static final DeferredBlock<Block> ROTTEN_SPRUCE_SLAB = registerBlock("rotten_spruce_slab",
            (properties) -> new SlabBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_SPRUCE_STAIRS = registerBlock("rotten_spruce_stairs",
            (properties) -> new StairBlock(Blocks.SPRUCE_PLANKS.defaultBlockState(), properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_SPRUCE_FENCE = registerBlock("rotten_spruce_fence",
            (properties) -> new FenceBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_SPRUCE_FENCE_GATE = registerBlock("rotten_spruce_fence_gate",
            (properties) -> new FenceGateBlock(properties.strength(2f).ignitedByLava(), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<Block> ROTTEN_SPRUCE_DOOR = registerBlock("rotten_spruce_door",
            (properties) -> new DoorBlock(BlockSetType.SPRUCE,properties.strength(2f).noOcclusion().ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_SPRUCE_TRAPDOOR = registerBlock("rotten_spruce_trapdoor",
            (properties) -> new TrapDoorBlock(BlockSetType.SPRUCE,properties.strength(2f).noOcclusion().ignitedByLava()));

    //Oak
    public static final DeferredBlock<Block> ROTTEN_OAK_LOG = registerBlock("rotten_oak_log",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_OAK_LOG = registerBlock("stripped_rotten_oak_log",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_OAK_WOOD = registerBlock("rotten_oak_wood",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_ROTTEN_OAK_WOOD = registerBlock("stripped_rotten_oak_wood",
            (properties) -> new RottenLogsBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_OAK_PLANKS = registerBlock("rotten_oak_planks",
            (properties) -> new RottenPlanksBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_OAK_BUTTON = registerBlock("rotten_oak_button",
            (properties) -> new ButtonBlock(BlockSetType.OAK, 10,properties.strength(2f)));
    public static final DeferredBlock<Block> ROTTEN_OAK_PRESSURE_PLATE = registerBlock("rotten_oak_pressure_plate",
            (properties) -> new PressurePlateBlock(BlockSetType.OAK,properties.strength(2f)));
    public static final DeferredBlock<Block> ROTTEN_OAK_SLAB = registerBlock("rotten_oak_slab",
            (properties) -> new SlabBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_OAK_STAIRS = registerBlock("rotten_oak_stairs",
            (properties) -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_OAK_FENCE = registerBlock("rotten_oak_fence",
            (properties) -> new FenceBlock(properties.strength(2f).ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_OAK_FENCE_GATE = registerBlock("rotten_oak_fence_gate",
            (properties) -> new FenceGateBlock(properties.strength(2f).ignitedByLava(), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<Block> ROTTEN_OAK_DOOR = registerBlock("rotten_oak_door",
            (properties) -> new DoorBlock(BlockSetType.OAK,properties.strength(2f).noOcclusion().ignitedByLava()));
    public static final DeferredBlock<Block> ROTTEN_OAK_TRAPDOOR = registerBlock("rotten_oak_trapdoor",
            (properties) -> new TrapDoorBlock(BlockSetType.OAK,properties.strength(2f).noOcclusion().ignitedByLava()));

    //Helper methods
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        BLOCK_ITEMS.registerSimpleBlockItem(name, block);
    }

    public static void register(IEventBus eventBus){
        BLOCK_ITEMS.register(eventBus);
        BLOCKS.register(eventBus);
    }
}
