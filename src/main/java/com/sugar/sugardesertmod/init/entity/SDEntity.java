package com.sugar.sugardesertmod.init.entity;

import com.sugar.sugardesertmod.SugarDesertMod;
import com.sugar.sugardesertmod.entity.EntityCowramel;
import com.sugar.sugardesertmod.entity.EntityDing;
import com.sugar.sugardesertmod.gen.biome.ModBiome;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class SDEntity {

	public static void entityRegister() {
		/**ResourceLocation = */
		/**registryName = 登録する名前*/
		/**entityClass = mobのクラス*/
		/**entityName = mobの名前、スポーンエッグはここで指定した名前になる*/
		/**id = mobのID、かぶらないようにする*/
		/**Object mod = */
		/**int trackingRange = トラッキング(MOBの探知)の範囲*/
		/**int updateFrequency = 更新頻度(tickごと)*/
		/**boolean sendsVelocityUpdates = 速度情報の有無*/
		/**int eggPrimary = スポーンエッグの色*/
		/**int eggSecondary = 模様部分*/
		EntityRegistry.registerModEntity(/*ResourceLocation*/ new ResourceLocation(SugarDesertMod.MOD_ID,/*registryName*/ "ding") ,/*entityClass*/ EntityDing.class, /*entityName*/ "Ding", /*id*/ 0, /*Object mod*/ SugarDesertMod.instance,/*int trackingRange*/ 60, /*int updateFrequency*/ 5,/*boolean sendsVelocityUpdates*/ false, /*int eggPrimary*/ 16776960,/*int eggSecondary*/ 11403055);
		EntityRegistry.registerModEntity(new ResourceLocation(SugarDesertMod.MOD_ID,"cowramel"),EntityCowramel.class,"Cowramel", /*id*/ 1,SugarDesertMod.instance,60,5,false, /*int eggPrimary=スポーンエッグの色*/ 13072945,/*int eggSecondary*/ 7882260);
	}

	public static void addSpawn() {
		EntityRegistry.addSpawn(EntityDing.class, 60, 1, 4, EnumCreatureType.CREATURE, ModBiome.PuddingPlain);
		EntityRegistry.addSpawn(EntityCowramel.class, 60, 1, 4, EnumCreatureType.CREATURE, ModBiome.PuddingPlain);
	}
}
