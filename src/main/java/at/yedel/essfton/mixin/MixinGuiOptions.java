package at.yedel.essfton.mixin;



import at.yedel.essfton.gui.EssftonGui;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.renderer.EntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;



@Mixin(GuiOptions.class)
public abstract class MixinGuiOptions {
    @Redirect(method = "actionPerformed", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/EntityRenderer;activateNextShader()V"))
    private void essfton$openEssftonGui(EntityRenderer instance) {
        Minecraft.getMinecraft().displayGuiScreen(new EssftonGui(Minecraft.getMinecraft().currentScreen));
    }
}
