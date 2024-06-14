package net.leo.infernovastructures.datagen.custom;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalBiomeTags;

import net.leo.infernovastructures.registry.INTags;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.world.biome.Biome;

import java.util.concurrent.CompletableFuture;

public class INBiomeTagProvider extends FabricTagProvider<Biome> {


    public INBiomeTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFut) {
        super(output, RegistryKeys.BIOME, registriesFut);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(INTags.HAS_QUICKSAND_LAKES).forceAddTag(ConventionalBiomeTags.DESERT);
    }
}
