package net.leo.infernovastructures.entity.render;


import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.ModelWithHat;
import net.minecraft.client.render.entity.model.ModelWithHead;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.MerchantEntity;
import net.minecraft.util.math.MathHelper;


@Environment(EnvType.CLIENT)

public class INVillagerResemblingModel<T extends Entity> extends SinglePartEntityModel<T> implements ModelWithHead, ModelWithHat {


    private final ModelPart root;
    private final ModelPart head;
    private final ModelPart hat;
    private final ModelPart hatRim;
    private final ModelPart rightLeg;
    private final ModelPart leftLeg;
    protected final ModelPart nose;
    private final ModelPart minerHat;


    public INVillagerResemblingModel(ModelPart root) {
        this.root = root;
        this.head = root.getChild("head");
        this.hat = this.head.getChild("hat");
        this.hatRim = this.hat.getChild("hat_rim");
        //Miner hat
        this.minerHat = this.hat.getChild("miner_hat");

        this.nose = this.head.getChild("nose");
        this.rightLeg = root.getChild("right_leg");
        this.leftLeg = root.getChild("left_leg");
    }


    public static TexturedModelData getModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        float f = 0.5F;
        ModelPartData modelPartData2 = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 64).cuboid(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), ModelTransform.NONE);
        ModelPartData modelPartData3 = modelPartData2.addChild("hat", ModelPartBuilder.create().uv(32, 64).cuboid(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new Dilation(0.51F)), ModelTransform.NONE);
        modelPartData3.addChild("hat_rim", ModelPartBuilder.create().uv(30, 110).cuboid(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), ModelTransform.rotation(-1.5707964F, 0.0F, 0.0F));
        //My code
        modelPartData3.addChild("miner_hat", ModelPartBuilder.create().uv(44, 0).cuboid(-6.0F, -31.0F, -6.0F, 12.0F, 2.0F, 12.0F, new Dilation(0.0F))
                .uv(106, 17).cuboid(-3.0F, -37.0F, -6.0F, 6.0F, 6.0F, 1.0F, new Dilation(0.0F))
                .uv(108, 4).cuboid(-2.0F, -36.0F, -6.5F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-5.0F, -36.0F, -5.0F, 10.0F, 5.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));



        modelPartData2.addChild("nose", ModelPartBuilder.create().uv(24, 64).cuboid(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F), ModelTransform.pivot(0.0F, -2.0F, 0.0F));
        ModelPartData modelPartData4 = modelPartData.addChild("body", ModelPartBuilder.create().uv(16, 84).cuboid(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F), ModelTransform.NONE);
        modelPartData4.addChild("jacket", ModelPartBuilder.create().uv(0, 102).cuboid(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new Dilation(0.5F)), ModelTransform.NONE);
        modelPartData.addChild("arms", ModelPartBuilder.create().uv(44, 86).cuboid(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F).uv(44, 86).cuboid(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, true).uv(40, 102).cuboid(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F), ModelTransform.of(0.0F, 3.0F, -1.0F, -0.75F, 0.0F, 0.0F));
        modelPartData.addChild("right_leg", ModelPartBuilder.create().uv(0, 86).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
        modelPartData.addChild("left_leg", ModelPartBuilder.create().uv(0, 86).mirrored().cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), ModelTransform.pivot(2.0F, 12.0F, 0.0F));
        return TexturedModelData.of(modelData,128,128);
    }

    public ModelPart getPart() {
        return this.root;
    }

    public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        boolean bl = false;
        if (entity instanceof MerchantEntity) {
            bl = ((MerchantEntity)entity).getHeadRollingTimeLeft() > 0;
        }

        this.head.yaw = headYaw * 0.017453292F;
        this.head.pitch = headPitch * 0.017453292F;
        if (bl) {
            this.head.roll = 0.3F * MathHelper.sin(0.45F * animationProgress);
            this.head.pitch = 0.4F;
        } else {
            this.head.roll = 0.0F;
        }

        this.rightLeg.pitch = MathHelper.cos(limbAngle * 0.6662F) * 1.4F * limbDistance * 0.5F;
        this.leftLeg.pitch = MathHelper.cos(limbAngle * 0.6662F + 3.1415927F) * 1.4F * limbDistance * 0.5F;
        this.rightLeg.yaw = 0.0F;
        this.leftLeg.yaw = 0.0F;
    }

    public ModelPart getHead() {
        return this.head;
    }

    public void setHatVisible(boolean visible) {
        this.head.visible = visible;
        this.hat.visible = visible;
        this.hatRim.visible = visible;
        this.minerHat.visible = visible;
    }
}
















