package net.mcreator.usefuldns.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.usefuldns.item.ReinfdiaplaterItem;
import net.mcreator.usefuldns.item.QuinmbItem;
import net.mcreator.usefuldns.item.GoldeneosItem;
import net.mcreator.usefuldns.item.DiamondeosItem;
import net.mcreator.usefuldns.block.MadcrafterBlock;
import net.mcreator.usefuldns.block.CompressedcoalBlock;
import net.mcreator.usefuldns.UsefuldnsMod;

import java.util.function.Supplier;
import java.util.Map;

public class MadcrafterfurrecipeProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency entity for procedure Madcrafterfurrecipe!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			Container _current = ((PlayerEntity) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					ItemStack _setstack = new ItemStack(Blocks.CRAFTING_TABLE);
					_setstack.setCount((int) 1);
					((Slot) ((Map) invobj).get((int) (0))).putStack(_setstack);
					_current.detectAndSendChanges();
				}
			}
		}
		if (entity instanceof PlayerEntity) {
			Container _current = ((PlayerEntity) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					ItemStack _setstack = new ItemStack(DiamondeosItem.block);
					_setstack.setCount((int) 1);
					((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
					_current.detectAndSendChanges();
				}
			}
		}
		if (entity instanceof PlayerEntity) {
			Container _current = ((PlayerEntity) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					ItemStack _setstack = new ItemStack(Blocks.CRAFTING_TABLE);
					_setstack.setCount((int) 1);
					((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
					_current.detectAndSendChanges();
				}
			}
		}
		if (entity instanceof PlayerEntity) {
			Container _current = ((PlayerEntity) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					ItemStack _setstack = new ItemStack(ReinfdiaplaterItem.block);
					_setstack.setCount((int) 1);
					((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
					_current.detectAndSendChanges();
				}
			}
		}
		if (entity instanceof PlayerEntity) {
			Container _current = ((PlayerEntity) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					ItemStack _setstack = new ItemStack(QuinmbItem.block);
					_setstack.setCount((int) 1);
					((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
					_current.detectAndSendChanges();
				}
			}
		}
		if (entity instanceof PlayerEntity) {
			Container _current = ((PlayerEntity) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					ItemStack _setstack = new ItemStack(ReinfdiaplaterItem.block);
					_setstack.setCount((int) 1);
					((Slot) ((Map) invobj).get((int) (5))).putStack(_setstack);
					_current.detectAndSendChanges();
				}
			}
		}
		if (entity instanceof PlayerEntity) {
			Container _current = ((PlayerEntity) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					ItemStack _setstack = new ItemStack(Blocks.CRAFTING_TABLE);
					_setstack.setCount((int) 1);
					((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
					_current.detectAndSendChanges();
				}
			}
		}
		if (entity instanceof PlayerEntity) {
			Container _current = ((PlayerEntity) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					ItemStack _setstack = new ItemStack(GoldeneosItem.block);
					_setstack.setCount((int) 1);
					((Slot) ((Map) invobj).get((int) (7))).putStack(_setstack);
					_current.detectAndSendChanges();
				}
			}
		}
		if (entity instanceof PlayerEntity) {
			Container _current = ((PlayerEntity) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					ItemStack _setstack = new ItemStack(Blocks.CRAFTING_TABLE);
					_setstack.setCount((int) 1);
					((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
					_current.detectAndSendChanges();
				}
			}
		}
		if (entity instanceof PlayerEntity) {
			Container _current = ((PlayerEntity) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					ItemStack _setstack = new ItemStack(CompressedcoalBlock.block);
					_setstack.setCount((int) 1);
					((Slot) ((Map) invobj).get((int) (9))).putStack(_setstack);
					_current.detectAndSendChanges();
				}
			}
		}
		if (entity instanceof PlayerEntity) {
			Container _current = ((PlayerEntity) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					ItemStack _setstack = new ItemStack(MadcrafterBlock.block);
					_setstack.setCount((int) 1);
					((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
					_current.detectAndSendChanges();
				}
			}
		}
	}
}
