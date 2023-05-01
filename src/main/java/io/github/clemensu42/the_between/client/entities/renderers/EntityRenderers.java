package io.github.clemensu42.the_between.client.entities.renderers;

import io.github.clemensu42.the_between.client.entities.models.PortalEntityModel;
import io.github.clemensu42.the_between.common.TheBetween;
import io.github.clemensu42.the_between.common.entities.EntityTypes;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;


public class EntityRenderers {
    public static final EntityModelLayer PORTAL_ENTITY_MODEL_LAYER = new EntityModelLayer(new Identifier(TheBetween.MODID, "portal_entity"), "main");

    public void registerEntityRenderers(){
        EntityRendererRegistry.register(EntityTypes.PORTAL_ENTITY_ENTITY_TYPE, PortalEntityRenderer::new);
    }

    public void registerModelLayers(){
        EntityModelLayerRegistry.registerModelLayer(PORTAL_ENTITY_MODEL_LAYER, PortalEntityModel::getTexturedModelData);
    }
}
