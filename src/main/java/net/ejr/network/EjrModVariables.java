package net.ejr.network;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.io.File;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EjrModVariables {
	public static com.google.gson.JsonArray GRINDER_RECIPES_ARRAY = new com.google.gson.JsonArray();
	public static File MODPACK_GRINDER_RECIPES = new File("");
	public static com.google.gson.JsonObject MODPACK_GRINDER_RECIPES_OBJECT = new com.google.gson.JsonObject();

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
	}
}
