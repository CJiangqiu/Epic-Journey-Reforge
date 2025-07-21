package net.ejr.procedures;

import net.minecraft.world.item.ItemStack;

public class BowUseEndProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putDouble("pulling", 0);
		itemstack.getOrCreateTag().putDouble("pulling_time", 0);
	}
}
