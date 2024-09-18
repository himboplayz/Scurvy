package net.himboplayz.scurvy.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

import net.himboplayz.scurvy.network.ScurvyModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ScurvySymptomCountdownProcedure {
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
		if ((entity.getCapability(ScurvyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ScurvyModVariables.PlayerVariables())).symptomTimer == 312000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You feel the effects of scurvy..."), true);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 100, 0));
		} else {
			{
				double _setval = (entity.getCapability(ScurvyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ScurvyModVariables.PlayerVariables())).scurvyTimer + 1;
				entity.getCapability(ScurvyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.symptomTimer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
