package net.mcreator.usefuldns.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.usefuldns.item.MadbuckItem;
import net.mcreator.usefuldns.block.UnobfurnaceBlock;
import net.mcreator.usefuldns.block.MadcrafterBlock;
import net.mcreator.usefuldns.block.AntimatterBlock;
import net.mcreator.usefuldns.UsefuldnsMod;

import java.util.Map;

public class AntimatterOnBlockRightClickedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency entity for procedure AntimatterOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency x for procedure AntimatterOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency y for procedure AntimatterOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency z for procedure AntimatterOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency world for procedure AntimatterOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == MadbuckItem.block)
				&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.AIR))) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("There is nothing under the Anti-Matter Producer."), (true));
			}
		} else {
			if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == MadbuckItem.block)
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == UnobfurnaceBlock.block))) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Nope, get your own Furnace. This is not allowed"), (true));
				}
			} else {
				if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == MadbuckItem.block)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == MadcrafterBlock.block))) {
					if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Craft your own crafter!!! This is not allowed"), (true));
					}
				} else {
					if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == MadbuckItem.block)
							&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == AntimatterBlock.block))) {
						if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Anti-Matter inceptions is not allowed!"), (true));
						}
					} else {
						if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == MadbuckItem.block)
								&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
										.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()))) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Something is blocking the reproduction"), (true));
							}
						} else {
							if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
									.getItem() == MadbuckItem.block)
									&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR))) {
								world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z),
										(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))), 3);
								if (entity instanceof PlayerEntity) {
									ItemStack _stktoremove = new ItemStack(MadbuckItem.block);
									((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
											((PlayerEntity) entity).container.func_234641_j_());
								}
							}
						}
					}
				}
			}
		}
	}
}
