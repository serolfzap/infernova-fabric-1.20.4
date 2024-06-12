package net.leo.infernovastructures.FuelItems;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.leo.infernovastructures.block.InfernovaStructuresBlocks;

public class FuelItemsandBlocks {

    public static void registerFuelItemsandBlocks() {

        FlammableBlockRegistry.getDefaultInstance().add(InfernovaStructuresBlocks.CRYSTAL_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(InfernovaStructuresBlocks.STRIPPED_CRYSTAL_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(InfernovaStructuresBlocks.CRYSTAL_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(InfernovaStructuresBlocks.STRIPPED_CRYSTAL_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(InfernovaStructuresBlocks.CRYSTAL_PLANKS, 5, 20);



    }
}
