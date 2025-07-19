package net.marmar.rotten_planks_and_logs.data.model;

import net.marmar.rotten_planks_and_logs.RottenPlanksAndLogs;
import net.marmar.rotten_planks_and_logs.block.RPLBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RPLItemModelProvider extends ItemModelProvider {
    public RPLItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RottenPlanksAndLogs.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Acacia
        buttonItem(RPLBlocks.ROTTEN_ACACIA_BUTTON, RPLBlocks.ROTTEN_ACACIA_PLANKS);

        blockWithItem(RPLBlocks.ROTTEN_ACACIA_PRESSURE_PLATE);

        blockWithItem(RPLBlocks.ROTTEN_ACACIA_SLAB);
        blockWithItem(RPLBlocks.ROTTEN_ACACIA_STAIRS);
        fenceItem(RPLBlocks.ROTTEN_ACACIA_FENCE, RPLBlocks.ROTTEN_ACACIA_PLANKS);
        blockWithItem(RPLBlocks.ROTTEN_ACACIA_FENCEGATE);

        //Bamboo
        buttonItem(RPLBlocks.ROTTEN_BAMBOO_BUTTON, RPLBlocks.ROTTEN_BAMBOO_PLANKS);

        blockWithItem(RPLBlocks.ROTTEN_BAMBOO_PRESSURE_PLATE);

        blockWithItem(RPLBlocks.ROTTEN_BAMBOO_SLAB);
        blockWithItem(RPLBlocks.ROTTEN_BAMBOO_STAIRS);
        fenceItem(RPLBlocks.ROTTEN_BAMBOO_FENCE, RPLBlocks.ROTTEN_BAMBOO_PLANKS);
        blockWithItem(RPLBlocks.ROTTEN_BAMBOO_FENCEGATE);

        //Birch
        buttonItem(RPLBlocks.ROTTEN_BIRCH_BUTTON, RPLBlocks.ROTTEN_BIRCH_PLANKS);

        blockWithItem(RPLBlocks.ROTTEN_BIRCH_PRESSURE_PLATE);

        blockWithItem(RPLBlocks.ROTTEN_BIRCH_SLAB);
        blockWithItem(RPLBlocks.ROTTEN_BIRCH_STAIRS);
        fenceItem(RPLBlocks.ROTTEN_BIRCH_FENCE, RPLBlocks.ROTTEN_BIRCH_PLANKS);
        blockWithItem(RPLBlocks.ROTTEN_BIRCH_FENCEGATE);

        //Cherry
        buttonItem(RPLBlocks.ROTTEN_CHERRY_BUTTON, RPLBlocks.ROTTEN_CHERRY_PLANKS);

        blockWithItem(RPLBlocks.ROTTEN_CHERRY_PRESSURE_PLATE);

        blockWithItem(RPLBlocks.ROTTEN_CHERRY_SLAB);
        blockWithItem(RPLBlocks.ROTTEN_CHERRY_STAIRS);
        fenceItem(RPLBlocks.ROTTEN_CHERRY_FENCE, RPLBlocks.ROTTEN_CHERRY_PLANKS);
        blockWithItem(RPLBlocks.ROTTEN_CHERRY_FENCEGATE);

        //Dark oak
        buttonItem(RPLBlocks.ROTTEN_DARK_OAK_BUTTON, RPLBlocks.ROTTEN_DARK_OAK_PLANKS);

        blockWithItem(RPLBlocks.ROTTEN_DARK_OAK_PRESSURE_PLATE);

        blockWithItem(RPLBlocks.ROTTEN_DARK_OAK_SLAB);
        blockWithItem(RPLBlocks.ROTTEN_DARK_OAK_STAIRS);
        fenceItem(RPLBlocks.ROTTEN_DARK_OAK_FENCE, RPLBlocks.ROTTEN_DARK_OAK_PLANKS);
        blockWithItem(RPLBlocks.ROTTEN_DARK_OAK_FENCEGATE);

        //Jungle
        buttonItem(RPLBlocks.ROTTEN_JUNGLE_BUTTON, RPLBlocks.ROTTEN_JUNGLE_PLANKS);

        blockWithItem(RPLBlocks.ROTTEN_JUNGLE_PRESSURE_PLATE);

        blockWithItem(RPLBlocks.ROTTEN_JUNGLE_SLAB);
        blockWithItem(RPLBlocks.ROTTEN_JUNGLE_STAIRS);
        fenceItem(RPLBlocks.ROTTEN_JUNGLE_FENCE, RPLBlocks.ROTTEN_JUNGLE_PLANKS);
        blockWithItem(RPLBlocks.ROTTEN_JUNGLE_FENCEGATE);

        //Mangle
        buttonItem(RPLBlocks.ROTTEN_MANGLE_BUTTON, RPLBlocks.ROTTEN_MANGLE_PLANKS);

        blockWithItem(RPLBlocks.ROTTEN_MANGLE_PRESSURE_PLATE);

        blockWithItem(RPLBlocks.ROTTEN_MANGLE_SLAB);
        blockWithItem(RPLBlocks.ROTTEN_MANGLE_STAIRS);
        fenceItem(RPLBlocks.ROTTEN_MANGLE_FENCE, RPLBlocks.ROTTEN_MANGLE_PLANKS);
        blockWithItem(RPLBlocks.ROTTEN_MANGLE_FENCEGATE);

        //Spruce
        buttonItem(RPLBlocks.ROTTEN_SPRUCE_BUTTON, RPLBlocks.ROTTEN_SPRUCE_PLANKS);

        blockWithItem(RPLBlocks.ROTTEN_SPRUCE_PRESSURE_PLATE);

        blockWithItem(RPLBlocks.ROTTEN_SPRUCE_SLAB);
        blockWithItem(RPLBlocks.ROTTEN_SPRUCE_STAIRS);
        fenceItem(RPLBlocks.ROTTEN_SPRUCE_FENCE, RPLBlocks.ROTTEN_SPRUCE_PLANKS);
        blockWithItem(RPLBlocks.ROTTEN_SPRUCE_FENCEGATE);

        //Oak
        buttonItem(RPLBlocks.ROTTEN_OAK_BUTTON, RPLBlocks.ROTTEN_OAK_PLANKS);

        blockWithItem(RPLBlocks.ROTTEN_OAK_PRESSURE_PLATE);

        blockWithItem(RPLBlocks.ROTTEN_OAK_SLAB);
        blockWithItem(RPLBlocks.ROTTEN_OAK_STAIRS);
        fenceItem(RPLBlocks.ROTTEN_OAK_FENCE, RPLBlocks.ROTTEN_OAK_PLANKS);
        blockWithItem(RPLBlocks.ROTTEN_OAK_FENCEGATE);
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(RottenPlanksAndLogs.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(RottenPlanksAndLogs.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void blockWithItem(RegistryObject<Block> block) {
        this.withExistingParent(RottenPlanksAndLogs.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }
}
