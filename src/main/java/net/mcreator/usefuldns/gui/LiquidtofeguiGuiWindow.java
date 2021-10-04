
package net.mcreator.usefuldns.gui;

import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.usefuldns.procedures.Liquidtofeper90Procedure;
import net.mcreator.usefuldns.procedures.Liquidtofeper80Procedure;
import net.mcreator.usefuldns.procedures.Liquidtofeper70Procedure;
import net.mcreator.usefuldns.procedures.Liquidtofeper60Procedure;
import net.mcreator.usefuldns.procedures.Liquidtofeper50Procedure;
import net.mcreator.usefuldns.procedures.Liquidtofeper40Procedure;
import net.mcreator.usefuldns.procedures.Liquidtofeper30Procedure;
import net.mcreator.usefuldns.procedures.Liquidtofeper20Procedure;
import net.mcreator.usefuldns.procedures.Liquidtofeper10Procedure;
import net.mcreator.usefuldns.procedures.Liquidtofeper100Procedure;
import net.mcreator.usefuldns.procedures.Liquidtofeper0Procedure;
import net.mcreator.usefuldns.procedures.Liqtofeper90Procedure;
import net.mcreator.usefuldns.procedures.Liqtofeper80Procedure;
import net.mcreator.usefuldns.procedures.Liqtofeper70Procedure;
import net.mcreator.usefuldns.procedures.Liqtofeper60Procedure;
import net.mcreator.usefuldns.procedures.Liqtofeper50Procedure;
import net.mcreator.usefuldns.procedures.Liqtofeper40Procedure;
import net.mcreator.usefuldns.procedures.Liqtofeper30Procedure;
import net.mcreator.usefuldns.procedures.Liqtofeper20Procedure;
import net.mcreator.usefuldns.procedures.Liqtofeper10Procedure;
import net.mcreator.usefuldns.procedures.Liqtofeper100Procedure;
import net.mcreator.usefuldns.procedures.Liqtofeper0Procedure;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

import com.google.common.collect.ImmutableMap;

@OnlyIn(Dist.CLIENT)
public class LiquidtofeguiGuiWindow extends ContainerScreen<LiquidtofeguiGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = LiquidtofeguiGui.guistate;
	public LiquidtofeguiGuiWindow(LiquidtofeguiGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 180;
	}
	private static final ResourceLocation texture = new ResourceLocation("usefuldns:textures/liquidtofegui.png");
	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/untitled.png"));
		this.blit(ms, this.guiLeft + 51, this.guiTop + 14, 0, 0, 72, 73, 72, 73);
		if (Liqtofeper0Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/aliquid_0.png"));
			this.blit(ms, this.guiLeft + 15, this.guiTop + 23, 0, 0, 18, 61, 18, 61);
		}
		if (Liqtofeper10Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/aliquid_10.png"));
			this.blit(ms, this.guiLeft + 15, this.guiTop + 23, 0, 0, 18, 61, 18, 61);
		}
		if (Liqtofeper20Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/aliquid_20.png"));
			this.blit(ms, this.guiLeft + 15, this.guiTop + 23, 0, 0, 18, 61, 18, 61);
		}
		if (Liqtofeper30Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/liquid_30.png"));
			this.blit(ms, this.guiLeft + 15, this.guiTop + 23, 0, 0, 18, 61, 18, 61);
		}
		if (Liqtofeper40Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/liquid_40.png"));
			this.blit(ms, this.guiLeft + 15, this.guiTop + 23, 0, 0, 18, 61, 18, 61);
		}
		if (Liqtofeper50Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/liquid_50.png"));
			this.blit(ms, this.guiLeft + 15, this.guiTop + 23, 0, 0, 18, 61, 18, 61);
		}
		if (Liqtofeper60Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/liquid_60.png"));
			this.blit(ms, this.guiLeft + 15, this.guiTop + 23, 0, 0, 18, 61, 18, 61);
		}
		if (Liqtofeper70Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/liquid_70.png"));
			this.blit(ms, this.guiLeft + 15, this.guiTop + 23, 0, 0, 18, 61, 18, 61);
		}
		if (Liqtofeper80Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/liquid_80.png"));
			this.blit(ms, this.guiLeft + 15, this.guiTop + 23, 0, 0, 18, 61, 18, 61);
		}
		if (Liqtofeper90Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/liquid_90.png"));
			this.blit(ms, this.guiLeft + 15, this.guiTop + 23, 0, 0, 18, 61, 18, 61);
		}
		if (Liqtofeper100Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/liquid_100.png"));
			this.blit(ms, this.guiLeft + 15, this.guiTop + 23, 0, 0, 18, 61, 18, 61);
		}
		if (Liquidtofeper0Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_0.png"));
			this.blit(ms, this.guiLeft + 96, this.guiTop + 23, 0, 0, 61, 18, 61, 18);
		}
		if (Liquidtofeper10Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_10.png"));
			this.blit(ms, this.guiLeft + 96, this.guiTop + 23, 0, 0, 61, 18, 61, 18);
		}
		if (Liquidtofeper20Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_20.png"));
			this.blit(ms, this.guiLeft + 96, this.guiTop + 23, 0, 0, 61, 18, 61, 18);
		}
		if (Liquidtofeper30Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_30.png"));
			this.blit(ms, this.guiLeft + 96, this.guiTop + 23, 0, 0, 61, 18, 61, 18);
		}
		if (Liquidtofeper40Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_40.png"));
			this.blit(ms, this.guiLeft + 96, this.guiTop + 23, 0, 0, 61, 18, 61, 18);
		}
		if (Liquidtofeper50Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_50.png"));
			this.blit(ms, this.guiLeft + 96, this.guiTop + 23, 0, 0, 61, 18, 61, 18);
		}
		if (Liquidtofeper60Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_60.png"));
			this.blit(ms, this.guiLeft + 96, this.guiTop + 23, 0, 0, 61, 18, 61, 18);
		}
		if (Liquidtofeper70Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_70.png"));
			this.blit(ms, this.guiLeft + 96, this.guiTop + 23, 0, 0, 61, 18, 61, 18);
		}
		if (Liquidtofeper80Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_80.png"));
			this.blit(ms, this.guiLeft + 96, this.guiTop + 23, 0, 0, 61, 18, 61, 18);
		}
		if (Liquidtofeper90Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_90.png"));
			this.blit(ms, this.guiLeft + 96, this.guiTop + 23, 0, 0, 61, 18, 61, 18);
		}
		if (Liquidtofeper100Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_100.png"));
			this.blit(ms, this.guiLeft + 96, this.guiTop + 23, 0, 0, 61, 18, 61, 18);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "" + (new Object() {
			public int getEnergyStored(BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(new BlockPos((int) x, (int) y, (int) z))) + "", 105, 41, -12829636);
		this.font.drawString(ms, "" + (new Object() {
			public int getFluidTankLevel(BlockPos pos, int tank) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getFluidInTank(tank).getAmount()));
				return _retval.get();
			}
		}.getFluidTankLevel(new BlockPos((int) x, (int) y, (int) z), 1)) + "", 33, 68, -12829636);
		this.font.drawString(ms, "Liquid Fe To FE transformer", 6, 5, -12829636);
		this.font.drawString(ms, "of 32,000 Buckets", 33, 77, -12829636);
		this.font.drawString(ms, "of 100 Million", 96, 50, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
	}
}
