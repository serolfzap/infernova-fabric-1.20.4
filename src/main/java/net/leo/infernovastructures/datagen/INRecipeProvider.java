package net.leo.infernovastructures.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.leo.infernovastructures.block.InfernovaStructuresBlocks;
import net.leo.infernovastructures.item.InfernovaStructuresItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.List;

public class INRecipeProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> SUGILITE_SMELTABLES = List.of(InfernovaStructuresBlocks.SUGILITE_ORE,
            InfernovaStructuresBlocks.DEEPSLATE_SUGILITE_ORE);

    public static final TagKey<Item> CRYSTAL_LOGS = TagKey.of(RegistryKeys.ITEM, new Identifier("infernovastructures", "crystal_logs"));


    public INRecipeProvider(FabricDataOutput output) {
        super(output);
    }



    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, SUGILITE_SMELTABLES, RecipeCategory.MISC, InfernovaStructuresItems.SUGILITE, 0.7f, 200, "sugilite");

        offerBlasting(exporter, SUGILITE_SMELTABLES, RecipeCategory.MISC, InfernovaStructuresItems.SUGILITE
                , 0.7f, 100, "sugilite");

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, InfernovaStructuresBlocks.SANDSTONE_PILLAR, Blocks.SANDSTONE  );
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, InfernovaStructuresBlocks.SANDSTONE_SPIRAL, Blocks.SMOOTH_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, InfernovaStructuresBlocks.CRACKED_SMOOTH_SANDSTONE, Blocks.SMOOTH_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, InfernovaStructuresBlocks.P_SANDSTONE, Blocks.SMOOTH_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, InfernovaStructuresBlocks.S_SANDSTONE, Blocks.SMOOTH_SANDSTONE);




        offerStairsRecipe(exporter, InfernovaStructuresBlocks.CRYSTAL_STAIRS, InfernovaStructuresBlocks.CRYSTAL_PLANKS);
        offerTrapdoorRecipe(exporter, InfernovaStructuresBlocks.CRYSTAL_TRAPDOOR, InfernovaStructuresBlocks.CRYSTAL_PLANKS);

        offerDoorRecipe(exporter, InfernovaStructuresBlocks.CRYSTAL_DOOR, InfernovaStructuresBlocks.CRYSTAL_PLANKS);

        offerPressurePlateRecipe(exporter, InfernovaStructuresBlocks.CRYSTAL_PRESSURE_PLATE,InfernovaStructuresBlocks.CRYSTAL_PLANKS);
        offerFenceRecipe(exporter, InfernovaStructuresBlocks.CRYSTAL_FENCE, InfernovaStructuresBlocks.CRYSTAL_PLANKS);
        offerSlabRecipe(exporter, RecipeCategory.MISC, InfernovaStructuresBlocks.CRYSTAL_SLAB, InfernovaStructuresBlocks.CRYSTAL_PLANKS);
        offerFenceGateRecipe(exporter, InfernovaStructuresBlocks.CRYSTAL_FENCE_GATE, InfernovaStructuresBlocks.CRYSTAL_PLANKS);







        offerPlanksRecipe2(exporter, InfernovaStructuresBlocks.CRYSTAL_PLANKS, CRYSTAL_LOGS, 4 );

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, InfernovaStructuresBlocks.CRYSTAL_WOOD, 3)
                .pattern("SS")
                .pattern("SS")
                .input('S', InfernovaStructuresBlocks.CRYSTAL_LOG)
                .criterion(hasItem(InfernovaStructuresBlocks.CRYSTAL_LOG), conditionsFromItem(InfernovaStructuresBlocks.CRYSTAL_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(InfernovaStructuresBlocks.CRYSTAL_WOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, InfernovaStructuresBlocks.STRIPPED_CRYSTAL_WOOD, 3)
                .pattern("SS")
                .pattern("SS")
                .input('S', InfernovaStructuresBlocks.STRIPPED_CRYSTAL_LOG)
                .criterion(hasItem(InfernovaStructuresBlocks.STRIPPED_CRYSTAL_LOG), conditionsFromItem(InfernovaStructuresBlocks.STRIPPED_CRYSTAL_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(InfernovaStructuresBlocks.STRIPPED_CRYSTAL_WOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, InfernovaStructuresBlocks.CRYSTAL_BUTTON, 1)
                .pattern("S")
                .input('S', InfernovaStructuresBlocks.CRYSTAL_PLANKS)
                .criterion(hasItem(InfernovaStructuresBlocks.CRYSTAL_PLANKS), conditionsFromItem(InfernovaStructuresBlocks.CRYSTAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(InfernovaStructuresBlocks.CRYSTAL_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, InfernovaStructuresItems.EXPLOSIVE_GLOVE, 1)
                .pattern("S S")
                .pattern("SIS")
                .pattern("SSS")
                .input('I', Items.SLIME_BLOCK)
                .input('S', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.SLIME_BALL), conditionsFromItem(Items.SLIME_BALL))
                .offerTo(exporter, new Identifier(getRecipeName(InfernovaStructuresItems.EXPLOSIVE_GLOVE)));



        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BROWN_DYE)
                .input(InfernovaStructuresBlocks.REED).group("brown_dye").criterion
                         (hasItem(InfernovaStructuresBlocks.REED), conditionsFromItem(InfernovaStructuresBlocks.REED)).offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, InfernovaStructuresBlocks.SUGILITE_ORE)
                .pattern("SSS")
                .input('S', InfernovaStructuresItems.SUGILITE)
                .criterion(hasItem(InfernovaStructuresItems.SUGILITE), conditionsFromItem(InfernovaStructuresItems.SUGILITE))
                .offerTo(exporter, new Identifier(getRecipeName(InfernovaStructuresBlocks.SUGILITE_ORE)));














    }

    public static void offerDoorRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input ) {
        RecipeProvider.createDoorRecipe(output, Ingredient.ofItems(input)).criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input)).offerTo(exporter);
    }


    public static void offerStairsRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input ) {
        RecipeProvider.createStairsRecipe(output, Ingredient.ofItems(input)).criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input)).offerTo(exporter);
    }

    public static void offerFenceRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input ) {
        RecipeProvider.createFenceRecipe(output, Ingredient.ofItems(input)).criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input)).offerTo(exporter);
    }

    public static void offerFenceGateRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input ) {
        RecipeProvider.createFenceGateRecipe(output, Ingredient.ofItems(input)).criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input)).offerTo(exporter);
    }

    public static void offerTrapdoorRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input ) {
        RecipeProvider.createTrapdoorRecipe(output, Ingredient.ofItems(input)).criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input)).offerTo(exporter);
    }






}
