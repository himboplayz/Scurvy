
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.himboplayz.scurvy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.himboplayz.scurvy.ScurvyMod;

public class ScurvyModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ScurvyMod.MODID);
	public static final RegistryObject<SoundEvent> WEGOTSCURVYMUSIC = REGISTRY.register("wegotscurvymusic", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("scurvy", "wegotscurvymusic")));
	public static final RegistryObject<SoundEvent> WEGOTSCURVYWARNINGSOUND = REGISTRY.register("wegotscurvywarningsound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("scurvy", "wegotscurvywarningsound")));
}
