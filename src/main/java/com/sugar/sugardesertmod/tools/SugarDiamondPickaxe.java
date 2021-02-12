package com.sugar.sugardesertmod.tools;

import com.sugar.sugardesertmod.init.item.SDItem;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class SugarDiamondPickaxe extends ItemPickaxe{

	public SugarDiamondPickaxe(ToolMaterial material) {
		super(material);
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == SDItem.Sugar_diamond;
	}

}
