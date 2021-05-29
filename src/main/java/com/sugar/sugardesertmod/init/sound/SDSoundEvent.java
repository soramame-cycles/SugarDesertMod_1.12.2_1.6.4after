package com.sugar.sugardesertmod.init.sound;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = SugarDesertMod.MOD_ID)
public class SDSoundEvent {

	//Ding
	public static final SoundEvent Entity_Ding_Ambient = createEvent("entity.ding.ambient");
	public static final SoundEvent Entity_Ding_Hurt = createEvent("entity.ding.hurt");
	public static final SoundEvent Entity_Ding_Death = createEvent("entity.ding.death");
	public static final SoundEvent Entity_Ding_Step = createEvent("entity.ding.step");
	public static final SoundEvent Entity_Cowramel_Ambient = createEvent("entity.cowramel.ambient");
	public static final SoundEvent Entity_Cowramel_Hurt = createEvent("entity.cowramel.hurt");
	public static final SoundEvent Entity_Cowramel_Death = createEvent("entity.cowramel.death");
	public static final SoundEvent Entity_Cowramel_Step = createEvent("entity.cowramel.step");
	public static final SoundEvent Entity_Cowramel_Milk = createEvent("entity.cowramel.milk");

	private static SoundEvent createEvent(String sound) {
		ResourceLocation name = new ResourceLocation(SugarDesertMod.MOD_ID,sound);
		return new SoundEvent(name).setRegistryName(name);

	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		event.getRegistry().registerAll(
				Entity_Ding_Ambient,
				Entity_Ding_Hurt,
				Entity_Ding_Death,
				Entity_Ding_Step,
				Entity_Cowramel_Ambient,
				Entity_Cowramel_Hurt,
				Entity_Cowramel_Death,
				Entity_Cowramel_Step,
				Entity_Cowramel_Milk
				);
	}

	public SDSoundEvent(){

	}
}
