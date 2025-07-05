package net.ejr.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ejr.block.entity.GrinderTileEntity;

public class GrinderBlockModel extends GeoModel<GrinderTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GrinderTileEntity animatable) {
		return new ResourceLocation("ejr", "animations/grinder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GrinderTileEntity animatable) {
		return new ResourceLocation("ejr", "geo/grinder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GrinderTileEntity animatable) {
		return new ResourceLocation("ejr", "textures/block/grinder.png");
	}
}
