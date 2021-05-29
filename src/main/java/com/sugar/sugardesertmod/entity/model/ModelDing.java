package com.sugar.sugardesertmod.entity.model;

import com.sugar.sugardesertmod.entity.EntityDing;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ModelDing extends ModelBase {
	private ModelRenderer body;
	private ModelRenderer head;
	private ModelRenderer center_horn_r1;
	private ModelRenderer left_horn_r1;
	private ModelRenderer right_horn_r1;
	private ModelRenderer leg1;
	private ModelRenderer leg2;
	private ModelRenderer leg3;
	private ModelRenderer leg4;
	private ModelRenderer tail;

	public ModelDing() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 15.3333F, 2.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, -0.3333F, -10.0F, 10, 6, 14, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 20, -4.0F, -4.3333F, -10.0F, 8, 4, 14, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 13.0F, -8.0F);
		head.cubeList.add(new ModelBox(head, 31, 38, -4.0F, -5.0F, -8.0F, 8, 8, 8, 0.0F, true));

		center_horn_r1 = new ModelRenderer(this);
		center_horn_r1.setRotationPoint(0.0F, 11.0F, 8.0F);
		head.addChild(center_horn_r1);
		setRotationAngle(center_horn_r1, -0.1309F, 0.0F, 0.0F);
		center_horn_r1.cubeList.add(new ModelBox(center_horn_r1, 16, 38, -2.0F, -15.0F, -19.0F, 2, 4, 2, 0.0F, true));

		left_horn_r1 = new ModelRenderer(this);
		left_horn_r1.setRotationPoint(0.0F, 11.0F, 8.0F);
		head.addChild(left_horn_r1);
		setRotationAngle(left_horn_r1, 0.0F, 0.0F, -0.0873F);
		left_horn_r1.cubeList.add(new ModelBox(left_horn_r1, 34, 0, 5.0F, -17.0F, -14.0F, 2, 4, 6, 0.0F, true));

		right_horn_r1 = new ModelRenderer(this);
		right_horn_r1.setRotationPoint(0.0F, 11.0F, 8.0F);
		head.addChild(right_horn_r1);
		setRotationAngle(right_horn_r1, 0.0F, 0.0F, 0.0873F);
		right_horn_r1.cubeList.add(new ModelBox(right_horn_r1, 30, 20, -7.0F, -17.0F, -14.0F, 2, 4, 6, 0.0F, true));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-3.5F, 21.0F, -6.5F);
		leg1.cubeList.add(new ModelBox(leg1, 0, 20, -1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(3.5F, 21.0F, -6.5F);
		leg2.cubeList.add(new ModelBox(leg2, 0, 26, -1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F, false));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(-3.5F, 21.0F, 4.5F);
		leg3.cubeList.add(new ModelBox(leg3, 0, 6, -1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F, false));

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(3.5F, 21.0F, 4.5F);
		leg4.cubeList.add(new ModelBox(leg4, 0, 0, -1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 15.0F, 6.0F);
		tail.cubeList.add(new ModelBox(tail, 0, 38, -2.0F, -2.0F, 0.0F, 4, 4, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		if(this.isChild) {
			GlStateManager.pushMatrix();
			GlStateManager.scale(0.6F, 0.6F, 0.6F);
			GlStateManager.translate(0.0F, 14.0F * f5, 0.0F);
			body.render(f5);
			head.render(f5);
			leg1.render(f5);
			leg2.render(f5);
			leg3.render(f5);
			leg4.render(f5);
			tail.render(f5);
			GlStateManager.popMatrix();
		}
		else {
			body.render(f5);
			head.render(f5);
			leg1.render(f5);
			leg2.render(f5);
			leg3.render(f5);
			leg4.render(f5);
			tail.render(f5);
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
		this.tail.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;

		if(entityIn instanceof EntityDing) {
			EntityDing entityding = (EntityDing) entityIn;
			if(entityding.isPUDDING()) {
				this.head.rotateAngleX = MathHelper.cos(ageInTicks * 1.0F)* 0.25F;
				//SugarDesertMod.LOGGER.info("swing");
			}
		}
	}
}