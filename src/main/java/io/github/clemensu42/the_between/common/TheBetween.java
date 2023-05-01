package io.github.clemensu42.the_between.common;

import io.github.clemensu42.the_between.common.entities.EntityTypes;
import io.github.clemensu42.the_between.common.items.TheBetweenItemGroups;
import io.github.clemensu42.the_between.common.items.TheBetweenItems;
import net.fabricmc.api.ModInitializer;

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
