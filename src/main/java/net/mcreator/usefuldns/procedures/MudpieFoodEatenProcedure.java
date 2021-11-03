package net.mcreator.usefuldns.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.usefuldns.potion.DiamondpoopsPotionEffect;
import net.mcreator.usefuldns.UsefuldnsMod;

import java.util.Map;

public class MudpieFoodEatenProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UsefuldnsMod.LOGGER.warn("Failed to load dependency entity for procedure MudpieFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(DiamondpoopsPotionEffect.potion, (int) 100, (int) 5, (true), (false)));
	}
}
