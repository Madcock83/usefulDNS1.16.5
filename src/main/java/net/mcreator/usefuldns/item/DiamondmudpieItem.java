
package net.mcreator.usefuldns.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.mcreator.usefuldns.procedures.MudpieFoodEatenProcedure;
import net.mcreator.usefuldns.UsefuldnsModElements;

import java.util.Map;
import java.util.HashMap;

@UsefuldnsModElements.ModElement.Tag
public class DiamondmudpieItem extends UsefuldnsModElements.ModElement {
	@ObjectHolder("usefuldns:diamondmudpie")
	public static final Item block = null;
	public DiamondmudpieItem(UsefuldnsModElements instance) {
		super(instance, 371);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(null).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(25).saturation(0.300000011920929f).setAlwaysEdible().meat().build()));
			setRegistryName("diamondmudpie");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 7;
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				MudpieFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
