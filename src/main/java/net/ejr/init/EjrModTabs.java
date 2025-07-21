
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
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ejr.epic_journey_reforge")).icon(() -> new ItemStack(EjrModItems.SCROLL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EjrModItems.SCROLL.get());
				tabData.accept(EjrModItems.STEEL_INGOT.get());
				tabData.accept(EjrModBlocks.STEEL_BLOCK.get().asItem());
				tabData.accept(EjrModItems.STEEL_ROD.get());
				tabData.accept(EjrModItems.STEEL_HARMER.get());
				tabData.accept(EjrModItems.STEEL_PLATE.get());
				tabData.accept(EjrModItems.STEEL_ARMOR_HELMET.get());
				tabData.accept(EjrModItems.STEEL_ARMOR_CHESTPLATE.get());
				tabData.accept(EjrModItems.STEEL_ARMOR_LEGGINGS.get());
				tabData.accept(EjrModItems.STEEL_ARMOR_BOOTS.get());
				tabData.accept(EjrModItems.STEEL_PICKAXE.get());
				tabData.accept(EjrModItems.STEEL_AXE.get());
				tabData.accept(EjrModItems.STEEL_SWORD.get());
				tabData.accept(EjrModItems.STEEL_SHOVEL.get());
				tabData.accept(EjrModItems.STEEL_HOE.get());
				tabData.accept(EjrModItems.STEEL_BOW.get());
				tabData.accept(EjrModItems.BIT.get());
				tabData.accept(EjrModBlocks.GRINDER.get().asItem());
				tabData.accept(EjrModItems.GOLD_DUST.get());
				tabData.accept(EjrModItems.SILVER_DUST.get());
				tabData.accept(EjrModItems.GOLD_SILVER_MIXED_DUST.get());
				tabData.accept(EjrModBlocks.SILVER_ORE.get().asItem());
				tabData.accept(EjrModItems.RAW_SILVER.get());
				tabData.accept(EjrModBlocks.RAW_SILVER_BLOCK.get().asItem());
				tabData.accept(EjrModItems.SILVER_INGOT.get());
				tabData.accept(EjrModBlocks.SILVER_BLOCK.get().asItem());
				tabData.accept(EjrModItems.BLACK_COPPER_INGOT_UPGRADE_SMITHING_TEMPLATE.get());
				tabData.accept(EjrModItems.BLACK_COPPER_INGOT.get());
				tabData.accept(EjrModItems.BLACK_COPPER_PICKAXE.get());
				tabData.accept(EjrModItems.BLACK_COPPER_AXE.get());
				tabData.accept(EjrModItems.BLACK_COPPER_SWORD.get());
				tabData.accept(EjrModItems.BLACK_COPPER_SHOVEL.get());
				tabData.accept(EjrModItems.BLACK_COPPER_HOE.get());
				tabData.accept(EjrModItems.BLACK_COPPER_ARMOR_HELMET.get());
				tabData.accept(EjrModItems.BLACK_COPPER_ARMOR_CHESTPLATE.get());
				tabData.accept(EjrModItems.BLACK_COPPER_ARMOR_LEGGINGS.get());
				tabData.accept(EjrModItems.BLACK_COPPER_ARMOR_BOOTS.get());
				tabData.accept(EjrModItems.BLACK_COPPER_BOW.get());
			}).withSearchBar().build());
}
