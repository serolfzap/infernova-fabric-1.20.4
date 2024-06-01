package net.leo.infernovastructures.entity.item;

import net.leo.infernovastructures.block.InfernovaStructuresBlocks;
import net.leo.infernovastructures.block.custom.CoconutBlock;
import net.leo.infernovastructures.entity.INEntities;
import net.leo.infernovastructures.item.InfernovaStructuresItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;

public class CoconutProjectile extends ThrownItemEntity {
    public CoconutProjectile(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public CoconutProjectile(LivingEntity livingEntity, World world) {
        super(INEntities.COCONUT_PROJECTILE,livingEntity, world);
    }

    @Override
    protected Item getDefaultItem() {
        return InfernovaStructuresItems.COCONUT;
    }

    @Override
    public Packet<ClientPlayPacketListener> createSpawnPacket() {
        return new EntitySpawnS2CPacket(this);
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        if (!this.getWorld().isClient()){
            this.getWorld().sendEntityStatus(this, (byte)3);
            this.getWorld().setBlockState(getBlockPos(), ((CoconutBlock) InfernovaStructuresBlocks.COCONUT_BLOCK).getRandomBlockState(), 3);

        }
        this.discard();
        super.onBlockHit(blockHitResult);
    }
}
