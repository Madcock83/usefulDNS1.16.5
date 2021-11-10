
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
public class SpawnerguiGuiWindow extends ContainerScreen<SpawnerguiGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = SpawnerguiGui.guistate;
	public SpawnerguiGuiWindow(SpawnerguiGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 233;
		this.ySize = 166;
	}
	private static final ResourceLocation texture = new ResourceLocation("usefuldns:textures/spawnergui.png");
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
		this.font.drawString(ms, "Place a drop of the mob in the input", 25, 8, -12829636);
		this.font.drawString(ms, "Only a few for now, more mobs will come later", 6, 20, -12829636);
		this.font.drawString(ms, "Egg = Chicken    Beef = Cow", 8, 34, -12829636);
		this.font.drawString(ms, "Wool = Sheep     Pork = Pig", 8, 43, -12829636);
		this.font.drawString(ms, "Blaze Rod = Blaze   Bone = Skeleton", 8, 52, -12829636);
		this.font.drawString(ms, "Gunpowder = Creeper   Flesh = Zombie", 8, 61, -12829636);
		this.font.drawString(ms, "Wither Skeleton Skull = Wither Skeleton", 8, 70, -12829636);
		this.font.drawString(ms, "More Mobs to Come Later", 53, 88, -12829636);
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
		this.addButton(new Button(this.guiLeft + 89, this.guiTop + 115, 45, 20, new StringTextComponent("Back"), e -> {
			if (true) {
				UsefuldnsMod.PACKET_HANDLER.sendToServer(new SpawnerguiGui.ButtonPressedMessage(0, x, y, z));
				SpawnerguiGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
