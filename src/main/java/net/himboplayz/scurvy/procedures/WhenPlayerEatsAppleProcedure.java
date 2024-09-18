package net.himboplayz.scurvy.procedures;

import net.minecraft.world.entity.Entity;

import net.himboplayz.scurvy.network.ScurvyModVariables;

public class WhenPlayerEatsAppleProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 0;
			entity.getCapability(ScurvyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.scurvyTimer = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 0;
			entity.getCapability(ScurvyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.symptomTimer = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
