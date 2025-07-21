package net.ejr.procedures;

import net.minecraft.world.item.ItemStack;

public class PullingHelperProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("pulling");
	}
}
