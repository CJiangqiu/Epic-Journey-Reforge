package net.ejr.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.ejr.block.model.GrinderDisplayModel;
import net.ejr.block.display.GrinderDisplayItem;

public class GrinderDisplayItemRenderer extends GeoItemRenderer<GrinderDisplayItem> {
	public GrinderDisplayItemRenderer() {
		super(new GrinderDisplayModel());
	}

	@Override
	public RenderType getRenderType(GrinderDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
