package net.mcreator.usefuldns.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.usefuldns.UsefuldnsMod;

import java.util.Map;

public class NightprocProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency x for procedure Nightproc!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency y for procedure Nightproc!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency z for procedure Nightproc!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency world for procedure Nightproc!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof ServerWorld) {
			((World) world).getServer().getCommandManager().handleCommand(new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z),
					Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
					"time set midnight");
		}
	}
}
