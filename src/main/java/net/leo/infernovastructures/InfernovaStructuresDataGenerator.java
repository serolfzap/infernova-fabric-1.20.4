package net.leo.infernovastructures;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.leo.infernovastructures.datagen.*;
import net.leo.infernovastructures.world.INConfiguredFeatures;
import net.leo.infernovastructures.world.INPlacedFeatures;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;


public class InfernovaStructuresDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(INBlockTagProvider::new);
		pack.addProvider(INItemTagProvider::new);
		pack.addProvider(INLootTableProvider::new);
		pack.addProvider(INModelProvider::new);
		pack.addProvider(INRecipeProvider::new);
		pack.addProvider(INWorldGenerator::new);
		pack.addProvider(INPoiTagProvider::new);


	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, INConfiguredFeatures::boostrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, INPlacedFeatures::boostrap);

	}
}

