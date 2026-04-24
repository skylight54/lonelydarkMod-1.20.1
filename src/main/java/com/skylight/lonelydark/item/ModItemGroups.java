package com.skylight.lonelydark.item;

import com.skylight.lonelydark.LonelydarkMod;
import com.skylight.lonelydark.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> LONELYDARK_GROUP = register("lonelydark_group");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(LonelydarkMod.MOD_ID,id));
    }

    public static void registerGroups(){
        Registry.register(
                Registries.ITEM_GROUP,
                LONELYDARK_GROUP,
                ItemGroup.create(null,-1)
                        .displayName(Text.translatable("itemGroup.lonelydark_group"))
                        .icon(()->new ItemStack(ModItems.DARK))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.DARK);
                            entries.add(ModItems.DARK_INGOT);
                            entries.add(ModBlocks.DARK_BLOCK);
                        }).build());
    }

}
