
package net.ejr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SteelPlateItem extends Item {
	public SteelPlateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
