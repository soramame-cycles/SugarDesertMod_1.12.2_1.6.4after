package com.sugar.sugardesertmod.entity.render;

import com.sugar.sugardesertmod.entity.EntityCowramel;
import com.sugar.sugardesertmod.entity.model.ModelCowramel;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderCowramel extends RenderLiving<EntityCowramel> {

	public static final ResourceLocation Cowramel_Textures = new ResourceLocation("sugard:textures/entity/cowramel_body.png");
	public static final ResourceLocation Calamel_Textures = new ResourceLocation("sugard:textures/entity/cowramel_caramel.png");

	public RenderCowramel(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, new ModelCowramel(), 0.7F);
		this.addLayer(new Calamel());
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityCowramel entity) {
		return Cowramel_Textures;
	}

	class Calamel implements LayerRenderer<EntityCowramel> {

		@Override
		public void doRenderLayer(EntityCowramel entitylivingbaseIn, float limbSwing, float limbSwingAmount,
				float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
			RenderCowramel.this.bindTexture(Calamel_Textures);
			GlStateManager.enableBlendProfile(GlStateManager.Profile.TRANSPARENT_MODEL);
			GlStateManager.color(1.0F, 1.0F, 1.0F, 128F);
			RenderCowramel.this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
			GlStateManager.disableBlendProfile(GlStateManager.Profile.TRANSPARENT_MODEL);
		}

		@Override
		public boolean shouldCombineTextures() {
			return false;
		}

	}

}
