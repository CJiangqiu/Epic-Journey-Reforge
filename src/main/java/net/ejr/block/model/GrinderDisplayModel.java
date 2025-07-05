package net.ejr.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ejr.block.display.GrinderDisplayItem;

public class GrinderDisplayModel extends GeoModel<GrinderDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GrinderDisplayItem animatable) {
		return new ResourceLocation("ejr", "animations/grinder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GrinderDisplayItem animatable) {
		return new ResourceLocation("ejr", "geo/grinder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GrinderDisplayItem entity) {
		return new ResourceLocation("ejr", "textures/block/grinder.png");
	}
}
