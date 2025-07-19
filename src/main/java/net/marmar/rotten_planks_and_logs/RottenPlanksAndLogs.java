package net.marmar.rotten_planks_and_logs;

import net.marmar.rotten_planks_and_logs.block.RPLBlocks;
import net.marmar.rotten_planks_and_logs.util.RPLTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RottenPlanksAndLogs.MOD_ID)
public class RottenPlanksAndLogs {
    public static final String MOD_ID = "rotten_planks_and_logs";

    public RottenPlanksAndLogs() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        RPLBlocks.register(modEventBus);
        RPLTabs.register(modEventBus);
    }
}
