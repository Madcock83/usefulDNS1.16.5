package net.mcreator.usefuldns.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;

import net.mcreator.usefuldns.UsefuldnsMod;

import java.util.Map;

public class MadstaffItemIsCraftedsmeltedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency itemstack for procedure MadstaffItemIsCraftedsmelted!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).addEnchantment(Enchantments.SHARPNESS, (int) 30);
		((itemstack)).addEnchantment(Enchantments.SMITE, (int) 30);
		((itemstack)).addEnchantment(Enchantments.LOOTING, (int) 10);
		((itemstack)).addEnchantment(Enchantments.UNBREAKING, (int) 5);
		((itemstack)).addEnchantment(Enchantments.KNOCKBACK, (int) 5);
	}
}
