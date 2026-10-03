package net.marmar.rotten_planks_and_logs.block.custom;

import net.marmar.rotten_planks_and_logs.block.RPLBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbility;
import org.jetbrains.annotations.Nullable;

public class RottenLogsBlock extends RotatedPillarBlock {
    public RottenLogsBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 3;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 3;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ItemAbility itemAbility, boolean simulate) {
        if (state.is(RPLBlocks.ROTTEN_ACACIA_LOG.get())) {
            return RPLBlocks.STRIPPED_ROTTEN_ACACIA_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
        }
        if (state.is(RPLBlocks.ROTTEN_OAK_LOG.get())) {
            return RPLBlocks.STRIPPED_ROTTEN_OAK_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
        }
        if (state.is(RPLBlocks.ROTTEN_BIRCH_LOG.get())) {
            return RPLBlocks.STRIPPED_ROTTEN_BIRCH_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
        }
        if (state.is(RPLBlocks.ROTTEN_SPRUCE_LOG.get())) {
            return RPLBlocks.STRIPPED_ROTTEN_SPRUCE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
        }
        if (state.is(RPLBlocks.ROTTEN_DARK_OAK_LOG.get())) {
            return RPLBlocks.STRIPPED_ROTTEN_DARK_OAK_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
        }
        if (state.is(RPLBlocks.ROTTEN_CHERRY_LOG.get())) {
            return RPLBlocks.STRIPPED_ROTTEN_CHERRY_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
        }
        if (state.is(RPLBlocks.ROTTEN_JUNGLE_LOG.get())) {
            return RPLBlocks.STRIPPED_ROTTEN_JUNGLE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
        }

        //Woods
        if (state.is(RPLBlocks.ROTTEN_ACACIA_WOOD.get())) {
            return RPLBlocks.STRIPPED_ROTTEN_ACACIA_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
        }
        if (state.is(RPLBlocks.ROTTEN_OAK_WOOD.get())) {
            return RPLBlocks.STRIPPED_ROTTEN_OAK_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
        }
        if (state.is(RPLBlocks.ROTTEN_BIRCH_WOOD.get())) {
            return RPLBlocks.STRIPPED_ROTTEN_BIRCH_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
        }
        if (state.is(RPLBlocks.ROTTEN_SPRUCE_WOOD.get())) {
            return RPLBlocks.STRIPPED_ROTTEN_SPRUCE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
        }
        if (state.is(RPLBlocks.ROTTEN_DARK_OAK_WOOD.get())) {
            return RPLBlocks.STRIPPED_ROTTEN_DARK_OAK_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
        }
        if (state.is(RPLBlocks.ROTTEN_CHERRY_WOOD.get())) {
            return RPLBlocks.STRIPPED_ROTTEN_CHERRY_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
        }
        if (state.is(RPLBlocks.ROTTEN_JUNGLE_WOOD.get())) {
            return RPLBlocks.STRIPPED_ROTTEN_JUNGLE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
        }

        return super.getToolModifiedState(state, context, itemAbility, simulate);
    }
}
