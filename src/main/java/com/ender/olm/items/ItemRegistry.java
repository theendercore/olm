package com.ender.olm.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {

    public static final Item FABRIC_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    public static void init() {
        Registry.register(Registry.ITEM, new Identifier("MODID", "item"), FABRIC_ITEM);

    }
}
