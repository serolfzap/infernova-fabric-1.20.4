package net.leo.infernovastructures.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.leo.infernovastructures.block.InfernovaStructuresBlocks;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class INBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public INBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static final TagKey<Block> QUICKSAND_TYPES = of("quicksand_types");



    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(id));
    }



    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(InfernovaStructuresBlocks.SUGILITE_ORE)
                .add(InfernovaStructuresBlocks.DEEPSLATE_SUGILITE_ORE)
                .add(InfernovaStructuresBlocks.SANDSTONE_PILLAR)
                .add(InfernovaStructuresBlocks.SANDSTONE_SPIRAL)
                .add(InfernovaStructuresBlocks.CRACKED_SMOOTH_SANDSTONE);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(InfernovaStructuresBlocks.CRYSTAL_PLANKS)
                .add(InfernovaStructuresBlocks.CRYSTAL_LOG)
                .add(InfernovaStructuresBlocks.CRYSTAL_WOOD)
                .add(InfernovaStructuresBlocks.STRIPPED_CRYSTAL_LOG)
                .add(InfernovaStructuresBlocks.STRIPPED_CRYSTAL_WOOD)
                .add(InfernovaStructuresBlocks.CRYSTAL_STAIRS)
                .add(InfernovaStructuresBlocks.CRYSTAL_BUTTON)
                .add(InfernovaStructuresBlocks.CRYSTAL_SLAB)
                .add(InfernovaStructuresBlocks.CRYSTAL_PRESSURE_PLATE)
                .add(InfernovaStructuresBlocks.CRYSTAL_FENCE)
                .add(InfernovaStructuresBlocks.CRYSTAL_FENCE_GATE)
                .add(InfernovaStructuresBlocks.CRYSTAL_DOOR)
                .add(InfernovaStructuresBlocks.CRYSTAL_TRAPDOOR);






        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(InfernovaStructuresBlocks.SUGILITE_ORE);


        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(InfernovaStructuresBlocks.DEEPSLATE_SUGILITE_ORE);


        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(InfernovaStructuresBlocks.CRYSTAL_PLANKS)
                .add(InfernovaStructuresBlocks.CRYSTAL_LOG)
                .add(InfernovaStructuresBlocks.CRYSTAL_WOOD)
                .add(InfernovaStructuresBlocks.STRIPPED_CRYSTAL_LOG)
                .add(InfernovaStructuresBlocks.STRIPPED_CRYSTAL_WOOD);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(InfernovaStructuresBlocks.CRYSTAL_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(InfernovaStructuresBlocks.CRYSTAL_FENCE_GATE);




        getOrCreateTagBuilder(INBlockTagProvider.QUICKSAND_TYPES)
                .add(InfernovaStructuresBlocks.QUICKSAND)
                .add(InfernovaStructuresBlocks.QUICKREDSAND)
                .add(InfernovaStructuresBlocks.SILTY_CLAY)
                .add(InfernovaStructuresBlocks.FLOWING_MUD);











































































    }
}
