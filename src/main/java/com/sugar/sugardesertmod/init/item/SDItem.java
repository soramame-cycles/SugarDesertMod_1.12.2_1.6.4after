package com.sugar.sugardesertmod.init.item;

import com.sugar.sugardesertmod.items.AZUKI_BEEN;
import com.sugar.sugardesertmod.items.AZUKI_BEEN_BUN;
import com.sugar.sugardesertmod.items.AZUKI_PASTE;
import com.sugar.sugardesertmod.items.BISMUTH_CRYSTAL;
import com.sugar.sugardesertmod.items.BISMUTH_LIQUID;
import com.sugar.sugardesertmod.items.CRUSH_SUGAR_CANE;
import com.sugar.sugardesertmod.items.POPPY_SEED;
import com.sugar.sugardesertmod.items.PUDDING;
import com.sugar.sugardesertmod.items.RAW_SUGAR;
import com.sugar.sugardesertmod.items.SUGAR_DIAMOND;
import com.sugar.sugardesertmod.items.SUGAR_DIAMOND_NUGGET;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SDItem {


	//Food
	public static Item Pudding;
	public static Item Azuki_been;
	public static Item Azuki_paste;
	public static Item Azuki_been_bun;
	public static Item Poppy_seed;
	public static Item Crushed_Sugar_Cane;
	public static Item Raw_Sugar;
	//Gem
	public static Item bismuth_crystal;
	public static Item bismuth_liquid;
	public static Item Sugar_diamond;
	public static Item Sugar_diamond_nugget;


	public static void RegisterItem(RegistryEvent.Register<Item> event) {
		Pudding = new PUDDING();
		Azuki_been = new AZUKI_BEEN();
		Azuki_paste = new AZUKI_PASTE();
		Azuki_been_bun = new AZUKI_BEEN_BUN();
		Poppy_seed = new POPPY_SEED();
		bismuth_crystal = new BISMUTH_CRYSTAL();
		bismuth_liquid = new BISMUTH_LIQUID();
		Sugar_diamond = new SUGAR_DIAMOND();
		Sugar_diamond_nugget = new SUGAR_DIAMOND_NUGGET();
		Crushed_Sugar_Cane = new CRUSH_SUGAR_CANE();/**1.6.4_start*/
		Raw_Sugar = new RAW_SUGAR();


		event.getRegistry().register(Pudding);
		event.getRegistry().register(Azuki_been);
		event.getRegistry().register(Azuki_paste);
		event.getRegistry().register(Azuki_been_bun);
		event.getRegistry().register(Poppy_seed);
		event.getRegistry().register(bismuth_crystal);
		event.getRegistry().register(bismuth_liquid);
		event.getRegistry().register(Sugar_diamond);
		event.getRegistry().register(Sugar_diamond_nugget);
		event.getRegistry().register(Crushed_Sugar_Cane);
		event.getRegistry().register(Raw_Sugar);


		ForgeRegistries.ITEMS.register(Pudding);
		ForgeRegistries.ITEMS.register(Azuki_been);
		ForgeRegistries.ITEMS.register(Azuki_paste);
		ForgeRegistries.ITEMS.register(Azuki_been_bun);
		ForgeRegistries.ITEMS.register(Poppy_seed);
		ForgeRegistries.ITEMS.register(bismuth_crystal);
		ForgeRegistries.ITEMS.register(bismuth_liquid);
		ForgeRegistries.ITEMS.register(Sugar_diamond);
		ForgeRegistries.ITEMS.register(Sugar_diamond_nugget);
		ForgeRegistries.ITEMS.register(Crushed_Sugar_Cane);
		ForgeRegistries.ITEMS.register(Raw_Sugar);


	}

	public static void RegisterItemModel(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Pudding, 0,
				new ModelResourceLocation("sugard:pudding"));
		ModelLoader.setCustomModelResourceLocation(Azuki_been, 0,
				new ModelResourceLocation("sugard:azuki_been"));
		ModelLoader.setCustomModelResourceLocation(Azuki_paste, 0,
				new ModelResourceLocation("sugard:azuki_paste"));
		ModelLoader.setCustomModelResourceLocation(Azuki_been_bun, 0,
				new ModelResourceLocation("sugard:azuki_been_bun"));
		ModelLoader.setCustomModelResourceLocation(Poppy_seed, 0,
				new ModelResourceLocation("sugard:poppy_seed"));
		ModelLoader.setCustomModelResourceLocation(bismuth_crystal, 0,
				new ModelResourceLocation("sugard:bismuth_crystal"));
		ModelLoader.setCustomModelResourceLocation(bismuth_liquid, 0,
				new ModelResourceLocation("sugard:bismuth_liquid"));
		ModelLoader.setCustomModelResourceLocation(Sugar_diamond, 0,
				new ModelResourceLocation("sugard:sugar_diamond"));
		ModelLoader.setCustomModelResourceLocation(Sugar_diamond_nugget, 0,
				new ModelResourceLocation("sugard:sugar_diamond_nugget"));
		ModelLoader.setCustomModelResourceLocation(Crushed_Sugar_Cane, 0,
				new ModelResourceLocation("sugard:crushed_sugar_cane"));
		ModelLoader.setCustomModelResourceLocation(Raw_Sugar, 0,
				new ModelResourceLocation("sugard:raw_sugar"));

	}
}
