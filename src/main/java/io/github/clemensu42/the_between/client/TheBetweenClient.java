package io.github.clemensu42.the_between.client;

import io.github.clemensu42.the_between.client.entities.renderers.EntityRenderers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class TheBetweenClient implements ClientModInitializer
{
	private EntityRenderers entityRenderers = new EntityRenderers();
	@Override
	public void onInitializeClient()
	{
		entityRenderers.registerEntityRenderers();
		entityRenderers.registerModelLayers();
	}
}
