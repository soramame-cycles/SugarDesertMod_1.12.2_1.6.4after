package com.sugar.sugardesertmod.entity.model;
// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelCowramel extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer centerhorn_r1;
	private final ModelRenderer body;
	private final ModelRenderer body2_r1;
	private final ModelRenderer body1_r1;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;

	public ModelCowramel() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 4.0F, -9.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -4.0F, -6.0F, 8, 8, 6, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 22, 0, -5.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 22, 0, 4.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F, true));

		centerhorn_r1 = new ModelRenderer(this);
		centerhorn_r1.setRotationPoint(-1.25F, -2.8802F, -6.0144F);
		head.addChild(centerhorn_r1);
		setRotationAngle(centerhorn_r1, -0.2182F, 0.0F, 0.0F);
		centerhorn_r1.cubeList.add(new ModelBox(centerhorn_r1, 0, 33, -1.0F, -1.5F, -0.5F, 2, 3, 1, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 7.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 5, 32, -6.5F, -6.0F, -4.0F, 13, 7, 10, 0.0F, false));

		body2_r1 = new ModelRenderer(this);
		body2_r1.setRotationPoint(0.0F, 5.0F, 6.0F);
		body.addChild(body2_r1);
		setRotationAngle(body2_r1, 1.5708F, 0.0F, 0.0F);
		body2_r1.cubeList.add(new ModelBox(body2_r1, 52, 0, -2.0F, -3.0F, -1.0F, 4, 6, 1, 0.0F, true));

		body1_r1 = new ModelRenderer(this);
		body1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(body1_r1);
		setRotationAngle(body1_r1, 1.5708F, 0.0F, 0.0F);
		body1_r1.cubeList.add(new ModelBox(body1_r1, 18, 4, -6.0F, -9.0F, -5.0F, 12, 18, 10, 0.0F, true));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(4.0F, 12.0F, 6.0F);
		leg1.cubeList.add(new ModelBox(leg1, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-4.0F, 12.0F, 6.0F);
		leg2.cubeList.add(new ModelBox(leg2, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, true));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(4.0F, 12.0F, -7.0F);
		leg3.cubeList.add(new ModelBox(leg3, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(-4.0F, 12.0F, -7.0F);
		leg4.cubeList.add(new ModelBox(leg4, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		if(this.isChild) {
			GlStateManager.pushMatrix();
			GlStateManager.scale(0.5F, 0.5F, 0.5F);
			GlStateManager.translate(0.0F, 22.0F * f5, 0.0F);
			body.render(f5);
			head.render(f5);
			leg1.render(f5);
			leg2.render(f5);
			leg3.render(f5);
			leg4.render(f5);
			GlStateManager.popMatrix();
		}

		else {
			head.render(f5);
			body.render(f5);
			leg1.render(f5);
			leg2.render(f5);
			leg3.render(f5);
			leg4.render(f5);
		}
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
		this.head.rotateAngleX = headPitch * 0.017453292F;
		this.head.rotateAngleY = netHeadYaw * 0.017453292F;
		this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	}
}