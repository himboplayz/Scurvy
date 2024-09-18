
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.himboplayz.scurvy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.himboplayz.scurvy.potion.ScurvyEffectMobEffect;
import net.himboplayz.scurvy.ScurvyMod;

public class ScurvyModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ScurvyMod.MODID);
	public static final RegistryObject<MobEffect> SCURVY_EFFECT = REGISTRY.register("scurvy_effect", () -> new ScurvyEffectMobEffect());
}
