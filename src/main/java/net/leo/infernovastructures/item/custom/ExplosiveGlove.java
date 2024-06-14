package net.leo.infernovastructures.item.custom;

import net.leo.infernovastructures.item.InfernovaStructuresItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.*;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.Optional;

public class ExplosiveGlove extends ToolItem {


    public ExplosiveGlove(ToolMaterial material, Settings settings) {
        super(material, settings);
    }

    public static boolean hasPlayerStackInInventory(PlayerEntity player, Item item) {
        return player.getInventory().containsAny(stack -> stack.isOf(item));
    }

    public static Optional<ItemStack> findFirstItemStack(PlayerEntity player, ItemStack stack) {
        return player.getInventory().main.stream().filter(inventoryStack -> inventoryStack.equals(stack)).findFirst();
    }

    public static Optional<Integer> findFirstItemStackIndex(PlayerEntity player, ItemStack stack) {
        int index = player.getInventory().getSlotWithStack(stack);
        return index == -1 ? Optional.empty() : Optional.of(index);
    }

    private void consumeOneGunpowder(PlayerEntity player) {
        Inventory inventory = player.getInventory();
        for (int i = 0; i < inventory.size(); i++) {
            ItemStack stack = inventory.getStack(i);
            if (stack.isOf(Items.GUNPOWDER)) {
                stack.decrement(1);
                if (stack.isEmpty()) {
                    inventory.removeStack(i);
                }
                break;
            }
        }
    }

    private void consumeOneDurability(ItemStack stack, PlayerEntity player) {
        stack.damage(1, player, p -> p.sendToolBreakStatus(p.getActiveHand()));
    }

    public void checkForGunpowderAndPrint(PlayerEntity player, World world, ItemStack stack) {
        if (player == null || world == null) {
            return;
        }

        Item gunpowder = Items.GUNPOWDER;
        Item explosiveGlove = InfernovaStructuresItems.EXPLOSIVE_GLOVE;

        if (hasPlayerStackInInventory(player, gunpowder) && hasPlayerStackInInventory(player, explosiveGlove)) {
            world.createExplosion(player, player.getX(), player.getY(), player.getZ(), 3.0F, World.ExplosionSourceType.TNT);

            consumeOneGunpowder(player);

            consumeOneDurability(stack, player);
        }
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(hand);

        if (!world.isClient) {
            if (!player.getItemCooldownManager().isCoolingDown(this)) {
                checkForGunpowderAndPrint(player, world, stack);
                player.getItemCooldownManager().set(this, 200);
            }
        }

        return TypedActionResult.success(stack);
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }
}
