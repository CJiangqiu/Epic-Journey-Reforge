package net.ejr.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.ejr.block.model.GrinderBlockModel;
import net.ejr.block.entity.GrinderTileEntity;

public class GrinderTileRenderer extends GeoBlockRenderer<GrinderTileEntity> {
	public GrinderTileRenderer() {
		super(new GrinderBlockModel());
	}

	@Override
	public RenderType getRenderType(GrinderTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
