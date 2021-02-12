package com.sugar.sugardesertmod.tools;

import com.sugar.sugardesertmod.init.item.SDItem;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class SugarDiamondAxe extends ItemAxe {

	public SugarDiamondAxe(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == SDItem.Sugar_diamond;
	}

}
