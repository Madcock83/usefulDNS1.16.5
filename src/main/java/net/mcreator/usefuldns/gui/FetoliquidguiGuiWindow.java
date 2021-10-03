
package net.mcreator.usefuldns.gui;

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

import net.mcreator.usefuldns.procedures.Fetoliquidper90Procedure;
import net.mcreator.usefuldns.procedures.Fetoliquidper80Procedure;
import net.mcreator.usefuldns.procedures.Fetoliquidper70Procedure;
import net.mcreator.usefuldns.procedures.Fetoliquidper60Procedure;
import net.mcreator.usefuldns.procedures.Fetoliquidper50Procedure;
import net.mcreator.usefuldns.procedures.Fetoliquidper40Procedure;
import net.mcreator.usefuldns.procedures.Fetoliquidper100Procedure;
import net.mcreator.usefuldns.procedures.Fetoliquidgui0perProcedure;
import net.mcreator.usefuldns.procedures.Fetoliquid30perProcedure;
import net.mcreator.usefuldns.procedures.Fetoliquid20perProcedure;
import net.mcreator.usefuldns.procedures.Fetoliquid10perProcedure;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

import com.google.common.collect.ImmutableMap;

@OnlyIn(Dist.CLIENT)
public class FetoliquidguiGuiWindow extends ContainerScreen<FetoliquidguiGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = FetoliquidguiGui.guistate;
	public FetoliquidguiGuiWindow(FetoliquidguiGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}
	private static final ResourceLocation texture = new ResourceLocation("usefuldns:textures/fetoliquidgui.png");
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
		if (Fetoliquidgui0perProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_0.png"));
			this.blit(ms, this.guiLeft + 24, this.guiTop + 25, 0, 0, 61, 18, 61, 18);
		}
		if (Fetoliquid10perProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_10.png"));
			this.blit(ms, this.guiLeft + 24, this.guiTop + 25, 0, 0, 61, 18, 61, 18);
		}
		if (Fetoliquid20perProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_20.png"));
			this.blit(ms, this.guiLeft + 24, this.guiTop + 25, 0, 0, 61, 18, 61, 18);
		}
		if (Fetoliquid30perProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_30.png"));
			this.blit(ms, this.guiLeft + 24, this.guiTop + 25, 0, 0, 61, 18, 61, 18);
		}
		if (Fetoliquidper40Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_40.png"));
			this.blit(ms, this.guiLeft + 24, this.guiTop + 25, 0, 0, 61, 18, 61, 18);
		}
		if (Fetoliquidper50Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_50.png"));
			this.blit(ms, this.guiLeft + 24, this.guiTop + 25, 0, 0, 61, 18, 61, 18);
		}
		if (Fetoliquidper60Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_60.png"));
			this.blit(ms, this.guiLeft + 24, this.guiTop + 25, 0, 0, 61, 18, 61, 18);
		}
		if (Fetoliquidper70Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_70.png"));
			this.blit(ms, this.guiLeft + 24, this.guiTop + 25, 0, 0, 61, 18, 61, 18);
		}
		if (Fetoliquidper80Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_80.png"));
			this.blit(ms, this.guiLeft + 24, this.guiTop + 25, 0, 0, 61, 18, 61, 18);
		}
		if (Fetoliquidper90Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_90.png"));
			this.blit(ms, this.guiLeft + 24, this.guiTop + 25, 0, 0, 61, 18, 61, 18);
		}
		if (Fetoliquidper100Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_100.png"));
			this.blit(ms, this.guiLeft + 24, this.guiTop + 25, 0, 0, 61, 18, 61, 18);
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
		}.getEnergyStored(new BlockPos((int) x, (int) y, (int) z))) + "", 24, 52, -12829636);
		this.font.drawString(ms, "of 10 Billion", 24, 61, -12829636);
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
