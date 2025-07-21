package net.ejr.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.ejr.init.EjrModItems;

public class BlackCopperBowUseProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entUseItem0 ? _entUseItem0.getUseItem() : ItemStack.EMPTY).getItem() == EjrModItems.BLACK_COPPER_BOW.get()) {
			if ((entity instanceof LivingEntity _entUseItem2 ? _entUseItem2.getUseItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("pulling") <= 4) {
				(entity instanceof LivingEntity _entUseItem6 ? _entUseItem6.getUseItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("pulling_time",
						((entity instanceof LivingEntity _entUseItem4 ? _entUseItem4.getUseItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("pulling_time") + 1));
				if ((entity instanceof LivingEntity _entUseItem8 ? _entUseItem8.getUseItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("pulling_time") == 5) {
					(entity instanceof LivingEntity _entUseItem12 ? _entUseItem12.getUseItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("pulling",
							((entity instanceof LivingEntity _entUseItem10 ? _entUseItem10.getUseItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("pulling") + 1));
					(entity instanceof LivingEntity _entUseItem14 ? _entUseItem14.getUseItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("pulling_time", 0);
				}
			}
		}
	}
}
