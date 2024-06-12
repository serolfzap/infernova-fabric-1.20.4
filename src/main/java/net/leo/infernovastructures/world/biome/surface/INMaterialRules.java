package net.leo.infernovastructures.world.biome.surface;

import net.leo.infernovastructures.block.InfernovaStructuresBlocks;
import net.leo.infernovastructures.world.biome.INBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class INMaterialRules {
    private static final MaterialRules.MaterialRule DIRT = makeStateRule(Blocks.DIRT);
    private static final MaterialRules.MaterialRule GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final MaterialRules.MaterialRule QUICKSAND = makeStateRule(InfernovaStructuresBlocks.SANDSTONE_PILLAR);
    private static final MaterialRules.MaterialRule P_SANDSTONE = makeStateRule(InfernovaStructuresBlocks.P_SANDSTONE);

    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);

        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        return MaterialRules.sequence(
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(INBiomes.CRYSAL_BIOME),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, GRASS_BLOCK)),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, DIRT)),

                // Default to a grass and dirt surface
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface)
        );
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}
