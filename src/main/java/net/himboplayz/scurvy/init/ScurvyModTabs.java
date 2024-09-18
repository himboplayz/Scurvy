
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.himboplayz.scurvy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.himboplayz.scurvy.ScurvyMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ScurvyModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ScurvyMod.MODID);
	public static final RegistryObject<CreativeModeTab> SCURVY_TAB = REGISTRY.register("scurvy_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.scurvy.scurvy_tab")).icon(() -> new ItemStack(ScurvyModItems.SCURVY_ICON.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ScurvyModItems.ENRICHED_KELP.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(ScurvyModItems.WE_GOT_SCURVY.get());
		}
	}
}
