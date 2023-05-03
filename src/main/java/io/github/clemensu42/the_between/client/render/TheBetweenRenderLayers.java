package io.github.clemensu42.the_between.client.render;

import io.github.clemensu42.the_between.client.render.TheBetweenRenderer;
import io.github.clemensu42.the_between.common.TheBetween;
import net.minecraft.client.render.*;
import net.minecraft.util.Identifier;

public class TheBetweenRenderLayers extends RenderLayer {
    public TheBetweenRenderLayers(String name, VertexFormat vertexFormat, VertexFormat.DrawMode drawMode, int expectedBufferSize, boolean hasCrumbling, boolean translucent, Runnable startAction, Runnable endAction) {
        super(name, vertexFormat, drawMode, expectedBufferSize, hasCrumbling, translucent, startAction, endAction);
    }
}
