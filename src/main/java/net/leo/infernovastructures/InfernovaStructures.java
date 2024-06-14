package net.leo.infernovastructures;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.leo.infernovastructures.FuelItems.FuelItemsandBlocks;
import net.leo.infernovastructures.block.InfernovaStructuresBlocks;
import net.leo.infernovastructures.item.INSItemGroups;
import net.leo.infernovastructures.item.InfernovaStructuresItems;
import net.leo.infernovastructures.util.INCustomTrades;
import net.leo.infernovastructures.entity.villager.INVillager;
import net.leo.infernovastructures.world.INPlacedFeatures;
import net.leo.infernovastructures.world.gen.INWorldGeneration;
import net.leo.infernovastructures.world.tree.INTrunkPlacerTypes;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InfernovaStructures implements ModInitializer {

	public static final String MOD_ID = "infernovastructures";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		InfernovaStructuresItems.registerInfernovaStructuresItems();
        INSItemGroups.registerItemGroups();
		InfernovaStructuresBlocks.registerInfernovaStructuresBlocks();
		FuelItemsandBlocks.registerFuelItemsandBlocks();

		StrippableBlockRegistry.register(InfernovaStructuresBlocks.CRYSTAL_LOG, InfernovaStructuresBlocks.STRIPPED_CRYSTAL_LOG);
		StrippableBlockRegistry.register(InfernovaStructuresBlocks.CRYSTAL_WOOD, InfernovaStructuresBlocks.STRIPPED_CRYSTAL_WOOD);

		FuelItemsandBlocks.registerFuelItemsandBlocks();
		INWorldGeneration.generateModWorldGen();
		INCustomTrades.registerCustomTrades();
		INVillager.registerVillagers();

		INTrunkPlacerTypes.register();

		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS), GenerationStep.Feature.VEGETAL_DECORATION, INPlacedFeatures.SUGILITE_ORE_PLACED_KEY);

		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT), GenerationStep.Feature.TOP_LAYER_MODIFICATION, INPlacedFeatures.QUICKSAND_PLACED_KEY);




	}
}