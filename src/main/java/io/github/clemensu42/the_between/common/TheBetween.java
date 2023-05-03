package io.github.clemensu42.the_between.common;

import io.github.clemensu42.the_between.common.entities.EntityTypes;
import io.github.clemensu42.the_between.common.items.TheBetweenItemGroups;
import io.github.clemensu42.the_between.common.items.TheBetweenItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.impl.client.resource.loader.FabricWrappedVanillaResourcePack;
import net.fabricmc.fabric.impl.resource.loader.FabricModResourcePack;
import net.fabricmc.fabric.impl.resource.loader.ModResourcePackCreator;
import net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil;
import net.minecraft.client.MinecraftClient;
import net.minecraft.resource.ResourcePackManager;

public class TheBetween implements ModInitializer
{
	public static final String MODID = "the_between";
	TheBetweenItems items = new TheBetweenItems();
	EntityTypes entityTypes = new EntityTypes();
	@Override
	public void onInitialize()
	{
		TheBetweenItemGroups.RegisterItemGroups();
	}
}
