package net.ejr.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.ejr.init.EjrModBlockEntities;
import net.ejr.block.renderer.GrinderTileRenderer;
import net.ejr.EjrMod;

@Mod.EventBusSubscriber(modid = EjrMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(EjrModBlockEntities.GRINDER.get(), context -> new GrinderTileRenderer());
	}
}
