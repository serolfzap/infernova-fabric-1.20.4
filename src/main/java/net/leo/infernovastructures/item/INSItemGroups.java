package net.leo.infernovastructures.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.leo.infernovastructures.InfernovaStructures;
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

                    }).build());
    public static void registerItemGroups(){
        InfernovaStructures.LOGGER.info("Registering Item Groups for "+InfernovaStructures.MOD_ID);

    }
}
