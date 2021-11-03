package net.mcreator.usefuldns.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.block.Blocks;

import net.mcreator.usefuldns.UsefuldnsMod;

import java.util.Map;

public class DecabloUpdateTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency x for procedure DecabloUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency y for procedure DecabloUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency z for procedure DecabloUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency world for procedure DecabloUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((world instanceof World) ? ((World) world).isBlockPowered(new BlockPos((int) x, (int) y, (int) z)) : false) == (true))
				&& (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.SOUL_CAMPFIRE)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.ENCHANTING_TABLE)))) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).addEntity(new ExperienceOrbEntity(((World) world), (x + 0.5), (y + 2), (z + 0.5), (int) 10));
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).addEntity(new ExperienceOrbEntity(((World) world), (x + 0.5), (y + 2), (z + 0.5), (int) 10));
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).addEntity(new ExperienceOrbEntity(((World) world), (x + 0.5), (y + 2), (z + 0.5), (int) 10));
			}
		}
	}
}
