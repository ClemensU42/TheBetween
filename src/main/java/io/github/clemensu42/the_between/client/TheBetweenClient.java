package io.github.clemensu42.the_between.client;

import io.github.clemensu42.the_between.client.entities.renderers.EntityRenderers;
import io.github.clemensu42.the_between.client.render.TheBetweenRenderer;
import io.github.clemensu42.the_between.common.TheBetween;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.CoreShaderRegistrationCallback;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class TheBetweenClient implements ClientModInitializer
{
	private EntityRenderers entityRenderers = new EntityRenderers();
	@Override
	public void onInitializeClient()
	{
		TheBetweenRenderer.registerShaders();
		entityRenderers.registerEntityRenderers();
		entityRenderers.registerModelLayers();
	}
}
