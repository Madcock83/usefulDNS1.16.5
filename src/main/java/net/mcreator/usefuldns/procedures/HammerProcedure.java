package net.mcreator.usefuldns.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.block.Block;

import net.mcreator.usefuldns.UsefuldnsMod;

import java.util.Map;

public class HammerProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency entity for procedure Hammer!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency x for procedure Hammer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency y for procedure Hammer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency z for procedure Hammer!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency world for procedure Hammer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((entity.rotationYaw) > 315) && ((entity.rotationYaw) < 360)) || (((entity.rotationYaw) > 0) && ((entity.rotationYaw) < 45)))) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) (y + 1), (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) (y - 1), (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)), (World) world,
							new BlockPos((int) (x - 1), (int) (y - 1), (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) (y - 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)), (World) world,
							new BlockPos((int) (x - 1), (int) (y - 1), (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)), (World) world,
							new BlockPos((int) (x + 1), (int) (y - 1), (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)), (World) world,
							new BlockPos((int) (x + 1), (int) (y + 1), (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), (World) world,
							new BlockPos((int) (x + 1), (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), (World) world,
							new BlockPos((int) (x - 1), (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) z), false);
				}
			}
		}
		if ((((entity.rotationYaw) > 135) && ((entity.rotationYaw) < 225))) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) (y + 1), (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) (y - 1), (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)), (World) world,
							new BlockPos((int) (x - 1), (int) (y - 1), (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) (y - 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)), (World) world,
							new BlockPos((int) (x - 1), (int) (y - 1), (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)), (World) world,
							new BlockPos((int) (x + 1), (int) (y - 1), (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)), (World) world,
							new BlockPos((int) (x + 1), (int) (y + 1), (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), (World) world,
							new BlockPos((int) (x + 1), (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), (World) world,
							new BlockPos((int) (x - 1), (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) z), false);
				}
			}
		}
		if ((((entity.rotationYaw) > 225) && ((entity.rotationYaw) < 315))) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) (y + 1), (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) (y - 1), (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))), (World) world,
							new BlockPos((int) x, (int) (y - 1), (int) (z - 1)));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))), (World) world,
							new BlockPos((int) x, (int) (y + 1), (int) (z - 1)));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))), (World) world,
							new BlockPos((int) x, (int) (y - 1), (int) (z + 1)));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))), (World) world,
							new BlockPos((int) x, (int) (y + 1), (int) (z + 1)));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) (z + 1)));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) (z - 1)));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), false);
				}
			}
		}
		if ((((entity.rotationYaw) > 45) && ((entity.rotationYaw) < 135))) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) (y + 1), (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) (y - 1), (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))), (World) world,
							new BlockPos((int) x, (int) (y - 1), (int) (z - 1)));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))), (World) world,
							new BlockPos((int) x, (int) (y + 1), (int) (z - 1)));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))), (World) world,
							new BlockPos((int) x, (int) (y - 1), (int) (z + 1)));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))), (World) world,
							new BlockPos((int) x, (int) (y + 1), (int) (z + 1)));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) (z + 1)));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getHarvestLevel()) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getHarvestLevel()) < 4))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) (z - 1)));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), false);
				}
			}
		}
	}
}
