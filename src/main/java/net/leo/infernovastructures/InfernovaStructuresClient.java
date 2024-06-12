package net.leo.infernovastructures;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.leo.infernovastructures.block.InfernovaStructuresBlocks;
import net.leo.infernovastructures.entity.INEntities;
import net.leo.infernovastructures.entity.render.INEntityLayers;
import net.leo.infernovastructures.entity.render.INVillagerResemblingModel;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

public class InfernovaStructuresClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(InfernovaStructuresBlocks.CRYSTAL_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfernovaStructuresBlocks.CRYSTAL_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfernovaStructuresBlocks.TAMARISK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfernovaStructuresBlocks.REED, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfernovaStructuresBlocks.WICKER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfernovaStructuresBlocks.SPARKLEFLORA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfernovaStructuresBlocks.BEGONIA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfernovaStructuresBlocks.LEAVES_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfernovaStructuresBlocks.CRYSTAL_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfernovaStructuresBlocks.CRYSTAL_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfernovaStructuresBlocks.LUMINOUS_MUSHROOM, RenderLayer.getCutout());


        EntityRendererRegistry.register(INEntities.COCONUT_PROJECTILE, FlyingItemEntityRenderer::new);


        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) {
                return FoliageColors.getDefaultColor();
            }
            return BiomeColors.getFoliageColor(world, pos);
        }, InfernovaStructuresBlocks.LEAVES_BLOCK);

        EntityModelLayerRegistry.registerModelLayer(INEntityLayers.MODIFIED_VILLAGER, INVillagerResemblingModel::getModelData);



    }
}


