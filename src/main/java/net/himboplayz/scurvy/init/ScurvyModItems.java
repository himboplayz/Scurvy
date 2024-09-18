
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.himboplayz.scurvy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.himboplayz.scurvy.item.WeGotScurvyItem;
import net.himboplayz.scurvy.item.ScurvyIconItem;
import net.himboplayz.scurvy.item.EnrichedKelpItem;
import net.himboplayz.scurvy.ScurvyMod;

public class ScurvyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ScurvyMod.MODID);
	public static final RegistryObject<Item> WE_GOT_SCURVY = REGISTRY.register("we_got_scurvy", () -> new WeGotScurvyItem());
	public static final RegistryObject<Item> ENRICHED_KELP = REGISTRY.register("enriched_kelp", () -> new EnrichedKelpItem());
	public static final RegistryObject<Item> SCURVY_ICON = REGISTRY.register("scurvy_icon", () -> new ScurvyIconItem());
	// Start of user code block custom items
	// End of user code block custom items
}
