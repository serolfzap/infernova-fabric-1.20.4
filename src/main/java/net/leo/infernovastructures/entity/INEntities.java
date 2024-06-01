package net.leo.infernovastructures.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.leo.infernovastructures.InfernovaStructures;
import net.leo.infernovastructures.entity.item.CoconutProjectile;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class INEntities {
    public static final EntityType<CoconutProjectile> COCONUT_PROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(InfernovaStructures.MOD_ID, "coconut_projectile"),
            FabricEntityTypeBuilder.<CoconutProjectile>create(SpawnGroup.MISC, CoconutProjectile::new)
                    .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());

    public static void registerModEntities() {
        InfernovaStructures.LOGGER.info("Registering Entities for " + InfernovaStructures.MOD_ID);
    }
}

