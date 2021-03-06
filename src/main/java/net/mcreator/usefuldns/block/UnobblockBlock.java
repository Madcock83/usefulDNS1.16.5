
package net.mcreator.usefuldns.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.usefuldns.itemgroup.UsefuldnsItemGroup;
import net.mcreator.usefuldns.UsefuldnsModElements;

import java.util.List;
import java.util.Collections;

@UsefuldnsModElements.ModElement.Tag
public class UnobblockBlock extends UsefuldnsModElements.ModElement {
	@ObjectHolder("usefuldns:unobblock")
	public static final Block block = null;
	public UnobblockBlock(UsefuldnsModElements instance) {
		super(instance, 64);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(UsefuldnsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ANVIL).sound(SoundType.SCAFFOLDING).hardnessAndResistance(2f, 10f).setLightLevel(s -> 0)
					.harvestLevel(3).harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("unobblock");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
