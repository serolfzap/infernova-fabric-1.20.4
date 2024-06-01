package net.leo.infernovastructures.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.leo.infernovastructures.block.InfernovaStructuresBlocks;
import net.leo.infernovastructures.item.InfernovaStructuresItems;
import net.minecraft.block.Block;

import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;

import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;

import net.minecraft.loot.function.SetCountLootFunction;

import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;




public class INLootTableProvider extends FabricBlockLootTableProvider {
    public INLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(InfernovaStructuresBlocks.CRYSTAL_LOG);
        addDrop(InfernovaStructuresBlocks.STRIPPED_CRYSTAL_LOG);
        addDrop(InfernovaStructuresBlocks.CRYSTAL_WOOD);
        addDrop(InfernovaStructuresBlocks.CRYSTAL_PLANKS);
        addDrop(InfernovaStructuresBlocks.SANDSTONE_SPIRAL);
        addDrop(InfernovaStructuresBlocks.CRACKED_SMOOTH_SANDSTONE);
        addDrop(InfernovaStructuresBlocks.P_SANDSTONE);
        addDrop(InfernovaStructuresBlocks.SANDSTONE_PILLAR);
        addDrop(InfernovaStructuresBlocks.STRIPPED_CRYSTAL_WOOD);
        addDrop(InfernovaStructuresBlocks.TAMARISK, shortPlantDrops((InfernovaStructuresBlocks.TAMARISK)));
        addDrop(InfernovaStructuresBlocks.CRYSTAL_LEAVES, leavesDrops(InfernovaStructuresBlocks.CRYSTAL_LEAVES, InfernovaStructuresBlocks.CRYSTAL_SAPLING, 0.05f));


        addDrop(InfernovaStructuresBlocks.SUGILITE_ORE, copperLikeOreDrops(InfernovaStructuresBlocks
                .SUGILITE_ORE, InfernovaStructuresItems.SUGILITE));

        addDrop(InfernovaStructuresBlocks.DEEPSLATE_SUGILITE_ORE, copperLikeOreDrops(InfernovaStructuresBlocks
                .DEEPSLATE_SUGILITE_ORE, InfernovaStructuresItems.SUGILITE));

        addDrop(InfernovaStructuresBlocks.CRYSTAL_FLOWER);
        addPottedPlantDrops(InfernovaStructuresBlocks.POTTED_CRYSTAL_FLOWER);
        addDrop(InfernovaStructuresBlocks.SPARKLEFLORA);
        addPottedPlantDrops(InfernovaStructuresBlocks.POTTED_SPARKLEFLORA);
        addDrop(InfernovaStructuresBlocks.BEGONIA);
        addPottedPlantDrops(InfernovaStructuresBlocks.POTTED_BEGONIA);
        addDrop(InfernovaStructuresBlocks.CRYSTAL_SAPLING);




        addDrop(InfernovaStructuresBlocks.REED, doorDrops(InfernovaStructuresBlocks.REED));
        addDrop(InfernovaStructuresBlocks.WICKER, doorDrops(InfernovaStructuresBlocks.WICKER));

        addDrop(InfernovaStructuresBlocks.COCONUT_BLOCK, INDrop(InfernovaStructuresItems.COCONUT));
        addDrop(InfernovaStructuresBlocks.LEAVES_BLOCK);
        addDrop(InfernovaStructuresBlocks.LUMINOUS_MUSHROOM);


        addDrop(InfernovaStructuresBlocks.CRYSTAL_SLAB);
        addDrop(InfernovaStructuresBlocks.CRYSTAL_STAIRS);
        addDrop(InfernovaStructuresBlocks.CRYSTAL_BUTTON);
        addDrop(InfernovaStructuresBlocks.CRYSTAL_FENCE);
        addDrop(InfernovaStructuresBlocks.CRYSTAL_FENCE_GATE);
        addDrop(InfernovaStructuresBlocks.CRYSTAL_PRESSURE_PLATE);
        addDrop(InfernovaStructuresBlocks.CRYSTAL_TRAPDOOR);
        addDrop(InfernovaStructuresBlocks.CRYSTAL_DOOR, doorDrops(InfernovaStructuresBlocks.CRYSTAL_DOOR));







    }

    public LootTable.Builder INDrop(ItemConvertible drop) {
        return LootTable.builder().pool(this.addSurvivesExplosionCondition(drop, LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0f)).with(ItemEntry.builder(drop))));
    }


        public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
            return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                    ((LeafEntry.Builder)
                            ItemEntry.builder(item)
                                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider
                                            .create(1.0f, 2.0f)))).apply(ApplyBonusLootFunction
                            .oreDrops(Enchantments.FORTUNE))));
        }









}
