
package net.mcreator.usefuldns.gui;

import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.network.IContainerFactory;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.gui.ScreenManager;

import net.mcreator.usefuldns.UsefuldnsModElements;
import net.mcreator.usefuldns.UsefuldnsMod;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

@UsefuldnsModElements.ModElement.Tag
public class UnboguiGui extends UsefuldnsModElements.ModElement {
	public static HashMap guistate = new HashMap();
	private static ContainerType<GuiContainerMod> containerType = null;
	public UnboguiGui(UsefuldnsModElements instance) {
		super(instance, 133);
		elements.addNetworkMessage(ButtonPressedMessage.class, ButtonPressedMessage::buffer, ButtonPressedMessage::new,
				ButtonPressedMessage::handler);
		elements.addNetworkMessage(GUISlotChangedMessage.class, GUISlotChangedMessage::buffer, GUISlotChangedMessage::new,
				GUISlotChangedMessage::handler);
		containerType = new ContainerType<>(new GuiContainerModFactory());
		FMLJavaModLoadingContext.get().getModEventBus().register(new ContainerRegisterHandler());
	}
	private static class ContainerRegisterHandler {
		@SubscribeEvent
		public void registerContainer(RegistryEvent.Register<ContainerType<?>> event) {
			event.getRegistry().register(containerType.setRegistryName("unbogui"));
		}
	}
	@OnlyIn(Dist.CLIENT)
	public void initElements() {
		DeferredWorkQueue.runLater(() -> ScreenManager.registerFactory(containerType, UnboguiGuiWindow::new));
	}
	public static class GuiContainerModFactory implements IContainerFactory {
		public GuiContainerMod create(int id, PlayerInventory inv, PacketBuffer extraData) {
			return new GuiContainerMod(id, inv, extraData);
		}
	}

