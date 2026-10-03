package net.marmar.rotten_planks_and_logs;

import net.marmar.rotten_planks_and_logs.block.RPLBlocks;
import net.marmar.rotten_planks_and_logs.util.RPLTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(RottenPlanksAndLogs.MOD_ID)
public class RottenPlanksAndLogs {
    public static final String MOD_ID = "rotten_planks_and_logs";

    public RottenPlanksAndLogs(IEventBus modEventBus) {
        RPLBlocks.register(modEventBus);
        RPLTabs.register(modEventBus);
    }
}
