
package net.mcreator.usefuldns.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.usefuldns.UsefuldnsMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MainitemGuiWindow extends ContainerScreen<MainitemGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = MainitemGui.guistate;
	public MainitemGuiWindow(MainitemGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 177;
		this.ySize = 170;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}
	private static final ResourceLocation texture = new ResourceLocation("usefuldns:textures/mainitem.png");
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
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/cobble_gen.png"));
		this.blit(ms, this.guiLeft + 7, this.guiTop + 9, 0, 0, -1, -1, -1, -1);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/endpop.png"));
		this.blit(ms, this.guiLeft + 7, this.guiTop + 36, 0, 0, 0, 0, 0, 0);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/exp_orb.png"));
		this.blit(ms, this.guiLeft + 7, this.guiTop + 63, 0, 0, 0, 0, 0, 0);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/lightningrod.png"));
		this.blit(ms, this.guiLeft + 7, this.guiTop + 90, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/madcannon1.png"));
		this.blit(ms, this.guiLeft + 7, this.guiTop + 117, 0, 0, 0, 0, 0, 0);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/madstaff.png"));
		this.blit(ms, this.guiLeft + 7, this.guiTop + 144, 0, 0, 16, 16, 16, 16);
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
		this.addButton(new Button(this.guiLeft + 25, this.guiTop + 9, 120, 20, new StringTextComponent("Portable Cobble Gen"), e -> {
			if (true) {
				UsefuldnsMod.PACKET_HANDLER.sendToServer(new MainitemGui.ButtonPressedMessage(0, x, y, z));
				MainitemGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 25, this.guiTop + 36, 60, 20, new StringTextComponent("End Pop"), e -> {
			if (true) {
				UsefuldnsMod.PACKET_HANDLER.sendToServer(new MainitemGui.ButtonPressedMessage(1, x, y, z));
				MainitemGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 25, this.guiTop + 63, 60, 20, new StringTextComponent("Exp Orb"), e -> {
			if (true) {
				UsefuldnsMod.PACKET_HANDLER.sendToServer(new MainitemGui.ButtonPressedMessage(2, x, y, z));
				MainitemGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 25, this.guiTop + 90, 90, 20, new StringTextComponent("Lightning Rod"), e -> {
			if (true) {
				UsefuldnsMod.PACKET_HANDLER.sendToServer(new MainitemGui.ButtonPressedMessage(3, x, y, z));
				MainitemGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 25, this.guiTop + 117, 75, 20, new StringTextComponent("Mad Cannon"), e -> {
			if (true) {
				UsefuldnsMod.PACKET_HANDLER.sendToServer(new MainitemGui.ButtonPressedMessage(4, x, y, z));
				MainitemGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 25, this.guiTop + 144, 125, 20, new StringTextComponent("Madcock Travel Staff"), e -> {
			if (true) {
				UsefuldnsMod.PACKET_HANDLER.sendToServer(new MainitemGui.ButtonPressedMessage(5, x, y, z));
				MainitemGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
	}
}
