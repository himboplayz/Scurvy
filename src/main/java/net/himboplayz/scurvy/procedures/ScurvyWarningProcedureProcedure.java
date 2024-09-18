package net.himboplayz.scurvy.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.himboplayz.scurvy.network.ScurvyModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ScurvyWarningProcedureProcedure {
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
		if ((entity.getCapability(ScurvyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ScurvyModVariables.PlayerVariables())).scurvyTimer == 100) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You feel the effects of scurvy..."), true);
		}
	}
}
