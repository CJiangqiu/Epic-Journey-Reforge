package net.ejr.init;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.ejr.configuration.EpicJourneyMeachineConfiguration;
import net.ejr.EjrMod;

@Mod.EventBusSubscriber(modid = EjrMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EjrModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, EpicJourneyMeachineConfiguration.SPEC, "Epic Journey Reforge-Meachines.toml");
		});
	}
}
