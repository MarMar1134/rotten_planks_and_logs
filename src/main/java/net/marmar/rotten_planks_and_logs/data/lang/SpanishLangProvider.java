package net.marmar.rotten_planks_and_logs.data.lang;

import net.marmar.rotten_planks_and_logs.RottenPlanksAndLogs;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class SpanishLangProvider extends LanguageProvider {
    public SpanishLangProvider(PackOutput output, String locale) {
        super(output, RottenPlanksAndLogs.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        this.add("tab." + RottenPlanksAndLogs.MOD_ID + ".rotten_wood", "Madera podrida");

        addWoodTranslations("acacia", "acacia");
        addWoodTranslations("bamboo", "bambú");
        addWoodTranslations("birch", "abedul");
        addWoodTranslations("cherry", "cerezo");
        addWoodTranslations("dark_oak", "roble oscuro");
        addWoodTranslations("jungle", "jungla");
        addWoodTranslations("mangle", "mangle");
        addWoodTranslations("spruce", "abeto");
        addWoodTranslations("oak", "roble");
    }

    private void addWoodTranslations(String pWoodType, String pTranslation){
        this.add("block.rotten_planks_and_logs.rotten_" + pWoodType + "_log", "Tronco de " + pTranslation + " podrido");
        this.add("block.rotten_planks_and_logs.stripped_rotten_" + pWoodType + "_log", "Tronco pelado de " + pTranslation + " podrido");
        this.add("block.rotten_planks_and_logs.rotten_" + pWoodType + "_wood", "Leño de " + pTranslation + " podrido");
        this.add("block.rotten_planks_and_logs.stripped_rotten_" + pWoodType + "_wood", "Leño pelado de " + pTranslation + " podrido");
        this.add("block.rotten_planks_and_logs.rotten_" + pWoodType + "_planks", "Tablones de " + pTranslation + " podridos");
        this.add("block.rotten_planks_and_logs.rotten_" + pWoodType + "_button", "Botón de " + pTranslation + " podrido");
        this.add("block.rotten_planks_and_logs.rotten_" + pWoodType + "_pressure_plate", "Placa de presión de " + pTranslation + " podrida");
        this.add("block.rotten_planks_and_logs.rotten_" + pWoodType + "_slab", "Baldosa de " + pTranslation + " podrida");
        this.add("block.rotten_planks_and_logs.rotten_" + pWoodType + "_stairs", "Escaleras de " + pTranslation + " podridas");
        this.add("block.rotten_planks_and_logs.rotten_" + pWoodType + "_fence", "Valla de " + pTranslation + " podrida");
        this.add("block.rotten_planks_and_logs.rotten_" + pWoodType + "_fencegate", "Puerta de valla de " + pTranslation + " podrida");
    }
}
