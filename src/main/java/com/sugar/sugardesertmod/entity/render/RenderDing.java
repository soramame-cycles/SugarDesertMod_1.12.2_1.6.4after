package com.sugar.sugardesertmod.entity.render;

import com.sugar.sugardesertmod.entity.EntityDing;
import com.sugar.sugardesertmod.entity.model.ModelDing;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderDing extends RenderLiving<EntityDing> {

	public static final ResourceLocation Ding_Textures = new ResourceLocation("sugard:textures/entity/ding.png");

	public RenderDing(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, new ModelDing(),0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityDing entity) {
		return Ding_Textures;
	}

}
