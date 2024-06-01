package net.leo.infernovastructures.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.leo.infernovastructures.entity.render.INEntityLayers;
import net.minecraft.client.render.entity.VillagerEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(VillagerEntityRenderer.class)
public class VillagerEntityRendererMixin {
    @ModifyExpressionValue(method = "<init>", at = @At(value = "FIELD",
            target = "Lnet/minecraft/client/render/entity/model/EntityModelLayers;VILLAGER:Lnet/minecraft/client/render/entity/model/EntityModelLayer;"))
    private static EntityModelLayer changeVillagerModelLayer(EntityModelLayer original) {
        return INEntityLayers.MODIFIED_VILLAGER;
    }


}
