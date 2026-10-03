package net.marmar.rotten_planks_and_logs.util;

import net.marmar.rotten_planks_and_logs.RottenPlanksAndLogs;
import net.marmar.rotten_planks_and_logs.block.RPLBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class RPLTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RottenPlanksAndLogs.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ROTTEN_WOOD = TABS.register("rotten_wood",
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
                        output.accept(RPLBlocks.ROTTEN_ACACIA_FENCEGATE.get());
                        output.accept(RPLBlocks.ROTTEN_ACACIA_PRESSURE_PLATE.get());
                        output.accept(RPLBlocks.ROTTEN_ACACIA_BUTTON.get());

                        //Bamboo
                        output.accept(RPLBlocks.ROTTEN_BAMBOO_PLANKS.get());
                        output.accept(RPLBlocks.ROTTEN_BAMBOO_STAIRS.get());
                        output.accept(RPLBlocks.ROTTEN_BAMBOO_SLAB.get());
                        output.accept(RPLBlocks.ROTTEN_BAMBOO_FENCE.get());
                        output.accept(RPLBlocks.ROTTEN_BAMBOO_FENCEGATE.get());
                        output.accept(RPLBlocks.ROTTEN_BAMBOO_PRESSURE_PLATE.get());
                        output.accept(RPLBlocks.ROTTEN_BAMBOO_BUTTON.get());

                        //Birch
                        output.accept(RPLBlocks.ROTTEN_BIRCH_LOG.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_BIRCH_LOG.get());
                        output.accept(RPLBlocks.ROTTEN_BIRCH_WOOD.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_BIRCH_WOOD.get());
                        output.accept(RPLBlocks.ROTTEN_BIRCH_PLANKS.get());
                        output.accept(RPLBlocks.ROTTEN_BIRCH_STAIRS.get());
                        output.accept(RPLBlocks.ROTTEN_BIRCH_SLAB.get());
                        output.accept(RPLBlocks.ROTTEN_BIRCH_FENCE.get());
                        output.accept(RPLBlocks.ROTTEN_BIRCH_FENCEGATE.get());
                        output.accept(RPLBlocks.ROTTEN_BIRCH_PRESSURE_PLATE.get());
                        output.accept(RPLBlocks.ROTTEN_BIRCH_BUTTON.get());

                        //Cherry
                        output.accept(RPLBlocks.ROTTEN_CHERRY_LOG.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_CHERRY_LOG.get());
                        output.accept(RPLBlocks.ROTTEN_CHERRY_WOOD.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_CHERRY_WOOD.get());
                        output.accept(RPLBlocks.ROTTEN_CHERRY_PLANKS.get());
                        output.accept(RPLBlocks.ROTTEN_CHERRY_STAIRS.get());
                        output.accept(RPLBlocks.ROTTEN_CHERRY_SLAB.get());
                        output.accept(RPLBlocks.ROTTEN_CHERRY_FENCE.get());
                        output.accept(RPLBlocks.ROTTEN_CHERRY_FENCEGATE.get());
                        output.accept(RPLBlocks.ROTTEN_CHERRY_PRESSURE_PLATE.get());
                        output.accept(RPLBlocks.ROTTEN_CHERRY_BUTTON.get());

                        //Dark oak
                        output.accept(RPLBlocks.ROTTEN_DARK_OAK_LOG.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_DARK_OAK_LOG.get());
                        output.accept(RPLBlocks.ROTTEN_DARK_OAK_WOOD.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_DARK_OAK_WOOD.get());
                        output.accept(RPLBlocks.ROTTEN_DARK_OAK_PLANKS.get());
                        output.accept(RPLBlocks.ROTTEN_DARK_OAK_STAIRS.get());
                        output.accept(RPLBlocks.ROTTEN_DARK_OAK_SLAB.get());
                        output.accept(RPLBlocks.ROTTEN_DARK_OAK_FENCE.get());
                        output.accept(RPLBlocks.ROTTEN_DARK_OAK_FENCEGATE.get());
                        output.accept(RPLBlocks.ROTTEN_DARK_OAK_PRESSURE_PLATE.get());
                        output.accept(RPLBlocks.ROTTEN_DARK_OAK_BUTTON.get());

                        //Jungle
                        output.accept(RPLBlocks.ROTTEN_JUNGLE_LOG.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_JUNGLE_LOG.get());
                        output.accept(RPLBlocks.ROTTEN_JUNGLE_WOOD.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_JUNGLE_WOOD.get());
                        output.accept(RPLBlocks.ROTTEN_JUNGLE_PLANKS.get());
                        output.accept(RPLBlocks.ROTTEN_JUNGLE_STAIRS.get());
                        output.accept(RPLBlocks.ROTTEN_JUNGLE_SLAB.get());
                        output.accept(RPLBlocks.ROTTEN_JUNGLE_FENCE.get());
                        output.accept(RPLBlocks.ROTTEN_JUNGLE_FENCEGATE.get());
                        output.accept(RPLBlocks.ROTTEN_JUNGLE_PRESSURE_PLATE.get());
                        output.accept(RPLBlocks.ROTTEN_JUNGLE_BUTTON.get());

                        //Mangle
                        output.accept(RPLBlocks.ROTTEN_MANGROVE_LOG.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_MANGROVE_LOG.get());
                        output.accept(RPLBlocks.ROTTEN_MANGROVE_WOOD.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_MANGROVE_WOOD.get());
                        output.accept(RPLBlocks.ROTTEN_MANGROVE_PLANKS.get());
                        output.accept(RPLBlocks.ROTTEN_MANGROVE_STAIRS.get());
                        output.accept(RPLBlocks.ROTTEN_MANGROVE_SLAB.get());
                        output.accept(RPLBlocks.ROTTEN_MANGROVE_FENCE.get());
                        output.accept(RPLBlocks.ROTTEN_MANGROVE_FENCEGATE.get());
                        output.accept(RPLBlocks.ROTTEN_MANGROVE_PRESSURE_PLATE.get());
                        output.accept(RPLBlocks.ROTTEN_MANGROVE_BUTTON.get());

                        //Spruce
                        output.accept(RPLBlocks.ROTTEN_SPRUCE_LOG.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_SPRUCE_LOG.get());
                        output.accept(RPLBlocks.ROTTEN_SPRUCE_WOOD.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_SPRUCE_WOOD.get());
                        output.accept(RPLBlocks.ROTTEN_SPRUCE_PLANKS.get());
                        output.accept(RPLBlocks.ROTTEN_SPRUCE_STAIRS.get());
                        output.accept(RPLBlocks.ROTTEN_SPRUCE_SLAB.get());
                        output.accept(RPLBlocks.ROTTEN_SPRUCE_FENCE.get());
                        output.accept(RPLBlocks.ROTTEN_SPRUCE_FENCEGATE.get());
                        output.accept(RPLBlocks.ROTTEN_SPRUCE_PRESSURE_PLATE.get());
                        output.accept(RPLBlocks.ROTTEN_SPRUCE_BUTTON.get());

                        //Oak
                        output.accept(RPLBlocks.ROTTEN_OAK_LOG.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_OAK_LOG.get());
                        output.accept(RPLBlocks.ROTTEN_OAK_WOOD.get());
                        output.accept(RPLBlocks.STRIPPED_ROTTEN_OAK_WOOD.get());
                        output.accept(RPLBlocks.ROTTEN_OAK_PLANKS.get());
                        output.accept(RPLBlocks.ROTTEN_OAK_STAIRS.get());
                        output.accept(RPLBlocks.ROTTEN_OAK_SLAB.get());
                        output.accept(RPLBlocks.ROTTEN_OAK_FENCE.get());
                        output.accept(RPLBlocks.ROTTEN_OAK_FENCEGATE.get());
                        output.accept(RPLBlocks.ROTTEN_OAK_PRESSURE_PLATE.get());
                        output.accept(RPLBlocks.ROTTEN_OAK_BUTTON.get());
                    }))
                    .build());

    public static void register(IEventBus eventBus){
        TABS.register(eventBus);
    }
}
