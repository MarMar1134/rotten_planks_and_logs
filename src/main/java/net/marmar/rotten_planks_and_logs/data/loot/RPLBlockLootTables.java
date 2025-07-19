package net.marmar.rotten_planks_and_logs.data.loot;

import net.marmar.rotten_planks_and_logs.block.RPLBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class RPLBlockLootTables extends BlockLootSubProvider {
    protected RPLBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        //Acacia
        this.dropSelf(RPLBlocks.ROTTEN_ACACIA_LOG.get());
        this.dropSelf(RPLBlocks.STRIPPED_ROTTEN_ACACIA_LOG.get());
        this.dropSelf(RPLBlocks.ROTTEN_ACACIA_WOOD.get());
        this.dropSelf(RPLBlocks.STRIPPED_ROTTEN_ACACIA_WOOD.get());
        this.dropSelf(RPLBlocks.ROTTEN_ACACIA_PLANKS.get());
        this.dropSelf(RPLBlocks.ROTTEN_ACACIA_BUTTON.get());
        this.dropSelf(RPLBlocks.ROTTEN_ACACIA_PRESSURE_PLATE.get());
        this.add(RPLBlocks.ROTTEN_ACACIA_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(RPLBlocks.ROTTEN_ACACIA_STAIRS.get());
        this.dropSelf(RPLBlocks.ROTTEN_ACACIA_FENCE.get());
        this.dropSelf(RPLBlocks.ROTTEN_ACACIA_FENCEGATE.get());

        //Bamboo
        this.dropSelf(RPLBlocks.ROTTEN_BAMBOO_PLANKS.get());
        this.dropSelf(RPLBlocks.ROTTEN_BAMBOO_BUTTON.get());
        this.dropSelf(RPLBlocks.ROTTEN_BAMBOO_PRESSURE_PLATE.get());
        this.add(RPLBlocks.ROTTEN_BAMBOO_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(RPLBlocks.ROTTEN_BAMBOO_STAIRS.get());
        this.dropSelf(RPLBlocks.ROTTEN_BAMBOO_FENCE.get());
        this.dropSelf(RPLBlocks.ROTTEN_BAMBOO_FENCEGATE.get());

        //Birch
        this.dropSelf(RPLBlocks.ROTTEN_BIRCH_LOG.get());
        this.dropSelf(RPLBlocks.STRIPPED_ROTTEN_BIRCH_LOG.get());
        this.dropSelf(RPLBlocks.ROTTEN_BIRCH_WOOD.get());
        this.dropSelf(RPLBlocks.STRIPPED_ROTTEN_BIRCH_WOOD.get());
        this.dropSelf(RPLBlocks.ROTTEN_BIRCH_PLANKS.get());
        this.dropSelf(RPLBlocks.ROTTEN_BIRCH_BUTTON.get());
        this.dropSelf(RPLBlocks.ROTTEN_BIRCH_PRESSURE_PLATE.get());
        this.add(RPLBlocks.ROTTEN_BIRCH_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(RPLBlocks.ROTTEN_BIRCH_STAIRS.get());
        this.dropSelf(RPLBlocks.ROTTEN_BIRCH_FENCE.get());
        this.dropSelf(RPLBlocks.ROTTEN_BIRCH_FENCEGATE.get());

        //Cherry
        this.dropSelf(RPLBlocks.ROTTEN_CHERRY_LOG.get());
        this.dropSelf(RPLBlocks.STRIPPED_ROTTEN_CHERRY_LOG.get());
        this.dropSelf(RPLBlocks.ROTTEN_CHERRY_WOOD.get());
        this.dropSelf(RPLBlocks.STRIPPED_ROTTEN_CHERRY_WOOD.get());
        this.dropSelf(RPLBlocks.ROTTEN_CHERRY_PLANKS.get());
        this.dropSelf(RPLBlocks.ROTTEN_CHERRY_BUTTON.get());
        this.dropSelf(RPLBlocks.ROTTEN_CHERRY_PRESSURE_PLATE.get());
        this.add(RPLBlocks.ROTTEN_CHERRY_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(RPLBlocks.ROTTEN_CHERRY_STAIRS.get());
        this.dropSelf(RPLBlocks.ROTTEN_CHERRY_FENCE.get());
        this.dropSelf(RPLBlocks.ROTTEN_CHERRY_FENCEGATE.get());

        //Dark oak
        this.dropSelf(RPLBlocks.ROTTEN_DARK_OAK_LOG.get());
        this.dropSelf(RPLBlocks.STRIPPED_ROTTEN_DARK_OAK_LOG.get());
        this.dropSelf(RPLBlocks.ROTTEN_DARK_OAK_WOOD.get());
        this.dropSelf(RPLBlocks.STRIPPED_ROTTEN_DARK_OAK_WOOD.get());
        this.dropSelf(RPLBlocks.ROTTEN_DARK_OAK_PLANKS.get());
        this.dropSelf(RPLBlocks.ROTTEN_DARK_OAK_BUTTON.get());
        this.dropSelf(RPLBlocks.ROTTEN_DARK_OAK_PRESSURE_PLATE.get());
        this.add(RPLBlocks.ROTTEN_DARK_OAK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(RPLBlocks.ROTTEN_DARK_OAK_STAIRS.get());
        this.dropSelf(RPLBlocks.ROTTEN_DARK_OAK_FENCE.get());
        this.dropSelf(RPLBlocks.ROTTEN_DARK_OAK_FENCEGATE.get());

        //Jungle
        this.dropSelf(RPLBlocks.ROTTEN_JUNGLE_LOG.get());
        this.dropSelf(RPLBlocks.STRIPPED_ROTTEN_JUNGLE_LOG.get());
        this.dropSelf(RPLBlocks.ROTTEN_JUNGLE_WOOD.get());
        this.dropSelf(RPLBlocks.STRIPPED_ROTTEN_JUNGLE_WOOD.get());
        this.dropSelf(RPLBlocks.ROTTEN_JUNGLE_PLANKS.get());
        this.dropSelf(RPLBlocks.ROTTEN_JUNGLE_BUTTON.get());
        this.dropSelf(RPLBlocks.ROTTEN_JUNGLE_PRESSURE_PLATE.get());
        this.add(RPLBlocks.ROTTEN_JUNGLE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(RPLBlocks.ROTTEN_JUNGLE_STAIRS.get());
        this.dropSelf(RPLBlocks.ROTTEN_JUNGLE_FENCE.get());
        this.dropSelf(RPLBlocks.ROTTEN_JUNGLE_FENCEGATE.get());

        //Mangle
        this.dropSelf(RPLBlocks.ROTTEN_MANGLE_LOG.get());
        this.dropSelf(RPLBlocks.STRIPPED_ROTTEN_MANGLE_LOG.get());
        this.dropSelf(RPLBlocks.ROTTEN_MANGLE_WOOD.get());
        this.dropSelf(RPLBlocks.STRIPPED_ROTTEN_MANGLE_WOOD.get());
        this.dropSelf(RPLBlocks.ROTTEN_MANGLE_PLANKS.get());
        this.dropSelf(RPLBlocks.ROTTEN_MANGLE_BUTTON.get());
        this.dropSelf(RPLBlocks.ROTTEN_MANGLE_PRESSURE_PLATE.get());
        this.add(RPLBlocks.ROTTEN_MANGLE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(RPLBlocks.ROTTEN_MANGLE_STAIRS.get());
        this.dropSelf(RPLBlocks.ROTTEN_MANGLE_FENCE.get());
        this.dropSelf(RPLBlocks.ROTTEN_MANGLE_FENCEGATE.get());

        //Spruce
        this.dropSelf(RPLBlocks.ROTTEN_SPRUCE_LOG.get());
        this.dropSelf(RPLBlocks.STRIPPED_ROTTEN_SPRUCE_LOG.get());
        this.dropSelf(RPLBlocks.ROTTEN_SPRUCE_WOOD.get());
        this.dropSelf(RPLBlocks.STRIPPED_ROTTEN_SPRUCE_WOOD.get());
        this.dropSelf(RPLBlocks.ROTTEN_SPRUCE_PLANKS.get());
        this.dropSelf(RPLBlocks.ROTTEN_SPRUCE_BUTTON.get());
        this.dropSelf(RPLBlocks.ROTTEN_SPRUCE_PRESSURE_PLATE.get());
        this.add(RPLBlocks.ROTTEN_SPRUCE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(RPLBlocks.ROTTEN_SPRUCE_STAIRS.get());
        this.dropSelf(RPLBlocks.ROTTEN_SPRUCE_FENCE.get());
        this.dropSelf(RPLBlocks.ROTTEN_SPRUCE_FENCEGATE.get());

        //Oak
        this.dropSelf(RPLBlocks.ROTTEN_OAK_LOG.get());
        this.dropSelf(RPLBlocks.STRIPPED_ROTTEN_OAK_LOG.get());
        this.dropSelf(RPLBlocks.ROTTEN_OAK_WOOD.get());
        this.dropSelf(RPLBlocks.STRIPPED_ROTTEN_OAK_WOOD.get());
        this.dropSelf(RPLBlocks.ROTTEN_OAK_PLANKS.get());
        this.dropSelf(RPLBlocks.ROTTEN_OAK_BUTTON.get());
        this.dropSelf(RPLBlocks.ROTTEN_OAK_PRESSURE_PLATE.get());
        this.add(RPLBlocks.ROTTEN_OAK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(RPLBlocks.ROTTEN_OAK_STAIRS.get());
        this.dropSelf(RPLBlocks.ROTTEN_OAK_FENCE.get());
        this.dropSelf(RPLBlocks.ROTTEN_OAK_FENCEGATE.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return RPLBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
