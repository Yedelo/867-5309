package at.yedel.essfton.gui;



import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.input.Keyboard;



public class EssftonGui extends GuiScreen {
    private final GuiScreen parentScreen;

    public EssftonGui(GuiScreen parentScreen) {
        this.parentScreen = parentScreen;
    }
    private static final int WHITE = 0xFFFFFFFF;

    @Override
    public void initGui() {
        Keyboard.enableRepeatEvents(true);
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();
        
    }
}
