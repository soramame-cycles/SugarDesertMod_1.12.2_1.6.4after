package com.sugar.sugardesertmod.proxy;

import com.sugar.sugardesertmod.entity.EntityCowramel;
import com.sugar.sugardesertmod.entity.EntityDing;
import com.sugar.sugardesertmod.entity.model.ModelCowramel;
import com.sugar.sugardesertmod.entity.model.ModelDing;
import com.sugar.sugardesertmod.entity.render.RenderCowramel;
import com.sugar.sugardesertmod.entity.render.RenderDing;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {

	@Override
	public void preinit(FMLPreInitializationEvent event) {
		super.preinit(event);
		RenderingRegistry.registerEntityRenderingHandler(EntityDing.class, new IRenderFactory<EntityDing>() {
			public Render<? super EntityDing> createRenderFor(RenderManager manager) {
				return new RenderDing(manager, new ModelDing(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityCowramel.class, new IRenderFactory<EntityCowramel>() {
			@Override
			public Render<? super EntityCowramel> createRenderFor(RenderManager manager) {
				return new RenderCowramel(manager,new ModelCowramel(),0.7f);
			}

		});
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}
