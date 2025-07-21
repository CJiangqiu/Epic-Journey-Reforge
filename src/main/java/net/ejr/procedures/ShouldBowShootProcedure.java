package net.ejr.procedures;

import net.minecraft.world.item.ItemStack;

public class ShouldBowShootProcedure {
	public static boolean execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("pulling") > 0) {
			return true;
		}
		return false;
	}
}
