
package net.mcreator.usefuldns.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Hand;
import net.minecraft.util.Direction;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.ActionResult;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.usefuldns.procedures.SwissArmyMagToolInInventoryTickProcedure;
import net.mcreator.usefuldns.procedures.SwissArmyMagRightClickedInAirProcedure;
import net.mcreator.usefuldns.procedures.SwissArmyBlockDestroyedWithToolProcedure;
import net.mcreator.usefuldns.UsefuldnsModElements;

import java.util.Map;
import java.util.HashMap;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

@UsefuldnsModElements.ModElement.Tag
public class SwissArmyMagItem extends UsefuldnsModElements.ModElement {
	@ObjectHolder("usefuldns:swiss_army_mag")
	public static final Item block = null;
	public SwissArmyMagItem(UsefuldnsModElements instance) {
		super(instance, 211);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {
			@Override
			public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
				ActionResult<ItemStack> retval = super.onItemRightClick(world, entity, hand);
				ItemStack itemstack = retval.getResult();
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("world", world);
					SwissArmyMagRightClickedInAirProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}

			@Override
			public ActionResultType onItemUse(ItemUseContext context) {
				ActionResultType retval = super.onItemUse(context);
				World world = context.getWorld();
				BlockPos pos = context.getPos();
				PlayerEntity entity = context.getPlayer();
				Direction direction = context.getFace();
				BlockState blockstate = world.getBlockState(pos);
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();
				ItemStack itemstack = context.getItem();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("world", world);
					SwissArmyMagRightClickedInAirProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}

			@Override
			public boolean onBlockDestroyed(ItemStack itemstack, World world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
				boolean retval = super.onBlockDestroyed(itemstack, world, blockstate, pos, entity);
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					SwissArmyBlockDestroyedWithToolProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}

			@Override
			public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
				super.inventoryTick(itemstack, world, entity, slot, selected);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					SwissArmyMagToolInInventoryTickProcedure.executeProcedure($_dependencies);
				}
			}

			@Override
			@OnlyIn(Dist.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setRegistryName("swiss_army_mag"));
	}
	private static class ItemToolCustom extends Item {
		protected ItemToolCustom() {
			super(new Item.Properties().group(null).maxDamage(4004));
		}

		@Override
		public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot) {
			if (equipmentSlot == EquipmentSlotType.MAINHAND) {
				ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
				builder.putAll(super.getAttributeModifiers(equipmentSlot));
				builder.put(Attributes.ATTACK_DAMAGE,
						new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier", 4f, AttributeModifier.Operation.ADDITION));
				builder.put(Attributes.ATTACK_SPEED,
						new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier", -1.2, AttributeModifier.Operation.ADDITION));
				return builder.build();
			}
			return super.getAttributeModifiers(equipmentSlot);
		}

		@Override
		public boolean canHarvestBlock(BlockState state) {
			return 5 >= state.getHarvestLevel();
		}

		@Override
		public float getDestroySpeed(ItemStack itemstack, BlockState blockstate) {
			return 30f;
		}

		@Override
		public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
			stack.damageItem(1, attacker, i -> i.sendBreakAnimation(EquipmentSlotType.MAINHAND));
			return true;
		}

		@Override
		public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving) {
			stack.damageItem(1, entityLiving, i -> i.sendBreakAnimation(EquipmentSlotType.MAINHAND));
			return true;
		}

		@Override
		public int getItemEnchantability() {
			return 64;
		}
	}
}
