
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ejr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.ejr.item.SteelRodItem;
import net.ejr.item.SteelPlateItem;
import net.ejr.item.SteelIngotItem;
import net.ejr.item.SteelHarmerItem;
import net.ejr.item.SteelArmorItem;
import net.ejr.item.ScrollItem;
import net.ejr.item.GoldDustItem;
import net.ejr.item.BitItem;
import net.ejr.block.display.GrinderDisplayItem;
import net.ejr.EjrMod;

public class EjrModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EjrMod.MODID);
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> SCROLL = REGISTRY.register("scroll", () -> new ScrollItem());
	public static final RegistryObject<Item> STEEL_ARMOR_HELMET = REGISTRY.register("steel_armor_helmet", () -> new SteelArmorItem.Helmet());
	public static final RegistryObject<Item> STEEL_ARMOR_CHESTPLATE = REGISTRY.register("steel_armor_chestplate", () -> new SteelArmorItem.Chestplate());
	public static final RegistryObject<Item> STEEL_ARMOR_LEGGINGS = REGISTRY.register("steel_armor_leggings", () -> new SteelArmorItem.Leggings());
	public static final RegistryObject<Item> STEEL_ARMOR_BOOTS = REGISTRY.register("steel_armor_boots", () -> new SteelArmorItem.Boots());
	public static final RegistryObject<Item> STEEL_ROD = REGISTRY.register("steel_rod", () -> new SteelRodItem());
	public static final RegistryObject<Item> STEEL_HARMER = REGISTRY.register("steel_harmer", () -> new SteelHarmerItem());
	public static final RegistryObject<Item> STEEL_PLATE = REGISTRY.register("steel_plate", () -> new SteelPlateItem());
	public static final RegistryObject<Item> BIT = REGISTRY.register("bit", () -> new BitItem());
	public static final RegistryObject<Item> GRINDER = REGISTRY.register(EjrModBlocks.GRINDER.getId().getPath(), () -> new GrinderDisplayItem(EjrModBlocks.GRINDER.get(), new Item.Properties()));
	public static final RegistryObject<Item> GOLD_DUST = REGISTRY.register("gold_dust", () -> new GoldDustItem());
	// Start of user code block custom items
	// End of user code block custom items
}
