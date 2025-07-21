package net.ejr.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.IoSupplier;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.PackResources;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.ejr.network.EjrModVariables;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

import java.io.InputStream;
import java.io.File;

import com.ibm.icu.util.Output;

@Mod.EventBusSubscriber
public class InitCustomRecipeTypeProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		com.google.gson.JsonObject empty_object = new com.google.gson.JsonObject();
		File empty_file = new File("");
		EjrModVariables.GRINDER_RECIPES_ARRAY = new com.google.gson.JsonArray();
		{
			if (world instanceof ServerLevel srvlvl_) {
				class Output implements PackResources.ResourceOutput {
					private List<com.google.gson.JsonObject> jsonObjects;
					private PackResources packResources;

					public Output(List<com.google.gson.JsonObject> jsonObjects) {
						this.jsonObjects = jsonObjects;
					}

					public void setPackResources(PackResources packResources) {
						this.packResources = packResources;
					}

					@Override
					public void accept(ResourceLocation resourceLocation, IoSupplier<InputStream> ioSupplier) {
						try {
							com.google.gson.JsonObject jsonObject = new com.google.gson.Gson()
									.fromJson(new java.io.BufferedReader(new java.io.InputStreamReader(ioSupplier.get(), java.nio.charset.StandardCharsets.UTF_8)).lines().collect(Collectors.joining("\n")), com.google.gson.JsonObject.class);
							this.jsonObjects.add(jsonObject);
						} catch (Exception e) {
						}
					}
				}
				List<com.google.gson.JsonObject> jsons = new ArrayList<>();
				Output output = new Output(jsons);
				ResourceManager rm = srvlvl_.getServer().getResourceManager();
				rm.listPacks().forEach(resource -> {
					output.setPackResources(resource);
					resource.listResources(PackType.SERVER_DATA, "ejr", "grinder_recipes", output);
				});
				for (com.google.gson.JsonObject jsoniterator : jsons) {
					EjrModVariables.GRINDER_RECIPES_ARRAY.add(jsoniterator);
				}
			}
		}
	}
}
