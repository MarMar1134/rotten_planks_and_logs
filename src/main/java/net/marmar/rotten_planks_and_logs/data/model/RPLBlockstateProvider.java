package net.marmar.rotten_planks_and_logs.data.model;

import net.marmar.rotten_planks_and_logs.RottenPlanksAndLogs;
import net.marmar.rotten_planks_and_logs.block.RPLBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RPLBlockstateProvider extends BlockStateProvider {
    public RPLBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, RottenPlanksAndLogs.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //Acacia
        rottenLogBlockItem(RPLBlocks.ROTTEN_ACACIA_LOG);
        rottenStrippedLogBlockItem(RPLBlocks.STRIPPED_ROTTEN_ACACIA_LOG, "acacia");

        rottenWoodBlockItem(RPLBlocks.ROTTEN_ACACIA_WOOD, RPLBlocks.ROTTEN_ACACIA_LOG);
        rottenWoodBlockItem(RPLBlocks.STRIPPED_ROTTEN_ACACIA_WOOD, RPLBlocks.STRIPPED_ROTTEN_ACACIA_LOG);

        rottenPlanksAndDeviatesModels(RPLBlocks.ROTTEN_ACACIA_PLANKS, RPLBlocks.ROTTEN_ACACIA_BUTTON, RPLBlocks.ROTTEN_ACACIA_PRESSURE_PLATE,
                RPLBlocks.ROTTEN_ACACIA_SLAB, RPLBlocks.ROTTEN_ACACIA_STAIRS, RPLBlocks.ROTTEN_ACACIA_FENCE, RPLBlocks.ROTTEN_ACACIA_FENCEGATE);

        //Bamboo
        rottenPlanksAndDeviatesModels(RPLBlocks.ROTTEN_BAMBOO_PLANKS, RPLBlocks.ROTTEN_BAMBOO_BUTTON, RPLBlocks.ROTTEN_BAMBOO_PRESSURE_PLATE,
                RPLBlocks.ROTTEN_BAMBOO_SLAB, RPLBlocks.ROTTEN_BAMBOO_STAIRS, RPLBlocks.ROTTEN_BAMBOO_FENCE, RPLBlocks.ROTTEN_BAMBOO_FENCEGATE);

        //Birch
        rottenLogBlockItem(RPLBlocks.ROTTEN_BIRCH_LOG);
        rottenStrippedLogBlockItem(RPLBlocks.STRIPPED_ROTTEN_BIRCH_LOG, "birch");

        rottenWoodBlockItem(RPLBlocks.ROTTEN_BIRCH_WOOD, RPLBlocks.ROTTEN_BIRCH_LOG);
        rottenWoodBlockItem(RPLBlocks.STRIPPED_ROTTEN_BIRCH_WOOD, RPLBlocks.STRIPPED_ROTTEN_BIRCH_LOG);

        rottenPlanksAndDeviatesModels(RPLBlocks.ROTTEN_BIRCH_PLANKS, RPLBlocks.ROTTEN_BIRCH_BUTTON, RPLBlocks.ROTTEN_BIRCH_PRESSURE_PLATE,
                RPLBlocks.ROTTEN_BIRCH_SLAB, RPLBlocks.ROTTEN_BIRCH_STAIRS, RPLBlocks.ROTTEN_BIRCH_FENCE, RPLBlocks.ROTTEN_BIRCH_FENCEGATE);

        //Cherry
        rottenLogBlockItem(RPLBlocks.ROTTEN_CHERRY_LOG);
        rottenStrippedLogBlockItem(RPLBlocks.STRIPPED_ROTTEN_CHERRY_LOG, "cherry");

        rottenWoodBlockItem(RPLBlocks.ROTTEN_CHERRY_WOOD, RPLBlocks.ROTTEN_CHERRY_LOG);
        rottenWoodBlockItem(RPLBlocks.STRIPPED_ROTTEN_CHERRY_WOOD, RPLBlocks.STRIPPED_ROTTEN_CHERRY_LOG);

        rottenPlanksAndDeviatesModels(RPLBlocks.ROTTEN_CHERRY_PLANKS, RPLBlocks.ROTTEN_CHERRY_BUTTON, RPLBlocks.ROTTEN_CHERRY_PRESSURE_PLATE,
                RPLBlocks.ROTTEN_CHERRY_SLAB, RPLBlocks.ROTTEN_CHERRY_STAIRS, RPLBlocks.ROTTEN_CHERRY_FENCE, RPLBlocks.ROTTEN_CHERRY_FENCEGATE);

        //Dark oak
        rottenLogBlockItem(RPLBlocks.ROTTEN_DARK_OAK_LOG);
        rottenStrippedLogBlockItem(RPLBlocks.STRIPPED_ROTTEN_DARK_OAK_LOG, "dark_oak");

        rottenWoodBlockItem(RPLBlocks.ROTTEN_DARK_OAK_WOOD, RPLBlocks.ROTTEN_DARK_OAK_LOG);
        rottenWoodBlockItem(RPLBlocks.STRIPPED_ROTTEN_DARK_OAK_WOOD, RPLBlocks.STRIPPED_ROTTEN_DARK_OAK_LOG);

        rottenPlanksAndDeviatesModels(RPLBlocks.ROTTEN_DARK_OAK_PLANKS, RPLBlocks.ROTTEN_DARK_OAK_BUTTON, RPLBlocks.ROTTEN_DARK_OAK_PRESSURE_PLATE,
                RPLBlocks.ROTTEN_DARK_OAK_SLAB, RPLBlocks.ROTTEN_DARK_OAK_STAIRS, RPLBlocks.ROTTEN_DARK_OAK_FENCE, RPLBlocks.ROTTEN_DARK_OAK_FENCEGATE);

        //Jungle
        rottenLogBlockItem(RPLBlocks.ROTTEN_JUNGLE_LOG);
        rottenStrippedLogBlockItem(RPLBlocks.STRIPPED_ROTTEN_JUNGLE_LOG, "jungle");

        rottenWoodBlockItem(RPLBlocks.ROTTEN_JUNGLE_WOOD, RPLBlocks.ROTTEN_JUNGLE_LOG);
        rottenWoodBlockItem(RPLBlocks.STRIPPED_ROTTEN_JUNGLE_WOOD, RPLBlocks.STRIPPED_ROTTEN_JUNGLE_LOG);

        rottenPlanksAndDeviatesModels(RPLBlocks.ROTTEN_JUNGLE_PLANKS, RPLBlocks.ROTTEN_JUNGLE_BUTTON, RPLBlocks.ROTTEN_JUNGLE_PRESSURE_PLATE,
                RPLBlocks.ROTTEN_JUNGLE_SLAB, RPLBlocks.ROTTEN_JUNGLE_STAIRS, RPLBlocks.ROTTEN_JUNGLE_FENCE, RPLBlocks.ROTTEN_JUNGLE_FENCEGATE);

        rottenLogBlockItem(RPLBlocks.ROTTEN_MANGLE_LOG);
        rottenStrippedLogBlockItem(RPLBlocks.STRIPPED_ROTTEN_MANGLE_LOG, "mangle");

        rottenWoodBlockItem(RPLBlocks.ROTTEN_MANGLE_WOOD, RPLBlocks.ROTTEN_MANGLE_LOG);
        rottenWoodBlockItem(RPLBlocks.STRIPPED_ROTTEN_MANGLE_WOOD, RPLBlocks.STRIPPED_ROTTEN_MANGLE_LOG);

        rottenPlanksAndDeviatesModels(RPLBlocks.ROTTEN_MANGLE_PLANKS, RPLBlocks.ROTTEN_MANGLE_BUTTON, RPLBlocks.ROTTEN_MANGLE_PRESSURE_PLATE,
                RPLBlocks.ROTTEN_MANGLE_SLAB, RPLBlocks.ROTTEN_MANGLE_STAIRS, RPLBlocks.ROTTEN_MANGLE_FENCE, RPLBlocks.ROTTEN_MANGLE_FENCEGATE);

        //Spruce
        rottenLogBlockItem(RPLBlocks.ROTTEN_SPRUCE_LOG);
        rottenStrippedLogBlockItem(RPLBlocks.STRIPPED_ROTTEN_SPRUCE_LOG, "spruce");

        rottenWoodBlockItem(RPLBlocks.ROTTEN_SPRUCE_WOOD, RPLBlocks.ROTTEN_SPRUCE_LOG);
        rottenWoodBlockItem(RPLBlocks.STRIPPED_ROTTEN_SPRUCE_WOOD, RPLBlocks.STRIPPED_ROTTEN_SPRUCE_LOG);

        rottenPlanksAndDeviatesModels(RPLBlocks.ROTTEN_SPRUCE_PLANKS, RPLBlocks.ROTTEN_SPRUCE_BUTTON, RPLBlocks.ROTTEN_SPRUCE_PRESSURE_PLATE,
                RPLBlocks.ROTTEN_SPRUCE_SLAB, RPLBlocks.ROTTEN_SPRUCE_STAIRS, RPLBlocks.ROTTEN_SPRUCE_FENCE, RPLBlocks.ROTTEN_SPRUCE_FENCEGATE);

        //Oak
        rottenLogBlockItem(RPLBlocks.ROTTEN_OAK_LOG);
        rottenStrippedLogBlockItem(RPLBlocks.STRIPPED_ROTTEN_OAK_LOG, "oak");

        rottenWoodBlockItem(RPLBlocks.ROTTEN_OAK_WOOD, RPLBlocks.ROTTEN_OAK_LOG);
        rottenWoodBlockItem(RPLBlocks.STRIPPED_ROTTEN_OAK_WOOD, RPLBlocks.STRIPPED_ROTTEN_OAK_LOG);

        rottenPlanksAndDeviatesModels(RPLBlocks.ROTTEN_OAK_PLANKS, RPLBlocks.ROTTEN_OAK_BUTTON, RPLBlocks.ROTTEN_OAK_PRESSURE_PLATE,
                RPLBlocks.ROTTEN_OAK_SLAB, RPLBlocks.ROTTEN_OAK_STAIRS, RPLBlocks.ROTTEN_OAK_FENCE, RPLBlocks.ROTTEN_OAK_FENCEGATE);
    }

    private void rottenPlanksAndDeviatesModels(RegistryObject<Block> pPlank, RegistryObject<Block> pButton, RegistryObject<Block> pPressurePlate,
                                               RegistryObject<Block> pSlab, RegistryObject<Block> pStairs, RegistryObject<Block> pFence, RegistryObject<Block> pFenceGate){
        blockWithItem(pPlank);

        buttonBlock((ButtonBlock) pButton.get(), blockTexture(pPlank.get()));
        pressurePlateBlock((PressurePlateBlock) pPressurePlate.get(), blockTexture(pPlank.get()));

        slabBlock((SlabBlock) pSlab.get(), blockTexture(pPlank.get()), blockTexture(pPlank.get()));
        stairsBlock((StairBlock) pStairs.get(), blockTexture(pPlank.get()));
        fenceBlock((FenceBlock) pFence.get(), blockTexture(pPlank.get()));
        fenceGateBlock((FenceGateBlock) pFenceGate.get(), blockTexture(pPlank.get()));
    }

    private void rottenLogBlockItem(RegistryObject<Block> pBlock){
        logBlock((RotatedPillarBlock) pBlock.get());
        blockItem(pBlock);
    }

    private void rottenStrippedLogBlockItem(RegistryObject<Block> pBlock, String pWoodType){
        axisBlock((RotatedPillarBlock) pBlock.get(), blockTexture(pBlock.get()),
                ResourceLocation.fromNamespaceAndPath(RottenPlanksAndLogs.MOD_ID, "block/stripped_rotten_" + pWoodType + "_log_top"));
        blockItem(pBlock);
    }

    private void rottenWoodBlockItem(RegistryObject<Block> pWood, RegistryObject<Block> pLog){
        axisBlock((RotatedPillarBlock) pWood.get(), blockTexture(pLog.get()), blockTexture(pLog.get()));
        blockItem(pWood);
    }

    private void blockWithItem(RegistryObject<Block> pBlock){
        simpleBlockWithItem(pBlock.get(), cubeAll(pBlock.get()));
    }

    private void blockItem(RegistryObject<Block> pBlock) {
        simpleBlockItem(pBlock.get(), new ModelFile.UncheckedModelFile(RottenPlanksAndLogs.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(pBlock.get()).getPath()));
    }
}
