package net.leo.infernovastructures.item.custom;


import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ExplosiveGlove extends Item {

    public ExplosiveGlove(Settings settings) {
        super(settings);
    }

    public void DetectGunPowder(ItemStack itemStack, LivingEntity user, BlockState state, World world, BlockPos pos, Entity entity) {

            if (itemStack.getItem() == Items.GUNPOWDER) {
                entity.damage(world.getDamageSources().inWall(), 1.0f);
            }


    }
}
