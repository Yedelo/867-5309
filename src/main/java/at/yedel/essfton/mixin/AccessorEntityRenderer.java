package at.yedel.essfton.mixin;

import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(EntityRenderer.class)
public interface AccessorEntityRenderer {
    @Accessor("shaderIndex")
    int essfton$getShaderIndex();

    @Accessor("theShaderGroup")
    ShaderGroup essfton$getShaderGroup();

    @Accessor("shaderResourceLocations")
    ResourceLocation[] essfton$getShaderResourceLocations();

    @Invoker("loadShader")
    void essfton$loadShader(ResourceLocation location);
}
