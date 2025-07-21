
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ejr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.ejr.block.SteelBlockBlock;
import net.ejr.block.SilverOreBlock;
import net.ejr.block.SilverBlockBlock;
import net.ejr.block.RawSilverBlockBlock;
import net.ejr.block.GrinderBlock;
import net.ejr.EjrMod;

public class EjrModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EjrMod.MODID);
	public static final RegistryObject<Block> GRINDER = REGISTRY.register("grinder", () -> new GrinderBlock());
	public static final RegistryObject<Block> SILVER_ORE = REGISTRY.register("silver_ore", () -> new SilverOreBlock());
	public static final RegistryObject<Block> SILVER_BLOCK = REGISTRY.register("silver_block", () -> new SilverBlockBlock());
	public static final RegistryObject<Block> STEEL_BLOCK = REGISTRY.register("steel_block", () -> new SteelBlockBlock());
	public static final RegistryObject<Block> RAW_SILVER_BLOCK = REGISTRY.register("raw_silver_block", () -> new RawSilverBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
