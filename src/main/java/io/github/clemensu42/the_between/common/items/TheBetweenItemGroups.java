package io.github.clemensu42.the_between.common.items;

import io.github.clemensu42.the_between.common.TheBetween;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class TheBetweenItemGroups
{
	public static final ItemGroup MATERIALS_GROUP = FabricItemGroup.builder(new Identifier(TheBetween.MODID, "materials_group"))
			.icon(() -> new ItemStack(TheBetweenItems.ECHORITE_INGOT))
			.build();

	public static void RegisterItemGroups(){
		ItemGroupEvents.modifyEntriesEvent(MATERIALS_GROUP).register(content -> {
			content.add(TheBetweenItems.ECHORITE_INGOT);
		});
	}
}
