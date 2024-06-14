package net.leo.infernovastructures.util;

import net.leo.infernovastructures.item.InfernovaStructuresItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;


public class InventoryUtil {
    public static boolean hasPlayerStackInInventory(PlayerEntity player, Item item) {
        for(int i = 0; i < player.getInventory().size(); i++) {
            ItemStack currentStack = player.getInventory().getStack(i);
            if (!currentStack.isEmpty() && currentStack.isOf(Items.GUNPOWDER)) {
                return true;
            }
        }

        return false;
    }

    public static int getFirstInventoryIndex(PlayerEntity player, Item item) {
        for(int i = 0; i < player.getInventory().size(); i++) {
            ItemStack currentStack = player.getInventory().getStack(i);
            if (!currentStack.isEmpty() && currentStack.isOf(Items.GUNPOWDER)) {
                return i;
            }
        }

        return -1;
    }
}
