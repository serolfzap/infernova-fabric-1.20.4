package net.leo.infernovastructures.world;


import net.leo.infernovastructures.InfernovaStructures;
import net.leo.infernovastructures.block.InfernovaStructuresBlocks;
import net.minecraft.registry.Registerable;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.noise.DoublePerlinNoiseSampler;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.NoiseThresholdBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class INConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> SUGILITE_ORE_KEY = registerKey("sugilite_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> CRYSTAL_KEY = registerKey("crystal");

    public static final RegistryKey<ConfiguredFeature<?, ?>> INFLOWERS_KEY = ConfiguredFeatures.of("inflowers");



    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);


        List<OreFeatureConfig.Target> overworldSugiliteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, InfernovaStructuresBlocks.SUGILITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, InfernovaStructuresBlocks.DEEPSLATE_SUGILITE_ORE.getDefaultState()));



        register(context, SUGILITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSugiliteOres, 5));

        register(context, CRYSTAL_KEY, Feature.TREE,new TreeFeatureConfig.Builder(
                BlockStateProvider.of(InfernovaStructuresBlocks.CRYSTAL_LOG),
                new StraightTrunkPlacer(6,5,4),

                BlockStateProvider.of(InfernovaStructuresBlocks.CRYSTAL_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2),
                ConstantIntProvider.create(2), 4),

                new TwoLayersFeatureSize(1,0,2)).build());




        register(context, INFLOWERS_KEY,
                Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2, PlacedFeatures.createEntry
                        (Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig
                                (new NoiseThresholdBlockStateProvider(2345L, new DoublePerlinNoiseSampler
                                        .NoiseParameters(0, 1.0, new double[0]),
                                        0.005F, -0.8F, 0.33333334F,
                                        InfernovaStructuresBlocks.BEGONIA.getDefaultState(),
                                        List.of(InfernovaStructuresBlocks.SPARKLEFLORA
                                        .getDefaultState(), InfernovaStructuresBlocks.REED.getDefaultState(),
                                                InfernovaStructuresBlocks.CRYSTAL_FLOWER.
                                        getDefaultState(), InfernovaStructuresBlocks.WICKER.getDefaultState()),
                                        List.of(InfernovaStructuresBlocks.TAMARISK.getDefaultState()))))));

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(InfernovaStructures.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register
            (Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?,
                    ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
