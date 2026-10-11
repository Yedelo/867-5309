package at.yedel.essfton.gui;



import at.yedel.essfton.launch.EssftonConstants;
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
    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) {
        super.mouseClicked(mouseX, mouseY, mouseButton);
        shaderListGui.mouseClicked(mouseX, mouseY, mouseButton);
    }

    @Override
    protected void mouseReleased(int mouseX, int mouseY, int state)  {
        super.mouseReleased(mouseX, mouseY, state);
        shaderListGui.mouseReleased(mouseX, mouseY, state);
    }

    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
        shaderListGui.handleMouseInput();
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();
        drawCenteredString("Super Secret Settings List", 5);
        drawCenteredString("§7Provided by Essfton", 15);
        shaderListGui.drawScreen(mouseX, mouseY, partialTicks);
        fontRendererObj.drawString("§7Version " + EssftonConstants.MOD_VERSION, 5, height - 15, 0xFFFFFF, true);
    }

    private void drawCenteredString(String string, int y) {
        int x = (width - fontRendererObj.getStringWidth(string)) / 2;
        fontRendererObj.drawString(string, x, y, 0xFFFFFF, true);
    }
}
