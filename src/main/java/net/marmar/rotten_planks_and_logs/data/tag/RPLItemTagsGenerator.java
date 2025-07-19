package net.marmar.rotten_planks_and_logs.data.tag;

import net.marmar.rotten_planks_and_logs.RottenPlanksAndLogs;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class RPLItemTagsGenerator extends ItemTagsProvider {
    public RPLItemTagsGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> lookupProviderBlocks, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupProvider, lookupProviderBlocks, RottenPlanksAndLogs.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

    }
}
