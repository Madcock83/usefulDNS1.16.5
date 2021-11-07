
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

import net.mcreator.usefuldns.procedures.Liqtofeper90Procedure;
import net.mcreator.usefuldns.procedures.Liqtofeper20Procedure;
import net.mcreator.usefuldns.procedures.Fxgui0Procedure;
import net.mcreator.usefuldns.procedures.FxGui80Procedure;
import net.mcreator.usefuldns.procedures.FxGui70Procedure;
import net.mcreator.usefuldns.procedures.FxGui60Procedure;
import net.mcreator.usefuldns.procedures.FxGui50Procedure;
import net.mcreator.usefuldns.procedures.FxGui40Procedure;
import net.mcreator.usefuldns.procedures.FxGui10Procedure;
import net.mcreator.usefuldns.procedures.FxGui100Procedure;
import net.mcreator.usefuldns.procedures.FXGui30Procedure;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

import com.google.common.collect.ImmutableMap;

@OnlyIn(Dist.CLIENT)
public class GuipotionblockGuiWindow extends ContainerScreen<GuipotionblockGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = GuipotionblockGui.guistate;
	public GuipotionblockGuiWindow(GuipotionblockGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 288;
		this.ySize = 216;
	}
	private static final ResourceLocation texture = new ResourceLocation("usefuldns:textures/guipotionblock.png");
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
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/line.png"));
		this.blit(ms, this.guiLeft + 35, this.guiTop + 23, 0, 0, 20, 50, 20, 50);
		if (Fxgui0Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_0.png"));
			this.blit(ms, this.guiLeft + 161, this.guiTop + 185, 0, 0, 61, 18, 61, 18);
		}
		if (FxGui10Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_10.png"));
			this.blit(ms, this.guiLeft + 161, this.guiTop + 185, 0, 0, 61, 18, 61, 18);
		}
		if (Liqtofeper20Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_20.png"));
			this.blit(ms, this.guiLeft + 161, this.guiTop + 185, 0, 0, 61, 18, 61, 18);
		}
		if (FXGui30Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_30.png"));
			this.blit(ms, this.guiLeft + 161, this.guiTop + 185, 0, 0, 61, 18, 61, 18);
		}
		if (FxGui40Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_40.png"));
			this.blit(ms, this.guiLeft + 161, this.guiTop + 185, 0, 0, 61, 18, 61, 18);
		}
		if (FxGui50Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_50.png"));
			this.blit(ms, this.guiLeft + 161, this.guiTop + 185, 0, 0, 61, 18, 61, 18);
		}
		if (FxGui60Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_60.png"));
			this.blit(ms, this.guiLeft + 161, this.guiTop + 185, 0, 0, 61, 18, 61, 18);
		}
		if (FxGui70Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_70.png"));
			this.blit(ms, this.guiLeft + 161, this.guiTop + 185, 0, 0, 61, 18, 61, 18);
		}
		if (FxGui80Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_80.png"));
			this.blit(ms, this.guiLeft + 161, this.guiTop + 185, 0, 0, 61, 18, 61, 18);
		}
		if (Liqtofeper90Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_90.png"));
			this.blit(ms, this.guiLeft + 161, this.guiTop + 185, 0, 0, 61, 18, 61, 18);
		}
		if (FxGui100Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_100.png"));
			this.blit(ms, this.guiLeft + 161, this.guiTop + 185, 0, 0, 61, 18, 61, 18);
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
		this.font.drawString(ms, "Night Vision", 71, 14, -12829636);
		this.font.drawString(ms, "Regeneration", 71, 32, -12829636);
		this.font.drawString(ms, "Saturation", 71, 50, -12829636);
		this.font.drawString(ms, "Speed", 71, 68, -12829636);
		this.font.drawString(ms, "Lock Day", 71, 86, -12829636);
		this.font.drawString(ms, "" + (new Object() {
			public int getEnergyStored(BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(new BlockPos((int) x, (int) y, (int) z))) + "", 80, 194, -12829636);
		this.font.drawString(ms, "Death", 170, 14, -12829636);
		this.font.drawString(ms, "Stop Rain", 170, 32, -12829636);
		this.font.drawString(ms, "/250,000", 116, 194, -12829636);
		this.font.drawString(ms, "not in use (yet)", 170, 50, -12829636);
		this.font.drawString(ms, "not in use (yet)", 170, 68, -12829636);
		this.font.drawString(ms, "not in use (yet)", 170, 86, -12829636);
		this.font.drawString(ms, "Input", 8, 23, -12829636);
		this.font.drawString(ms, "Use Redstone", -63, 5, -1);
		this.font.drawString(ms, "To Activate", -63, 14, -1);
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
