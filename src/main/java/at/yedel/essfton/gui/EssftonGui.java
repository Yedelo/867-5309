package at.yedel.essfton.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiOptionButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiSlot;
import net.minecraft.client.resources.I18n;

import java.util.List;

public class EssftonGui extends GuiScreen {
    private final GuiScreen parentScreen;
    private ShaderList shaderList;
    private int selectedEntry = 0;
    private GuiButton applyButton;
    private GuiButton doneButton;

    public EssftonGui(GuiScreen screen) {
        this.parentScreen = screen;
    }
    
    public void initGui() {
        this.shaderList = new ShaderList(this);
        this.shaderList.registerScrollButtons(7, 8);
        this.buttonList.add(applyButton = new GuiButton(867, this.width / 2 - 155, this.height - 38, "Apply"));
        this.buttonList.add(doneButton = new GuiButton(5309, this.width / 2 - 155 + 160, this.height - 38, "Done"));
    }
    
    public void handleMouseInput() {
        super.handleMouseInput();
        this.shaderList.handleMouseInput();
    }
    
    protected void actionPerformed(GuiButton button) {
        if (button.enabled) {
            if (button == applyButton) {
                apply();
            }
            else if (button == doneButton) {
                done();
            }
            else {
                shaderList.actionPerformed(button);
            }
        }
    }

    private void apply() {
        System.out.println("Apply");
    }

    private void done() {
        System.out.println("Done");
    }
    
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.shaderList.drawScreen(mouseX, mouseY, partialTicks);
        this.drawCenteredString(this.fontRendererObj, "Super Secret Settings", this.width / 2, 5, 0xFFFFFF);
        this.drawCenteredString(this.fontRendererObj, "§7Provided by Essfton", this.width / 2, 15, 0xFFFFFF);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    private static class ShaderList extends GuiSlot {
        private final List<String> ENTRIES = List.of("None", "Notch", "FXAA", "Art", "Bumpy", "Blobs 2", "Pencil", "Color Convolve", "Deconverge", "Flip", "Invert", "NTSC", "Phosphor", "Scan Pincushion", "Sobel", "Bits", "Desaturate", "Green", "Blur", "Wobble", "Blobs", "Antialias", "Creeper", "Spider");
        private final EssftonGui gui;

        public ShaderList(EssftonGui gui) {
            super(Minecraft.getMinecraft(), gui.width, gui.height, 28, gui.height - 32, 18);
            this.gui = gui;
        }

        protected int getSize() {
            return ENTRIES.size();
        }

        protected void elementClicked(int slotIndex, boolean isDoubleClick, int mouseX, int mouseY) {
            gui.selectedEntry = slotIndex;
        }

        protected boolean isSelected(int slotIndex) {
            return slotIndex == gui.selectedEntry;
        }

        protected int getContentHeight() {
            return this.getSize() * 18;
        }

        protected void drawBackground() {
            gui.drawDefaultBackground();
        }

        protected void drawSlot(int entryID, int i, int j, int k, int mouseXIn, int mouseYIn) {
           gui.drawCenteredString(gui.fontRendererObj, ENTRIES.get(entryID), this.width / 2, j + 1, 0xFFFFFF);
        }
    }
}