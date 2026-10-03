package net.marmar.rotten_planks_and_logs.util;

import net.marmar.rotten_planks_and_logs.RottenPlanksAndLogs;
import net.marmar.rotten_planks_and_logs.block.RPLBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public class RPLTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RottenPlanksAndLogs.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ROTTEN_WOOD = TABS.register("rotten_wood",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(RPLBlocks.ROTTEN_DARK_OAK_PLANKS.get()))
                    .title(Component.translatable("tab." + RottenPlanksAndLogs.MOD_ID + ".rotten_wood"))
                    .withSearchBar()
                    .displayItems(((itemDisplayParameters, output) -> {
                        //Acacia
                        output.accept(RPLBlocks.ROTTEN_ACACIA_LOG.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_ACACIA_LOG.get());
                        output.accept(RPLBlocks.ROTTEN_ACACIA_WOOD.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_ACACIA_WOOD.get());
                        output.accept(RPLBlocks.ROTTEN_ACACIA_PLANKS.get());
                        output.accept(RPLBlocks.ROTTEN_ACACIA_STAIRS.get());
                        output.accept(RPLBlocks.ROTTEN_ACACIA_SLAB.get());
                        output.accept(RPLBlocks.ROTTEN_ACACIA_FENCE.get());
                        output.accept(RPLBlocks.ROTTEN_ACACIA_FENCE_GATE.get());
                        output.accept(RPLBlocks.ROTTEN_ACACIA_PRESSURE_PLATE.get());
                        output.accept(RPLBlocks.ROTTEN_ACACIA_BUTTON.get());
                        output.accept(RPLBlocks.ROTTEN_ACACIA_DOOR.get());
                        output.accept(RPLBlocks.ROTTEN_ACACIA_TRAPDOOR.get());

                        //Bamboo
                        output.accept(RPLBlocks.ROTTEN_BAMBOO_PLANKS.get());
                        output.accept(RPLBlocks.ROTTEN_BAMBOO_STAIRS.get());
                        output.accept(RPLBlocks.ROTTEN_BAMBOO_SLAB.get());
                        output.accept(RPLBlocks.ROTTEN_BAMBOO_FENCE.get());
                        output.accept(RPLBlocks.ROTTEN_BAMBOO_FENCE_GATE.get());
                        output.accept(RPLBlocks.ROTTEN_BAMBOO_PRESSURE_PLATE.get());
                        output.accept(RPLBlocks.ROTTEN_BAMBOO_BUTTON.get());
                        output.accept(RPLBlocks.ROTTEN_BAMBOO_DOOR.get());
                        output.accept(RPLBlocks.ROTTEN_BAMBOO_TRAPDOOR.get());

                        //Birch
                        output.accept(RPLBlocks.ROTTEN_BIRCH_LOG.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_BIRCH_LOG.get());
                        output.accept(RPLBlocks.ROTTEN_BIRCH_WOOD.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_BIRCH_WOOD.get());
                        output.accept(RPLBlocks.ROTTEN_BIRCH_PLANKS.get());
                        output.accept(RPLBlocks.ROTTEN_BIRCH_STAIRS.get());
                        output.accept(RPLBlocks.ROTTEN_BIRCH_SLAB.get());
                        output.accept(RPLBlocks.ROTTEN_BIRCH_FENCE.get());
                        output.accept(RPLBlocks.ROTTEN_BIRCH_FENCE_GATE.get());
                        output.accept(RPLBlocks.ROTTEN_BIRCH_PRESSURE_PLATE.get());
                        output.accept(RPLBlocks.ROTTEN_BIRCH_BUTTON.get());
                        output.accept(RPLBlocks.ROTTEN_BIRCH_DOOR.get());
                        output.accept(RPLBlocks.ROTTEN_BIRCH_TRAPDOOR.get());

                        //Cherry
                        output.accept(RPLBlocks.ROTTEN_CHERRY_LOG.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_CHERRY_LOG.get());
                        output.accept(RPLBlocks.ROTTEN_CHERRY_WOOD.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_CHERRY_WOOD.get());
                        output.accept(RPLBlocks.ROTTEN_CHERRY_PLANKS.get());
                        output.accept(RPLBlocks.ROTTEN_CHERRY_STAIRS.get());
                        output.accept(RPLBlocks.ROTTEN_CHERRY_SLAB.get());
                        output.accept(RPLBlocks.ROTTEN_CHERRY_FENCE.get());
                        output.accept(RPLBlocks.ROTTEN_CHERRY_FENCE_GATE.get());
                        output.accept(RPLBlocks.ROTTEN_CHERRY_PRESSURE_PLATE.get());
                        output.accept(RPLBlocks.ROTTEN_CHERRY_BUTTON.get());
                        output.accept(RPLBlocks.ROTTEN_CHERRY_DOOR.get());
                        output.accept(RPLBlocks.ROTTEN_CHERRY_TRAPDOOR.get());

                        //Dark oak
                        output.accept(RPLBlocks.ROTTEN_DARK_OAK_LOG.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_DARK_OAK_LOG.get());
                        output.accept(RPLBlocks.ROTTEN_DARK_OAK_WOOD.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_DARK_OAK_WOOD.get());
                        output.accept(RPLBlocks.ROTTEN_DARK_OAK_PLANKS.get());
                        output.accept(RPLBlocks.ROTTEN_DARK_OAK_STAIRS.get());
                        output.accept(RPLBlocks.ROTTEN_DARK_OAK_SLAB.get());
                        output.accept(RPLBlocks.ROTTEN_DARK_OAK_FENCE.get());
                        output.accept(RPLBlocks.ROTTEN_DARK_OAK_FENCE_GATE.get());
                        output.accept(RPLBlocks.ROTTEN_DARK_OAK_PRESSURE_PLATE.get());
                        output.accept(RPLBlocks.ROTTEN_DARK_OAK_BUTTON.get());
                        output.accept(RPLBlocks.ROTTEN_DARK_OAK_DOOR.get());
                        output.accept(RPLBlocks.ROTTEN_DARK_OAK_TRAPDOOR.get());

                        //Jungle
                        output.accept(RPLBlocks.ROTTEN_JUNGLE_LOG.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_JUNGLE_LOG.get());
                        output.accept(RPLBlocks.ROTTEN_JUNGLE_WOOD.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_JUNGLE_WOOD.get());
                        output.accept(RPLBlocks.ROTTEN_JUNGLE_PLANKS.get());
                        output.accept(RPLBlocks.ROTTEN_JUNGLE_STAIRS.get());
                        output.accept(RPLBlocks.ROTTEN_JUNGLE_SLAB.get());
                        output.accept(RPLBlocks.ROTTEN_JUNGLE_FENCE.get());
                        output.accept(RPLBlocks.ROTTEN_JUNGLE_FENCE_GATE.get());
                        output.accept(RPLBlocks.ROTTEN_JUNGLE_PRESSURE_PLATE.get());
                        output.accept(RPLBlocks.ROTTEN_JUNGLE_BUTTON.get());
                        output.accept(RPLBlocks.ROTTEN_JUNGLE_DOOR.get());
                        output.accept(RPLBlocks.ROTTEN_JUNGLE_TRAPDOOR.get());

                        //Mangle
                        output.accept(RPLBlocks.ROTTEN_MANGROVE_LOG.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_MANGROVE_LOG.get());
                        output.accept(RPLBlocks.ROTTEN_MANGROVE_WOOD.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_MANGROVE_WOOD.get());
                        output.accept(RPLBlocks.ROTTEN_MANGROVE_PLANKS.get());
                        output.accept(RPLBlocks.ROTTEN_MANGROVE_STAIRS.get());
                        output.accept(RPLBlocks.ROTTEN_MANGROVE_SLAB.get());
                        output.accept(RPLBlocks.ROTTEN_MANGROVE_FENCE.get());
                        output.accept(RPLBlocks.ROTTEN_MANGROVE_FENCE_GATE.get());
                        output.accept(RPLBlocks.ROTTEN_MANGROVE_PRESSURE_PLATE.get());
                        output.accept(RPLBlocks.ROTTEN_MANGROVE_BUTTON.get());
                        output.accept(RPLBlocks.ROTTEN_MANGROVE_DOOR.get());
                        output.accept(RPLBlocks.ROTTEN_MANGROVE_TRAPDOOR.get());

                        //Spruce
                        output.accept(RPLBlocks.ROTTEN_SPRUCE_LOG.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_SPRUCE_LOG.get());
                        output.accept(RPLBlocks.ROTTEN_SPRUCE_WOOD.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_SPRUCE_WOOD.get());
                        output.accept(RPLBlocks.ROTTEN_SPRUCE_PLANKS.get());
                        output.accept(RPLBlocks.ROTTEN_SPRUCE_STAIRS.get());
                        output.accept(RPLBlocks.ROTTEN_SPRUCE_SLAB.get());
                        output.accept(RPLBlocks.ROTTEN_SPRUCE_FENCE.get());
                        output.accept(RPLBlocks.ROTTEN_SPRUCE_FENCE_GATE.get());
                        output.accept(RPLBlocks.ROTTEN_SPRUCE_PRESSURE_PLATE.get());
                        output.accept(RPLBlocks.ROTTEN_SPRUCE_BUTTON.get());
                        output.accept(RPLBlocks.ROTTEN_SPRUCE_DOOR.get());
                        output.accept(RPLBlocks.ROTTEN_SPRUCE_TRAPDOOR.get());

                        //Oak
                        output.accept(RPLBlocks.ROTTEN_OAK_LOG.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_OAK_LOG.get());
                        output.accept(RPLBlocks.ROTTEN_OAK_WOOD.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_OAK_WOOD.get());
                        output.accept(RPLBlocks.ROTTEN_OAK_PLANKS.get());
                        output.accept(RPLBlocks.ROTTEN_OAK_STAIRS.get());
                        output.accept(RPLBlocks.ROTTEN_OAK_SLAB.get());
                        output.accept(RPLBlocks.ROTTEN_OAK_FENCE.get());
                        output.accept(RPLBlocks.ROTTEN_OAK_FENCE_GATE.get());
                        output.accept(RPLBlocks.ROTTEN_OAK_PRESSURE_PLATE.get());
                        output.accept(RPLBlocks.ROTTEN_OAK_BUTTON.get());
                        output.accept(RPLBlocks.ROTTEN_OAK_DOOR.get());
                        output.accept(RPLBlocks.ROTTEN_OAK_TRAPDOOR.get());
                    }))
                    .build());

    public static void register(IEventBus eventBus){
        TABS.register(eventBus);
    }
}
