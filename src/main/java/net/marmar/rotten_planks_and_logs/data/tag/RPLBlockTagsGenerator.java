package net.marmar.rotten_planks_and_logs.data.tag;

import net.marmar.rotten_planks_and_logs.RottenPlanksAndLogs;
import net.marmar.rotten_planks_and_logs.block.RPLBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class RPLBlockTagsGenerator extends BlockTagsProvider {
    public RPLBlockTagsGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, RottenPlanksAndLogs.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.WOODEN_FENCES).add(
                RPLBlocks.ROTTEN_ACACIA_FENCE.get(),
                RPLBlocks.ROTTEN_BIRCH_FENCE.get(),
                RPLBlocks.ROTTEN_BAMBOO_FENCE.get(),
                RPLBlocks.ROTTEN_CHERRY_FENCE.get(),
                RPLBlocks.ROTTEN_DARK_OAK_FENCE.get(),
                RPLBlocks.ROTTEN_JUNGLE_FENCE.get(),
                RPLBlocks.ROTTEN_MANGLE_FENCE.get(),
                RPLBlocks.ROTTEN_SPRUCE_FENCE.get(),
                RPLBlocks.ROTTEN_OAK_FENCE.get()
        );

        this.tag(BlockTags.FENCE_GATES).add(
                RPLBlocks.ROTTEN_ACACIA_FENCEGATE.get(),
                RPLBlocks.ROTTEN_BIRCH_FENCEGATE.get(),
                RPLBlocks.ROTTEN_BAMBOO_FENCEGATE.get(),
                RPLBlocks.ROTTEN_CHERRY_FENCEGATE.get(),
                RPLBlocks.ROTTEN_DARK_OAK_FENCEGATE.get(),
                RPLBlocks.ROTTEN_JUNGLE_FENCEGATE.get(),
                RPLBlocks.ROTTEN_MANGLE_FENCEGATE.get(),
                RPLBlocks.ROTTEN_SPRUCE_FENCEGATE.get(),
                RPLBlocks.ROTTEN_OAK_FENCEGATE.get()
        );

        this.tag(BlockTags.WOODEN_STAIRS).add(
                RPLBlocks.ROTTEN_ACACIA_STAIRS.get(),
                RPLBlocks.ROTTEN_BIRCH_STAIRS.get(),
                RPLBlocks.ROTTEN_BAMBOO_STAIRS.get(),
                RPLBlocks.ROTTEN_CHERRY_STAIRS.get(),
                RPLBlocks.ROTTEN_DARK_OAK_STAIRS.get(),
                RPLBlocks.ROTTEN_JUNGLE_STAIRS.get(),
                RPLBlocks.ROTTEN_MANGLE_STAIRS.get(),
                RPLBlocks.ROTTEN_SPRUCE_STAIRS.get(),
                RPLBlocks.ROTTEN_OAK_STAIRS.get()
        );

        this.tag(BlockTags.WOODEN_SLABS).add(
                RPLBlocks.ROTTEN_ACACIA_SLAB.get(),
                RPLBlocks.ROTTEN_BIRCH_SLAB.get(),
                RPLBlocks.ROTTEN_BAMBOO_SLAB.get(),
                RPLBlocks.ROTTEN_CHERRY_SLAB.get(),
                RPLBlocks.ROTTEN_DARK_OAK_SLAB.get(),
                RPLBlocks.ROTTEN_JUNGLE_SLAB.get(),
                RPLBlocks.ROTTEN_MANGLE_SLAB.get(),
                RPLBlocks.ROTTEN_SPRUCE_SLAB.get(),
                RPLBlocks.ROTTEN_OAK_SLAB.get()
        );

        this.tag(BlockTags.WOODEN_BUTTONS).add(
                RPLBlocks.ROTTEN_ACACIA_BUTTON.get(),
                RPLBlocks.ROTTEN_BIRCH_BUTTON.get(),
                RPLBlocks.ROTTEN_BAMBOO_BUTTON.get(),
                RPLBlocks.ROTTEN_CHERRY_BUTTON.get(),
                RPLBlocks.ROTTEN_DARK_OAK_BUTTON.get(),
                RPLBlocks.ROTTEN_JUNGLE_BUTTON.get(),
                RPLBlocks.ROTTEN_MANGLE_BUTTON.get(),
                RPLBlocks.ROTTEN_SPRUCE_BUTTON.get(),
                RPLBlocks.ROTTEN_OAK_BUTTON.get()
        );

        this.tag(BlockTags.WOODEN_PRESSURE_PLATES).add(
                RPLBlocks.ROTTEN_ACACIA_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_BIRCH_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_BAMBOO_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_CHERRY_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_DARK_OAK_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_JUNGLE_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_MANGLE_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_SPRUCE_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_OAK_PRESSURE_PLATE.get()
        );

        this.tag(BlockTags.MINEABLE_WITH_AXE).add(
                //Acacia
                RPLBlocks.ROTTEN_ACACIA_LOG.get(),
                RPLBlocks.STRIPPED_ROTTEN_ACACIA_LOG.get(),
                RPLBlocks.ROTTEN_ACACIA_WOOD.get(),
                RPLBlocks.STRIPPED_ROTTEN_ACACIA_WOOD.get(),
                RPLBlocks.ROTTEN_ACACIA_PLANKS.get(),
                RPLBlocks.ROTTEN_ACACIA_BUTTON.get(),
                RPLBlocks.ROTTEN_ACACIA_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_ACACIA_SLAB.get(),
                RPLBlocks.ROTTEN_ACACIA_STAIRS.get(),
                RPLBlocks.ROTTEN_ACACIA_FENCE.get(),
                RPLBlocks.ROTTEN_ACACIA_FENCEGATE.get(),

                //Bamboo
                RPLBlocks.ROTTEN_BAMBOO_PLANKS.get(),
                RPLBlocks.ROTTEN_BAMBOO_BUTTON.get(),
                RPLBlocks.ROTTEN_BAMBOO_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_BAMBOO_SLAB.get(),
                RPLBlocks.ROTTEN_BAMBOO_STAIRS.get(),
                RPLBlocks.ROTTEN_BAMBOO_FENCE.get(),
                RPLBlocks.ROTTEN_BAMBOO_FENCEGATE.get(),

                //Birch
                RPLBlocks.ROTTEN_BIRCH_LOG.get(),
                RPLBlocks.STRIPPED_ROTTEN_BIRCH_LOG.get(),
                RPLBlocks.ROTTEN_BIRCH_WOOD.get(),
                RPLBlocks.STRIPPED_ROTTEN_BIRCH_WOOD.get(),
                RPLBlocks.ROTTEN_BIRCH_PLANKS.get(),
                RPLBlocks.ROTTEN_BIRCH_BUTTON.get(),
                RPLBlocks.ROTTEN_BIRCH_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_BIRCH_SLAB.get(),
                RPLBlocks.ROTTEN_BIRCH_STAIRS.get(),
                RPLBlocks.ROTTEN_BIRCH_FENCE.get(),
                RPLBlocks.ROTTEN_BIRCH_FENCEGATE.get(),

                //Cherry
                RPLBlocks.ROTTEN_CHERRY_LOG.get(),
                RPLBlocks.STRIPPED_ROTTEN_CHERRY_LOG.get(),
                RPLBlocks.ROTTEN_CHERRY_WOOD.get(),
                RPLBlocks.STRIPPED_ROTTEN_CHERRY_WOOD.get(),
                RPLBlocks.ROTTEN_CHERRY_PLANKS.get(),
                RPLBlocks.ROTTEN_CHERRY_BUTTON.get(),
                RPLBlocks.ROTTEN_CHERRY_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_CHERRY_SLAB.get(),
                RPLBlocks.ROTTEN_CHERRY_STAIRS.get(),
                RPLBlocks.ROTTEN_CHERRY_FENCE.get(),
                RPLBlocks.ROTTEN_CHERRY_FENCEGATE.get(),

                //Dark oak
                RPLBlocks.ROTTEN_DARK_OAK_LOG.get(),
                RPLBlocks.STRIPPED_ROTTEN_DARK_OAK_LOG.get(),
                RPLBlocks.ROTTEN_DARK_OAK_WOOD.get(),
                RPLBlocks.STRIPPED_ROTTEN_DARK_OAK_WOOD.get(),
                RPLBlocks.ROTTEN_DARK_OAK_PLANKS.get(),
                RPLBlocks.ROTTEN_DARK_OAK_BUTTON.get(),
                RPLBlocks.ROTTEN_DARK_OAK_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_DARK_OAK_SLAB.get(),
                RPLBlocks.ROTTEN_DARK_OAK_STAIRS.get(),
                RPLBlocks.ROTTEN_DARK_OAK_FENCE.get(),
                RPLBlocks.ROTTEN_DARK_OAK_FENCEGATE.get(),

                //Jungle
                RPLBlocks.ROTTEN_JUNGLE_LOG.get(),
                RPLBlocks.STRIPPED_ROTTEN_JUNGLE_LOG.get(),
                RPLBlocks.ROTTEN_JUNGLE_WOOD.get(),
                RPLBlocks.STRIPPED_ROTTEN_JUNGLE_WOOD.get(),
                RPLBlocks.ROTTEN_JUNGLE_PLANKS.get(),
                RPLBlocks.ROTTEN_JUNGLE_BUTTON.get(),
                RPLBlocks.ROTTEN_JUNGLE_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_JUNGLE_SLAB.get(),
                RPLBlocks.ROTTEN_JUNGLE_STAIRS.get(),
                RPLBlocks.ROTTEN_JUNGLE_FENCE.get(),
                RPLBlocks.ROTTEN_JUNGLE_FENCEGATE.get(),

                //Mangle
                RPLBlocks.ROTTEN_MANGLE_LOG.get(),
                RPLBlocks.STRIPPED_ROTTEN_MANGLE_LOG.get(),
                RPLBlocks.ROTTEN_MANGLE_WOOD.get(),
                RPLBlocks.STRIPPED_ROTTEN_MANGLE_WOOD.get(),
                RPLBlocks.ROTTEN_MANGLE_PLANKS.get(),
                RPLBlocks.ROTTEN_MANGLE_BUTTON.get(),
                RPLBlocks.ROTTEN_MANGLE_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_MANGLE_SLAB.get(),
                RPLBlocks.ROTTEN_MANGLE_STAIRS.get(),
                RPLBlocks.ROTTEN_MANGLE_FENCE.get(),
                RPLBlocks.ROTTEN_MANGLE_FENCEGATE.get(),

                //Spruce
                RPLBlocks.ROTTEN_SPRUCE_LOG.get(),
                RPLBlocks.STRIPPED_ROTTEN_SPRUCE_LOG.get(),
                RPLBlocks.ROTTEN_SPRUCE_WOOD.get(),
                RPLBlocks.STRIPPED_ROTTEN_SPRUCE_WOOD.get(),
                RPLBlocks.ROTTEN_SPRUCE_PLANKS.get(),
                RPLBlocks.ROTTEN_SPRUCE_BUTTON.get(),
                RPLBlocks.ROTTEN_SPRUCE_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_SPRUCE_SLAB.get(),
                RPLBlocks.ROTTEN_SPRUCE_STAIRS.get(),
                RPLBlocks.ROTTEN_SPRUCE_FENCE.get(),
                RPLBlocks.ROTTEN_SPRUCE_FENCEGATE.get(),

                //Oak
                RPLBlocks.ROTTEN_OAK_LOG.get(),
                RPLBlocks.STRIPPED_ROTTEN_OAK_LOG.get(),
                RPLBlocks.ROTTEN_OAK_WOOD.get(),
                RPLBlocks.STRIPPED_ROTTEN_OAK_WOOD.get(),
                RPLBlocks.ROTTEN_OAK_PLANKS.get(),
                RPLBlocks.ROTTEN_OAK_BUTTON.get(),
                RPLBlocks.ROTTEN_OAK_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_OAK_SLAB.get(),
                RPLBlocks.ROTTEN_OAK_STAIRS.get(),
                RPLBlocks.ROTTEN_OAK_FENCE.get(),
                RPLBlocks.ROTTEN_OAK_FENCEGATE.get()
        );

        this.tag(Tags.Blocks.NEEDS_WOOD_TOOL).add(
                //Acacia
                RPLBlocks.ROTTEN_ACACIA_LOG.get(),
                RPLBlocks.STRIPPED_ROTTEN_ACACIA_LOG.get(),
                RPLBlocks.ROTTEN_ACACIA_WOOD.get(),
                RPLBlocks.STRIPPED_ROTTEN_ACACIA_WOOD.get(),
                RPLBlocks.ROTTEN_ACACIA_PLANKS.get(),
                RPLBlocks.ROTTEN_ACACIA_BUTTON.get(),
                RPLBlocks.ROTTEN_ACACIA_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_ACACIA_SLAB.get(),
                RPLBlocks.ROTTEN_ACACIA_STAIRS.get(),
                RPLBlocks.ROTTEN_ACACIA_FENCE.get(),
                RPLBlocks.ROTTEN_ACACIA_FENCEGATE.get(),

                //Bamboo
                RPLBlocks.ROTTEN_BAMBOO_PLANKS.get(),
                RPLBlocks.ROTTEN_BAMBOO_BUTTON.get(),
                RPLBlocks.ROTTEN_BAMBOO_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_BAMBOO_SLAB.get(),
                RPLBlocks.ROTTEN_BAMBOO_STAIRS.get(),
                RPLBlocks.ROTTEN_BAMBOO_FENCE.get(),
                RPLBlocks.ROTTEN_BAMBOO_FENCEGATE.get(),

                //Birch
                RPLBlocks.ROTTEN_BIRCH_LOG.get(),
                RPLBlocks.STRIPPED_ROTTEN_BIRCH_LOG.get(),
                RPLBlocks.ROTTEN_BIRCH_WOOD.get(),
                RPLBlocks.STRIPPED_ROTTEN_BIRCH_WOOD.get(),
                RPLBlocks.ROTTEN_BIRCH_PLANKS.get(),
                RPLBlocks.ROTTEN_BIRCH_BUTTON.get(),
                RPLBlocks.ROTTEN_BIRCH_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_BIRCH_SLAB.get(),
                RPLBlocks.ROTTEN_BIRCH_STAIRS.get(),
                RPLBlocks.ROTTEN_BIRCH_FENCE.get(),
                RPLBlocks.ROTTEN_BIRCH_FENCEGATE.get(),

                //Cherry
                RPLBlocks.ROTTEN_CHERRY_LOG.get(),
                RPLBlocks.STRIPPED_ROTTEN_CHERRY_LOG.get(),
                RPLBlocks.ROTTEN_CHERRY_WOOD.get(),
                RPLBlocks.STRIPPED_ROTTEN_CHERRY_WOOD.get(),
                RPLBlocks.ROTTEN_CHERRY_PLANKS.get(),
                RPLBlocks.ROTTEN_CHERRY_BUTTON.get(),
                RPLBlocks.ROTTEN_CHERRY_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_CHERRY_SLAB.get(),
                RPLBlocks.ROTTEN_CHERRY_STAIRS.get(),
                RPLBlocks.ROTTEN_CHERRY_FENCE.get(),
                RPLBlocks.ROTTEN_CHERRY_FENCEGATE.get(),

                //Dark oak
                RPLBlocks.ROTTEN_DARK_OAK_LOG.get(),
                RPLBlocks.STRIPPED_ROTTEN_DARK_OAK_LOG.get(),
                RPLBlocks.ROTTEN_DARK_OAK_WOOD.get(),
                RPLBlocks.STRIPPED_ROTTEN_DARK_OAK_WOOD.get(),
                RPLBlocks.ROTTEN_DARK_OAK_PLANKS.get(),
                RPLBlocks.ROTTEN_DARK_OAK_BUTTON.get(),
                RPLBlocks.ROTTEN_DARK_OAK_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_DARK_OAK_SLAB.get(),
                RPLBlocks.ROTTEN_DARK_OAK_STAIRS.get(),
                RPLBlocks.ROTTEN_DARK_OAK_FENCE.get(),
                RPLBlocks.ROTTEN_DARK_OAK_FENCEGATE.get(),

                //Jungle
                RPLBlocks.ROTTEN_JUNGLE_LOG.get(),
                RPLBlocks.STRIPPED_ROTTEN_JUNGLE_LOG.get(),
                RPLBlocks.ROTTEN_JUNGLE_WOOD.get(),
                RPLBlocks.STRIPPED_ROTTEN_JUNGLE_WOOD.get(),
                RPLBlocks.ROTTEN_JUNGLE_PLANKS.get(),
                RPLBlocks.ROTTEN_JUNGLE_BUTTON.get(),
                RPLBlocks.ROTTEN_JUNGLE_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_JUNGLE_SLAB.get(),
                RPLBlocks.ROTTEN_JUNGLE_STAIRS.get(),
                RPLBlocks.ROTTEN_JUNGLE_FENCE.get(),
                RPLBlocks.ROTTEN_JUNGLE_FENCEGATE.get(),

                //Mangle
                RPLBlocks.ROTTEN_MANGLE_LOG.get(),
                RPLBlocks.STRIPPED_ROTTEN_MANGLE_LOG.get(),
                RPLBlocks.ROTTEN_MANGLE_WOOD.get(),
                RPLBlocks.STRIPPED_ROTTEN_MANGLE_WOOD.get(),
                RPLBlocks.ROTTEN_MANGLE_PLANKS.get(),
                RPLBlocks.ROTTEN_MANGLE_BUTTON.get(),
                RPLBlocks.ROTTEN_MANGLE_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_MANGLE_SLAB.get(),
                RPLBlocks.ROTTEN_MANGLE_STAIRS.get(),
                RPLBlocks.ROTTEN_MANGLE_FENCE.get(),
                RPLBlocks.ROTTEN_MANGLE_FENCEGATE.get(),

                //Spruce
                RPLBlocks.ROTTEN_SPRUCE_LOG.get(),
                RPLBlocks.STRIPPED_ROTTEN_SPRUCE_LOG.get(),
                RPLBlocks.ROTTEN_SPRUCE_WOOD.get(),
                RPLBlocks.STRIPPED_ROTTEN_SPRUCE_WOOD.get(),
                RPLBlocks.ROTTEN_SPRUCE_PLANKS.get(),
                RPLBlocks.ROTTEN_SPRUCE_BUTTON.get(),
                RPLBlocks.ROTTEN_SPRUCE_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_SPRUCE_SLAB.get(),
                RPLBlocks.ROTTEN_SPRUCE_STAIRS.get(),
                RPLBlocks.ROTTEN_SPRUCE_FENCE.get(),
                RPLBlocks.ROTTEN_SPRUCE_FENCEGATE.get(),

                //Oak
                RPLBlocks.ROTTEN_OAK_LOG.get(),
                RPLBlocks.STRIPPED_ROTTEN_OAK_LOG.get(),
                RPLBlocks.ROTTEN_OAK_WOOD.get(),
                RPLBlocks.STRIPPED_ROTTEN_OAK_WOOD.get(),
                RPLBlocks.ROTTEN_OAK_PLANKS.get(),
                RPLBlocks.ROTTEN_OAK_BUTTON.get(),
                RPLBlocks.ROTTEN_OAK_PRESSURE_PLATE.get(),
                RPLBlocks.ROTTEN_OAK_SLAB.get(),
                RPLBlocks.ROTTEN_OAK_STAIRS.get(),
                RPLBlocks.ROTTEN_OAK_FENCE.get(),
                RPLBlocks.ROTTEN_OAK_FENCEGATE.get()
        );
    }
}
