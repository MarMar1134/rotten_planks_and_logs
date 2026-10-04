package net.marmar.rotten_planks_and_logs.data;

import net.marmar.rotten_planks_and_logs.RottenPlanksAndLogs;
import net.marmar.rotten_planks_and_logs.data.lang.EnglishLangProvider;
import net.marmar.rotten_planks_and_logs.data.lang.SpanishLangProvider;
import net.marmar.rotten_planks_and_logs.data.loot.RPLLootTableProvider;
import net.marmar.rotten_planks_and_logs.data.model.*;
import net.marmar.rotten_planks_and_logs.data.tag.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("removal")
@EventBusSubscriber(modid = RottenPlanksAndLogs.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        //Recipes
        generator.addProvider(event.includeServer(), new RPLRecipeProvider.Runner(packOutput, lookupProvider));

        //Loot tables
        generator.addProvider(event.includeServer(), RPLLootTableProvider.create(packOutput, lookupProvider));

        //Models
        generator.addProvider(event.includeClient(), new RPLBlockstateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new RPLItemModelProvider(packOutput, existingFileHelper));

        //Tags
        RPLBlockTagsGenerator blockTagGenerator = generator.addProvider(event.includeServer(),
                new RPLBlockTagsGenerator(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new RPLItemTagsGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter(),
                existingFileHelper));

        //Lang
        generator.addProvider(event.includeClient(), new EnglishLangProvider(packOutput));
        generator.addProvider(event.includeClient(), new SpanishLangProvider(packOutput, "es_ar"));
        generator.addProvider(event.includeClient(), new SpanishLangProvider(packOutput, "es_cl"));
        generator.addProvider(event.includeClient(), new SpanishLangProvider(packOutput, "es_ec"));
        generator.addProvider(event.includeClient(), new SpanishLangProvider(packOutput, "es_mx"));
        generator.addProvider(event.includeClient(), new SpanishLangProvider(packOutput, "es_es"));
        generator.addProvider(event.includeClient(), new SpanishLangProvider(packOutput, "es_uy"));
        generator.addProvider(event.includeClient(), new SpanishLangProvider(packOutput, "es_ve"));
    }
}
