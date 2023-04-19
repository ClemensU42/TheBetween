package io.github.clemensu42.the_between.common.items;

import io.github.clemensu42.the_between.common.TheBetween;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TheBetweenItems
{
	public static final Item ECHORITE_INGOT;

	public TheBetweenItems(){}

	private static Item register(String name, Item item){
		return (Item) Registry.register(Registries.ITEM, new Identifier(TheBetween.MODID, name), item);
	}

	private static Item createBasicItem(){
		return new Item(new FabricItemSettings().maxCount(64));
	}

	static{
		ECHORITE_INGOT = register("echorite_ingot", createBasicItem());
	}
}
