package com.sugar.sugardesertmod.proxy;

import com.sugar.sugardesertmod.gen.biome.ModBiome;
import com.sugar.sugardesertmod.gen.block.BismuthOreGen;
import com.sugar.sugardesertmod.gen.block.EndDiaGen;
import com.sugar.sugardesertmod.gen.block.NetherDiaGen;
import com.sugar.sugardesertmod.gen.block.SugarBlockGen;
import com.sugar.sugardesertmod.gen.block.SugarDiaOreGen;
import com.sugar.sugardesertmod.handlers.OreDictionaryHandler;
import com.sugar.sugardesertmod.init.entity.SDEntity;
import com.sugar.sugardesertmod.recipes.SmeltingSugarD;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class CommonProxy {

	public void preinit(FMLPreInitializationEvent event) {

	}

	public void init(FMLInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new BismuthOreGen(), 0);
		GameRegistry.registerWorldGenerator(new SugarBlockGen(), 0);
		GameRegistry.registerWorldGenerator(new SugarDiaOreGen(),0);
		GameRegistry.registerWorldGenerator(new NetherDiaGen(), 0);
		GameRegistry.registerWorldGenerator(new EndDiaGen(), 0);
		ModBiome.registerBiomeTypes();
		SmeltingSugarD.register();
		OreDictionaryHandler.registerOreDictionary();
		SDEntity.entityRegister();
		SDEntity.addSpawn();
	}

	public void postInit(FMLPostInitializationEvent event) {

	}
}
