package com.sugar.sugardesertmod;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.sugar.sugardesertmod.gen.biome.ModBiome;
import com.sugar.sugardesertmod.init.block.SugarDBlock;
import com.sugar.sugardesertmod.init.item.SDItem;
import com.sugar.sugardesertmod.init.tool.SugarDTools;
import com.sugar.sugardesertmod.proxy.CommonProxy;
import com.sugar.sugardesertmod.tab.CreativeTabsSugarD;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(modid = SugarDesertMod.MOD_ID,name = SugarDesertMod.MOD_NAME,version = SugarDesertMod.MOD_VERSION,
	updateJSON = "https://raw.githubusercontent.com/soramame-cycles/sugar_desertmod/master/sugarD_updateChecker.json")
public class SugarDesertMod {
	public static final String MOD_ID = "sugard";
	public static final String MOD_NAME = "SugerDesertmod";
	public static final String MOD_VERSION = "1.7.0";

	public static CreativeTabsSugarD Tab_sugard = new CreativeTabsSugarD();



	@Instance(MOD_ID)
	public static SugarDesertMod instance;

	@SidedProxy(clientSide = "com.sugar.sugardesertmod.proxy.ClientProxy", serverSide = "com.sugar.sugardesertmod.proxy.CommonProxy")
	public static CommonProxy proxy;


	public static final Logger LOGGER = (Logger) LogManager.getLogger(MOD_ID);

	@Mod.EventHandler
	//最初に処理をしたいものをここにいれる
	public void preinit(FMLPreInitializationEvent event) {
		proxy.preinit(event);
	}

	@Mod.EventHandler
	//このjava自体をイベントとして扱うコード
	public void construct(FMLConstructionEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@Mod.EventHandler
	//preInitの次に読み込ませたいもの
	public void init(FMLInitializationEvent event) {
		proxy.init(event);

	}

	@SubscribeEvent
	//アイテム登録のイベント
	public void registerItems(RegistryEvent.Register<Item> event) {
		SugarDBlock.RegisterItemBlock(event);
		SugarDBlock.Sugar_stone_wall(event);
		SugarDTools.Bismuth_pickaxe(event);
		SugarDTools.Sugar_diamond_axe(event);
		SugarDTools.Sugar_diamond_hoe(event);
		SugarDTools.Sugar_diamond_pickaxe(event);
		SugarDTools.Sugar_diamond_shovel(event);
		SugarDTools.Sugar_diamond_sword(event);
		SDItem.RegisterItem(event);


	}

	@SubscribeEvent
	//blockの登録イベント
	public void registerBlocks(RegistryEvent.Register<Block> event) {

	}

	@SubscribeEvent
	//モデル登録のイベント
	@SideOnly(Side.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		SugarDBlock.RegistryItemblockModel(event);
		SugarDTools.Bismuth_pickaxeModel(event);
		SugarDTools.Sugar_diamond_axeModel(event);
		SugarDTools.Sugar_diamond_hoeModel(event);
		SugarDTools.Sugar_diamond_pickaxeModel(event);
		SugarDTools.Sugar_diamond_shovelModel(event);
		SugarDTools.Sugar_diamond_swordModel(event);
		SDItem.RegisterItemModel(event);
	}

	@SubscribeEvent
	//バイオーム
    public void registerBiomes(RegistryEvent.Register<Biome> event) {
		IForgeRegistry<Biome> registry = event.getRegistry();
		ModBiome.registerBiomes(registry);
	}

	@Mod.EventHandler
	//一番最後に処理したいもの
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}
