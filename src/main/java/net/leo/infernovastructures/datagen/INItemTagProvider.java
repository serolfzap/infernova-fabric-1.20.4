package net.leo.infernovastructures.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.leo.infernovastructures.block.InfernovaStructuresBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class INItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public INItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(InfernovaStructuresBlocks.CRYSTAL_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(InfernovaStructuresBlocks.CRYSTAL_PLANKS.asItem())
                .add(InfernovaStructuresBlocks.CRYSTAL_LOG.asItem())
                .add(InfernovaStructuresBlocks.CRYSTAL_WOOD.asItem())
                .add(InfernovaStructuresBlocks.STRIPPED_CRYSTAL_LOG.asItem())
                .add(InfernovaStructuresBlocks.STRIPPED_CRYSTAL_WOOD.asItem());

        getOrCreateTagBuilder(INRecipeProvider.CRYSTAL_LOGS)
                .add(InfernovaStructuresBlocks.CRYSTAL_LOG.asItem())
                .add(InfernovaStructuresBlocks.CRYSTAL_WOOD.asItem())
                .add(InfernovaStructuresBlocks.STRIPPED_CRYSTAL_LOG.asItem())
                .add(InfernovaStructuresBlocks.STRIPPED_CRYSTAL_WOOD.asItem());












    }
}
