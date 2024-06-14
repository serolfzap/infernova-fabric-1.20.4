package net.leo.infernovastructures.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.leo.infernovastructures.InfernovaStructures;
import net.leo.infernovastructures.block.InfernovaStructuresBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class INSItemGroups {

    public static final ItemGroup COCONUT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(InfernovaStructures.MOD_ID, "coconut"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.coconut"))
                    .icon(() -> new ItemStack(InfernovaStructuresItems.COCONUT)).entries((displayContext, entries) -> {
                        entries.add(InfernovaStructuresItems.COCONUT);
                        entries.add(InfernovaStructuresItems.SUGILITE);
                        entries.add(InfernovaStructuresItems.QUICKSAND_BUCKET);
                        entries.add(InfernovaStructuresItems.QUICKREDSAND_BUCKET);
                        entries.add(InfernovaStructuresItems.FLOWING_MUD_BUCKET);
                        entries.add(InfernovaStructuresItems.SILTY_CLAY_BUCKET);
                        entries.add(InfernovaStructuresItems.LEAVES);
                        entries.add(InfernovaStructuresItems.EXPLOSIVE_GLOVE);
                        entries.add(InfernovaStructuresItems.LUMINOUS_MUSHROOM);

                        entries.add(InfernovaStructuresItems.SUGILSHARD_IRON_PICKAXE);
                        entries.add(InfernovaStructuresItems.SUGILSHARD_IRON_SHOVEL);









                        entries.add(InfernovaStructuresBlocks.SANDSTONE_PILLAR);
                        entries.add(InfernovaStructuresBlocks.SANDSTONE_SPIRAL);
                        entries.add(InfernovaStructuresBlocks.CRACKED_SMOOTH_SANDSTONE);


                        entries.add(InfernovaStructuresBlocks.CRYSTAL_LEAVES);
                        entries.add(InfernovaStructuresBlocks.CRYSTAL_LOG);
                        entries.add(InfernovaStructuresBlocks.CRYSTAL_PLANKS);
                        entries.add(InfernovaStructuresBlocks.CRYSTAL_WOOD);

                        entries.add(InfernovaStructuresBlocks.CRYSTAL_STAIRS);
                        entries.add(InfernovaStructuresBlocks.CRYSTAL_FENCE_GATE);
                        entries.add(InfernovaStructuresBlocks.CRYSTAL_FENCE);
                        entries.add(InfernovaStructuresBlocks.CRYSTAL_DOOR);
                        entries.add(InfernovaStructuresBlocks.CRYSTAL_PRESSURE_PLATE);
                        entries.add(InfernovaStructuresBlocks.CRYSTAL_SLAB);
                        entries.add(InfernovaStructuresBlocks.CRYSTAL_TRAPDOOR);
                        entries.add(InfernovaStructuresBlocks.CRYSTAL_BUTTON);

                        entries.add(InfernovaStructuresBlocks.STRIPPED_CRYSTAL_LOG);
                        entries.add(InfernovaStructuresBlocks.STRIPPED_CRYSTAL_WOOD);
                        entries.add(InfernovaStructuresBlocks.SUGILITE_ORE);
                        entries.add(InfernovaStructuresBlocks.DEEPSLATE_SUGILITE_ORE);


                        entries.add(InfernovaStructuresBlocks.CRYSTAL_FLOWER);
                        entries.add(InfernovaStructuresBlocks.CRYSTAL_SAPLING);
                        entries.add(InfernovaStructuresBlocks.TAMARISK);
                        entries.add(InfernovaStructuresBlocks.REED);
                        entries.add(InfernovaStructuresBlocks.WICKER);
                        entries.add(InfernovaStructuresBlocks.SPARKLEFLORA);
                        entries.add(InfernovaStructuresBlocks.BEGONIA);












                    }).build());
    public static void registerItemGroups(){
        InfernovaStructures.LOGGER.info("Registering Item Groups for "+InfernovaStructures.MOD_ID);

    }
}
