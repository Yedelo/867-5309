package at.yedel.essfton.mixin;

import net.minecraft.client.audio.SoundHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = "net.minecraft.client.gui.GuiOptions$1")
public abstract class MixinSuperSecretSettingsButton {
    @Inject(method = "playPressSound", at = @At("HEAD"), cancellable = true)
    private void essfton$cancelPressSound(SoundHandler soundHandlerIn, CallbackInfo ci) {
        ci.cancel();
    }
}
