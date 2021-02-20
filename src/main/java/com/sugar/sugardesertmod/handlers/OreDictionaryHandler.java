package com.sugar.sugardesertmod.handlers;

import com.sugar.sugardesertmod.init.block.SugarDBlock;
import com.sugar.sugardesertmod.init.item.SDItem;

public class OreDictionaryHandler {

	public static void registerOreDictionary() {
		/**Ores*/
		net.minecraftforge.oredict.OreDictionary.registerOre("oreSugarDiamond", SugarDBlock.Sugar_diamond_ore);
		net.minecraftforge.oredict.OreDictionary.registerOre("oreBismuth", SugarDBlock.Bismuth_Ore);
		net.minecraftforge.oredict.OreDictionary.registerOre("oreSugarrack", SugarDBlock.Sugarrack);
		net.minecraftforge.oredict.OreDictionary.registerOre("oreEndSugarStone", SugarDBlock.End_sugar_stone);
		/**Gems*/
		net.minecraftforge.oredict.OreDictionary.registerOre("gemSugarDiamond", SDItem.Sugar_diamond);
		net.minecraftforge.oredict.OreDictionary.registerOre("gemBismuth", SDItem.bismuth_crystal);
		/**Nuggets*/
		net.minecraftforge.oredict.OreDictionary.registerOre("nuggetSugarDiamond", SDItem.Sugar_diamond_nugget);
		/**Log*/
		net.minecraftforge.oredict.OreDictionary.registerOre("logWood", SugarDBlock.Sugar_log);
		net.minecraftforge.oredict.OreDictionary.registerOre("treeLeaves", SugarDBlock.Sugar_leaves);
		net.minecraftforge.oredict.OreDictionary.registerOre("treesapling", SugarDBlock.Sugar_sapling);
		net.minecraftforge.oredict.OreDictionary.registerOre("plankWood", SugarDBlock.Sugar_planks);
		net.minecraftforge.oredict.OreDictionary.registerOre("slabWood", SugarDBlock.Sugar_planks_slab);
		net.minecraftforge.oredict.OreDictionary.registerOre("stairWood", SugarDBlock.Sugar_planks_stairs);
		net.minecraftforge.oredict.OreDictionary.registerOre("fenceWood", SugarDBlock.Sugar_fence);
		/**Block*/
		net.minecraftforge.oredict.OreDictionary.registerOre("torch", SugarDBlock.Sugar_torch);
		net.minecraftforge.oredict.OreDictionary.registerOre("blockGlass", SugarDBlock.Sugar_candy);
		net.minecraftforge.oredict.OreDictionary.registerOre("paneGlass", SugarDBlock.Sugar_pane);
		/**Food*/
		net.minecraftforge.oredict.OreDictionary.registerOre("azuki", SDItem.Azuki_been);
		net.minecraftforge.oredict.OreDictionary.registerOre("anko", SDItem.Azuki_been_bun);
		net.minecraftforge.oredict.OreDictionary.registerOre("anpan", SDItem.Azuki_been_bun);
		net.minecraftforge.oredict.OreDictionary.registerOre("pudding", SDItem.Pudding);
		/**Dye*/
		net.minecraftforge.oredict.OreDictionary.registerOre("dyeWhite", SugarDBlock.IceCandy_block);
		net.minecraftforge.oredict.OreDictionary.registerOre("dyeOrange", SugarDBlock.IceCandy_block1);
		net.minecraftforge.oredict.OreDictionary.registerOre("dyeMagenta", SugarDBlock.IceCandy_block2);
		net.minecraftforge.oredict.OreDictionary.registerOre("dyeLightBlue", SugarDBlock.IceCandy_block3);
		net.minecraftforge.oredict.OreDictionary.registerOre("dyeYellow", SugarDBlock.IceCandy_block4);
		net.minecraftforge.oredict.OreDictionary.registerOre("dyeLime", SugarDBlock.IceCandy_block5);
		net.minecraftforge.oredict.OreDictionary.registerOre("dyePink", SugarDBlock.IceCandy_block6);
		net.minecraftforge.oredict.OreDictionary.registerOre("dyeGray", SugarDBlock.IceCandy_block7);
		net.minecraftforge.oredict.OreDictionary.registerOre("dyeLightGray", SugarDBlock.IceCandy_block8);
		net.minecraftforge.oredict.OreDictionary.registerOre("dyeCyan", SugarDBlock.IceCandy_block9);
		net.minecraftforge.oredict.OreDictionary.registerOre("dyePurple", SugarDBlock.IceCandy_block10);
		net.minecraftforge.oredict.OreDictionary.registerOre("dyeBlue", SugarDBlock.IceCandy_block11);
		net.minecraftforge.oredict.OreDictionary.registerOre("dyeBrown", SugarDBlock.IceCandy_block12);
		net.minecraftforge.oredict.OreDictionary.registerOre("dyeGreen", SugarDBlock.IceCandy_block13);
		net.minecraftforge.oredict.OreDictionary.registerOre("dyeRed", SugarDBlock.IceCandy_block14);
		net.minecraftforge.oredict.OreDictionary.registerOre("dyeBlack", SugarDBlock.IceCandy_block15);
	}
}
