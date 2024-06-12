package net.leo.infernovastructures.entity.render;

import com.google.common.collect.Sets;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.leo.infernovastructures.InfernovaStructures;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

import java.util.Set;
import java.util.stream.Stream;


@Environment(EnvType.CLIENT)
public class INEntityLayers {


    public static final EntityModelLayer MODIFIED_VILLAGER = new EntityModelLayer(new Identifier(InfernovaStructures.MOD_ID, "infernova"), "main");

    private static final String MAIN = "main";

    private static final Set<EntityModelLayer> LAYERS = Sets.newHashSet();




    public INEntityLayers() {
    }

    private static EntityModelLayer registerMain(String id) {
        return register(id, "main");
    }

    private static EntityModelLayer register(String id, String layer) {
        EntityModelLayer entityModelLayer = create(id, layer);
        if (!LAYERS.add(entityModelLayer)) {
            throw new IllegalStateException("Duplicate registration for " + entityModelLayer);
        } else {
            return entityModelLayer;
        }
    }

    private static EntityModelLayer create(String id, String layer) {
        return new EntityModelLayer(new Identifier("minecraft", id), layer);
    }


    public static Stream<EntityModelLayer> getLayers() {
        return LAYERS.stream();
    }





}

