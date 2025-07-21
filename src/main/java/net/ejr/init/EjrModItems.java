
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ejr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.ejr.procedures.PullingHelperProcedure;
import net.ejr.item.SteelSwordItem;
import net.ejr.item.SteelShovelItem;
import net.ejr.item.SteelRodItem;
import net.ejr.item.SteelPlateItem;
import net.ejr.item.SteelPickaxeItem;
import net.ejr.item.SteelIngotItem;
import net.ejr.item.SteelHoeItem;
import net.ejr.item.SteelHarmerItem;
import net.ejr.item.SteelBowItem;
import net.ejr.item.SteelAxeItem;
import net.ejr.item.SteelArmorItem;
import net.ejr.item.SilverIngotItem;
import net.ejr.item.SilverDustItem;
import net.ejr.item.ScrollItem;
import net.ejr.item.RawSilverItem;
import net.ejr.item.GoldSilverMixedDustItem;
import net.ejr.item.GoldDustItem;
import net.ejr.item.BlackCopperSwordItem;
import net.ejr.item.BlackCopperShovelItem;
import net.ejr.item.BlackCopperPickaxeItem;
import net.ejr.item.BlackCopperIngotUpgradeSmithingTemplateItem;
import net.ejr.item.BlackCopperIngotItem;
import net.ejr.item.BlackCopperHoeItem;
import net.ejr.item.BlackCopperBowItem;
import net.ejr.item.BlackCopperAxeItem;
import net.ejr.item.BlackCopperArmorItem;
import net.ejr.item.BitItem;
import net.ejr.block.display.GrinderDisplayItem;
import net.ejr.EjrMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
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
	public static final RegistryObject<Item> STEEL_PICKAXE = REGISTRY.register("steel_pickaxe", () -> new SteelPickaxeItem());
	public static final RegistryObject<Item> STEEL_AXE = REGISTRY.register("steel_axe", () -> new SteelAxeItem());
	public static final RegistryObject<Item> STEEL_SWORD = REGISTRY.register("steel_sword", () -> new SteelSwordItem());
	public static final RegistryObject<Item> STEEL_SHOVEL = REGISTRY.register("steel_shovel", () -> new SteelShovelItem());
	public static final RegistryObject<Item> STEEL_HOE = REGISTRY.register("steel_hoe", () -> new SteelHoeItem());
	public static final RegistryObject<Item> SILVER_INGOT = REGISTRY.register("silver_ingot", () -> new SilverIngotItem());
	public static final RegistryObject<Item> SILVER_ORE = block(EjrModBlocks.SILVER_ORE);
	public static final RegistryObject<Item> SILVER_BLOCK = block(EjrModBlocks.SILVER_BLOCK);
	public static final RegistryObject<Item> STEEL_BLOCK = block(EjrModBlocks.STEEL_BLOCK);
	public static final RegistryObject<Item> SILVER_DUST = REGISTRY.register("silver_dust", () -> new SilverDustItem());
	public static final RegistryObject<Item> RAW_SILVER = REGISTRY.register("raw_silver", () -> new RawSilverItem());
	public static final RegistryObject<Item> STEEL_BOW = REGISTRY.register("steel_bow", () -> new SteelBowItem());
	public static final RegistryObject<Item> GOLD_SILVER_MIXED_DUST = REGISTRY.register("gold_silver_mixed_dust", () -> new GoldSilverMixedDustItem());
	public static final RegistryObject<Item> RAW_SILVER_BLOCK = block(EjrModBlocks.RAW_SILVER_BLOCK);
	public static final RegistryObject<Item> BLACK_COPPER_INGOT_UPGRADE_SMITHING_TEMPLATE = REGISTRY.register("black_copper_ingot_upgrade_smithing_template", () -> new BlackCopperIngotUpgradeSmithingTemplateItem());
	public static final RegistryObject<Item> BLACK_COPPER_INGOT = REGISTRY.register("black_copper_ingot", () -> new BlackCopperIngotItem());
	public static final RegistryObject<Item> BLACK_COPPER_PICKAXE = REGISTRY.register("black_copper_pickaxe", () -> new BlackCopperPickaxeItem());
	public static final RegistryObject<Item> BLACK_COPPER_AXE = REGISTRY.register("black_copper_axe", () -> new BlackCopperAxeItem());
	public static final RegistryObject<Item> BLACK_COPPER_SWORD = REGISTRY.register("black_copper_sword", () -> new BlackCopperSwordItem());
	public static final RegistryObject<Item> BLACK_COPPER_SHOVEL = REGISTRY.register("black_copper_shovel", () -> new BlackCopperShovelItem());
	public static final RegistryObject<Item> BLACK_COPPER_HOE = REGISTRY.register("black_copper_hoe", () -> new BlackCopperHoeItem());
	public static final RegistryObject<Item> BLACK_COPPER_ARMOR_HELMET = REGISTRY.register("black_copper_armor_helmet", () -> new BlackCopperArmorItem.Helmet());
	public static final RegistryObject<Item> BLACK_COPPER_ARMOR_CHESTPLATE = REGISTRY.register("black_copper_armor_chestplate", () -> new BlackCopperArmorItem.Chestplate());
	public static final RegistryObject<Item> BLACK_COPPER_ARMOR_LEGGINGS = REGISTRY.register("black_copper_armor_leggings", () -> new BlackCopperArmorItem.Leggings());
	public static final RegistryObject<Item> BLACK_COPPER_ARMOR_BOOTS = REGISTRY.register("black_copper_armor_boots", () -> new BlackCopperArmorItem.Boots());
	public static final RegistryObject<Item> BLACK_COPPER_BOW = REGISTRY.register("black_copper_bow", () -> new BlackCopperBowItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(STEEL_BOW.get(), new ResourceLocation("ejr:steel_bow_pulling"), (itemStackToRender, clientWorld, entity, itemEntityId) -> (float) PullingHelperProcedure.execute(itemStackToRender));
			ItemProperties.register(BLACK_COPPER_BOW.get(), new ResourceLocation("ejr:black_copper_bow_pulling"), (itemStackToRender, clientWorld, entity, itemEntityId) -> (float) PullingHelperProcedure.execute(itemStackToRender));
		});
	}
}
