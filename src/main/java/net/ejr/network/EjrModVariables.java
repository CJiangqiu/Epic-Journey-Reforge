package net.ejr.network;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EjrModVariables {
	public static com.google.gson.JsonArray GRINDER_RECIPES_ARRAY = new com.google.gson.JsonArray();

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
	}
}
