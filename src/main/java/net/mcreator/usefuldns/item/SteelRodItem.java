
package net.mcreator.usefuldns.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.usefuldns.itemgroup.UsefuldnsItemGroup;
import net.mcreator.usefuldns.UsefuldnsModElements;

@UsefuldnsModElements.ModElement.Tag
public class SteelRodItem extends UsefuldnsModElements.ModElement {
	@ObjectHolder("usefuldns:steel_rod")
	public static final Item block = null;
	public SteelRodItem(UsefuldnsModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(UsefuldnsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("steel_rod");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}