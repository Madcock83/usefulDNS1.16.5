package net.mcreator.usefuldns.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.state.Property;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.usefuldns.UsefuldnsMod;

import java.util.Map;

public class PlacefillblockdownProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency x for procedure Placefillblockdown!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency y for procedure Placefillblockdown!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency z for procedure Placefillblockdown!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency world for procedure Placefillblockdown!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) (z - 1)))).getBlock() == Blocks.LAVA)
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) (z - 1)))).getBlock() == Blocks.LAVA))
				|| (((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) (z - 1)))).getBlock() == Blocks.BUBBLE_COLUMN)
						|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) (z - 1)))).getBlock() == Blocks.WATER)))
				|| ((((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) (z - 1)))).getBlock() == Blocks.AIR)
						|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) (z - 1)))).getBlock() == Blocks.CAVE_AIR))
						|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) (z - 1)))).getBlock() == Blocks.WATER)))) {
			{
				BlockPos _bp = new BlockPos((int) (x - 2), (int) (y - 2), (int) (z - 1));
				BlockState _bs = Blocks.GLASS.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if ((((((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) (z + 1)))).getBlock() == Blocks.LAVA)
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) (z + 1)))).getBlock() == Blocks.LAVA))
				|| (((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) (z + 1)))).getBlock() == Blocks.BUBBLE_COLUMN)
						|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) (z + 1)))).getBlock() == Blocks.WATER)))
				|| ((((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) (z + 1)))).getBlock() == Blocks.AIR)
						|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) (z + 1)))).getBlock() == Blocks.CAVE_AIR))
						|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) (z + 1)))).getBlock() == Blocks.WATER)))) {
			{
				BlockPos _bp = new BlockPos((int) (x - 2), (int) (y - 2), (int) (z + 1));
				BlockState _bs = Blocks.GLASS.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if ((((((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) z))).getBlock() == Blocks.LAVA)
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) z))).getBlock() == Blocks.LAVA))
				|| (((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) z))).getBlock() == Blocks.BUBBLE_COLUMN)
						|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) z))).getBlock() == Blocks.WATER)))
				|| ((((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) z))).getBlock() == Blocks.AIR)
						|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) z))).getBlock() == Blocks.CAVE_AIR))
						|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) z))).getBlock() == Blocks.WATER)))) {
			{
				BlockPos _bp = new BlockPos((int) (x - 2), (int) (y - 2), (int) z);
				BlockState _bs = Blocks.GLASS.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if ((((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z + 2)))).getBlock() == Blocks.LAVA)
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z + 2)))).getBlock() == Blocks.LAVA))
				|| (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z + 2)))).getBlock() == Blocks.BUBBLE_COLUMN)
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z + 2)))).getBlock() == Blocks.WATER)))
				|| ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z + 2)))).getBlock() == Blocks.AIR)
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z + 2)))).getBlock() == Blocks.CAVE_AIR))
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z + 2)))).getBlock() == Blocks.WATER)))) {
			{
				BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 2), (int) (z + 2));
				BlockState _bs = Blocks.GLASS.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if ((((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z + 2)))).getBlock() == Blocks.LAVA)
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z + 2)))).getBlock() == Blocks.LAVA))
				|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z + 2)))).getBlock() == Blocks.BUBBLE_COLUMN)
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z + 2)))).getBlock() == Blocks.WATER)))
				|| ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z + 2)))).getBlock() == Blocks.AIR)
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z + 2)))).getBlock() == Blocks.CAVE_AIR))
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z + 2)))).getBlock() == Blocks.WATER)))) {
			{
				BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 2), (int) (z + 2));
				BlockState _bs = Blocks.GLASS.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if ((((((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 2)))).getBlock() == Blocks.LAVA)
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 2)))).getBlock() == Blocks.LAVA))
				|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 2)))).getBlock() == Blocks.BUBBLE_COLUMN)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 2)))).getBlock() == Blocks.WATER)))
				|| ((((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 2)))).getBlock() == Blocks.AIR)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 2)))).getBlock() == Blocks.CAVE_AIR))
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 2)))).getBlock() == Blocks.WATER)))) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) (y - 2), (int) (z + 2));
				BlockState _bs = Blocks.GLASS.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if ((((((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) (z - 1)))).getBlock() == Blocks.LAVA)
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) (z - 1)))).getBlock() == Blocks.LAVA))
				|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) (z - 1)))).getBlock() == Blocks.BUBBLE_COLUMN)
						|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) (z - 1)))).getBlock() == Blocks.WATER)))
				|| ((((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) (z - 1)))).getBlock() == Blocks.AIR)
						|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) (z - 1)))).getBlock() == Blocks.CAVE_AIR))
						|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) (z - 1)))).getBlock() == Blocks.WATER)))) {
			{
				BlockPos _bp = new BlockPos((int) (x + 2), (int) (y - 2), (int) (z - 1));
				BlockState _bs = Blocks.GLASS.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if ((((((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) (z + 1)))).getBlock() == Blocks.LAVA)
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) (z + 1)))).getBlock() == Blocks.LAVA))
				|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) (z + 1)))).getBlock() == Blocks.BUBBLE_COLUMN)
						|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) (z + 1)))).getBlock() == Blocks.WATER)))
				|| ((((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) (z + 1)))).getBlock() == Blocks.AIR)
						|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) (z + 1)))).getBlock() == Blocks.CAVE_AIR))
						|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) (z + 1)))).getBlock() == Blocks.WATER)))) {
			{
				BlockPos _bp = new BlockPos((int) (x + 2), (int) (y - 2), (int) (z + 1));
				BlockState _bs = Blocks.GLASS.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if ((((((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) z))).getBlock() == Blocks.LAVA)
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) z))).getBlock() == Blocks.LAVA))
				|| (((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) z))).getBlock() == Blocks.BUBBLE_COLUMN)
						|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) z))).getBlock() == Blocks.WATER)))
				|| ((((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) z))).getBlock() == Blocks.AIR)
						|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) z))).getBlock() == Blocks.CAVE_AIR))
						|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) z))).getBlock() == Blocks.WATER)))) {
			{
				BlockPos _bp = new BlockPos((int) (x + 2), (int) (y - 2), (int) z);
				BlockState _bs = Blocks.GLASS.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if ((((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z - 2)))).getBlock() == Blocks.LAVA)
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z - 2)))).getBlock() == Blocks.LAVA))
				|| (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z - 2)))).getBlock() == Blocks.BUBBLE_COLUMN)
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z - 2)))).getBlock() == Blocks.WATER)))
				|| ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z - 2)))).getBlock() == Blocks.AIR)
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z - 2)))).getBlock() == Blocks.CAVE_AIR))
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z - 2)))).getBlock() == Blocks.WATER)))) {
			{
				BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 2), (int) (z - 2));
				BlockState _bs = Blocks.GLASS.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if ((((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - 2)))).getBlock() == Blocks.LAVA)
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - 2)))).getBlock() == Blocks.LAVA))
				|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - 2)))).getBlock() == Blocks.BUBBLE_COLUMN)
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - 2)))).getBlock() == Blocks.WATER)))
				|| ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - 2)))).getBlock() == Blocks.AIR)
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - 2)))).getBlock() == Blocks.CAVE_AIR))
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - 2)))).getBlock() == Blocks.WATER)))) {
			{
				BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - 2));
				BlockState _bs = Blocks.GLASS.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if ((((((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 2)))).getBlock() == Blocks.LAVA)
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 2)))).getBlock() == Blocks.LAVA))
				|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 2)))).getBlock() == Blocks.BUBBLE_COLUMN)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 2)))).getBlock() == Blocks.WATER)))
				|| ((((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 2)))).getBlock() == Blocks.AIR)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 2)))).getBlock() == Blocks.CAVE_AIR))
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 2)))).getBlock() == Blocks.WATER)))) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) (y - 2), (int) (z - 2));
				BlockState _bs = Blocks.GLASS.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
	}
}
