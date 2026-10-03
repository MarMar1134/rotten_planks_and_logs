package net.marmar.rotten_planks_and_logs.data.model;

import net.marmar.rotten_planks_and_logs.RottenPlanksAndLogs;
import net.marmar.rotten_planks_and_logs.block.RPLBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class RPLBlockstateProvider extends BlockStateProvider {
    public RPLBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, RottenPlanksAndLogs.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //Acacia
        rottenLogBlockItem(RPLBlocks.ROTTEN_ACACIA_LOG);
        rottenLogBlockItem(RPLBlocks.STRIPPED_ROTTEN_ACACIA_LOG);

        rottenWoodBlockItem(RPLBlocks.ROTTEN_ACACIA_WOOD, RPLBlocks.ROTTEN_ACACIA_LOG);
        rottenWoodBlockItem(RPLBlocks.STRIPPED_ROTTEN_ACACIA_WOOD, RPLBlocks.STRIPPED_ROTTEN_ACACIA_LOG);

        rottenPlanksAndDeviatesModels(RPLBlocks.ROTTEN_ACACIA_PLANKS, RPLBlocks.ROTTEN_ACACIA_BUTTON, RPLBlocks.ROTTEN_ACACIA_PRESSURE_PLATE,
                RPLBlocks.ROTTEN_ACACIA_SLAB, RPLBlocks.ROTTEN_ACACIA_STAIRS, RPLBlocks.ROTTEN_ACACIA_FENCE, RPLBlocks.ROTTEN_ACACIA_FENCE_GATE);

        doorBlock(RPLBlocks.ROTTEN_ACACIA_DOOR, "rotten_acacia_door");

        trapdoorBlock(RPLBlocks.ROTTEN_ACACIA_TRAPDOOR, "rotten_acacia_trapdoor");

        //Bamboo
        rottenPlanksAndDeviatesModels(RPLBlocks.ROTTEN_BAMBOO_PLANKS, RPLBlocks.ROTTEN_BAMBOO_BUTTON, RPLBlocks.ROTTEN_BAMBOO_PRESSURE_PLATE,
                RPLBlocks.ROTTEN_BAMBOO_SLAB, RPLBlocks.ROTTEN_BAMBOO_STAIRS, RPLBlocks.ROTTEN_BAMBOO_FENCE, RPLBlocks.ROTTEN_BAMBOO_FENCE_GATE);

        doorBlock(RPLBlocks.ROTTEN_BAMBOO_DOOR, "rotten_bamboo_door");

        trapdoorBlock(RPLBlocks.ROTTEN_BAMBOO_TRAPDOOR, "rotten_bamboo_trapdoor");

        //Birch
        rottenLogBlockItem(RPLBlocks.ROTTEN_BIRCH_LOG);
        rottenLogBlockItem(RPLBlocks.STRIPPED_ROTTEN_BIRCH_LOG);

        rottenWoodBlockItem(RPLBlocks.ROTTEN_BIRCH_WOOD, RPLBlocks.ROTTEN_BIRCH_LOG);
        rottenWoodBlockItem(RPLBlocks.STRIPPED_ROTTEN_BIRCH_WOOD, RPLBlocks.STRIPPED_ROTTEN_BIRCH_LOG);

        rottenPlanksAndDeviatesModels(RPLBlocks.ROTTEN_BIRCH_PLANKS, RPLBlocks.ROTTEN_BIRCH_BUTTON, RPLBlocks.ROTTEN_BIRCH_PRESSURE_PLATE,
                RPLBlocks.ROTTEN_BIRCH_SLAB, RPLBlocks.ROTTEN_BIRCH_STAIRS, RPLBlocks.ROTTEN_BIRCH_FENCE, RPLBlocks.ROTTEN_BIRCH_FENCE_GATE);

        doorBlock(RPLBlocks.ROTTEN_BIRCH_DOOR, "rotten_birch_door");

        trapdoorBlock(RPLBlocks.ROTTEN_BIRCH_TRAPDOOR, "rotten_birch_trapdoor");

        //Cherry
        rottenLogBlockItem(RPLBlocks.ROTTEN_CHERRY_LOG);
        rottenLogBlockItem(RPLBlocks.STRIPPED_ROTTEN_CHERRY_LOG);

        rottenWoodBlockItem(RPLBlocks.ROTTEN_CHERRY_WOOD, RPLBlocks.ROTTEN_CHERRY_LOG);
        rottenWoodBlockItem(RPLBlocks.STRIPPED_ROTTEN_CHERRY_WOOD, RPLBlocks.STRIPPED_ROTTEN_CHERRY_LOG);

        rottenPlanksAndDeviatesModels(RPLBlocks.ROTTEN_CHERRY_PLANKS, RPLBlocks.ROTTEN_CHERRY_BUTTON, RPLBlocks.ROTTEN_CHERRY_PRESSURE_PLATE,
                RPLBlocks.ROTTEN_CHERRY_SLAB, RPLBlocks.ROTTEN_CHERRY_STAIRS, RPLBlocks.ROTTEN_CHERRY_FENCE, RPLBlocks.ROTTEN_CHERRY_FENCE_GATE);

        doorBlock(RPLBlocks.ROTTEN_CHERRY_DOOR, "rotten_cherry_door");

        trapdoorBlock(RPLBlocks.ROTTEN_CHERRY_TRAPDOOR, "rotten_cherry_trapdoor");

        //Dark oak
        rottenLogBlockItem(RPLBlocks.ROTTEN_DARK_OAK_LOG);
        rottenLogBlockItem(RPLBlocks.STRIPPED_ROTTEN_DARK_OAK_LOG);

        rottenWoodBlockItem(RPLBlocks.ROTTEN_DARK_OAK_WOOD, RPLBlocks.ROTTEN_DARK_OAK_LOG);
        rottenWoodBlockItem(RPLBlocks.STRIPPED_ROTTEN_DARK_OAK_WOOD, RPLBlocks.STRIPPED_ROTTEN_DARK_OAK_LOG);

        rottenPlanksAndDeviatesModels(RPLBlocks.ROTTEN_DARK_OAK_PLANKS, RPLBlocks.ROTTEN_DARK_OAK_BUTTON, RPLBlocks.ROTTEN_DARK_OAK_PRESSURE_PLATE,
                RPLBlocks.ROTTEN_DARK_OAK_SLAB, RPLBlocks.ROTTEN_DARK_OAK_STAIRS, RPLBlocks.ROTTEN_DARK_OAK_FENCE, RPLBlocks.ROTTEN_DARK_OAK_FENCE_GATE);

        doorBlock(RPLBlocks.ROTTEN_DARK_OAK_DOOR, "rotten_dark_oak_door");

        trapdoorBlock(RPLBlocks.ROTTEN_DARK_OAK_TRAPDOOR, "rotten_dark_oak_trapdoor");

        //Jungle
        rottenLogBlockItem(RPLBlocks.ROTTEN_JUNGLE_LOG);
        rottenLogBlockItem(RPLBlocks.STRIPPED_ROTTEN_JUNGLE_LOG);

        rottenWoodBlockItem(RPLBlocks.ROTTEN_JUNGLE_WOOD, RPLBlocks.ROTTEN_JUNGLE_LOG);
        rottenWoodBlockItem(RPLBlocks.STRIPPED_ROTTEN_JUNGLE_WOOD, RPLBlocks.STRIPPED_ROTTEN_JUNGLE_LOG);

        rottenPlanksAndDeviatesModels(RPLBlocks.ROTTEN_JUNGLE_PLANKS, RPLBlocks.ROTTEN_JUNGLE_BUTTON, RPLBlocks.ROTTEN_JUNGLE_PRESSURE_PLATE,
                RPLBlocks.ROTTEN_JUNGLE_SLAB, RPLBlocks.ROTTEN_JUNGLE_STAIRS, RPLBlocks.ROTTEN_JUNGLE_FENCE, RPLBlocks.ROTTEN_JUNGLE_FENCE_GATE);

        doorBlock(RPLBlocks.ROTTEN_JUNGLE_DOOR, "rotten_jungle_door");

        trapdoorBlock(RPLBlocks.ROTTEN_JUNGLE_TRAPDOOR, "rotten_jungle_trapdoor");

        //Mangrove
        rottenLogBlockItem(RPLBlocks.ROTTEN_MANGROVE_LOG);
        rottenLogBlockItem(RPLBlocks.STRIPPED_ROTTEN_MANGROVE_LOG);

        rottenWoodBlockItem(RPLBlocks.ROTTEN_MANGROVE_WOOD, RPLBlocks.ROTTEN_MANGROVE_LOG);
        rottenWoodBlockItem(RPLBlocks.STRIPPED_ROTTEN_MANGROVE_WOOD, RPLBlocks.STRIPPED_ROTTEN_MANGROVE_LOG);

        rottenPlanksAndDeviatesModels(RPLBlocks.ROTTEN_MANGROVE_PLANKS, RPLBlocks.ROTTEN_MANGROVE_BUTTON, RPLBlocks.ROTTEN_MANGROVE_PRESSURE_PLATE,
                RPLBlocks.ROTTEN_MANGROVE_SLAB, RPLBlocks.ROTTEN_MANGROVE_STAIRS, RPLBlocks.ROTTEN_MANGROVE_FENCE, RPLBlocks.ROTTEN_MANGROVE_FENCE_GATE);

        doorBlock(RPLBlocks.ROTTEN_MANGROVE_DOOR, "rotten_mangrove_door");

        trapdoorBlock(RPLBlocks.ROTTEN_MANGROVE_TRAPDOOR, "rotten_mangrove_trapdoor");

        //Spruce
        rottenLogBlockItem(RPLBlocks.ROTTEN_SPRUCE_LOG);
        rottenLogBlockItem(RPLBlocks.STRIPPED_ROTTEN_SPRUCE_LOG);

        rottenWoodBlockItem(RPLBlocks.ROTTEN_SPRUCE_WOOD, RPLBlocks.ROTTEN_SPRUCE_LOG);
        rottenWoodBlockItem(RPLBlocks.STRIPPED_ROTTEN_SPRUCE_WOOD, RPLBlocks.STRIPPED_ROTTEN_SPRUCE_LOG);

        rottenPlanksAndDeviatesModels(RPLBlocks.ROTTEN_SPRUCE_PLANKS, RPLBlocks.ROTTEN_SPRUCE_BUTTON, RPLBlocks.ROTTEN_SPRUCE_PRESSURE_PLATE,
                RPLBlocks.ROTTEN_SPRUCE_SLAB, RPLBlocks.ROTTEN_SPRUCE_STAIRS, RPLBlocks.ROTTEN_SPRUCE_FENCE, RPLBlocks.ROTTEN_SPRUCE_FENCE_GATE);

        doorBlock(RPLBlocks.ROTTEN_SPRUCE_DOOR, "rotten_spruce_door");

        trapdoorBlock(RPLBlocks.ROTTEN_SPRUCE_TRAPDOOR, "rotten_spruce_trapdoor");

        //Oak
        rottenLogBlockItem(RPLBlocks.ROTTEN_OAK_LOG);
        rottenLogBlockItem(RPLBlocks.STRIPPED_ROTTEN_OAK_LOG);

        rottenWoodBlockItem(RPLBlocks.ROTTEN_OAK_WOOD, RPLBlocks.ROTTEN_OAK_LOG);
        rottenWoodBlockItem(RPLBlocks.STRIPPED_ROTTEN_OAK_WOOD, RPLBlocks.STRIPPED_ROTTEN_OAK_LOG);

        rottenPlanksAndDeviatesModels(RPLBlocks.ROTTEN_OAK_PLANKS, RPLBlocks.ROTTEN_OAK_BUTTON, RPLBlocks.ROTTEN_OAK_PRESSURE_PLATE,
                RPLBlocks.ROTTEN_OAK_SLAB, RPLBlocks.ROTTEN_OAK_STAIRS, RPLBlocks.ROTTEN_OAK_FENCE, RPLBlocks.ROTTEN_OAK_FENCE_GATE);

        doorBlock(RPLBlocks.ROTTEN_OAK_DOOR, "rotten_oak_door");

        trapdoorBlock(RPLBlocks.ROTTEN_OAK_TRAPDOOR, "rotten_oak_trapdoor");
    }

    private void rottenPlanksAndDeviatesModels(DeferredBlock<Block> pPlank, DeferredBlock<Block> pButton, DeferredBlock<Block> pPressurePlate,
                                               DeferredBlock<Block> pSlab, DeferredBlock<Block> pStairs, DeferredBlock<Block> pFence, DeferredBlock<Block> pFenceGate){
        blockWithItem(pPlank);

        buttonBlock((ButtonBlock) pButton.get(), blockTexture(pPlank.get()));
        pressurePlateBlock((PressurePlateBlock) pPressurePlate.get(), blockTexture(pPlank.get()));

        slabBlock((SlabBlock) pSlab.get(), blockTexture(pPlank.get()), blockTexture(pPlank.get()));
        stairsBlock((StairBlock) pStairs.get(), blockTexture(pPlank.get()));
        fenceBlock((FenceBlock) pFence.get(), blockTexture(pPlank.get()));
        fenceGateBlock((FenceGateBlock) pFenceGate.get(), blockTexture(pPlank.get()));
    }

    private void rottenLogBlockItem(DeferredBlock<Block> pBlock){
        logBlock(((RotatedPillarBlock) pBlock.get()));
        blockItem(pBlock);
    }

    private void rottenWoodBlockItem(DeferredBlock<Block> pWood, DeferredBlock<Block> pLog){
        axisBlock(((RotatedPillarBlock) pWood.get()), blockTexture(pLog.get()), blockTexture(pLog.get()));
        blockItem(pWood);
    }

    private void doorBlock(DeferredBlock<Block> pDoor, String pName){
        doorBlockWithRenderType((DoorBlock) pDoor.get(), modLoc("block/" + pName + "_bottom"), modLoc("block/" + pName + "_top"), "cutout");
    }

    private void trapdoorBlock(DeferredBlock<Block> pTrapdoor, String pName){
        trapdoorBlockWithRenderType((TrapDoorBlock) pTrapdoor.get(), modLoc("block/" + pName), true, "cutout");
    }

    private void blockWithItem(DeferredBlock<Block> pBlock){
        simpleBlockWithItem(pBlock.get(), cubeAll(pBlock.get()));
    }

    private void blockItem(DeferredBlock<Block> pBlock) {
        simpleBlockItem(pBlock.get(), cubeAll(pBlock.get()));
    }
}
