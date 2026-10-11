package at.yedel.essfton.gui;



import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiListExtended;



public class ShaderListGui extends GuiListExtended {
    public ShaderListGui(Minecraft minecraft, int i, int j, int k, int l, int m) {
        super(minecraft, i, j, k, l, m);
    }

    @Override
    public IGuiListEntry getListEntry(int index) {
        return null;
    }

    @Override protected int getSize() {
        return 0;
    }
}
