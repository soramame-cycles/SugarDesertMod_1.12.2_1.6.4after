package com.sugar.sugardesertmod.tools;

import com.sugar.sugardesertmod.init.item.SDItem;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class SugarDiamondShovel extends ItemSpade {

	public SugarDiamondShovel(ToolMaterial material) {
		super(material);
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == SDItem.Sugar_diamond;
	}

}
