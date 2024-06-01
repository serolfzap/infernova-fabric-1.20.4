package net.leo.infernovastructures.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.leo.infernovastructures.world.INPlacedFeatures;
import net.minecraft.world.gen.GenerationStep;

public class INOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, INPlacedFeatures.SUGILITE_ORE_PLACED_KEY);
    }
}
