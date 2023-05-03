package io.github.clemensu42.the_between.client.render;

import io.github.clemensu42.the_between.common.TheBetween;
import net.fabricmc.fabric.api.client.rendering.v1.CoreShaderRegistrationCallback;
import net.fabricmc.fabric.impl.client.rendering.FabricShaderProgram;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.render.RenderPhase;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.util.Identifier;

import java.io.IOException;

public class TheBetweenRenderer {
    public static ShaderProgram PORTAL_SHARD_PROGRAM;
    public static ShaderProgram FULL_PORTAL_PROGRAM;

    public static void registerShaders(){
        CoreShaderRegistrationCallback.EVENT.register(context -> {
            context.register(new Identifier(TheBetween.MODID, "portal_shard"), VertexFormats.POSITION_TEXTURE, shaderProgram -> PORTAL_SHARD_PROGRAM = shaderProgram);
            context.register(new Identifier(TheBetween.MODID, "full_portal"), VertexFormats.POSITION_TEXTURE, shaderProgram -> FULL_PORTAL_PROGRAM = shaderProgram);
        });
    }

    public static ShaderProgram getPortalShardProgram(){return PORTAL_SHARD_PROGRAM;}
    public static ShaderProgram getFullPortalProgram(){return FULL_PORTAL_PROGRAM;}

}
