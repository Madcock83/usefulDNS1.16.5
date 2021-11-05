package net.mcreator.usefuldns.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.usefuldns.UsefuldnsMod;

import java.util.Map;

public class BatteryPlayerStartsToDestroyProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency entity for procedure BatteryPlayerStartsToDestroy!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Destroying block will lose all saved energy"), (false));
		}
	}
}
