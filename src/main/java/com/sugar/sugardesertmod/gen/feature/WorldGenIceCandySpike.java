package com.sugar.sugardesertmod.gen.feature;

import java.util.ArrayList;
import java.util.Random;

import com.sugar.sugardesertmod.init.block.SugarDBlock;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenIceCandySpike extends WorldGenerator {

	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		/**入れ替えする用のリストを作成*/
		ArrayList<IBlockState> ice_color = new ArrayList<IBlockState>();

		ice_color.add(SugarDBlock.IceCandy_block.getDefaultState());
		ice_color.add(SugarDBlock.IceCandy_block1.getDefaultState());
		ice_color.add(SugarDBlock.IceCandy_block2.getDefaultState());
		ice_color.add(SugarDBlock.IceCandy_block3.getDefaultState());
		ice_color.add(SugarDBlock.IceCandy_block4.getDefaultState());
		ice_color.add(SugarDBlock.IceCandy_block5.getDefaultState());
		ice_color.add(SugarDBlock.IceCandy_block6.getDefaultState());
		ice_color.add(SugarDBlock.IceCandy_block7.getDefaultState());
		ice_color.add(SugarDBlock.IceCandy_block8.getDefaultState());
		ice_color.add(SugarDBlock.IceCandy_block9.getDefaultState());
		ice_color.add(SugarDBlock.IceCandy_block10.getDefaultState());
		ice_color.add(SugarDBlock.IceCandy_block11.getDefaultState());
		ice_color.add(SugarDBlock.IceCandy_block12.getDefaultState());
		ice_color.add(SugarDBlock.IceCandy_block13.getDefaultState());
		ice_color.add(SugarDBlock.IceCandy_block14.getDefaultState());
		ice_color.add(SugarDBlock.IceCandy_block15.getDefaultState());

		/**numberに0~15のランダムな数字を代入
		 * color_stateにnumber番目のカラーのブロックを代入
		 * */
		int number = new Random().nextInt(ice_color.size());
		IBlockState color_state = ice_color.get(number);

		//空気ブロックかつ高度が2以上の時に下に生成を続ける
		while (worldIn.isAirBlock(position) && position.getY() > 2) {
			position = position.down();
		}
		//下のブロックが雪ブロックの時に生成を止める
		if (worldIn.getBlockState(position).getBlock() != Blocks.SNOW) {
			return false;
		}
		else {
			position = position.up(rand.nextInt(4));
			//i=標準の柱,j=柱のよこ幅
			int i = rand.nextInt(4) + 7;
			int j = i / 4 + rand.nextInt(2);

			if (j > 1 && rand.nextInt(60) == 0) {
				position = position.up(10 + rand.nextInt(30));
			}

			for (int k = 0; k < i; ++k) {
				float f = (1.0F - (float)k / (float)i) * (float)j;
				int l = MathHelper.ceil(f);

				for (int i1 = -l; i1 <= l; ++i1) {
					float f1 = (float)MathHelper.abs(i1) - 0.25F;

					for (int j1 = -l; j1 <= l; ++j1) {
						float f2 = (float)MathHelper.abs(j1) - 0.25F;

						if ((i1 == 0 && j1 == 0 || f1 * f1 + f2 * f2 <= f * f) && (i1 != -l && i1 != l && j1 != -l && j1 != l || rand.nextFloat() <= 0.75F)) {
							IBlockState iblockstate = worldIn.getBlockState(position.add(i1, k, j1));
							Block block = iblockstate.getBlock();

							if (iblockstate.getBlock().isAir(iblockstate, worldIn, position.add(i1, k, j1)) || block == Blocks.DIRT || block == Blocks.SNOW || block == Blocks.ICE) {

								//(IBlockState) color_stateでブロックを切り替えてるつもり
								this.setBlockAndNotifyAdequately(worldIn, position, color_state);
							}

							if (k != 0 && l > 1) {
								iblockstate = worldIn.getBlockState(position.add(i1, -k, j1));
								block = iblockstate.getBlock();

								if (iblockstate.getBlock().isAir(iblockstate, worldIn, position.add(i1, -k, j1)) || block == Blocks.DIRT || block == Blocks.SNOW || block == Blocks.ICE) {
									this.setBlockAndNotifyAdequately(worldIn, position,color_state);
								}
							}

						}
					}
				}
			}

			int k1 = j - 1;

			if (k1 < 0){
				k1 = 0;
			}
			else if (k1 > 1){
				k1 = 1;
			}

			for (int l1 = -k1; l1 <= k1; ++l1){
				for (int i2 = -k1; i2 <= k1; ++i2){
					BlockPos blockpos = position.add(l1, -1, i2);
					int j2 = 50;

					if (Math.abs(l1) == 1 && Math.abs(i2) == 1){
						j2 = rand.nextInt(5);
					}

					while (blockpos.getY() > 50){
						IBlockState iblockstate1 = worldIn.getBlockState(blockpos);
						Block block1 = iblockstate1.getBlock();

						if (!iblockstate1.getBlock().isAir(iblockstate1, worldIn, blockpos) && block1 != Blocks.DIRT && block1 != Blocks.SNOW && block1 != Blocks.ICE &&
								block1 != SugarDBlock.IceCandy_block && block1 != SugarDBlock.IceCandy_block1 && block1 != SugarDBlock.IceCandy_block2 &&
								block1 != SugarDBlock.IceCandy_block3 && block1 != SugarDBlock.IceCandy_block4 && block1 != SugarDBlock.IceCandy_block5 &&
								block1 != SugarDBlock.IceCandy_block6 && block1 != SugarDBlock.IceCandy_block7 && block1 != SugarDBlock.IceCandy_block8 &&
								block1 != SugarDBlock.IceCandy_block9 && block1 != SugarDBlock.IceCandy_block10 && block1 != SugarDBlock.IceCandy_block11 &&
								block1 != SugarDBlock.IceCandy_block12 && block1 != SugarDBlock.IceCandy_block13 && block1 != SugarDBlock.IceCandy_block14 &&
								block1 != SugarDBlock.IceCandy_block15){
							break;
						}

						/**
						 * this.setBlockAndNotifyAdequately(worldIn, position, (IBlockState) color_state);
						 * this.setBlockAndNotifyAdequately(worldIn, blockpos, (IBlockState) color_state);
						 * positionとblockposを間違えないように。私は間違えた*/
						this.setBlockAndNotifyAdequately(worldIn, blockpos,color_state);
						blockpos = blockpos.down();
						--j2;

						if (j2 <= 0){
							blockpos = blockpos.down(rand.nextInt(5) + 1);
							j2 = rand.nextInt(5);
						}
					}
				}
			}
		}

		return true;
	}

}
