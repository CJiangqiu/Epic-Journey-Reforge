
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ejr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.ejr.EjrMod;

public class EjrModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EjrMod.MODID);
	public static final RegistryObject<CreativeModeTab> EPIC_JOURNEY_REFORGE = REGISTRY.register("epic_journey_reforge",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ejr.epic_journey_reforge")).icon(() -> new ItemStack(EjrModItems.STEEL_INGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EjrModItems.STEEL_INGOT.get());
			}).withSearchBar().build());
}
