package com.sugar.sugardesertmod.tools;

import com.sugar.sugardesertmod.init.item.SDItem;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class SugarDiamondSword extends ItemSword {

	public SugarDiamondSword(ToolMaterial material) {
		super(material);
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == SDItem.Sugar_diamond;
	}

}
