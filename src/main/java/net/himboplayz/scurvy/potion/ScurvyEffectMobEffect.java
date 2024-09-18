
package net.himboplayz.scurvy.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.himboplayz.scurvy.procedures.ScurvyEffectOnEffectActiveTickProcedure;

public class ScurvyEffectMobEffect extends MobEffect {
	public ScurvyEffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -8519680);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ScurvyEffectOnEffectActiveTickProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
