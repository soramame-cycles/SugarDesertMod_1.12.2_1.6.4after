package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class IceCandyBlock extends Block{

	@SuppressWarnings("deprecation")
	public IceCandyBlock(String name) {
		super(Material.GLASS);
		this.setHardness(0.5F);
		this.setResistance(0.5F);
		this.setHarvestLevel("pickaxe", 0);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.setSoundType(SoundType.GLASS);
		this.setLightLevel(0.4F);
		this.slipperiness = 0.989F;
	}

}
