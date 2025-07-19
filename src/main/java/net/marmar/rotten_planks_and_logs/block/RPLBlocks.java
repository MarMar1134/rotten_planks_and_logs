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
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class RPLBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
            ForgeRegistries.BLOCKS, RottenPlanksAndLogs.MOD_ID);
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, RottenPlanksAndLogs.MOD_ID);

    //Acacia
    public static final RegistryObject<Block> ROTTEN_ACACIA_LOG = registerBlockWithItem("rotten_acacia_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_ROTTEN_ACACIA_LOG = registerBlockWithItem("stripped_rotten_acacia_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> ROTTEN_ACACIA_WOOD = registerBlockWithItem("rotten_acacia_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_ROTTEN_ACACIA_WOOD = registerBlockWithItem("stripped_rotten_acacia_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> ROTTEN_ACACIA_PLANKS = registerBlockWithItem("rotten_acacia_planks",
            () -> new RottenPlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ROTTEN_ACACIA_BUTTON = registerBlockWithItem("rotten_acacia_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> ROTTEN_ACACIA_PRESSURE_PLATE = registerBlockWithItem("rotten_acacia_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> ROTTEN_ACACIA_SLAB = registerBlockWithItem("rotten_acacia_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> ROTTEN_ACACIA_STAIRS = registerBlockWithItem("rotten_acacia_stairs",
            () -> new StairBlock(() -> ROTTEN_ACACIA_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> ROTTEN_ACACIA_FENCE = registerBlockWithItem("rotten_acacia_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ROTTEN_ACACIA_FENCEGATE = registerBlockWithItem("rotten_acacia_fencegate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    //Bamboo
    public static final RegistryObject<Block> ROTTEN_BAMBOO_PLANKS = registerBlockWithItem("rotten_bamboo_planks",
            () -> new RottenPlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ROTTEN_BAMBOO_BUTTON = registerBlockWithItem("rotten_bamboo_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> ROTTEN_BAMBOO_PRESSURE_PLATE = registerBlockWithItem("rotten_bamboo_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> ROTTEN_BAMBOO_SLAB = registerBlockWithItem("rotten_bamboo_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> ROTTEN_BAMBOO_STAIRS = registerBlockWithItem("rotten_bamboo_stairs",
            () -> new StairBlock(() -> ROTTEN_BAMBOO_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> ROTTEN_BAMBOO_FENCE = registerBlockWithItem("rotten_bamboo_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ROTTEN_BAMBOO_FENCEGATE = registerBlockWithItem("rotten_bamboo_fencegate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    //Birch
    public static final RegistryObject<Block> ROTTEN_BIRCH_LOG = registerBlockWithItem("rotten_birch_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_ROTTEN_BIRCH_LOG = registerBlockWithItem("stripped_rotten_birch_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> ROTTEN_BIRCH_WOOD = registerBlockWithItem("rotten_birch_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_ROTTEN_BIRCH_WOOD = registerBlockWithItem("stripped_rotten_birch_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> ROTTEN_BIRCH_PLANKS = registerBlockWithItem("rotten_birch_planks",
            () -> new RottenPlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ROTTEN_BIRCH_BUTTON = registerBlockWithItem("rotten_birch_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> ROTTEN_BIRCH_PRESSURE_PLATE = registerBlockWithItem("rotten_birch_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> ROTTEN_BIRCH_SLAB = registerBlockWithItem("rotten_birch_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> ROTTEN_BIRCH_STAIRS = registerBlockWithItem("rotten_birch_stairs",
            () -> new StairBlock(() -> ROTTEN_BIRCH_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> ROTTEN_BIRCH_FENCE = registerBlockWithItem("rotten_birch_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ROTTEN_BIRCH_FENCEGATE = registerBlockWithItem("rotten_birch_fencegate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    //Cherry
    public static final RegistryObject<Block> ROTTEN_CHERRY_LOG = registerBlockWithItem("rotten_cherry_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_ROTTEN_CHERRY_LOG = registerBlockWithItem("stripped_rotten_cherry_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> ROTTEN_CHERRY_WOOD = registerBlockWithItem("rotten_cherry_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_ROTTEN_CHERRY_WOOD = registerBlockWithItem("stripped_rotten_cherry_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> ROTTEN_CHERRY_PLANKS = registerBlockWithItem("rotten_cherry_planks",
            () -> new RottenPlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ROTTEN_CHERRY_BUTTON = registerBlockWithItem("rotten_cherry_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> ROTTEN_CHERRY_PRESSURE_PLATE = registerBlockWithItem("rotten_cherry_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> ROTTEN_CHERRY_SLAB = registerBlockWithItem("rotten_cherry_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> ROTTEN_CHERRY_STAIRS = registerBlockWithItem("rotten_cherry_stairs",
            () -> new StairBlock(() -> ROTTEN_CHERRY_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> ROTTEN_CHERRY_FENCE = registerBlockWithItem("rotten_cherry_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ROTTEN_CHERRY_FENCEGATE = registerBlockWithItem("rotten_cherry_fencegate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    //Dark oak
    public static final RegistryObject<Block> ROTTEN_DARK_OAK_LOG = registerBlockWithItem("rotten_dark_oak_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_ROTTEN_DARK_OAK_LOG = registerBlockWithItem("stripped_rotten_dark_oak_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> ROTTEN_DARK_OAK_WOOD = registerBlockWithItem("rotten_dark_oak_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_ROTTEN_DARK_OAK_WOOD = registerBlockWithItem("stripped_rotten_dark_oak_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> ROTTEN_DARK_OAK_PLANKS = registerBlockWithItem("rotten_dark_oak_planks",
            () -> new RottenPlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ROTTEN_DARK_OAK_BUTTON = registerBlockWithItem("rotten_dark_oak_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> ROTTEN_DARK_OAK_PRESSURE_PLATE = registerBlockWithItem("rotten_dark_oak_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> ROTTEN_DARK_OAK_SLAB = registerBlockWithItem("rotten_dark_oak_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> ROTTEN_DARK_OAK_STAIRS = registerBlockWithItem("rotten_dark_oak_stairs",
            () -> new StairBlock(() -> ROTTEN_DARK_OAK_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> ROTTEN_DARK_OAK_FENCE = registerBlockWithItem("rotten_dark_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ROTTEN_DARK_OAK_FENCEGATE = registerBlockWithItem("rotten_dark_oak_fencegate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    //Jungle
    public static final RegistryObject<Block> ROTTEN_JUNGLE_LOG = registerBlockWithItem("rotten_jungle_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_ROTTEN_JUNGLE_LOG = registerBlockWithItem("stripped_rotten_jungle_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> ROTTEN_JUNGLE_WOOD = registerBlockWithItem("rotten_jungle_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_ROTTEN_JUNGLE_WOOD = registerBlockWithItem("stripped_rotten_jungle_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> ROTTEN_JUNGLE_PLANKS = registerBlockWithItem("rotten_jungle_planks",
            () -> new RottenPlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ROTTEN_JUNGLE_BUTTON = registerBlockWithItem("rotten_jungle_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> ROTTEN_JUNGLE_PRESSURE_PLATE = registerBlockWithItem("rotten_jungle_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> ROTTEN_JUNGLE_SLAB = registerBlockWithItem("rotten_jungle_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> ROTTEN_JUNGLE_STAIRS = registerBlockWithItem("rotten_jungle_stairs",
            () -> new StairBlock(() -> ROTTEN_JUNGLE_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> ROTTEN_JUNGLE_FENCE = registerBlockWithItem("rotten_jungle_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ROTTEN_JUNGLE_FENCEGATE = registerBlockWithItem("rotten_jungle_fencegate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    //Mangle
    public static final RegistryObject<Block> ROTTEN_MANGLE_LOG = registerBlockWithItem("rotten_mangle_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_ROTTEN_MANGLE_LOG = registerBlockWithItem("stripped_rotten_mangle_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> ROTTEN_MANGLE_WOOD = registerBlockWithItem("rotten_mangle_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_ROTTEN_MANGLE_WOOD = registerBlockWithItem("stripped_rotten_mangle_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> ROTTEN_MANGLE_PLANKS = registerBlockWithItem("rotten_mangle_planks",
            () -> new RottenPlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ROTTEN_MANGLE_BUTTON = registerBlockWithItem("rotten_mangle_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> ROTTEN_MANGLE_PRESSURE_PLATE = registerBlockWithItem("rotten_mangle_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> ROTTEN_MANGLE_SLAB = registerBlockWithItem("rotten_mangle_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> ROTTEN_MANGLE_STAIRS = registerBlockWithItem("rotten_mangle_stairs",
            () -> new StairBlock(() -> ROTTEN_MANGLE_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> ROTTEN_MANGLE_FENCE = registerBlockWithItem("rotten_mangle_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ROTTEN_MANGLE_FENCEGATE = registerBlockWithItem("rotten_mangle_fencegate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    //Spruce
    public static final RegistryObject<Block> ROTTEN_SPRUCE_LOG = registerBlockWithItem("rotten_spruce_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_ROTTEN_SPRUCE_LOG = registerBlockWithItem("stripped_rotten_spruce_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> ROTTEN_SPRUCE_WOOD = registerBlockWithItem("rotten_spruce_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_ROTTEN_SPRUCE_WOOD = registerBlockWithItem("stripped_rotten_spruce_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> ROTTEN_SPRUCE_PLANKS = registerBlockWithItem("rotten_spruce_planks",
            () -> new RottenPlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ROTTEN_SPRUCE_BUTTON = registerBlockWithItem("rotten_spruce_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> ROTTEN_SPRUCE_PRESSURE_PLATE = registerBlockWithItem("rotten_spruce_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> ROTTEN_SPRUCE_SLAB = registerBlockWithItem("rotten_spruce_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> ROTTEN_SPRUCE_STAIRS = registerBlockWithItem("rotten_spruce_stairs",
            () -> new StairBlock(() -> ROTTEN_SPRUCE_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> ROTTEN_SPRUCE_FENCE = registerBlockWithItem("rotten_spruce_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ROTTEN_SPRUCE_FENCEGATE = registerBlockWithItem("rotten_spruce_fencegate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    //Oak
    public static final RegistryObject<Block> ROTTEN_OAK_LOG = registerBlockWithItem("rotten_oak_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_ROTTEN_OAK_LOG = registerBlockWithItem("stripped_rotten_oak_log",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> ROTTEN_OAK_WOOD = registerBlockWithItem("rotten_oak_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_ROTTEN_OAK_WOOD = registerBlockWithItem("stripped_rotten_oak_wood",
            () -> new RottenLogsBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> ROTTEN_OAK_PLANKS = registerBlockWithItem("rotten_oak_planks",
            () -> new RottenPlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ROTTEN_OAK_BUTTON = registerBlockWithItem("rotten_oak_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> ROTTEN_OAK_PRESSURE_PLATE = registerBlockWithItem("rotten_oak_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> ROTTEN_OAK_SLAB = registerBlockWithItem("rotten_oak_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> ROTTEN_OAK_STAIRS = registerBlockWithItem("rotten_oak_stairs",
            () -> new StairBlock(() -> ROTTEN_OAK_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> ROTTEN_OAK_FENCE = registerBlockWithItem("rotten_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ROTTEN_OAK_FENCEGATE = registerBlockWithItem("rotten_oak_fencegate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    //Helper methods
    private static <T extends Block> RegistryObject<T> registerBlockWithItem(String name, Supplier<T> block){
        RegistryObject<T> ToReturn = BLOCKS.register(name, block);
        registerBlockItem(name, ToReturn);
        return ToReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        BLOCK_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
        BLOCK_ITEMS.register(eventBus);
    }
}
