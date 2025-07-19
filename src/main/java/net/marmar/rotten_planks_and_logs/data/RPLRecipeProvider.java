package net.marmar.rotten_planks_and_logs.data;

import net.marmar.rotten_planks_and_logs.block.RPLBlocks;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

public class RPLRecipeProvider extends RecipeProvider {
    public RPLRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
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
        rottenWoodRecipe(Blocks.ACACIA_FENCE_GATE, RPLBlocks.ROTTEN_ACACIA_FENCEGATE.get(), consumer);

        //Bamboo
        rottenWoodRecipe(Blocks.BAMBOO_PLANKS, RPLBlocks.ROTTEN_BAMBOO_PLANKS.get(), consumer);
        rottenWoodRecipe(Blocks.BAMBOO_BUTTON, RPLBlocks.ROTTEN_BAMBOO_BUTTON.get(), consumer);
        rottenWoodRecipe(Blocks.BAMBOO_PRESSURE_PLATE, RPLBlocks.ROTTEN_BAMBOO_PRESSURE_PLATE.get(), consumer);
        rottenWoodRecipe(Blocks.BAMBOO_SLAB, RPLBlocks.ROTTEN_BAMBOO_SLAB.get(), consumer);
        rottenWoodRecipe(Blocks.BAMBOO_STAIRS, RPLBlocks.ROTTEN_BAMBOO_STAIRS.get(), consumer);
        rottenWoodRecipe(Blocks.BAMBOO_FENCE, RPLBlocks.ROTTEN_BAMBOO_FENCE.get(), consumer);
        rottenWoodRecipe(Blocks.BAMBOO_FENCE_GATE, RPLBlocks.ROTTEN_BAMBOO_FENCEGATE.get(), consumer);

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
        rottenWoodRecipe(Blocks.BIRCH_FENCE_GATE, RPLBlocks.ROTTEN_BIRCH_FENCEGATE.get(), consumer);

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
        rottenWoodRecipe(Blocks.CHERRY_FENCE_GATE, RPLBlocks.ROTTEN_CHERRY_FENCEGATE.get(), consumer);

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
        rottenWoodRecipe(Blocks.DARK_OAK_FENCE_GATE, RPLBlocks.ROTTEN_DARK_OAK_FENCEGATE.get(), consumer);

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
        rottenWoodRecipe(Blocks.JUNGLE_FENCE_GATE, RPLBlocks.ROTTEN_JUNGLE_FENCEGATE.get(), consumer);

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
        rottenWoodRecipe(Blocks.SPRUCE_FENCE_GATE, RPLBlocks.ROTTEN_SPRUCE_FENCEGATE.get(), consumer);

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
        rottenWoodRecipe(Blocks.OAK_FENCE_GATE, RPLBlocks.ROTTEN_OAK_FENCEGATE.get(), consumer);
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
}
