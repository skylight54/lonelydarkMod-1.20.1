package com.skylight.lonelydark.block;

import com.skylight.lonelydark.LonelydarkMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block DARK_BLOCK = register("dark_block",new Block(AbstractBlock.Settings.copy(Blocks.STONE)));

    //注册方块
    public static Block register(String id, Block block) {
        registerBlockItems(id, block);//注册方块是顺便 注册对应物品
        return Registry.register(Registries.BLOCK, new Identifier(LonelydarkMod.MOD_ID, id), block);
    }

    //注册方块对应物品
    public static void registerBlockItems(String id, Block block) {
        Registry.register(Registries.ITEM, new Identifier(LonelydarkMod.MOD_ID, id),
                new BlockItem(block,new Item.Settings()));

    }

    //辅助调用函数
    public static void registerModBlocks(){

    }
}
