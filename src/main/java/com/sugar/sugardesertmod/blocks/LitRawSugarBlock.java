package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LitRawSugarBlock extends Block {

	public LitRawSugarBlock() {
		super(Material.ROCK);
		this.setHardness(2.0F);
		this.setResistance(100.0F);
		this.setHarvestLevel("pickaxe", 1);
		this.setRegistryName("lit_raw_sugar_block");
		this.setUnlocalizedName("lit_raw_sugar_block");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.setLightLevel(1.0F);
	}

	public LitRawSugarBlock(Material materialIn) {
		super(materialIn);
	}

	@Override
	public boolean isFireSource(World world, BlockPos pos, EnumFacing side) {
		return true;
	}

}
