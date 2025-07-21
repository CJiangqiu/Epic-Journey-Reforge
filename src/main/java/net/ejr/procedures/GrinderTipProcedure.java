package net.ejr.procedures;

import net.minecraft.network.chat.Component;

public class GrinderTipProcedure {
	public static String execute() {
		return Component.translatable("gui.tip.need_redstone").getString() + "";
	}
}
