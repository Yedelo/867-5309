package at.yedel.essfton.gui;



import at.yedel.essfton.launch.EssftonConstants;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.input.Keyboard;

import java.io.IOException;


public class EssftonGui extends GuiScreen {
    private final GuiScreen parentScreen;

    public EssftonGui(GuiScreen parentScreen) {
        this.parentScreen = parentScreen;
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        super.drawScreen(mouseX, mouseY, partialTicks);
        drawDefaultBackground();
        drawCenteredString(fontRendererObj, "Super Secret Settings", width / 2, 5, 0xFFFFFF);
        drawCenteredString(fontRendererObj, "§7Provided by Essfton", width / 2, 15, 0xFFFFFF);
        drawString(fontRendererObj, "§7Version " + EssftonConstants.MOD_VERSION, 5, height - 15, 0xFFFFFF);
    }
}
