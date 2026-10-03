package net.marmar.rotten_planks_and_logs.data.lang;

import net.marmar.rotten_planks_and_logs.RottenPlanksAndLogs;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class EnglishLangProvider extends LanguageProvider {
    public EnglishLangProvider(PackOutput output) {
        super(output, RottenPlanksAndLogs.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.add("tab." + RottenPlanksAndLogs.MOD_ID + ".rotten_wood", "Rotten wood");

        addWoodTranslations("acacia", "acacia");
        addWoodTranslations("bamboo", "bamboo");
        addWoodTranslations("birch", "birch");
        addWoodTranslations("cherry", "cherry");
        addWoodTranslations("dark_oak", "dark oak");
        addWoodTranslations("jungle", "jungle");
        addWoodTranslations("mangrove", "mangrove");
        addWoodTranslations("spruce", "spruce");
        addWoodTranslations("oak", "oak");
    }

    private void addWoodTranslations(String pWoodType, String pTranslation){
        this.add("block." + RottenPlanksAndLogs.MOD_ID + ".rotten_" + pWoodType + "_log", "Rotten " + pTranslation + " log");
        this.add("block." + RottenPlanksAndLogs.MOD_ID + ".stripped_rotten_" + pWoodType + "_log", "Stripped rotten " + pTranslation + " log");
        this.add("block." + RottenPlanksAndLogs.MOD_ID + ".rotten_" + pWoodType + "_wood", "Rotten " + pTranslation + " wood");
        this.add("block." + RottenPlanksAndLogs.MOD_ID + ".stripped_rotten_" + pWoodType + "_wood", "Stripped rotten " + pTranslation + " wood");
        this.add("block." + RottenPlanksAndLogs.MOD_ID + ".rotten_" + pWoodType + "_planks", "Rotten " + pTranslation + " planks");
        this.add("block." + RottenPlanksAndLogs.MOD_ID + ".rotten_" + pWoodType + "_button", "Rotten " + pTranslation + " button");
        this.add("block." + RottenPlanksAndLogs.MOD_ID + ".rotten_" + pWoodType + "_pressure_plate", "Rotten " + pTranslation + " pressure plate");
        this.add("block." + RottenPlanksAndLogs.MOD_ID + ".rotten_" + pWoodType + "_slab", "Rotten " + pTranslation + " slab");
        this.add("block." + RottenPlanksAndLogs.MOD_ID + ".rotten_" + pWoodType + "_stairs", "Rotten " + pTranslation + " stairs");
        this.add("block." + RottenPlanksAndLogs.MOD_ID + ".rotten_" + pWoodType + "_fence", "Rotten " + pTranslation + " fence");
        this.add("block." + RottenPlanksAndLogs.MOD_ID + ".rotten_" + pWoodType + "_fencegate", "Rotten " + pTranslation + " fence gate");
        this.add("block." + RottenPlanksAndLogs.MOD_ID + ".rotten_" + pWoodType + "_door", "Rotten " + pTranslation + " door");
        this.add("block." + RottenPlanksAndLogs.MOD_ID + ".rotten_" + pWoodType + "_trapdoor", "Rotten " + pTranslation + " trapdoor");
    }
}
