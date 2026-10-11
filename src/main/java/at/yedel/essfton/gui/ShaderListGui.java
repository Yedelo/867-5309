package at.yedel.essfton.gui;



import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiListExtended;

import java.util.ArrayList;
import java.util.List;


public class ShaderListGui extends GuiListExtended {
    private final List<ShaderEntry> entries = new ArrayList<>();
    private final FontRenderer fontRenderer;

    public ShaderListGui(EssftonGui gui, FontRenderer fontRenderer) {
        super(Minecraft.getMinecraft(), gui.width, gui.height, 63, gui.height - 32, 18);
        this.fontRenderer = fontRenderer;
        entries.add(new ShaderEntry(fontRenderer));
        entries.add(new ShaderEntry(fontRenderer));
    }

    @Override
    public IGuiListEntry getListEntry(int index) {
        return entries.get(index);
    }

    @Override protected int getSize() {
        return entries.size();
    }
}
