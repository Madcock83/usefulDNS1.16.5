package net.mcreator.usefuldns.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.usefuldns.UsefuldnsMod;

import java.util.Map;

public class MadstaffRightClickedInAirProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency entity for procedure MadstaffRightClickedInAir!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency itemstack for procedure MadstaffRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(Items.ARROW)) : false)
				&& ((entity.isSneaking()) == (false)))) {
			if (entity instanceof LivingEntity) {
				Entity _ent = entity;
				if (!_ent.world.isRemote()) {
					ArrowEntity entityToSpawn = new ArrowEntity(_ent.world, (LivingEntity) entity);
					entityToSpawn.shoot(entity.getLookVec().x, entity.getLookVec().y, entity.getLookVec().z, (float) 100, 0);
					entityToSpawn.setDamage((float) 500);
					entityToSpawn.setKnockbackStrength((int) 5);
					_ent.world.addEntity(entityToSpawn);
				}
			}
		}
		if ((((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
				.getBoolean("madstaff")) == (false)) && (entity.isSneaking()))) {
			((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
					.putBoolean("madstaff", (true));
			((itemstack)).addEnchantment(Enchantments.SHARPNESS, (int) 30);
			((itemstack)).addEnchantment(Enchantments.SMITE, (int) 30);
			((itemstack)).addEnchantment(Enchantments.LOOTING, (int) 10);
			((itemstack)).addEnchantment(Enchantments.UNBREAKING, (int) 5);
			((itemstack)).addEnchantment(Enchantments.KNOCKBACK, (int) 5);
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7aEnchantments Enabled"), (true));
			}
		} else if ((((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
				.getBoolean("madstaff")) == (true)) && (entity.isSneaking()))) {
			((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
					.putBoolean("madstaff", (false));
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments((itemstack));
				if (_enchantments.containsKey(Enchantments.SHARPNESS)) {
					_enchantments.remove(Enchantments.SHARPNESS);
					EnchantmentHelper.setEnchantments(_enchantments, (itemstack));
				}
			}
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments((itemstack));
				if (_enchantments.containsKey(Enchantments.SMITE)) {
					_enchantments.remove(Enchantments.SMITE);
					EnchantmentHelper.setEnchantments(_enchantments, (itemstack));
				}
			}
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments((itemstack));
				if (_enchantments.containsKey(Enchantments.LOOTING)) {
					_enchantments.remove(Enchantments.LOOTING);
					EnchantmentHelper.setEnchantments(_enchantments, (itemstack));
				}
			}
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments((itemstack));
				if (_enchantments.containsKey(Enchantments.UNBREAKING)) {
					_enchantments.remove(Enchantments.UNBREAKING);
					EnchantmentHelper.setEnchantments(_enchantments, (itemstack));
				}
			}
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments((itemstack));
				if (_enchantments.containsKey(Enchantments.KNOCKBACK)) {
					_enchantments.remove(Enchantments.KNOCKBACK);
					EnchantmentHelper.setEnchantments(_enchantments, (itemstack));
				}
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7aEnchantments Disabled"), (true));
			}
		}
	}
}
