package com.sugar.sugardesertmod.init.block;

import com.sugar.sugardesertmod.blocks.BlockBismuthCrystalBlock;
import com.sugar.sugardesertmod.blocks.BlockBismuthOre;
import com.sugar.sugardesertmod.blocks.CaramelSauce;
import com.sugar.sugardesertmod.blocks.CookieBlock;
import com.sugar.sugardesertmod.blocks.EndSugarStone;
import com.sugar.sugardesertmod.blocks.IceCandyBlock;
import com.sugar.sugardesertmod.blocks.LitRawSugarBlock;
import com.sugar.sugardesertmod.blocks.MoistSugarBlock;
import com.sugar.sugardesertmod.blocks.PuddingBlock;
import com.sugar.sugardesertmod.blocks.RawSugarBlock;
import com.sugar.sugardesertmod.blocks.RottenFleshBlock;
import com.sugar.sugardesertmod.blocks.SugarBlock;
import com.sugar.sugardesertmod.blocks.SugarCandy;
import com.sugar.sugardesertmod.blocks.SugarCobblestone;
import com.sugar.sugardesertmod.blocks.SugarDiamondBlock;
import com.sugar.sugardesertmod.blocks.SugarDiamondOre;
import com.sugar.sugardesertmod.blocks.SugarFence;
import com.sugar.sugardesertmod.blocks.SugarLeaves;
import com.sugar.sugardesertmod.blocks.SugarLog;
import com.sugar.sugardesertmod.blocks.SugarPane;
import com.sugar.sugardesertmod.blocks.SugarPillar;
import com.sugar.sugardesertmod.blocks.SugarPlanks;
import com.sugar.sugardesertmod.blocks.SugarPlanksButton;
import com.sugar.sugardesertmod.blocks.SugarPlanksStairs;
import com.sugar.sugardesertmod.blocks.SugarPlanks_slab;
import com.sugar.sugardesertmod.blocks.SugarSapling;
import com.sugar.sugardesertmod.blocks.SugarStone;
import com.sugar.sugardesertmod.blocks.SugarStoneButton;
import com.sugar.sugardesertmod.blocks.SugarStoneStairs;
import com.sugar.sugardesertmod.blocks.SugarStoneWall;
import com.sugar.sugardesertmod.blocks.SugarTorch;
import com.sugar.sugardesertmod.blocks.SugarTrapDoor;
import com.sugar.sugardesertmod.blocks.Sugar_slab;
import com.sugar.sugardesertmod.blocks.Sugarbricks;
import com.sugar.sugardesertmod.blocks.Sugarbricksslab;
import com.sugar.sugardesertmod.blocks.Sugarbricksstairs;
import com.sugar.sugardesertmod.blocks.Sugarcobslab;
import com.sugar.sugardesertmod.blocks.Sugarcobstairs;
import com.sugar.sugardesertmod.blocks.Sugarrack;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SugarDBlock {

	public static Block Bismuth_Ore;
	public static Block Bismuth_crystal_block;
	public static Block Sugar_block;
	public static Block Sugar_stone;
	public static Block Sugar_pillar;
	public static Block Sugar_log;
	public static Block Sugar_planks;
	public static Block Sugar_planks_slab;
	public static Block Sugar_slab;
	public static Block Sugar_torch;
	public static Block Sugar_candy;
	public static Block Sugar_fence;
	public static Block Sugar_diamond_ore;
	public static Block Sugar_diamond_block;
	public static Block Rotten_flesh_block;
	public static Block Sugar_cobblestone;
	public static Block Sugarrack;
	public static Block End_sugar_stone;
	public static Block Sugar_stone_stairs;
	public static Block Sugar_planks_stairs;
	public static Block Sugar_stone_wall;
	public static Block Sugar_leaves;
	public static Block Sugar_sapling;
	public static Block Sugar_trapdoor;
	public static Block Sugar_bricks;
	public static Block Sugar_pane;
	public static Block Caramel_sauce;
	public static Block Pudding_block;
	public static Block Sugar_bricks_slab;
	public static Block Sugar_bricks_stairs;
	public static Block Sugar_cob_slab;
	public static Block Sugar_cob_stairs;
	public static Block Sugar_planks_button;
	public static Block Sugar_stone_button;
	public static Block Cookie_block;
	public static Block Raw_sugar_block;
	public static Block Moist_sugar_block;
	public static Block IceCandy_block;
	public static Block IceCandy_block1;
	public static Block IceCandy_block2;
	public static Block IceCandy_block3;
	public static Block IceCandy_block4;
	public static Block IceCandy_block5;
	public static Block IceCandy_block6;
	public static Block IceCandy_block7;
	public static Block IceCandy_block8;
	public static Block IceCandy_block9;
	public static Block IceCandy_block10;
	public static Block IceCandy_block11;
	public static Block IceCandy_block12;
	public static Block IceCandy_block13;
	public static Block IceCandy_block14;
	public static Block IceCandy_block15;
	public static Block Lit_raw_sugar_block;

	public static void RegisterItemBlock(RegistryEvent.Register<Item> event) {
		Bismuth_Ore = new BlockBismuthOre();
		Bismuth_crystal_block = new BlockBismuthCrystalBlock();
		Sugar_block = new SugarBlock();
		Sugar_stone = new SugarStone();
		Sugar_pillar = new SugarPillar();
		Sugar_log = new SugarLog();/**CHANGED 1.4 change blockclass blockLog*/
		Sugar_planks = new SugarPlanks();
		Sugar_planks_slab = new SugarPlanks_slab();
		Sugar_slab = new Sugar_slab();
		Sugar_torch = new SugarTorch();
		Sugar_candy = new SugarCandy();
		Sugar_fence = new SugarFence();
		Sugar_diamond_ore = new SugarDiamondOre();
		Sugar_diamond_block = new SugarDiamondBlock();
		Rotten_flesh_block = new RottenFleshBlock();
		Sugar_cobblestone = new SugarCobblestone();
		Sugarrack = new Sugarrack();
		End_sugar_stone = new EndSugarStone();
		Sugar_stone_stairs = new SugarStoneStairs();
		Sugar_planks_stairs = new SugarPlanksStairs();
		Sugar_leaves = new SugarLeaves();
		Sugar_sapling = new SugarSapling();
		Sugar_trapdoor = new SugarTrapDoor();/**1.5*/
		Sugar_bricks = new Sugarbricks();
		Sugar_pane = new SugarPane();
		Caramel_sauce = new CaramelSauce();
		Pudding_block = new PuddingBlock();
		Sugar_bricks_slab = new Sugarbricksslab();
		Sugar_bricks_stairs = new Sugarbricksstairs();
		Sugar_cob_slab = new Sugarcobslab();
		Sugar_cob_stairs = new Sugarcobstairs();
		Sugar_planks_button = new SugarPlanksButton();/**1.6*/
		Sugar_stone_button = new SugarStoneButton();
		Cookie_block = new CookieBlock();/**1.6.4*/
		Raw_sugar_block = new RawSugarBlock();
		Moist_sugar_block = new MoistSugarBlock();
		IceCandy_block = new IceCandyBlock("white_icecandy_block");
		IceCandy_block1 = new IceCandyBlock("orange_icecandy_block");
		IceCandy_block2 = new IceCandyBlock("magenta_icecandy_block");
		IceCandy_block3 = new IceCandyBlock("light_blue_icecandy_block");
		IceCandy_block4 = new IceCandyBlock("yellow_icecandy_block");
		IceCandy_block5 = new IceCandyBlock("lime_icecandy_block");
		IceCandy_block6 = new IceCandyBlock("pink_icecandy_block");
		IceCandy_block7 = new IceCandyBlock("gray_icecandy_block");
		IceCandy_block8 = new IceCandyBlock("silver_icecandy_block");
		IceCandy_block9 = new IceCandyBlock("cyan_icecandy_block");
		IceCandy_block10 = new IceCandyBlock("purple_icecandy_block");
		IceCandy_block11 = new IceCandyBlock("blue_icecandy_block");
		IceCandy_block12 = new IceCandyBlock("brown_icecandy_block");
		IceCandy_block13 = new IceCandyBlock("green_icecandy_block");
		IceCandy_block14 = new IceCandyBlock("red_icecandy_block");
		IceCandy_block15 = new IceCandyBlock("black_icecandy_block");
		Lit_raw_sugar_block = new LitRawSugarBlock();

		event.getRegistry().register(new ItemBlock(Bismuth_Ore).setRegistryName("bismuth_ore"));
		event.getRegistry().register(new ItemBlock(Bismuth_crystal_block).setRegistryName("bismuth_crystal_block"));
		event.getRegistry().register(new ItemBlock(Sugar_block).setRegistryName("sugar_block"));
		event.getRegistry().register(new ItemBlock(Sugar_stone).setRegistryName("sugar_stone"));
		event.getRegistry().register(new ItemBlock(Sugar_pillar).setRegistryName("sugar_pillar"));
		event.getRegistry().register(new ItemBlock(Sugar_log).setRegistryName("sugar_log"));
		event.getRegistry().register(new ItemBlock(Sugar_planks).setRegistryName("sugar_planks"));
		event.getRegistry().register(new ItemBlock(Sugar_planks_slab).setRegistryName("sugar_planks_slab"));
		event.getRegistry().register(new ItemBlock(Sugar_slab).setRegistryName("sugar_slab"));
		event.getRegistry().register(new ItemBlock(Sugar_torch).setRegistryName("sugar_torch"));
		event.getRegistry().register(new ItemBlock(Sugar_candy).setRegistryName("sugar_candy"));
		event.getRegistry().register(new ItemBlock(Sugar_fence).setRegistryName("sugar_fence"));
		event.getRegistry().register(new ItemBlock(Sugar_diamond_ore).setRegistryName("sugar_diamond_ore"));
		event.getRegistry().register(new ItemBlock(Sugar_diamond_block).setRegistryName("sugar_diamond_block"));
		event.getRegistry().register(new ItemBlock(Rotten_flesh_block).setRegistryName("rotten_flesh_block"));
		event.getRegistry().register(new ItemBlock(Sugar_cobblestone).setRegistryName("sugar_cobblestone"));
		event.getRegistry().register(new ItemBlock(Sugarrack).setRegistryName("sugarrack"));
		event.getRegistry().register(new ItemBlock(End_sugar_stone).setRegistryName("end_sugar_stone"));
		event.getRegistry().register(new ItemBlock(Sugar_stone_stairs).setRegistryName("sugar_stone_stairs"));
		event.getRegistry().register(new ItemBlock(Sugar_planks_stairs).setRegistryName("sugar_planks_stairs"));
		event.getRegistry().register(new ItemBlock(Sugar_leaves).setRegistryName("sugar_leaves"));
		event.getRegistry().register(new ItemBlock(Sugar_sapling).setRegistryName("sugar_sapling"));
		event.getRegistry().register(new ItemBlock(Sugar_trapdoor).setRegistryName("sugar_trapdoor"));
		event.getRegistry().register(new ItemBlock(Sugar_bricks).setRegistryName("sugar_bricks"));
		event.getRegistry().register(new ItemBlock(Sugar_pane).setRegistryName("sugar_pane"));
		event.getRegistry().register(new ItemBlock(Caramel_sauce).setRegistryName("caramel_sauce"));
		event.getRegistry().register(new ItemBlock(Pudding_block).setRegistryName("pudding_block"));
		event.getRegistry().register(new ItemBlock(Sugar_bricks_slab).setRegistryName("sugar_bricks_slab"));
		event.getRegistry().register(new ItemBlock(Sugar_bricks_stairs).setRegistryName("sugar_bricks_stairs"));
		event.getRegistry().register(new ItemBlock(Sugar_cob_slab).setRegistryName("sugar_cob_slab"));
		event.getRegistry().register(new ItemBlock(Sugar_cob_stairs).setRegistryName("sugar_cob_stairs"));
		event.getRegistry().register(new ItemBlock(Sugar_planks_button).setRegistryName("sugar_planks_button"));
		event.getRegistry().register(new ItemBlock(Sugar_stone_button).setRegistryName("sugar_stone_button"));
		event.getRegistry().register(new ItemBlock(Cookie_block).setRegistryName("cookie_block"));
		event.getRegistry().register(new ItemBlock(Raw_sugar_block).setRegistryName("raw_sugar_block"));
		event.getRegistry().register(new ItemBlock(Moist_sugar_block).setRegistryName("moist_sugar_block"));
		event.getRegistry().register(new ItemBlock(IceCandy_block).setRegistryName("white_icecandy_block"));
		event.getRegistry().register(new ItemBlock(IceCandy_block1).setRegistryName("orange_icecandy_block"));
		event.getRegistry().register(new ItemBlock(IceCandy_block2).setRegistryName("magenta_icecandy_block"));
		event.getRegistry().register(new ItemBlock(IceCandy_block3).setRegistryName("light_blue_icecandy_block"));
		event.getRegistry().register(new ItemBlock(IceCandy_block4).setRegistryName("yellow_icecandy_block"));
		event.getRegistry().register(new ItemBlock(IceCandy_block5).setRegistryName("lime_icecandy_block"));
		event.getRegistry().register(new ItemBlock(IceCandy_block6).setRegistryName("pink_icecandy_block"));
		event.getRegistry().register(new ItemBlock(IceCandy_block7).setRegistryName("gray_icecandy_block"));
		event.getRegistry().register(new ItemBlock(IceCandy_block8).setRegistryName("silver_icecandy_block"));
		event.getRegistry().register(new ItemBlock(IceCandy_block9).setRegistryName("cyan_icecandy_block"));
		event.getRegistry().register(new ItemBlock(IceCandy_block10).setRegistryName("purple_icecandy_block"));
		event.getRegistry().register(new ItemBlock(IceCandy_block11).setRegistryName("blue_icecandy_block"));
		event.getRegistry().register(new ItemBlock(IceCandy_block12).setRegistryName("brown_icecandy_block"));
		event.getRegistry().register(new ItemBlock(IceCandy_block13).setRegistryName("green_icecandy_block"));
		event.getRegistry().register(new ItemBlock(IceCandy_block14).setRegistryName("red_icecandy_block"));
		event.getRegistry().register(new ItemBlock(IceCandy_block15).setRegistryName("black_icecandy_block"));
		event.getRegistry().register(new ItemBlock(Lit_raw_sugar_block).setRegistryName("lit_raw_sugar_block"));


		ForgeRegistries.BLOCKS.register(Bismuth_Ore);
		ForgeRegistries.BLOCKS.register(Bismuth_crystal_block);
		ForgeRegistries.BLOCKS.register(Sugar_block);
		ForgeRegistries.BLOCKS.register(Sugar_stone);
		ForgeRegistries.BLOCKS.register(Sugar_pillar);
		ForgeRegistries.BLOCKS.register(Sugar_log);
		ForgeRegistries.BLOCKS.register(Sugar_planks);
		ForgeRegistries.BLOCKS.register(Sugar_planks_slab);
		ForgeRegistries.BLOCKS.register(Sugar_slab);
		ForgeRegistries.BLOCKS.register(Sugar_torch);
		ForgeRegistries.BLOCKS.register(Sugar_candy);
		ForgeRegistries.BLOCKS.register(Sugar_fence);
		ForgeRegistries.BLOCKS.register(Sugar_diamond_ore);
		ForgeRegistries.BLOCKS.register(Sugar_diamond_block);
		ForgeRegistries.BLOCKS.register(Rotten_flesh_block);
		ForgeRegistries.BLOCKS.register(Sugar_cobblestone);
		ForgeRegistries.BLOCKS.register(Sugarrack);
		ForgeRegistries.BLOCKS.register(End_sugar_stone);
		ForgeRegistries.BLOCKS.register(Sugar_stone_stairs);
		ForgeRegistries.BLOCKS.register(Sugar_planks_stairs);
		ForgeRegistries.BLOCKS.register(Sugar_leaves);
		ForgeRegistries.BLOCKS.register(Sugar_sapling);
		ForgeRegistries.BLOCKS.register(Sugar_trapdoor);
		ForgeRegistries.BLOCKS.register(Sugar_bricks);
		ForgeRegistries.BLOCKS.register(Sugar_pane);
		ForgeRegistries.BLOCKS.register(Caramel_sauce);
		ForgeRegistries.BLOCKS.register(Pudding_block);
		ForgeRegistries.BLOCKS.register(Sugar_bricks_slab);
		ForgeRegistries.BLOCKS.register(Sugar_bricks_stairs);
		ForgeRegistries.BLOCKS.register(Sugar_cob_slab);
		ForgeRegistries.BLOCKS.register(Sugar_cob_stairs);
		ForgeRegistries.BLOCKS.register(Sugar_planks_button);
		ForgeRegistries.BLOCKS.register(Sugar_stone_button);
		ForgeRegistries.BLOCKS.register(Cookie_block);
		ForgeRegistries.BLOCKS.register(Raw_sugar_block);
		ForgeRegistries.BLOCKS.register(Moist_sugar_block);
		ForgeRegistries.BLOCKS.register(IceCandy_block);
		ForgeRegistries.BLOCKS.register(IceCandy_block1);
		ForgeRegistries.BLOCKS.register(IceCandy_block2);
		ForgeRegistries.BLOCKS.register(IceCandy_block3);
		ForgeRegistries.BLOCKS.register(IceCandy_block4);
		ForgeRegistries.BLOCKS.register(IceCandy_block5);
		ForgeRegistries.BLOCKS.register(IceCandy_block6);
		ForgeRegistries.BLOCKS.register(IceCandy_block7);
		ForgeRegistries.BLOCKS.register(IceCandy_block8);
		ForgeRegistries.BLOCKS.register(IceCandy_block9);
		ForgeRegistries.BLOCKS.register(IceCandy_block10);
		ForgeRegistries.BLOCKS.register(IceCandy_block11);
		ForgeRegistries.BLOCKS.register(IceCandy_block12);
		ForgeRegistries.BLOCKS.register(IceCandy_block13);
		ForgeRegistries.BLOCKS.register(IceCandy_block14);
		ForgeRegistries.BLOCKS.register(IceCandy_block15);
		ForgeRegistries.BLOCKS.register(Lit_raw_sugar_block);
	}
	//FIXME おそらくアイテムとブロック両方ともあるって状況っぽい？ガバやんけ
		public static void Sugar_stone_wall(RegistryEvent.Register<Item> event) {
			Sugar_stone_wall = new SugarStoneWall();
			event.getRegistry().register(new ItemBlock(Sugar_stone_wall).setRegistryName("sugar_stone_wall"));
			ForgeRegistries.BLOCKS.register(Sugar_stone_wall);
		}

	public static void RegistryItemblockModel(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Bismuth_Ore),0,
				new ModelResourceLocation("sugard:bismuth_ore"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Bismuth_crystal_block),0,
				new ModelResourceLocation("sugard:bismuth_crystal_block"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_block), 0,
				new ModelResourceLocation("sugard:sugar_block"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_stone), 0,
				new ModelResourceLocation("sugard:sugar_stone"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_pillar), 0,
				new ModelResourceLocation("sugard:sugar_pillar"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_log), 0,
				new ModelResourceLocation("sugard:sugar_log"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_planks), 0,
				new ModelResourceLocation("sugard:sugar_planks"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_planks_slab), 0,
				new ModelResourceLocation("sugard:sugar_planks_slab"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_slab), 0,
				new ModelResourceLocation("sugard:sugar_slab"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_torch), 0,
				new ModelResourceLocation("sugard:sugar_torch"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_candy), 0,
				new ModelResourceLocation("sugard:sugar_candy"));
		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_fence), 0,
				new ModelResourceLocation("sugard:sugar_fence"));
		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_diamond_ore), 0,
				new ModelResourceLocation("sugard:sugar_diamond_ore"));
		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_diamond_block), 0,
				new ModelResourceLocation("sugard:sugar_diamond_block"));
		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Rotten_flesh_block), 0,
				new ModelResourceLocation("sugard:rotten_flesh_block"));
		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_cobblestone), 0,
				new ModelResourceLocation("sugard:sugar_cobblestone"));
		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugarrack), 0,
				new ModelResourceLocation("sugard:sugarrack"));
		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(End_sugar_stone), 0,
				new ModelResourceLocation("sugard:end_sugar_stone"));
		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_stone_stairs), 0,
				new ModelResourceLocation("sugard:sugar_stone_stairs"));
		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_planks_stairs), 0,
				new ModelResourceLocation("sugard:sugar_planks_stairs"));
		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_stone_wall), 0,
				new ModelResourceLocation("sugard:sugar_stone_wall"));
		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_leaves), 0,
				new ModelResourceLocation("sugard:sugar_leaves"));
		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_sapling), 0,
				new ModelResourceLocation("sugard:sugar_sapling"));
		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_trapdoor), 0,
				new ModelResourceLocation("sugard:sugar_trapdoor"));
		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_bricks), 0,
				new ModelResourceLocation("sugard:sugar_bricks"));
		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_pane), 0,
				new ModelResourceLocation("sugard:sugar_pane"));
		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Caramel_sauce), 0,
				new ModelResourceLocation("sugard:caramel_sauce"));
		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Pudding_block), 0,
				new ModelResourceLocation("sugard:pudding_block"));
		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_bricks_slab), 0,
				new ModelResourceLocation("sugard:sugar_bricks_slab"));
		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_bricks_stairs), 0,
				new ModelResourceLocation("sugard:sugar_bricks_stairs"));
		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_cob_slab), 0,
				new ModelResourceLocation("sugard:sugar_cob_slab"));
		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_cob_stairs), 0,
				new ModelResourceLocation("sugard:sugar_cob_stairs"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_planks_button), 0,
				new ModelResourceLocation("sugard:sugar_planks_button"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_stone_button), 0,
				new ModelResourceLocation("sugard:sugar_stone_button"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Cookie_block), 0,
				new ModelResourceLocation("sugard:cookie_block"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Raw_sugar_block), 0,
				new ModelResourceLocation("sugard:raw_sugar_block"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Moist_sugar_block), 0,
				new ModelResourceLocation("sugard:moist_sugar_block"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IceCandy_block), 0,
				new ModelResourceLocation("sugard:white_icecandy_block"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IceCandy_block1), 0,
				new ModelResourceLocation("sugard:orange_icecandy_block"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IceCandy_block2), 0,
				new ModelResourceLocation("sugard:magenta_icecandy_block"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IceCandy_block3), 0,
				new ModelResourceLocation("sugard:light_blue_icecandy_block"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IceCandy_block4), 0,
				new ModelResourceLocation("sugard:yellow_icecandy_block"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IceCandy_block5), 0,
				new ModelResourceLocation("sugard:lime_icecandy_block"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IceCandy_block6), 0,
				new ModelResourceLocation("sugard:pink_icecandy_block"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IceCandy_block7), 0,
				new ModelResourceLocation("sugard:gray_icecandy_block"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IceCandy_block8), 0,
				new ModelResourceLocation("sugard:silver_icecandy_block"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IceCandy_block9), 0,
				new ModelResourceLocation("sugard:cyan_icecandy_block"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IceCandy_block10), 0,
				new ModelResourceLocation("sugard:purple_icecandy_block"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IceCandy_block11), 0,
				new ModelResourceLocation("sugard:blue_icecandy_block"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IceCandy_block12), 0,
				new ModelResourceLocation("sugard:brown_icecandy_block"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IceCandy_block13), 0,
				new ModelResourceLocation("sugard:green_icecandy_block"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IceCandy_block14), 0,
				new ModelResourceLocation("sugard:red_icecandy_block"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IceCandy_block15), 0,
				new ModelResourceLocation("sugard:black_icecandy_block"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Lit_raw_sugar_block), 0,
				new ModelResourceLocation("sugard:lit_raw_sugar_block"));
	}

}
