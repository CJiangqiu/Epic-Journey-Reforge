package net.ejr.procedures;

import net.minecraft.world.level.LevelAccessor;

public class GrinderTipHelperProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (HasRedstoneUpDownProcedure.execute(world, x, y, z) == true) {
			return false;
		}
		return true;
	}
}
