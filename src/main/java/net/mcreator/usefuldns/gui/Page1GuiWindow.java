
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
public class Page1GuiWindow extends ContainerScreen<Page1Gui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = Page1Gui.guistate;
	public Page1GuiWindow(Page1Gui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 238;
		this.ySize = 200;
	}
	private static final ResourceLocation texture = new ResourceLocation("usefuldns:textures/page_1.png");
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
		this.font.drawString(ms, "Welcome to usefulDNS", 63, 6, -16777216);
		this.font.drawString(ms, "This book is a WIP", 75, 18, -16777216);
		this.font.drawString(ms, "I will add more when I get the time", 46, 28, -16777216);
		this.font.drawString(ms, "For now this will give you some basic info", 25, 38, -16777216);
		this.font.drawString(ms, "Sorry for the basic look here :-(", 40, 176, -16777216);
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
		this.addButton(new Button(this.guiLeft + 7, this.guiTop + 54, 222, 20, new StringTextComponent("Ender Crafter Recipes"), e -> {
			if (true) {
				UsefuldnsMod.PACKET_HANDLER.sendToServer(new Page1Gui.ButtonPressedMessage(0, x, y, z));
				Page1Gui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 11, this.guiTop + 79, 213, 20, new StringTextComponent("Unobtainium Furnace Recipes"), e -> {
			if (true) {
				UsefuldnsMod.PACKET_HANDLER.sendToServer(new Page1Gui.ButtonPressedMessage(1, x, y, z));
				Page1Gui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 42, this.guiTop + 126, 150, 20, new StringTextComponent("Tools and Items"), e -> {
			if (true) {
				UsefuldnsMod.PACKET_HANDLER.sendToServer(new Page1Gui.ButtonPressedMessage(2, x, y, z));
				Page1Gui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 6, this.guiTop + 101, 220, 20, new StringTextComponent("Anti-Matter Projector"), e -> {
			if (true) {
				UsefuldnsMod.PACKET_HANDLER.sendToServer(new Page1Gui.ButtonPressedMessage(3, x, y, z));
				Page1Gui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
	}
}
