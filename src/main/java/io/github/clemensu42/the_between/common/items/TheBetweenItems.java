package io.github.clemensu42.the_between.common.items;

import io.github.clemensu42.the_between.common.TheBetween;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TheBetweenItems
{
	public static final Item ECHORITE_INGOT;
	public static final Item TENERITE_INGOT;

	public TheBetweenItems(){}

	private static Item register(String name, Item item){
		return (Item) Registry.register(Registry.ITEM, new Identifier(TheBetween.MODID, name), item);
	}

	private static Item createBasicItem(ItemGroup itemGroup){
		return new Item(new FabricItemSettings().group(itemGroup).maxCount(64));
	}

	static{
		ECHORITE_INGOT = register("echorite_ingot", createBasicItem(TheBetweenItemGroups.MATERIALS_GROUP));
		TENERITE_INGOT = register("tenerite_ingot", createBasicItem(TheBetweenItemGroups.MATERIALS_GROUP));
	}
}
