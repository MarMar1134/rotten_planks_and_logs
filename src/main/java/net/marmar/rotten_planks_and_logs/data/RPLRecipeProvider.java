package net.marmar.rotten_planks_and_logs.data;

import net.marmar.rotten_planks_and_logs.block.RPLBlocks;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Consumer;

public class RPLRecipeProvider extends RecipeProvider {
    public RPLRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    private static void buildIndividualBlockRecipes(Consumer<FinishedRecipe> consumer){
        //Acacia
        rottenWoodRecipe(Blocks.ACACIA_LOG, RPLBlocks.ROTTEN_ACACIA_LOG.get(), consumer);
        rottenWoodRecipe(Blocks.STRIPPED_ACACIA_LOG, RPLBlocks.STRIPPED_ROTTEN_ACACIA_LOG.get(), consumer);
        rottenWoodRecipe(Blocks.ACACIA_WOOD, RPLBlocks.ROTTEN_ACACIA_WOOD.get(), consumer);
        rottenWoodRecipe(Blocks.STRIPPED_ACACIA_WOOD, RPLBlocks.STRIPPED_ROTTEN_ACACIA_WOOD.get(), consumer);
        rottenWoodRecipe(Blocks.ACACIA_PLANKS, RPLBlocks.ROTTEN_ACACIA_PLANKS.get(), consumer);
        rottenWoodRecipe(Blocks.ACACIA_BUTTON, RPLBlocks.ROTTEN_ACACIA_BUTTON.get(), consumer);
        rottenWoodRecipe(Blocks.ACACIA_PRESSURE_PLATE, RPLBlocks.ROTTEN_ACACIA_PRESSURE_PLATE.get(), consumer);
        rottenWoodRecipe(Blocks.ACACIA_SLAB, RPLBlocks.ROTTEN_ACACIA_SLAB.get(), consumer);
        rottenWoodRecipe(Blocks.ACACIA_STAIRS, RPLBlocks.ROTTEN_ACACIA_STAIRS.get(), consumer);
        rottenWoodRecipe(Blocks.ACACIA_FENCE, RPLBlocks.ROTTEN_ACACIA_FENCE.get(), consumer);
        rottenWoodRecipe(Blocks.ACACIA_FENCE_GATE, RPLBlocks.ROTTEN_ACACIA_FENCE_GATE.get(), consumer);
        rottenWoodRecipe(Blocks.ACACIA_DOOR, RPLBlocks.ROTTEN_ACACIA_DOOR.get(), consumer);
        rottenWoodRecipe(Blocks.ACACIA_TRAPDOOR, RPLBlocks.ROTTEN_ACACIA_TRAPDOOR.get(), consumer);

        //Bamboo
        rottenWoodRecipe(Blocks.BAMBOO_PLANKS, RPLBlocks.ROTTEN_BAMBOO_PLANKS.get(), consumer);
        rottenWoodRecipe(Blocks.BAMBOO_BUTTON, RPLBlocks.ROTTEN_BAMBOO_BUTTON.get(), consumer);
        rottenWoodRecipe(Blocks.BAMBOO_PRESSURE_PLATE, RPLBlocks.ROTTEN_BAMBOO_PRESSURE_PLATE.get(), consumer);
        rottenWoodRecipe(Blocks.BAMBOO_SLAB, RPLBlocks.ROTTEN_BAMBOO_SLAB.get(), consumer);
        rottenWoodRecipe(Blocks.BAMBOO_STAIRS, RPLBlocks.ROTTEN_BAMBOO_STAIRS.get(), consumer);
        rottenWoodRecipe(Blocks.BAMBOO_FENCE, RPLBlocks.ROTTEN_BAMBOO_FENCE.get(), consumer);
        rottenWoodRecipe(Blocks.BAMBOO_FENCE_GATE, RPLBlocks.ROTTEN_BAMBOO_FENCE_GATE.get(), consumer);
        rottenWoodRecipe(Blocks.BAMBOO_DOOR, RPLBlocks.ROTTEN_BAMBOO_DOOR.get(), consumer);
        rottenWoodRecipe(Blocks.BAMBOO_TRAPDOOR, RPLBlocks.ROTTEN_BAMBOO_TRAPDOOR.get(), consumer);

        //Birch
        rottenWoodRecipe(Blocks.BIRCH_LOG, RPLBlocks.ROTTEN_BIRCH_LOG.get(), consumer);
        rottenWoodRecipe(Blocks.STRIPPED_BIRCH_LOG, RPLBlocks.STRIPPED_ROTTEN_BIRCH_LOG.get(), consumer);
        rottenWoodRecipe(Blocks.BIRCH_WOOD, RPLBlocks.ROTTEN_BIRCH_WOOD.get(), consumer);
        rottenWoodRecipe(Blocks.STRIPPED_BIRCH_WOOD, RPLBlocks.STRIPPED_ROTTEN_BIRCH_WOOD.get(), consumer);
        rottenWoodRecipe(Blocks.BIRCH_PLANKS, RPLBlocks.ROTTEN_BIRCH_PLANKS.get(), consumer);
        rottenWoodRecipe(Blocks.BIRCH_BUTTON, RPLBlocks.ROTTEN_BIRCH_BUTTON.get(), consumer);
        rottenWoodRecipe(Blocks.BIRCH_PRESSURE_PLATE, RPLBlocks.ROTTEN_BIRCH_PRESSURE_PLATE.get(), consumer);
        rottenWoodRecipe(Blocks.BIRCH_SLAB, RPLBlocks.ROTTEN_BIRCH_SLAB.get(), consumer);
        rottenWoodRecipe(Blocks.BIRCH_STAIRS, RPLBlocks.ROTTEN_BIRCH_STAIRS.get(), consumer);
        rottenWoodRecipe(Blocks.BIRCH_FENCE, RPLBlocks.ROTTEN_BIRCH_FENCE.get(), consumer);
        rottenWoodRecipe(Blocks.BIRCH_FENCE_GATE, RPLBlocks.ROTTEN_BIRCH_FENCE_GATE.get(), consumer);
        rottenWoodRecipe(Blocks.BIRCH_DOOR, RPLBlocks.ROTTEN_BIRCH_DOOR.get(), consumer);
        rottenWoodRecipe(Blocks.BIRCH_TRAPDOOR, RPLBlocks.ROTTEN_BIRCH_TRAPDOOR.get(), consumer);

        //Cherry
        rottenWoodRecipe(Blocks.CHERRY_LOG, RPLBlocks.ROTTEN_CHERRY_LOG.get(), consumer);
        rottenWoodRecipe(Blocks.STRIPPED_CHERRY_LOG, RPLBlocks.STRIPPED_ROTTEN_CHERRY_LOG.get(), consumer);
        rottenWoodRecipe(Blocks.CHERRY_WOOD, RPLBlocks.ROTTEN_CHERRY_WOOD.get(), consumer);
        rottenWoodRecipe(Blocks.STRIPPED_CHERRY_WOOD, RPLBlocks.STRIPPED_ROTTEN_CHERRY_WOOD.get(), consumer);
        rottenWoodRecipe(Blocks.CHERRY_PLANKS, RPLBlocks.ROTTEN_CHERRY_PLANKS.get(), consumer);
        rottenWoodRecipe(Blocks.CHERRY_BUTTON, RPLBlocks.ROTTEN_CHERRY_BUTTON.get(), consumer);
        rottenWoodRecipe(Blocks.CHERRY_PRESSURE_PLATE, RPLBlocks.ROTTEN_CHERRY_PRESSURE_PLATE.get(), consumer);
        rottenWoodRecipe(Blocks.CHERRY_SLAB, RPLBlocks.ROTTEN_CHERRY_SLAB.get(), consumer);
        rottenWoodRecipe(Blocks.CHERRY_STAIRS, RPLBlocks.ROTTEN_CHERRY_STAIRS.get(), consumer);
        rottenWoodRecipe(Blocks.CHERRY_FENCE, RPLBlocks.ROTTEN_CHERRY_FENCE.get(), consumer);
        rottenWoodRecipe(Blocks.CHERRY_FENCE_GATE, RPLBlocks.ROTTEN_CHERRY_FENCE_GATE.get(), consumer);
        rottenWoodRecipe(Blocks.CHERRY_DOOR, RPLBlocks.ROTTEN_CHERRY_DOOR.get(), consumer);
        rottenWoodRecipe(Blocks.CHERRY_TRAPDOOR, RPLBlocks.ROTTEN_CHERRY_TRAPDOOR.get(), consumer);

        //Dark oak
        rottenWoodRecipe(Blocks.DARK_OAK_LOG, RPLBlocks.ROTTEN_DARK_OAK_LOG.get(), consumer);
        rottenWoodRecipe(Blocks.STRIPPED_DARK_OAK_LOG, RPLBlocks.STRIPPED_ROTTEN_DARK_OAK_LOG.get(), consumer);
        rottenWoodRecipe(Blocks.DARK_OAK_WOOD, RPLBlocks.ROTTEN_DARK_OAK_WOOD.get(), consumer);
        rottenWoodRecipe(Blocks.STRIPPED_DARK_OAK_WOOD, RPLBlocks.STRIPPED_ROTTEN_DARK_OAK_WOOD.get(), consumer);
        rottenWoodRecipe(Blocks.DARK_OAK_PLANKS, RPLBlocks.ROTTEN_DARK_OAK_PLANKS.get(), consumer);
        rottenWoodRecipe(Blocks.DARK_OAK_BUTTON, RPLBlocks.ROTTEN_DARK_OAK_BUTTON.get(), consumer);
        rottenWoodRecipe(Blocks.DARK_OAK_PRESSURE_PLATE, RPLBlocks.ROTTEN_DARK_OAK_PRESSURE_PLATE.get(), consumer);
        rottenWoodRecipe(Blocks.DARK_OAK_SLAB, RPLBlocks.ROTTEN_DARK_OAK_SLAB.get(), consumer);
        rottenWoodRecipe(Blocks.DARK_OAK_STAIRS, RPLBlocks.ROTTEN_DARK_OAK_STAIRS.get(), consumer);
        rottenWoodRecipe(Blocks.DARK_OAK_FENCE, RPLBlocks.ROTTEN_DARK_OAK_FENCE.get(), consumer);
        rottenWoodRecipe(Blocks.DARK_OAK_FENCE_GATE, RPLBlocks.ROTTEN_DARK_OAK_FENCE_GATE.get(), consumer);
        rottenWoodRecipe(Blocks.DARK_OAK_DOOR, RPLBlocks.ROTTEN_DARK_OAK_DOOR.get(), consumer);
        rottenWoodRecipe(Blocks.DARK_OAK_TRAPDOOR, RPLBlocks.ROTTEN_DARK_OAK_TRAPDOOR.get(), consumer);

        //Jungle
        rottenWoodRecipe(Blocks.JUNGLE_LOG, RPLBlocks.ROTTEN_JUNGLE_LOG.get(), consumer);
        rottenWoodRecipe(Blocks.STRIPPED_JUNGLE_LOG, RPLBlocks.STRIPPED_ROTTEN_JUNGLE_LOG.get(), consumer);
        rottenWoodRecipe(Blocks.JUNGLE_WOOD, RPLBlocks.ROTTEN_JUNGLE_WOOD.get(), consumer);
        rottenWoodRecipe(Blocks.STRIPPED_JUNGLE_WOOD, RPLBlocks.STRIPPED_ROTTEN_JUNGLE_WOOD.get(), consumer);
        rottenWoodRecipe(Blocks.JUNGLE_PLANKS, RPLBlocks.ROTTEN_JUNGLE_PLANKS.get(), consumer);
        rottenWoodRecipe(Blocks.JUNGLE_BUTTON, RPLBlocks.ROTTEN_JUNGLE_BUTTON.get(), consumer);
        rottenWoodRecipe(Blocks.JUNGLE_PRESSURE_PLATE, RPLBlocks.ROTTEN_JUNGLE_PRESSURE_PLATE.get(), consumer);
        rottenWoodRecipe(Blocks.JUNGLE_SLAB, RPLBlocks.ROTTEN_JUNGLE_SLAB.get(), consumer);
        rottenWoodRecipe(Blocks.JUNGLE_STAIRS, RPLBlocks.ROTTEN_JUNGLE_STAIRS.get(), consumer);
        rottenWoodRecipe(Blocks.JUNGLE_FENCE, RPLBlocks.ROTTEN_JUNGLE_FENCE.get(), consumer);
        rottenWoodRecipe(Blocks.JUNGLE_FENCE_GATE, RPLBlocks.ROTTEN_JUNGLE_FENCE_GATE.get(), consumer);
        rottenWoodRecipe(Blocks.JUNGLE_DOOR, RPLBlocks.ROTTEN_JUNGLE_DOOR.get(), consumer);
        rottenWoodRecipe(Blocks.JUNGLE_TRAPDOOR, RPLBlocks.ROTTEN_JUNGLE_TRAPDOOR.get(), consumer);

        //Mangrove
        rottenWoodRecipe(Blocks.MANGROVE_LOG, RPLBlocks.ROTTEN_MANGROVE_LOG.get(), consumer);
        rottenWoodRecipe(Blocks.STRIPPED_MANGROVE_LOG, RPLBlocks.STRIPPED_ROTTEN_MANGROVE_LOG.get(), consumer);
        rottenWoodRecipe(Blocks.MANGROVE_WOOD, RPLBlocks.ROTTEN_MANGROVE_WOOD.get(), consumer);
        rottenWoodRecipe(Blocks.STRIPPED_MANGROVE_WOOD, RPLBlocks.STRIPPED_ROTTEN_MANGROVE_WOOD.get(), consumer);
        rottenWoodRecipe(Blocks.MANGROVE_PLANKS, RPLBlocks.ROTTEN_MANGROVE_PLANKS.get(), consumer);
        rottenWoodRecipe(Blocks.MANGROVE_BUTTON, RPLBlocks.ROTTEN_MANGROVE_BUTTON.get(), consumer);
        rottenWoodRecipe(Blocks.MANGROVE_PRESSURE_PLATE, RPLBlocks.ROTTEN_MANGROVE_PRESSURE_PLATE.get(), consumer);
        rottenWoodRecipe(Blocks.MANGROVE_SLAB, RPLBlocks.ROTTEN_MANGROVE_SLAB.get(), consumer);
        rottenWoodRecipe(Blocks.MANGROVE_STAIRS, RPLBlocks.ROTTEN_MANGROVE_STAIRS.get(), consumer);
        rottenWoodRecipe(Blocks.MANGROVE_FENCE, RPLBlocks.ROTTEN_MANGROVE_FENCE.get(), consumer);
        rottenWoodRecipe(Blocks.MANGROVE_FENCE_GATE, RPLBlocks.ROTTEN_MANGROVE_FENCE_GATE.get(), consumer);
        rottenWoodRecipe(Blocks.MANGROVE_DOOR, RPLBlocks.ROTTEN_MANGROVE_DOOR.get(), consumer);
        rottenWoodRecipe(Blocks.MANGROVE_TRAPDOOR, RPLBlocks.ROTTEN_MANGROVE_TRAPDOOR.get(), consumer);

        //Spruce
        rottenWoodRecipe(Blocks.SPRUCE_LOG, RPLBlocks.ROTTEN_SPRUCE_LOG.get(), consumer);
        rottenWoodRecipe(Blocks.STRIPPED_SPRUCE_LOG, RPLBlocks.STRIPPED_ROTTEN_SPRUCE_LOG.get(), consumer);
        rottenWoodRecipe(Blocks.SPRUCE_WOOD, RPLBlocks.ROTTEN_SPRUCE_WOOD.get(), consumer);
        rottenWoodRecipe(Blocks.STRIPPED_SPRUCE_WOOD, RPLBlocks.STRIPPED_ROTTEN_SPRUCE_WOOD.get(), consumer);
        rottenWoodRecipe(Blocks.SPRUCE_PLANKS, RPLBlocks.ROTTEN_SPRUCE_PLANKS.get(), consumer);
        rottenWoodRecipe(Blocks.SPRUCE_BUTTON, RPLBlocks.ROTTEN_SPRUCE_BUTTON.get(), consumer);
        rottenWoodRecipe(Blocks.SPRUCE_PRESSURE_PLATE, RPLBlocks.ROTTEN_SPRUCE_PRESSURE_PLATE.get(), consumer);
        rottenWoodRecipe(Blocks.SPRUCE_SLAB, RPLBlocks.ROTTEN_SPRUCE_SLAB.get(), consumer);
        rottenWoodRecipe(Blocks.SPRUCE_STAIRS, RPLBlocks.ROTTEN_SPRUCE_STAIRS.get(), consumer);
        rottenWoodRecipe(Blocks.SPRUCE_FENCE, RPLBlocks.ROTTEN_SPRUCE_FENCE.get(), consumer);
        rottenWoodRecipe(Blocks.SPRUCE_FENCE_GATE, RPLBlocks.ROTTEN_SPRUCE_FENCE_GATE.get(), consumer);
        rottenWoodRecipe(Blocks.SPRUCE_DOOR, RPLBlocks.ROTTEN_SPRUCE_DOOR.get(), consumer);
        rottenWoodRecipe(Blocks.SPRUCE_TRAPDOOR, RPLBlocks.ROTTEN_SPRUCE_TRAPDOOR.get(), consumer);

        //Oak
        rottenWoodRecipe(Blocks.OAK_LOG, RPLBlocks.ROTTEN_OAK_LOG.get(), consumer);
        rottenWoodRecipe(Blocks.STRIPPED_OAK_LOG, RPLBlocks.STRIPPED_ROTTEN_OAK_LOG.get(), consumer);
        rottenWoodRecipe(Blocks.OAK_WOOD, RPLBlocks.ROTTEN_OAK_WOOD.get(), consumer);
        rottenWoodRecipe(Blocks.STRIPPED_OAK_WOOD, RPLBlocks.STRIPPED_ROTTEN_OAK_WOOD.get(), consumer);
        rottenWoodRecipe(Blocks.OAK_PLANKS, RPLBlocks.ROTTEN_OAK_PLANKS.get(), consumer);
        rottenWoodRecipe(Blocks.OAK_BUTTON, RPLBlocks.ROTTEN_OAK_BUTTON.get(), consumer);
        rottenWoodRecipe(Blocks.OAK_PRESSURE_PLATE, RPLBlocks.ROTTEN_OAK_PRESSURE_PLATE.get(), consumer);
        rottenWoodRecipe(Blocks.OAK_SLAB, RPLBlocks.ROTTEN_OAK_SLAB.get(), consumer);
        rottenWoodRecipe(Blocks.OAK_STAIRS, RPLBlocks.ROTTEN_OAK_STAIRS.get(), consumer);
        rottenWoodRecipe(Blocks.OAK_FENCE, RPLBlocks.ROTTEN_OAK_FENCE.get(), consumer);
        rottenWoodRecipe(Blocks.OAK_FENCE_GATE, RPLBlocks.ROTTEN_OAK_FENCE_GATE.get(), consumer);
        rottenWoodRecipe(Blocks.OAK_DOOR, RPLBlocks.ROTTEN_OAK_DOOR.get(), consumer);
        rottenWoodRecipe(Blocks.OAK_TRAPDOOR, RPLBlocks.ROTTEN_OAK_TRAPDOOR.get(), consumer);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        buildIndividualBlockRecipes(consumer);

        //Acacia
        logToPlankRecipe(RPLBlocks.ROTTEN_ACACIA_LOG, RPLBlocks.ROTTEN_ACACIA_PLANKS, consumer);
        logToPlankRecipe(RPLBlocks.STRIPPED_ROTTEN_ACACIA_LOG, RPLBlocks.ROTTEN_ACACIA_PLANKS, consumer);
        logToPlankRecipe(RPLBlocks.ROTTEN_ACACIA_WOOD, RPLBlocks.ROTTEN_ACACIA_PLANKS, consumer);
        logToPlankRecipe(RPLBlocks.STRIPPED_ROTTEN_ACACIA_WOOD, RPLBlocks.ROTTEN_ACACIA_PLANKS, consumer);

        rottenWoodFamilyRecipes(RPLBlocks.ROTTEN_ACACIA_PLANKS, RPLBlocks.ROTTEN_ACACIA_STAIRS, RPLBlocks.ROTTEN_ACACIA_SLAB, RPLBlocks.ROTTEN_ACACIA_FENCE,
                RPLBlocks.ROTTEN_ACACIA_FENCE_GATE, RPLBlocks.ROTTEN_ACACIA_BUTTON, RPLBlocks.ROTTEN_ACACIA_PRESSURE_PLATE, RPLBlocks.ROTTEN_ACACIA_DOOR, RPLBlocks.ROTTEN_ACACIA_TRAPDOOR,
                consumer);

        //Bamboo
        rottenWoodFamilyRecipes(RPLBlocks.ROTTEN_BAMBOO_PLANKS, RPLBlocks.ROTTEN_BAMBOO_STAIRS, RPLBlocks.ROTTEN_BAMBOO_SLAB, RPLBlocks.ROTTEN_BAMBOO_FENCE,
                RPLBlocks.ROTTEN_BAMBOO_FENCE_GATE, RPLBlocks.ROTTEN_BAMBOO_BUTTON, RPLBlocks.ROTTEN_BAMBOO_PRESSURE_PLATE, RPLBlocks.ROTTEN_BAMBOO_DOOR, RPLBlocks.ROTTEN_BAMBOO_TRAPDOOR,
                consumer);

        //Birch
        logToPlankRecipe(RPLBlocks.ROTTEN_BIRCH_LOG, RPLBlocks.ROTTEN_BIRCH_PLANKS, consumer);
        logToPlankRecipe(RPLBlocks.STRIPPED_ROTTEN_BIRCH_LOG, RPLBlocks.ROTTEN_BIRCH_PLANKS, consumer);
        logToPlankRecipe(RPLBlocks.ROTTEN_BIRCH_WOOD, RPLBlocks.ROTTEN_BIRCH_PLANKS, consumer);
        logToPlankRecipe(RPLBlocks.STRIPPED_ROTTEN_BIRCH_WOOD, RPLBlocks.ROTTEN_BIRCH_PLANKS, consumer);

        rottenWoodFamilyRecipes(RPLBlocks.ROTTEN_BIRCH_PLANKS, RPLBlocks.ROTTEN_BIRCH_STAIRS, RPLBlocks.ROTTEN_BIRCH_SLAB, RPLBlocks.ROTTEN_BIRCH_FENCE,
                RPLBlocks.ROTTEN_BIRCH_FENCE_GATE, RPLBlocks.ROTTEN_BIRCH_BUTTON, RPLBlocks.ROTTEN_BIRCH_PRESSURE_PLATE, RPLBlocks.ROTTEN_BIRCH_DOOR, RPLBlocks.ROTTEN_BIRCH_TRAPDOOR,
                consumer);

        //Cherry
        logToPlankRecipe(RPLBlocks.ROTTEN_CHERRY_LOG, RPLBlocks.ROTTEN_CHERRY_PLANKS, consumer);
        logToPlankRecipe(RPLBlocks.STRIPPED_ROTTEN_CHERRY_LOG, RPLBlocks.ROTTEN_CHERRY_PLANKS, consumer);
        logToPlankRecipe(RPLBlocks.ROTTEN_CHERRY_WOOD, RPLBlocks.ROTTEN_CHERRY_PLANKS, consumer);
        logToPlankRecipe(RPLBlocks.STRIPPED_ROTTEN_CHERRY_WOOD, RPLBlocks.ROTTEN_CHERRY_PLANKS, consumer);

        rottenWoodFamilyRecipes(RPLBlocks.ROTTEN_CHERRY_PLANKS, RPLBlocks.ROTTEN_CHERRY_STAIRS, RPLBlocks.ROTTEN_CHERRY_SLAB, RPLBlocks.ROTTEN_CHERRY_FENCE,
                RPLBlocks.ROTTEN_CHERRY_FENCE_GATE, RPLBlocks.ROTTEN_CHERRY_BUTTON, RPLBlocks.ROTTEN_CHERRY_PRESSURE_PLATE, RPLBlocks.ROTTEN_CHERRY_DOOR, RPLBlocks.ROTTEN_CHERRY_TRAPDOOR,
                consumer);

        //Dark oak
        logToPlankRecipe(RPLBlocks.ROTTEN_DARK_OAK_LOG, RPLBlocks.ROTTEN_DARK_OAK_PLANKS, consumer);
        logToPlankRecipe(RPLBlocks.STRIPPED_ROTTEN_DARK_OAK_LOG, RPLBlocks.ROTTEN_DARK_OAK_PLANKS, consumer);
        logToPlankRecipe(RPLBlocks.ROTTEN_DARK_OAK_WOOD, RPLBlocks.ROTTEN_DARK_OAK_PLANKS, consumer);
        logToPlankRecipe(RPLBlocks.STRIPPED_ROTTEN_DARK_OAK_WOOD, RPLBlocks.ROTTEN_DARK_OAK_PLANKS, consumer);

        rottenWoodFamilyRecipes(RPLBlocks.ROTTEN_DARK_OAK_PLANKS, RPLBlocks.ROTTEN_DARK_OAK_STAIRS, RPLBlocks.ROTTEN_DARK_OAK_SLAB, RPLBlocks.ROTTEN_DARK_OAK_FENCE,
                RPLBlocks.ROTTEN_DARK_OAK_FENCE_GATE, RPLBlocks.ROTTEN_DARK_OAK_BUTTON, RPLBlocks.ROTTEN_DARK_OAK_PRESSURE_PLATE, RPLBlocks.ROTTEN_DARK_OAK_DOOR, RPLBlocks.ROTTEN_DARK_OAK_TRAPDOOR,
                consumer);

        //Jungle
        logToPlankRecipe(RPLBlocks.ROTTEN_JUNGLE_LOG, RPLBlocks.ROTTEN_JUNGLE_PLANKS, consumer);
        logToPlankRecipe(RPLBlocks.STRIPPED_ROTTEN_JUNGLE_LOG, RPLBlocks.ROTTEN_JUNGLE_PLANKS, consumer);
        logToPlankRecipe(RPLBlocks.ROTTEN_JUNGLE_WOOD, RPLBlocks.ROTTEN_JUNGLE_PLANKS, consumer);
        logToPlankRecipe(RPLBlocks.STRIPPED_ROTTEN_JUNGLE_WOOD, RPLBlocks.ROTTEN_JUNGLE_PLANKS, consumer);

        rottenWoodFamilyRecipes(RPLBlocks.ROTTEN_JUNGLE_PLANKS, RPLBlocks.ROTTEN_JUNGLE_STAIRS, RPLBlocks.ROTTEN_JUNGLE_SLAB, RPLBlocks.ROTTEN_JUNGLE_FENCE,
                RPLBlocks.ROTTEN_JUNGLE_FENCE_GATE, RPLBlocks.ROTTEN_JUNGLE_BUTTON, RPLBlocks.ROTTEN_JUNGLE_PRESSURE_PLATE, RPLBlocks.ROTTEN_JUNGLE_DOOR, RPLBlocks.ROTTEN_JUNGLE_TRAPDOOR,
                consumer);

        //Mangrove
        logToPlankRecipe(RPLBlocks.ROTTEN_MANGROVE_LOG, RPLBlocks.ROTTEN_MANGROVE_PLANKS, consumer);
        logToPlankRecipe(RPLBlocks.STRIPPED_ROTTEN_MANGROVE_LOG, RPLBlocks.ROTTEN_MANGROVE_PLANKS, consumer);
        logToPlankRecipe(RPLBlocks.ROTTEN_MANGROVE_WOOD, RPLBlocks.ROTTEN_MANGROVE_PLANKS, consumer);
        logToPlankRecipe(RPLBlocks.STRIPPED_ROTTEN_MANGROVE_WOOD, RPLBlocks.ROTTEN_MANGROVE_PLANKS, consumer);

        rottenWoodFamilyRecipes(RPLBlocks.ROTTEN_MANGROVE_PLANKS, RPLBlocks.ROTTEN_MANGROVE_STAIRS, RPLBlocks.ROTTEN_MANGROVE_SLAB, RPLBlocks.ROTTEN_MANGROVE_FENCE,
                RPLBlocks.ROTTEN_MANGROVE_FENCE_GATE, RPLBlocks.ROTTEN_MANGROVE_BUTTON, RPLBlocks.ROTTEN_MANGROVE_PRESSURE_PLATE, RPLBlocks.ROTTEN_MANGROVE_DOOR, RPLBlocks.ROTTEN_MANGROVE_TRAPDOOR,
                consumer);

        //Spruce
        logToPlankRecipe(RPLBlocks.ROTTEN_SPRUCE_LOG, RPLBlocks.ROTTEN_SPRUCE_PLANKS, consumer);
        logToPlankRecipe(RPLBlocks.STRIPPED_ROTTEN_SPRUCE_LOG, RPLBlocks.ROTTEN_SPRUCE_PLANKS, consumer);
        logToPlankRecipe(RPLBlocks.ROTTEN_SPRUCE_WOOD, RPLBlocks.ROTTEN_SPRUCE_PLANKS, consumer);
        logToPlankRecipe(RPLBlocks.STRIPPED_ROTTEN_SPRUCE_WOOD, RPLBlocks.ROTTEN_SPRUCE_PLANKS, consumer);

        rottenWoodFamilyRecipes(RPLBlocks.ROTTEN_SPRUCE_PLANKS, RPLBlocks.ROTTEN_SPRUCE_STAIRS, RPLBlocks.ROTTEN_SPRUCE_SLAB, RPLBlocks.ROTTEN_SPRUCE_FENCE,
                RPLBlocks.ROTTEN_SPRUCE_FENCE_GATE, RPLBlocks.ROTTEN_SPRUCE_BUTTON, RPLBlocks.ROTTEN_SPRUCE_PRESSURE_PLATE, RPLBlocks.ROTTEN_SPRUCE_DOOR, RPLBlocks.ROTTEN_SPRUCE_TRAPDOOR,
                consumer);

        //Oak
        logToPlankRecipe(RPLBlocks.ROTTEN_OAK_LOG, RPLBlocks.ROTTEN_OAK_PLANKS, consumer);
        logToPlankRecipe(RPLBlocks.STRIPPED_ROTTEN_OAK_LOG, RPLBlocks.ROTTEN_OAK_PLANKS, consumer);
        logToPlankRecipe(RPLBlocks.ROTTEN_OAK_WOOD, RPLBlocks.ROTTEN_OAK_PLANKS, consumer);
        logToPlankRecipe(RPLBlocks.STRIPPED_ROTTEN_OAK_WOOD, RPLBlocks.ROTTEN_OAK_PLANKS, consumer);

        rottenWoodFamilyRecipes(RPLBlocks.ROTTEN_OAK_PLANKS, RPLBlocks.ROTTEN_OAK_STAIRS, RPLBlocks.ROTTEN_OAK_SLAB, RPLBlocks.ROTTEN_OAK_FENCE,
                RPLBlocks.ROTTEN_OAK_FENCE_GATE, RPLBlocks.ROTTEN_OAK_BUTTON, RPLBlocks.ROTTEN_OAK_PRESSURE_PLATE, RPLBlocks.ROTTEN_OAK_DOOR, RPLBlocks.ROTTEN_OAK_TRAPDOOR,
                consumer);
    }

