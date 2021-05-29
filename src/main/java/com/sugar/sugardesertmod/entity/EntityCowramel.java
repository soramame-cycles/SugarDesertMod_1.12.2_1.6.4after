package com.sugar.sugardesertmod.entity;

import com.sugar.sugardesertmod.SugarDesertMod;
import com.sugar.sugardesertmod.init.sound.SDSoundEvent;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityCowramel extends EntityCow {

	public EntityCowramel(World worldIn) {
		super(worldIn);
	}
	@Override
	public EntityCowramel createChild(EntityAgeable ageable){
		return new EntityCowramel(this.world);
	}
	@Override
	protected SoundEvent getAmbientSound(){
		return SDSoundEvent.Entity_Cowramel_Ambient;
	}
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn){
		return SDSoundEvent.Entity_Cowramel_Hurt;
	}
	@Override
	protected SoundEvent getDeathSound(){
		return SDSoundEvent.Entity_Cowramel_Death;
	}
	@Override
	protected void playStepSound(BlockPos pos, Block blockIn){
		this.playSound(SDSoundEvent.Entity_Cowramel_Step, 0.15F, 1.0F);
	}
	@Override
	protected ResourceLocation getLootTable() {
		return new ResourceLocation(SugarDesertMod.MOD_ID,"entities/cowramel");
	}
	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand){
		ItemStack itemstack = player.getHeldItem(hand);

		if (itemstack.getItem() == Items.BUCKET && !player.capabilities.isCreativeMode && !this.isChild()){
			player.playSound(SDSoundEvent.Entity_Cowramel_Milk, 1.0F, 1.0F);
			itemstack.shrink(1);

			if (itemstack.isEmpty()){
				player.setHeldItem(hand, new ItemStack(Items.MILK_BUCKET));
			}
			else if (!player.inventory.addItemStackToInventory(new ItemStack(Items.MILK_BUCKET))){
				player.dropItem(new ItemStack(Items.MILK_BUCKET), false);
			}

			return true;
		}
		else{
			return super.processInteract(player, hand);
		}
	}

}
