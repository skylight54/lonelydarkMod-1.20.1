package com.skylight.lonelydark.item;

import com.skylight.lonelydark.LonelydarkMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item DARK = registerItem("material/dark", new Item(new Item.Settings()));
    public static final Item DARK_INGOT = registerItem("material/dark_ingot", new Item(new Item.Settings()));


    //整合下面的注册方法
    public static Item registerItem(String id, Item item){
        return Registry.register(Registries.ITEM,new Identifier(LonelydarkMod.MOD_ID, id), item);
    }

    public static Item register(String id, Item item) {
        return register(new Identifier(LonelydarkMod.MOD_ID, id), item); //从new Identifier(id)改成 自己模组的命名空间
    }

    public static Item register(Identifier id, Item item) {
        return register(RegistryKey.of(Registries.ITEM.getKey(), id), item);
    }

    public static Item register(RegistryKey<Item> key, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }

        return Registry.register(Registries.ITEM, key, item);
    }

    public static void registerItems() {

    }
}
