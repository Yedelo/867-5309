package at.yedel.essfton.gui;



import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.input.Keyboard;

import java.io.IOException;


public class EssftonGui extends GuiScreen {
    private GuiScreen parentScreen;
    private ShaderListGui shaderListGui;

    public EssftonGui(GuiScreen parentScreen) {
        this.parentScreen = parentScreen;
    }
    private static final int WHITE = 0xFFFFFFFF;


    @Override
    public void initGui() {
        shaderListGui = new ShaderListGui(this, Minecraft.getMinecraft().fontRendererObj);
        Keyboard.enableRepeatEvents(true);
    }

    @Override
    public void handleMouseInput() /*? if forge {*/ throws IOException /*?}*/ {
        super.handleMouseInput();
        shaderListGui.handleMouseInput();
    }

    @Override
    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) /*? if forge {*/ throws IOException /*?}*/ {
        super.mouseClicked(mouseX, mouseY, mouseButton);
        shaderListGui.mouseClicked(mouseX, mouseY, mouseButton);
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();
        shaderListGui.drawScreen(mouseX, mouseY, partialTicks);
    }
}
