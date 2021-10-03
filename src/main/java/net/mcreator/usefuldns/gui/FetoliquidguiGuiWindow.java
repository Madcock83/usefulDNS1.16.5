
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

import net.mcreator.usefuldns.procedures.Liquidfeper90Procedure;
import net.mcreator.usefuldns.procedures.Liquidfeper80Procedure;
import net.mcreator.usefuldns.procedures.Liquidfeper70Procedure;
import net.mcreator.usefuldns.procedures.Liquidfeper60Procedure;
import net.mcreator.usefuldns.procedures.Liquidfeper50Procedure;
import net.mcreator.usefuldns.procedures.Liquidfeper40Procedure;
import net.mcreator.usefuldns.procedures.Liquidfeper30Procedure;
import net.mcreator.usefuldns.procedures.Liquidfeper20Procedure;
import net.mcreator.usefuldns.procedures.Liquidfeper10Procedure;
import net.mcreator.usefuldns.procedures.Liquidfeper100Procedure;
import net.mcreator.usefuldns.procedures.Liquidfeper0Procedure;
import net.mcreator.usefuldns.procedures.Fetoliquidper90Procedure;
import net.mcreator.usefuldns.procedures.Fetoliquidper80Procedure;
import net.mcreator.usefuldns.procedures.Fetoliquidper70Procedure;
import net.mcreator.usefuldns.procedures.Fetoliquidper60Procedure;
import net.mcreator.usefuldns.procedures.Fetoliquidper50Procedure;
import net.mcreator.usefuldns.procedures.Fetoliquidper40Procedure;
import net.mcreator.usefuldns.procedures.Fetoliquidper100Procedure;
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
		this.xSize = 177;
		this.ySize = 185;
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
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_0.png"));
		this.blit(ms, this.guiLeft + 25, this.guiTop + 34, 0, 0, 61, 18, 61, 18);
		if (Fetoliquid10perProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_10.png"));
			this.blit(ms, this.guiLeft + 25, this.guiTop + 34, 0, 0, 61, 18, 61, 18);
		}
		if (Fetoliquid20perProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_20.png"));
			this.blit(ms, this.guiLeft + 25, this.guiTop + 34, 0, 0, 61, 18, 61, 18);
		}
		if (Fetoliquid30perProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_30.png"));
			this.blit(ms, this.guiLeft + 25, this.guiTop + 34, 0, 0, 61, 18, 61, 18);
		}
		if (Fetoliquidper40Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_40.png"));
			this.blit(ms, this.guiLeft + 25, this.guiTop + 34, 0, 0, 61, 18, 61, 18);
		}
		if (Fetoliquidper50Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_50.png"));
			this.blit(ms, this.guiLeft + 25, this.guiTop + 34, 0, 0, 61, 18, 61, 18);
		}
		if (Fetoliquidper60Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_60.png"));
			this.blit(ms, this.guiLeft + 25, this.guiTop + 34, 0, 0, 61, 18, 61, 18);
		}
		if (Fetoliquidper70Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_70.png"));
			this.blit(ms, this.guiLeft + 25, this.guiTop + 34, 0, 0, 61, 18, 61, 18);
		}
		if (Fetoliquidper80Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_80.png"));
			this.blit(ms, this.guiLeft + 25, this.guiTop + 34, 0, 0, 61, 18, 61, 18);
		}
		if (Fetoliquidper90Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_90.png"));
			this.blit(ms, this.guiLeft + 25, this.guiTop + 34, 0, 0, 61, 18, 61, 18);
		}
		if (Fetoliquidper100Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/afe_100.png"));
			this.blit(ms, this.guiLeft + 25, this.guiTop + 34, 0, 0, 61, 18, 61, 18);
		}
		if (Liquidfeper0Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/aliquid_0.png"));
			this.blit(ms, this.guiLeft + 142, this.guiTop + 7, 0, 0, 18, 61, 18, 61);
		}
		if (Liquidfeper10Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/aliquid_10.png"));
			this.blit(ms, this.guiLeft + 142, this.guiTop + 7, 0, 0, 18, 61, 18, 61);
		}
		if (Liquidfeper20Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/aliquid_20.png"));
			this.blit(ms, this.guiLeft + 142, this.guiTop + 7, 0, 0, 18, 61, 18, 61);
		}
		if (Liquidfeper30Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/liquid_30.png"));
			this.blit(ms, this.guiLeft + 142, this.guiTop + 7, 0, 0, 18, 61, 18, 61);
		}
		if (Liquidfeper40Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/liquid_40.png"));
			this.blit(ms, this.guiLeft + 142, this.guiTop + 7, 0, 0, 18, 61, 18, 61);
		}
		if (Liquidfeper50Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/liquid_50.png"));
			this.blit(ms, this.guiLeft + 142, this.guiTop + 7, 0, 0, 18, 61, 18, 61);
		}
		if (Liquidfeper60Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/liquid_60.png"));
			this.blit(ms, this.guiLeft + 142, this.guiTop + 7, 0, 0, 18, 61, 18, 61);
		}
		if (Liquidfeper70Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/liquid_70.png"));
			this.blit(ms, this.guiLeft + 142, this.guiTop + 7, 0, 0, 18, 61, 18, 61);
		}
		if (Liquidfeper80Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/liquid_80.png"));
			this.blit(ms, this.guiLeft + 142, this.guiTop + 7, 0, 0, 18, 61, 18, 61);
		}
		if (Liquidfeper90Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/liquid_90.png"));
			this.blit(ms, this.guiLeft + 142, this.guiTop + 7, 0, 0, 18, 61, 18, 61);
		}
		if (Liquidfeper100Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/liquid_100.png"));
			this.blit(ms, this.guiLeft + 142, this.guiTop + 7, 0, 0, 18, 61, 18, 61);
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
		}.getEnergyStored(new BlockPos((int) x, (int) y, (int) z))) + "", 25, 25, -12829636);
		this.font.drawString(ms, "of 10 Million", 25, 52, -12829636);
		this.font.drawString(ms, "" + (new Object() {
			public int getFluidTankLevel(BlockPos pos, int tank) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getFluidInTank(tank).getAmount()));
				return _retval.get();
			}
		}.getFluidTankLevel(new BlockPos((int) x, (int) y, (int) z), 1)) + "", 106, 70, -12829636);
		this.font.drawString(ms, "of 32,000 Buckets", 88, 79, -12829636);
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