	public static class GuiContainerMod extends Container implements Supplier<Map<Integer, Slot>> {
		World world;
		PlayerEntity entity;
		int x, y, z;
		private IItemHandler internal;
		private Map<Integer, Slot> customSlots = new HashMap<>();
		private boolean bound = false;
		public GuiContainerMod(int id, PlayerInventory inv, PacketBuffer extraData) {
			super(containerType, id);
			this.entity = inv.player;
			this.world = inv.player.world;
			this.internal = new ItemStackHandler(85);
			BlockPos pos = null;
			if (extraData != null) {
				pos = extraData.readBlockPos();
				this.x = pos.getX();
				this.y = pos.getY();
				this.z = pos.getZ();
			}
			if (pos != null) {
				if (extraData.readableBytes() == 1) { // bound to item
					byte hand = extraData.readByte();
					ItemStack itemstack;
					if (hand == 0)
						itemstack = this.entity.getHeldItemMainhand();
					else
						itemstack = this.entity.getHeldItemOffhand();
					itemstack.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
				} else if (extraData.readableBytes() > 1) {
					extraData.readByte(); // drop padding
					Entity entity = world.getEntityByID(extraData.readVarInt());
					if (entity != null)
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							this.internal = capability;
							this.bound = true;
						});
				} else { // might be bound to block
					TileEntity ent = inv.player != null ? inv.player.world.getTileEntity(pos) : null;
					if (ent != null) {
						ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							this.internal = capability;
							this.bound = true;
						});
					}
				}
			}
			this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 11, 7) {
			}));
			this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 29, 7) {
			}));
			this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 47, 7) {
			}));
			this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 65, 7) {
			}));
			this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 83, 7) {
			}));
			this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 101, 7) {
			}));
			this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 119, 7) {
			}));
			this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 137, 7) {
			}));
			this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 155, 7) {
			}));
			this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 173, 7) {
			}));
			this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 191, 7) {
			}));
			this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 209, 7) {
			}));
			this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 227, 7) {
			}));
			this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 11, 25) {
			}));
			this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 29, 25) {
			}));
			this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 47, 25) {
			}));
			this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 65, 25) {
			}));
			this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 83, 25) {
			}));
			this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 101, 25) {
			}));
			this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 119, 25) {
			}));
			this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 137, 25) {
			}));
			this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 155, 25) {
			}));
			this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 173, 25) {
			}));
			this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 191, 25) {
			}));
			this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 209, 25) {
			}));
			this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 227, 25) {
			}));
			this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 11, 43) {
			}));
			this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 29, 43) {
			}));
			this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 47, 43) {
			}));
			this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 65, 43) {
			}));
			this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, 83, 43) {
			}));
			this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 101, 43) {
			}));
			this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 119, 43) {
			}));
			this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 137, 43) {
			}));
			this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 155, 43) {
			}));
			this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 173, 43) {
			}));
			this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 191, 43) {
			}));
			this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 209, 43) {
			}));
			this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 29, 61) {
			}));
			this.customSlots.put(41, this.addSlot(new SlotItemHandler(internal, 41, 47, 61) {
			}));
			this.customSlots.put(42, this.addSlot(new SlotItemHandler(internal, 42, 65, 61) {
			}));
			this.customSlots.put(43, this.addSlot(new SlotItemHandler(internal, 43, 83, 61) {
			}));
			this.customSlots.put(45, this.addSlot(new SlotItemHandler(internal, 45, 119, 61) {
			}));
			this.customSlots.put(46, this.addSlot(new SlotItemHandler(internal, 46, 137, 61) {
			}));
			this.customSlots.put(48, this.addSlot(new SlotItemHandler(internal, 48, 173, 61) {
			}));
			this.customSlots.put(49, this.addSlot(new SlotItemHandler(internal, 49, 191, 61) {
			}));
			this.customSlots.put(51, this.addSlot(new SlotItemHandler(internal, 51, 227, 61) {
			}));
			this.customSlots.put(52, this.addSlot(new SlotItemHandler(internal, 52, 11, 79) {
			}));
			this.customSlots.put(54, this.addSlot(new SlotItemHandler(internal, 54, 47, 79) {
			}));
			this.customSlots.put(55, this.addSlot(new SlotItemHandler(internal, 55, 65, 79) {
			}));
			this.customSlots.put(57, this.addSlot(new SlotItemHandler(internal, 57, 101, 79) {
			}));
			this.customSlots.put(58, this.addSlot(new SlotItemHandler(internal, 58, 119, 79) {
			}));
			this.customSlots.put(47, this.addSlot(new SlotItemHandler(internal, 47, 155, 61) {
			}));
			this.customSlots.put(44, this.addSlot(new SlotItemHandler(internal, 44, 101, 61) {
			}));
			this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 11, 61) {
			}));
			this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 227, 43) {
			}));
			this.customSlots.put(60, this.addSlot(new SlotItemHandler(internal, 60, 155, 79) {
			}));
			this.customSlots.put(56, this.addSlot(new SlotItemHandler(internal, 56, 83, 79) {
			}));
			this.customSlots.put(53, this.addSlot(new SlotItemHandler(internal, 53, 29, 79) {
			}));
			this.customSlots.put(50, this.addSlot(new SlotItemHandler(internal, 50, 209, 61) {
			}));
			this.customSlots.put(61, this.addSlot(new SlotItemHandler(internal, 61, 173, 79) {
			}));
			this.customSlots.put(62, this.addSlot(new SlotItemHandler(internal, 62, 191, 79) {
			}));
			this.customSlots.put(63, this.addSlot(new SlotItemHandler(internal, 63, 209, 79) {
			}));
			this.customSlots.put(64, this.addSlot(new SlotItemHandler(internal, 64, 227, 79) {
			}));
			this.customSlots.put(65, this.addSlot(new SlotItemHandler(internal, 65, 11, 97) {
			}));
			this.customSlots.put(66, this.addSlot(new SlotItemHandler(internal, 66, 29, 97) {
			}));
			this.customSlots.put(67, this.addSlot(new SlotItemHandler(internal, 67, 209, 97) {
			}));
			this.customSlots.put(68, this.addSlot(new SlotItemHandler(internal, 68, 227, 97) {
			}));
			this.customSlots.put(69, this.addSlot(new SlotItemHandler(internal, 69, 11, 115) {
			}));
			this.customSlots.put(70, this.addSlot(new SlotItemHandler(internal, 70, 29, 115) {
			}));
			this.customSlots.put(59, this.addSlot(new SlotItemHandler(internal, 59, 137, 79) {
			}));
			this.customSlots.put(71, this.addSlot(new SlotItemHandler(internal, 71, 209, 115) {
			}));
			this.customSlots.put(72, this.addSlot(new SlotItemHandler(internal, 72, 227, 115) {
			}));
			this.customSlots.put(73, this.addSlot(new SlotItemHandler(internal, 73, 11, 133) {
			}));
			this.customSlots.put(74, this.addSlot(new SlotItemHandler(internal, 74, 29, 133) {
			}));
			this.customSlots.put(75, this.addSlot(new SlotItemHandler(internal, 75, 209, 133) {
			}));
			this.customSlots.put(76, this.addSlot(new SlotItemHandler(internal, 76, 227, 133) {
			}));
			this.customSlots.put(77, this.addSlot(new SlotItemHandler(internal, 77, 11, 151) {
			}));
			this.customSlots.put(78, this.addSlot(new SlotItemHandler(internal, 78, 29, 151) {
			}));
			this.customSlots.put(79, this.addSlot(new SlotItemHandler(internal, 79, 209, 151) {
			}));
			this.customSlots.put(80, this.addSlot(new SlotItemHandler(internal, 80, 227, 151) {
			}));
			this.customSlots.put(81, this.addSlot(new SlotItemHandler(internal, 81, 11, 169) {
			}));
			this.customSlots.put(82, this.addSlot(new SlotItemHandler(internal, 82, 29, 169) {
			}));
			this.customSlots.put(83, this.addSlot(new SlotItemHandler(internal, 83, 209, 169) {
			}));
			this.customSlots.put(84, this.addSlot(new SlotItemHandler(internal, 84, 227, 169) {
			}));
			int si;
			int sj;
			for (si = 0; si < 3; ++si)
				for (sj = 0; sj < 9; ++sj)
					this.addSlot(new Slot(inv, sj + (si + 1) * 9, 39 + 8 + sj * 18, 17 + 84 + si * 18));
			for (si = 0; si < 9; ++si)
				this.addSlot(new Slot(inv, si, 39 + 8 + si * 18, 17 + 142));
		}

		public Map<Integer, Slot> get() {
			return customSlots;
		}

		@Override
		public boolean canInteractWith(PlayerEntity player) {
			return true;
		}

		@Override
		public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
			ItemStack itemstack = ItemStack.EMPTY;
			Slot slot = (Slot) this.inventorySlots.get(index);
			if (slot != null && slot.getHasStack()) {
				ItemStack itemstack1 = slot.getStack();
				itemstack = itemstack1.copy();
				if (index < 85) {
					if (!this.mergeItemStack(itemstack1, 85, this.inventorySlots.size(), true)) {
						return ItemStack.EMPTY;
					}
					slot.onSlotChange(itemstack1, itemstack);
				} else if (!this.mergeItemStack(itemstack1, 0, 85, false)) {
					if (index < 85 + 27) {
						if (!this.mergeItemStack(itemstack1, 85 + 27, this.inventorySlots.size(), true)) {
							return ItemStack.EMPTY;
						}
					} else {
						if (!this.mergeItemStack(itemstack1, 85, 85 + 27, false)) {
							return ItemStack.EMPTY;
						}
					}
					return ItemStack.EMPTY;
				}
				if (itemstack1.getCount() == 0) {
					slot.putStack(ItemStack.EMPTY);
				} else {
					slot.onSlotChanged();
				}
				if (itemstack1.getCount() == itemstack.getCount()) {
					return ItemStack.EMPTY;
				}
				slot.onTake(playerIn, itemstack1);
			}
			return itemstack;
		}

		@Override /**
					 * Merges provided ItemStack with the first avaliable one in the
					 * container/player inventor between minIndex (included) and maxIndex
					 * (excluded). Args : stack, minIndex, maxIndex, negativDirection. /!\ the
					 * Container implementation do not check if the item is valid for the slot
					 */
		protected boolean mergeItemStack(ItemStack stack, int startIndex, int endIndex, boolean reverseDirection) {
			boolean flag = false;
			int i = startIndex;
			if (reverseDirection) {
				i = endIndex - 1;
			}
			if (stack.isStackable()) {
				while (!stack.isEmpty()) {
					if (reverseDirection) {
						if (i < startIndex) {
							break;
						}
					} else if (i >= endIndex) {
						break;
					}
					Slot slot = this.inventorySlots.get(i);
					ItemStack itemstack = slot.getStack();
					if (slot.isItemValid(itemstack) && !itemstack.isEmpty() && areItemsAndTagsEqual(stack, itemstack)) {
						int j = itemstack.getCount() + stack.getCount();
						int maxSize = Math.min(slot.getSlotStackLimit(), stack.getMaxStackSize());
						if (j <= maxSize) {
							stack.setCount(0);
							itemstack.setCount(j);
							slot.putStack(itemstack);
							flag = true;
						} else if (itemstack.getCount() < maxSize) {
							stack.shrink(maxSize - itemstack.getCount());
							itemstack.setCount(maxSize);
							slot.putStack(itemstack);
							flag = true;
						}
					}
					if (reverseDirection) {
						--i;
					} else {
						++i;
					}
				}
			}
			if (!stack.isEmpty()) {
				if (reverseDirection) {
					i = endIndex - 1;
				} else {
					i = startIndex;
				}
				while (true) {
					if (reverseDirection) {
						if (i < startIndex) {
							break;
						}
					} else if (i >= endIndex) {
						break;
					}
					Slot slot1 = this.inventorySlots.get(i);
					ItemStack itemstack1 = slot1.getStack();
					if (itemstack1.isEmpty() && slot1.isItemValid(stack)) {
						if (stack.getCount() > slot1.getSlotStackLimit()) {
							slot1.putStack(stack.split(slot1.getSlotStackLimit()));
						} else {
							slot1.putStack(stack.split(stack.getCount()));
						}
						slot1.onSlotChanged();
						flag = true;
						break;
					}
					if (reverseDirection) {
						--i;
					} else {
						++i;
					}
				}
			}
			return flag;
		}

		@Override
		public void onContainerClosed(PlayerEntity playerIn) {
			super.onContainerClosed(playerIn);
			if (!bound && (playerIn instanceof ServerPlayerEntity)) {
				if (!playerIn.isAlive() || playerIn instanceof ServerPlayerEntity && ((ServerPlayerEntity) playerIn).hasDisconnected()) {
					for (int j = 0; j < internal.getSlots(); ++j) {
						playerIn.dropItem(internal.extractItem(j, internal.getStackInSlot(j).getCount(), false), false);
					}
				} else {
					for (int i = 0; i < internal.getSlots(); ++i) {
						playerIn.inventory.placeItemBackInInventory(playerIn.world,
								internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
					}
				}
			}
		}

		private void slotChanged(int slotid, int ctype, int meta) {
			if (this.world != null && this.world.isRemote()) {
				UsefuldnsMod.PACKET_HANDLER.sendToServer(new GUISlotChangedMessage(slotid, x, y, z, ctype, meta));
				handleSlotAction(entity, slotid, ctype, meta, x, y, z);
			}
		}
	}

	public static class ButtonPressedMessage {
		int buttonID, x, y, z;
		public ButtonPressedMessage(PacketBuffer buffer) {
			this.buttonID = buffer.readInt();
			this.x = buffer.readInt();
			this.y = buffer.readInt();
			this.z = buffer.readInt();
		}

		public ButtonPressedMessage(int buttonID, int x, int y, int z) {
			this.buttonID = buttonID;
			this.x = x;
			this.y = y;
			this.z = z;
		}

		public static void buffer(ButtonPressedMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.buttonID);
			buffer.writeInt(message.x);
			buffer.writeInt(message.y);
			buffer.writeInt(message.z);
		}

		public static void handler(ButtonPressedMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				PlayerEntity entity = context.getSender();
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			});
			context.setPacketHandled(true);
		}
	}

	public static class GUISlotChangedMessage {
		int slotID, x, y, z, changeType, meta;
		public GUISlotChangedMessage(int slotID, int x, int y, int z, int changeType, int meta) {
			this.slotID = slotID;
			this.x = x;
			this.y = y;
			this.z = z;
			this.changeType = changeType;
			this.meta = meta;
		}

		public GUISlotChangedMessage(PacketBuffer buffer) {
			this.slotID = buffer.readInt();
			this.x = buffer.readInt();
			this.y = buffer.readInt();
			this.z = buffer.readInt();
			this.changeType = buffer.readInt();
			this.meta = buffer.readInt();
		}

		public static void buffer(GUISlotChangedMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.slotID);
			buffer.writeInt(message.x);
			buffer.writeInt(message.y);
			buffer.writeInt(message.z);
			buffer.writeInt(message.changeType);
			buffer.writeInt(message.meta);
		}

		public static void handler(GUISlotChangedMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				PlayerEntity entity = context.getSender();
				int slotID = message.slotID;
				int changeType = message.changeType;
				int meta = message.meta;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleSlotAction(entity, slotID, changeType, meta, x, y, z);
			});
			context.setPacketHandled(true);
		}
	}
	static void handleButtonAction(PlayerEntity entity, int buttonID, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
	}

	private static void handleSlotAction(PlayerEntity entity, int slotID, int changeType, int meta, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
	}
}
