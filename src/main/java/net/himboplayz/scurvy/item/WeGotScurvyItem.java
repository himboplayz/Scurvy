
package net.himboplayz.scurvy.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class WeGotScurvyItem extends RecordItem {
	public WeGotScurvyItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("scurvy:wegotscurvymusic")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1180);
	}
}
