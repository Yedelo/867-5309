package at.yedel.essfton.gui;



import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiListExtended;



public class ShaderEntry implements GuiListExtended.IGuiListEntry {
    private final FontRenderer fontRenderer;
    public ShaderEntry(FontRenderer fontRenderer) {
        this.fontRenderer = fontRenderer;
    }

    @Override public void setSelected(int i, int j, int k) {
        System.out.println("setSelected(" + i + "," + j + "," + k + ")");
    }

    @Override public void drawEntry(int slotIndex, int x, int y, int listWidth, int slotHeight, int mouseX, int mouseY, boolean isSelected) {
        fontRenderer.drawString(String.valueOf(slotIndex), x, y + 8 * slotIndex, 0xFFFFFF, true);
    }

    @Override public boolean mousePressed(int slotIndex, int i, int j, int k, int l, int m) {
        System.out.println("mousePressed(" + slotIndex + "," + i + "," + j + "," + k + "," + l + ")");
        return false;
    }

    @Override public void mouseReleased(int slotIndex, int x, int y, int mouseEvent, int relativeX, int relativeY) {
        System.out.println("mouseReleased(" + slotIndex + "," + x + "," + y + "," + relativeX + "," + relativeY + ")");
    }
}
