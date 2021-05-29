package com.sugar.sugardesertmod.entity;

import com.sugar.sugardesertmod.SugarDesertMod;
import com.sugar.sugardesertmod.init.item.SDItem;
import com.sugar.sugardesertmod.init.sound.SDSoundEvent;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityDing extends EntityAnimal {

	private boolean PartyUltimateDanceDing;//略してP.U.D.Ding
	public int timeUntilNextAzuki;
	public int dropCount;

	private static final DataParameter<Boolean> PUDDING = EntityDataManager.<Boolean>createKey(EntityDing.class, DataSerializers.BOOLEAN);

	public EntityDing(World worldIn) {
		super(worldIn);
		super.setSize(1.0F, 0.7F);
	}

	protected void initEntityAI() {
		this.tasks.addTask(0,  new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
		this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
		this.tasks.addTask(3, new EntityAITempt(this, 1.25D,SDItem.Pudding , false));
		this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
		this.tasks.addTask(5, new EntityAIWanderAvoidWater(this, 1.0D));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(7, new EntityAILookIdle(this));
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}
	//Dingが発する音
	@Override
	protected SoundEvent getAmbientSound() {
		return SDSoundEvent.Entity_Ding_Ambient;
	}
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SDSoundEvent.Entity_Ding_Hurt;
	}
	@Override
	protected SoundEvent getDeathSound() {
		return SDSoundEvent.Entity_Ding_Death;
	}
	@Override
	protected void playStepSound(BlockPos pos, Block blockIn) {
		this.playSound(SDSoundEvent.Entity_Ding_Step, 0.15F, 1.0F);
	}

	//子供をつくるメソッド
	@Override
	public EntityDing createChild(EntityAgeable ageable) {
		return new EntityDing(this.world);
	}

	@Override
	public boolean isBreedingItem(ItemStack stack) {
		return stack.getItem() == SDItem.Pudding;

	}

	@Override
	public float getEyeHeight() {
		return this.height*1.3F;

	}
	protected ResourceLocation getLootTable() {
		return new ResourceLocation(SugarDesertMod.MOD_ID,"entities/ding");

	}

	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand) {
		ItemStack itemstack = player.getHeldItem(hand);

		if(itemstack.getItem() == SDItem.Sugar_diamond && !this.isChild()) {
			if (!player.capabilities.isCreativeMode) {
				itemstack.shrink(1);
			}
			if(!world.isRemote) {
				PartyUltimateDanceDing = true;
				this.setPUDDING(true);
			}
			return true;
		}
		else{
			return super.processInteract(player, hand);
		}
	}
	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();

		int dancingCount = rand.nextInt(30)+2;

		if(!this.world.isRemote && PartyUltimateDanceDing == true && --this.timeUntilNextAzuki <= 0) {
			for (dropCount = 0; dropCount < dancingCount; dropCount++) {
				this.dropItem(SDItem.Azuki_been, 1);
			}
			this.timeUntilNextAzuki = 200 + rand.nextInt(200);
		}
		else if(!this.world.isRemote && PartyUltimateDanceDing == true) {
			for (int i = 0; i < 20; ++i) {
				this.world.spawnParticle(EnumParticleTypes.REDSTONE,
						this.posX + (this.rand.nextDouble() - 0.5D) * (double) this.width,
						this.posY + this.rand.nextDouble() * (double) this.height - 0.05D,
						this.posZ + (this.rand.nextDouble() - 0.5D) * (double) this.width,
						(this.rand.nextDouble() - 0.5D) * 2.0D, -this.rand.nextDouble(),
						(this.rand.nextDouble() - 0.5D) * 2.0D);
			}
		}

		if (PartyUltimateDanceDing == true && dropCount == dancingCount) {
			this.PartyUltimateDanceDing = false;
			this.setPUDDING(false);
			SugarDesertMod.LOGGER.info("drop azuki");
		}

	}
	@Override
	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.PartyUltimateDanceDing = compound.getBoolean("IsPartyUltimateDanceDing");

		if(compound.hasKey("TimeNextAzuki")) {
			this.timeUntilNextAzuki = compound.getInteger("TimeNextAzuki");
		}
	}
	@Override
	public void writeEntityToNBT(NBTTagCompound compound) {
		super.writeEntityToNBT(compound);
		compound.setBoolean("IsPartyUltimateDanceDing",this.PartyUltimateDanceDing);
		compound.setInteger("TimeNextAzuki", this.timeUntilNextAzuki);
	}
	@Override
	protected void entityInit() {
		super.entityInit();
		this.getDataManager().register(PUDDING, Boolean.valueOf(false));
	}

	public void setPUDDING(boolean pudding) {
		this.getDataManager().set(PUDDING, Boolean.valueOf(pudding));
	}
	@SideOnly(Side.CLIENT)
	public boolean isPUDDING() {
		return ((Boolean)this.getDataManager().get(PUDDING)).booleanValue();
	}

}
