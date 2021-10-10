
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
public class UnobfuranceguiGuiWindow extends ContainerScreen<UnobfuranceguiGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = UnobfuranceguiGui.guistate;
	public UnobfuranceguiGuiWindow(UnobfuranceguiGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 225;
		this.ySize = 225;
	}
	private static final ResourceLocation texture = new ResourceLocation("usefuldns:textures/unobfurancegui.png");
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
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/fire.png"));
		this.blit(ms, this.guiLeft + 85, this.guiTop + 76, 0, 0, 256, 256, 256, 256);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("usefuldns:textures/arrow.png"));
		this.blit(ms, this.guiLeft + 103, this.guiTop + 40, 0, 0, 256, 256, 256, 256);
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
		this.font.drawString(ms, "Fuel", 121, 94, -12566464);
		this.font.drawString(ms, "Unobtainium Furance", 5, 5, -12566464);
		this.font.drawString(ms, "Place Vanilla recipes in Green Slot", 4, 15, -12566464);
		this.font.drawString(ms, "This Furnace Only Accepts", 40, 193, -12566464);
		this.font.drawString(ms, "Coal Blocks and", 74, 202, -12566464);
		this.font.drawString(ms, "Compressed Coal as Fuel", 57, 211, -12566464);
		this.font.drawString(ms, "Anything placed in", -95, 4, -1);
		this.font.drawString(ms, "the green slot", -95, 13, -1);
		this.font.drawString(ms, "will be melted", -95, 22, -1);
		this.font.drawString(ms, "regaurdless if it", -95, 31, -1);
		this.font.drawString(ms, "has a smelting", -95, 40, -1);
		this.font.drawString(ms, "recipe or not", -95, 49, -1);
		this.font.drawString(ms, "once fuel", -95, 58, -1);
		this.font.drawString(ms, "is added", -95, 67, -1);
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
		this.addButton(new Button(this.guiLeft + 157, this.guiTop + 85, 44, 20, new StringTextComponent("Sort"), e -> {
			if (true) {
				UsefuldnsMod.PACKET_HANDLER.sendToServer(new UnobfuranceguiGui.ButtonPressedMessage(0, x, y, z));
				UnobfuranceguiGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
