package net.himboplayz.scurvy.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.himboplayz.scurvy.network.ScurvyModVariables;
import net.himboplayz.scurvy.init.ScurvyModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ScurvyCountdownProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(ScurvyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ScurvyModVariables.PlayerVariables())).scurvyTimer > 336000) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ScurvyModMobEffects.SCURVY_EFFECT.get(), 5, 0));
		} else {
			{
				double _setval = (entity.getCapability(ScurvyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ScurvyModVariables.PlayerVariables())).scurvyTimer + 1;
				entity.getCapability(ScurvyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.scurvyTimer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
