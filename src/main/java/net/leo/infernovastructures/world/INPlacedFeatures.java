package net.leo.infernovastructures.world;

import net.leo.infernovastructures.InfernovaStructures;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.MiscConfiguredFeatures;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;


public class INPlacedFeatures {
    public static final RegistryKey<PlacedFeature> SUGILITE_ORE_PLACED_KEY = registerKey("sugilite_ore_placed");

    public static final RegistryKey<PlacedFeature> INFLOWERS_PLACED_KEY = registerKey("inflowers_placed");

    public static final RegistryKey<PlacedFeature> QUICKSAND_PLACED_KEY = registerKey("quicksand_placed");







    public static void boostrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, SUGILITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(INConfiguredFeatures.SUGILITE_ORE_KEY),
                INOrePlacement.modifiersWithCount(3, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-50), YOffset.fixed(30))));



        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);


        RegistryEntry<ConfiguredFeature<?, ?>> registryEntry01in = registryEntryLookup.getOrThrow(INConfiguredFeatures.INFLOWERS_KEY);


        PlacementModifier inplacementModifier = SurfaceWaterDepthFilterPlacementModifier.of(0);


        List<PlacementModifier> infFlowersPlacementModifiers = List.of(
                NoiseThresholdCountPlacementModifier.of(-0.8, 15, 4), // Example placement modifier
                RarityFilterPlacementModifier.of(32), // Example rarity filter
                SquarePlacementModifier.of(), // Example placement modifier
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, // Example heightmap
                BiomePlacementModifier.of() // Example biome placement modifier
        );


        INPlacedFeatures.register(context, INFLOWERS_PLACED_KEY, registryEntry01in, infFlowersPlacementModifiers);


        RegistryEntry<ConfiguredFeature<?, ?>> registryEntry12in = registryEntryLookup.getOrThrow(INConfiguredFeatures.QUICKSAND_KEY);

        PlacedFeatures.register(context, QUICKSAND_PLACED_KEY, registryEntry12in, new PlacementModifier[]{BiomePlacementModifier.of()});


















    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(InfernovaStructures.MOD_ID, name));
    }

    public static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

}
