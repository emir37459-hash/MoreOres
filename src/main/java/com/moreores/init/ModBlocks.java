package com.moreores.init;

import com.moreores.MoreOresMod;
import com.moreores.blocks.BlockOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModBlocks {

    public static Block RUBY_ORE;
    public static Block SAPPHIRE_ORE;
    public static Block TOPAZ_ORE;
    public static Block AMETHYST_ORE;
    public static Block TITANIUM_ORE;
    public static Block COPPER_ORE;
    public static Block TIN_ORE;
    public static Block SILVER_ORE;

    public static void register() {
        RUBY_ORE      = registerOre("ruby_ore",      2, 3.0f);
        SAPPHIRE_ORE  = registerOre("sapphire_ore",  2, 3.0f);
        TOPAZ_ORE     = registerOre("topaz_ore",     2, 3.0f);
        AMETHYST_ORE  = registerOre("amethyst_ore",  2, 3.0f);
        TITANIUM_ORE  = registerOre("titanium_ore",  3, 5.0f);
        COPPER_ORE    = registerOre("copper_ore",    1, 2.0f);
        TIN_ORE       = registerOre("tin_ore",       1, 2.0f);
        SILVER_ORE    = registerOre("silver_ore",    2, 3.0f);
    }

    private static Block registerOre(String name, int harvestLevel, float hardness) {
        Block block = new BlockOre(Material.ROCK, harvestLevel, hardness)
                .setRegistryName(MoreOresMod.MODID, name)
                .setUnlocalizedName(MoreOresMod.MODID + "." + name)
                .setCreativeTab(MoreOresMod.TAB);

        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(new ItemBlock(block)
                .setRegistryName(block.getRegistryName()));
        return block;
    }
}
