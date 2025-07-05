package net.ejr.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class EpicJourneyMeachineConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_MEACHINE_SOUNDS;
	static {
		ENABLE_MEACHINE_SOUNDS = BUILDER.comment("Allow machines in the mod to play sounds while working.").define("Enable Machine Sounds", true);

		SPEC = BUILDER.build();
	}

}
