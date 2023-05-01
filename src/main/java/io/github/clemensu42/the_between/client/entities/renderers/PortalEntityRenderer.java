package io.github.clemensu42.the_between.client.entities.renderers;

import io.github.clemensu42.the_between.client.entities.models.PortalEntityModel;
import io.github.clemensu42.the_between.common.TheBetween;
import io.github.clemensu42.the_between.common.entities.PortalEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayers;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

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
        matrices.push();

        matrices.scale(1.0F, -1.0F, 1.0F);
        matrices.translate(0.0F, -1.5F, 0.0F);
        VertexConsumer vertexConsumer = vertexConsumers.getBuffer(this.model.getLayer(this.getTexture(entity)));
        int p = OverlayTexture.DEFAULT_UV;
        model.render(matrices, vertexConsumer, light, p, 1F, 1F, 1F, 1F);

        matrices.pop();
        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }


}
