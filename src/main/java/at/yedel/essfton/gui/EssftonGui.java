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
}
