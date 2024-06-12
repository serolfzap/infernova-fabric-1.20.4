package net.leo.infernovastructures.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.leo.infernovastructures.block.InfernovaStructuresBlocks;
import net.leo.infernovastructures.item.InfernovaStructuresItems;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;


public class INModelProvider extends FabricModelProvider {



    public INModelProvider(FabricDataOutput output) {
        super(output);
    }



    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        Identifier modelId = TexturedModel.CUBE_BOTTOM_TOP.get(InfernovaStructuresBlocks.MINING_WORKBENCH).upload(InfernovaStructuresBlocks.MINING_WORKBENCH, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(InfernovaStructuresBlocks.MINING_WORKBENCH, modelId));


        BlockStateModelGenerator.BlockTexturePool crystalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(InfernovaStructuresBlocks.CRYSTAL_PLANKS);

        blockStateModelGenerator.registerSimpleCubeAll(InfernovaStructuresBlocks.DEEPSLATE_SUGILITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(InfernovaStructuresBlocks.SUGILITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(InfernovaStructuresBlocks.SANDSTONE_SPIRAL);
        blockStateModelGenerator.registerSimpleCubeAll(InfernovaStructuresBlocks.CRACKED_SMOOTH_SANDSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(InfernovaStructuresBlocks.P_SANDSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(InfernovaStructuresBlocks.S_SANDSTONE);












        blockStateModelGenerator.registerLog(InfernovaStructuresBlocks.CRYSTAL_LOG).log(InfernovaStructuresBlocks.CRYSTAL_LOG).wood(InfernovaStructuresBlocks.CRYSTAL_WOOD);
        blockStateModelGenerator.registerLog(InfernovaStructuresBlocks.STRIPPED_CRYSTAL_LOG).log(InfernovaStructuresBlocks.STRIPPED_CRYSTAL_LOG).wood(InfernovaStructuresBlocks.STRIPPED_CRYSTAL_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(InfernovaStructuresBlocks.CRYSTAL_LEAVES);


        crystalPool.stairs(InfernovaStructuresBlocks.CRYSTAL_STAIRS);
        crystalPool.slab(InfernovaStructuresBlocks.CRYSTAL_SLAB);
        crystalPool.pressurePlate(InfernovaStructuresBlocks.CRYSTAL_PRESSURE_PLATE);
        crystalPool.fence(InfernovaStructuresBlocks.CRYSTAL_FENCE);
        crystalPool.fenceGate(InfernovaStructuresBlocks.CRYSTAL_FENCE_GATE);
        crystalPool.button(InfernovaStructuresBlocks.CRYSTAL_BUTTON);

        blockStateModelGenerator.registerDoor(InfernovaStructuresBlocks.CRYSTAL_DOOR);
        blockStateModelGenerator.registerTrapdoor(InfernovaStructuresBlocks.CRYSTAL_TRAPDOOR);


        blockStateModelGenerator.registerTintableCross(InfernovaStructuresBlocks.CRYSTAL_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerSimpleCubeAll(InfernovaStructuresBlocks.QUICKSAND);
        blockStateModelGenerator.registerSimpleCubeAll(InfernovaStructuresBlocks.QUICKREDSAND);
        blockStateModelGenerator.registerSimpleCubeAll(InfernovaStructuresBlocks.FLOWING_MUD);
        blockStateModelGenerator.registerSimpleCubeAll(InfernovaStructuresBlocks.SILTY_CLAY);

        blockStateModelGenerator.registerFlowerPotPlant(InfernovaStructuresBlocks.CRYSTAL_FLOWER, InfernovaStructuresBlocks.POTTED_CRYSTAL_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(InfernovaStructuresBlocks.SPARKLEFLORA, InfernovaStructuresBlocks.POTTED_SPARKLEFLORA, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(InfernovaStructuresBlocks.BEGONIA, InfernovaStructuresBlocks.POTTED_BEGONIA, BlockStateModelGenerator.TintType.NOT_TINTED);


        blockStateModelGenerator.registerTintableCross(InfernovaStructuresBlocks.TAMARISK, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(InfernovaStructuresBlocks.REED, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(InfernovaStructuresBlocks.WICKER, BlockStateModelGenerator.TintType.NOT_TINTED);


        blockStateModelGenerator.registerAxisRotated(InfernovaStructuresBlocks.SANDSTONE_PILLAR, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);




        //Json custom blocks
        blockStateModelGenerator.registerSimpleState(InfernovaStructuresBlocks.COCONUT_BLOCK);
        blockStateModelGenerator.registerSimpleState(InfernovaStructuresBlocks.LUMINOUS_MUSHROOM);











    }
















    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(InfernovaStructuresItems.COCONUT, Models.GENERATED);
        itemModelGenerator.register(InfernovaStructuresItems.SUGILITE, Models.GENERATED);
        itemModelGenerator.register(InfernovaStructuresItems.QUICKSAND_BUCKET, Models.GENERATED);
        itemModelGenerator.register(InfernovaStructuresItems.QUICKREDSAND_BUCKET, Models.GENERATED);
        itemModelGenerator.register(InfernovaStructuresItems.FLOWING_MUD_BUCKET, Models.GENERATED);
        itemModelGenerator.register(InfernovaStructuresItems.SILTY_CLAY_BUCKET, Models.GENERATED);
        itemModelGenerator.register(InfernovaStructuresItems.LUMINOUS_MUSHROOM, Models.GENERATED);



    }






}