    //Triggers
    private static InventoryChangeTrigger.TriggerInstance HAS_WOOD_OR_VINE(ItemLike pBlock){
        return InventoryChangeTrigger.TriggerInstance.hasItems(pBlock, Items.VINE);
    }
    private static InventoryChangeTrigger.TriggerInstance HAS_WOOD_OR_MOSS_BLOCK(ItemLike pBlock){
        return InventoryChangeTrigger.TriggerInstance.hasItems(pBlock, Items.MOSS_BLOCK);
    }

    //Helper methods
    private static void rottenWoodRecipe(Block pBlock, Block pRottenBlock, Consumer<FinishedRecipe> pConsumer){
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, pRottenBlock)
                .requires(pBlock).requires(Items.VINE)
                .unlockedBy("has_wood_and_vine", HAS_WOOD_OR_VINE(pBlock))
                .save(pConsumer, getItemName(pRottenBlock) + "_from_vine");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, pRottenBlock)
                .requires(pBlock).requires(Items.MOSS_BLOCK)
                .unlockedBy("has_wood_and_moss_block", HAS_WOOD_OR_MOSS_BLOCK(pBlock))
                .save(pConsumer, getItemName(pRottenBlock) + "_from_moss_block");
    }

    private static void logToPlankRecipe(RegistryObject<Block> pLog, RegistryObject<Block> pPlank, Consumer<FinishedRecipe> pConsumer){
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, pPlank.get(), 4)
                .requires(pLog.get())
                .group(getItemName(pPlank.get()))
                .unlockedBy(getHasName(pLog.get()), has(pLog.get()))
                .save(pConsumer, getItemName(pPlank.get()) + "_from_" + getItemName(pLog.get()));
    }

    private static void rottenWoodFamilyRecipes(RegistryObject<Block> pPlank, RegistryObject<Block> pStairs, RegistryObject<Block> pSlab,
                                                RegistryObject<Block> pFence, RegistryObject<Block> pFenceGate, RegistryObject<Block> pButton,
                                                RegistryObject<Block> pPressurePlace, RegistryObject<Block> pDoor, RegistryObject<Block> pTrapdoor,
                                                Consumer<FinishedRecipe> pConsumer){
        stairBuilder(pStairs.get(), Ingredient.of(pPlank.get()))
                .unlockedBy(getHasName(pPlank.get()), has(pPlank.get()))
                .save(pConsumer, getItemName(pStairs.get()) + "_from_" + getItemName(pPlank.get()));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, pSlab.get(), Ingredient.of(pPlank.get()))
                .unlockedBy(getHasName(pPlank.get()), has(pPlank.get()))
                .save(pConsumer, getItemName(pSlab.get()) + "_from_" + getItemName(pPlank.get()));

        fenceBuilder(pFence.get(), Ingredient.of(pPlank.get()))
                .unlockedBy(getHasName(pPlank.get()), has(pPlank.get()))
                .save(pConsumer, getItemName(pFence.get()) + "_from_" + getItemName(pPlank.get()));

        fenceGateBuilder(pFenceGate.get(), Ingredient.of(pPlank.get()))
                .unlockedBy(getHasName(pPlank.get()), has(pPlank.get()))
                .save(pConsumer, getItemName(pFenceGate.get()) + "_from_" + getItemName(pPlank.get()));

        buttonBuilder(pButton.get(), Ingredient.of(pPlank.get()))
                .unlockedBy(getHasName(pPlank.get()), has(pPlank.get()))
                .save(pConsumer, getItemName(pButton.get()) + "_from_" + getItemName(pPlank.get()));

        pressurePlateBuilder(RecipeCategory.REDSTONE, pPressurePlace.get(), Ingredient.of(pPlank.get()))
                .unlockedBy(getHasName(pPlank.get()), has(pPlank.get()))
                .save(pConsumer, getItemName(pPressurePlace.get()) + "_from_" + getItemName(pPlank.get()));

        doorBuilder(pDoor.get(), Ingredient.of(pPlank.get()))
                .unlockedBy(getHasName(pPlank.get()), has(pPlank.get()))
                .save(pConsumer, getItemName(pDoor.get()) + "_from_" + getItemName(pPlank.get()));

        trapdoorBuilder(pTrapdoor.get(), Ingredient.of(pPlank.get()))
                .unlockedBy(getHasName(pPlank.get()), has(pPlank.get()))
                .save(pConsumer, getItemName(pTrapdoor.get()) + "_from_" + getItemName(pPlank.get()));
    }
}
