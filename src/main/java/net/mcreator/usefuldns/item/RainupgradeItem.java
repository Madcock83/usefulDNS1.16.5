
package net.mcreator.usefuldns.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.usefuldns.itemgroup.UsefuldnsItemGroup;
import net.mcreator.usefuldns.UsefuldnsModElements;

import java.util.List;

@UsefuldnsModElements.ModElement.Tag
public class RainupgradeItem extends UsefuldnsModElements.ModElement {
	@ObjectHolder("usefuldns:rainupgrade")
	public static final Item block = null;
	public RainupgradeItem(UsefuldnsModElements instance) {
		super(instance, 48);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(UsefuldnsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("rainupgrade");
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

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Upgrade to stop the Rain"));
			list.add(new StringTextComponent("Comsumes 1 FE/tick"));
		}
	}
}