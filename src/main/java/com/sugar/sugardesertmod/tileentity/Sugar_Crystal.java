package com.sugar.sugardesertmod.tileentity;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Sugar_Crystal extends BlockContainer {

	protected Sugar_Crystal() {
		super(Material.ROCK);
		this.setHardness(0.5F);
		this.setResistance(0.5F);
		this.setHarvestLevel("pickaxe", 0);
		this.setRegistryName("sugar_crystal");
		this.setUnlocalizedName("sugar_crystal");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.setSoundType(SoundType.GLASS);
	}

	protected Sugar_Crystal(Material materialIn) {
		super(materialIn);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntitySugarCrystal();
	}

	/**やりたいこと、特定のブロックを持ってクリックするとExpが手に入る*/
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			//TileEntitySugarCrystal tesc = (TileEntitySugarCrystal) world.getTileEntity(pos);
			if (!player.isSneaking()) {
				if (player.getHeldItemMainhand().isEmpty()) {

				}
			}
		}

		return true;
	}

	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state) {
		super.breakBlock(world, pos, state);
	}

}
