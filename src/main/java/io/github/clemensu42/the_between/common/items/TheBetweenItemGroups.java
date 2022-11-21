package io.github.clemensu42.the_between.common.items;

import io.github.clemensu42.the_between.common.TheBetween;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class TheBetweenItemGroups
{
	public static final ItemGroup MATERIALS_GROUP = FabricItemGroupBuilder.create(
			new Identifier(TheBetween.MODID, "materials_group"))
			.icon(() -> new ItemStack(TheBetweenItems.ECHORITE_INGOT))
			.build();
}
