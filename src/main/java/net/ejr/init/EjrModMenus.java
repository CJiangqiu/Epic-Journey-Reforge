
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.ejr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.ejr.world.inventory.GrinderGuiMenu;
import net.ejr.EjrMod;

public class EjrModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, EjrMod.MODID);
	public static final RegistryObject<MenuType<GrinderGuiMenu>> GRINDER_GUI = REGISTRY.register("grinder_gui", () -> IForgeMenuType.create(GrinderGuiMenu::new));
}
