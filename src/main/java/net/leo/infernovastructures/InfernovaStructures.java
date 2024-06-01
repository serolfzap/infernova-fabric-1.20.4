package net.leo.infernovastructures;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.leo.infernovastructures.FuelItems.FuelItemsandBlocks;
import net.leo.infernovastructures.block.InfernovaStructuresBlocks;
import net.leo.infernovastructures.item.INSItemGroups;
import net.leo.infernovastructures.item.InfernovaStructuresItems;
import net.leo.infernovastructures.util.INCustomTrades;
import net.leo.infernovastructures.entity.villager.INVillager;
import net.leo.infernovastructures.world.gen.INWorldGeneration;
import net.leo.infernovastructures.world.tree.INTrunkPlacerTypes;
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

		FlammableBlockRegistry.getDefaultInstance().add(InfernovaStructuresBlocks.CRYSTAL_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(InfernovaStructuresBlocks.STRIPPED_CRYSTAL_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(InfernovaStructuresBlocks.CRYSTAL_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(InfernovaStructuresBlocks.STRIPPED_CRYSTAL_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(InfernovaStructuresBlocks.CRYSTAL_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(InfernovaStructuresBlocks.CRYSTAL_LEAVES, 30, 60);

		INWorldGeneration.generateModWorldGen();
		INCustomTrades.registerCustomTrades();
		INVillager.registerVillagers();

		INTrunkPlacerTypes.register();



	}
}