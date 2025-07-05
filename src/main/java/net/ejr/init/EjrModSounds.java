
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ejr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.ejr.EjrMod;

public class EjrModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, EjrMod.MODID);
	public static final RegistryObject<SoundEvent> GRINDER = REGISTRY.register("grinder", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ejr", "grinder")));
}
