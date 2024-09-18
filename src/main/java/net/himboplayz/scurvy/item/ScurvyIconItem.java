
package net.himboplayz.scurvy.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ScurvyIconItem extends Item {
	public ScurvyIconItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
