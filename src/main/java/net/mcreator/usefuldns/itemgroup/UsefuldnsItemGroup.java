
package net.mcreator.usefuldns.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.usefuldns.item.SwissArmyItem;
import net.mcreator.usefuldns.UsefuldnsModElements;

@UsefuldnsModElements.ModElement.Tag
public class UsefuldnsItemGroup extends UsefuldnsModElements.ModElement {
	public UsefuldnsItemGroup(UsefuldnsModElements instance) {
		super(instance, 116);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabusefuldns") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SwissArmyItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
