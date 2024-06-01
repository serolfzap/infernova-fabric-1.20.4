package net.leo.infernovastructures.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.leo.infernovastructures.InfernovaStructures;
import net.leo.infernovastructures.InfernovaStructuresClient;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class InfernovaStructuresItems {

    public static final Item COCONUT = registerItem("coconut", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries ){
        entries.add(COCONUT);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(InfernovaStructures.MOD_ID, name), item);
    }
    public static void registerInfernovaStructuresItems() {
        InfernovaStructures.LOGGER.info("Registering Mod Items for " + InfernovaStructures.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(InfernovaStructuresItems::addItemsToIngredientItemGroup);
    }
}
