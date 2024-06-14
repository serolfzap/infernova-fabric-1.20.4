package net.leo.infernovastructures.registry;

import net.leo.infernovastructures.InfernovaStructures;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class INTags {
    public static final TagKey<Biome> HAS_QUICKSAND_LAKES =
            TagKey.of(RegistryKeys.BIOME, new Identifier
                    ("infernovastructures", "has_quicksand_lakes"));

}
