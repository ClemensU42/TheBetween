package io.github.clemensu42.the_between.client.entities.renderers;

import com.mojang.blaze3d.systems.RenderSystem;
import io.github.clemensu42.the_between.client.render.TheBetweenRenderLayers;
import io.github.clemensu42.the_between.client.render.TheBetweenRenderer;
import io.github.clemensu42.the_between.common.TheBetween;
import io.github.clemensu42.the_between.common.entities.PortalEntity;
import io.github.clemensu42.the_between.client.entities.models.PortalEntityModel;
import net.minecraft.client.render.*;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import org.joml.Matrix4f;

public class PortalEntityRenderer extends EntityRenderer<PortalEntity> {
    private PortalEntityModel model;
    protected PortalEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
        model = new PortalEntityModel(ctx.getPart(EntityRenderers.PORTAL_ENTITY_MODEL_LAYER));
    }

    @Override
    public Identifier getTexture(PortalEntity entity) {
        return new Identifier(TheBetween.MODID, "textures/entity/portal/portal.png");
    }

    @Override
    public void render(PortalEntity entity, float yaw, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        model.age += tickDelta;
        model.shatteringProgress = entity.shatterProgress;
        matrices.push();

        matrices.scale(1.0F, -1.0F, 1.0F);
        VertexConsumer vertexConsumer = vertexConsumers.getBuffer(this.model.getLayer(this.getTexture(entity)));
        int p = OverlayTexture.DEFAULT_UV;
        model.render(matrices, vertexConsumer, light, p, 1F, 1F, 1F, 1F);

        if(entity.shatterProgress > 0.0) {
            model.renderShards(matrices);
        }

        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);

        if(entity.shatterProgress <= 0.0){
            model.renderInnerPortal(matrices);
        }
        matrices.pop();
    }



}
