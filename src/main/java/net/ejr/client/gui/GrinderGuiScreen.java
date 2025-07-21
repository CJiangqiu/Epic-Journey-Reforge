package net.ejr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.ejr.world.inventory.GrinderGuiMenu;
import net.ejr.procedures.Progress5Procedure;
import net.ejr.procedures.Progress4Procedure;
import net.ejr.procedures.Progress3Procedure;
import net.ejr.procedures.Progress2Procedure;
import net.ejr.procedures.Progress1Procedure;
import net.ejr.procedures.HasRedstoneUpDownProcedure;
import net.ejr.procedures.GrinderTipProcedure;
import net.ejr.procedures.GrinderTipHelperProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GrinderGuiScreen extends AbstractContainerScreen<GrinderGuiMenu> {
	private final static HashMap<String, Object> guistate = GrinderGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public GrinderGuiScreen(GrinderGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ejr:textures/screens/grinder_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (GrinderTipHelperProcedure.execute(world, x, y, z))
			if (mouseX > leftPos + 77 && mouseX < leftPos + 101 && mouseY > topPos + 58 && mouseY < topPos + 82)
				guiGraphics.renderTooltip(font, Component.literal(GrinderTipProcedure.execute()), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("ejr:textures/screens/redstone_false.png"), this.leftPos + 80, this.topPos + 61, 0, 0, 16, 16, 16, 16);

		if (HasRedstoneUpDownProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("ejr:textures/screens/restone_true.png"), this.leftPos + 80, this.topPos + 61, 0, 0, 16, 16, 16, 16);
		}

		guiGraphics.blit(new ResourceLocation("ejr:textures/screens/progress_0.png"), this.leftPos + 69, this.topPos + 25, 0, 0, 32, 32, 32, 32);

		if (Progress1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("ejr:textures/screens/progress_1.png"), this.leftPos + 69, this.topPos + 25, 0, 0, 32, 32, 32, 32);
		}
		if (Progress2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("ejr:textures/screens/progress_2.png"), this.leftPos + 69, this.topPos + 25, 0, 0, 32, 32, 32, 32);
		}
		if (Progress3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("ejr:textures/screens/progress_3.png"), this.leftPos + 69, this.topPos + 25, 0, 0, 32, 32, 32, 32);
		}
		if (Progress4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("ejr:textures/screens/progress_4.png"), this.leftPos + 69, this.topPos + 25, 0, 0, 32, 32, 32, 32);
		}
		if (Progress5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("ejr:textures/screens/progress_5.png"), this.leftPos + 69, this.topPos + 25, 0, 0, 32, 32, 32, 32);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
	}
}
