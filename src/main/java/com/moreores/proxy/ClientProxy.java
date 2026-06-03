package com.moreores.proxy;

import com.moreores.init.ModBlocks;
import com.moreores.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenderers() {
        // Ore blocks
        regBlock(ModBlocks.RUBY_ORE,      "ruby_ore");
        regBlock(ModBlocks.SAPPHIRE_ORE,  "sapphire_ore");
        regBlock(ModBlocks.TOPAZ_ORE,     "topaz_ore");
        regBlock(ModBlocks.AMETHYST_ORE,  "amethyst_ore");
        regBlock(ModBlocks.TITANIUM_ORE,  "titanium_ore");
        regBlock(ModBlocks.COPPER_ORE,    "copper_ore");
        regBlock(ModBlocks.TIN_ORE,       "tin_ore");
        regBlock(ModBlocks.SILVER_ORE,    "silver_ore");

        // Gems/Ingots
        regItem(ModItems.RUBY_GEM,       "ruby_gem");
        regItem(ModItems.SAPPHIRE_GEM,   "sapphire_gem");
        regItem(ModItems.TOPAZ_GEM,      "topaz_gem");
        regItem(ModItems.AMETHYST_GEM,   "amethyst_gem");
        regItem(ModItems.TITANIUM_INGOT, "titanium_ingot");
        regItem(ModItems.COPPER_INGOT,   "copper_ingot");
        regItem(ModItems.TIN_INGOT,      "tin_ingot");
        regItem(ModItems.SILVER_INGOT,   "silver_ingot");

        // Tools
        String[] mats = {"ruby","sapphire","topaz","amethyst","titanium","copper","tin","silver"};
        String[] tools = {"sword","pickaxe","axe","shovel","hoe","helmet","chestplate","leggings","boots"};
        for (String mat : mats) {
            for (String tool : tools) {
                regItem(net.minecraftforge.fml.common.registry.ForgeRegistries.ITEMS.getValue(
                    new net.minecraft.util.ResourceLocation("moreores", mat+"_"+tool)),
                    mat+"_"+tool);
            }
        }
    }

    private void regItem(Item item, String name) {
        if (item == null) return;
        ModelLoader.setCustomModelResourceLocation(item, 0,
            new ModelResourceLocation("moreores:" + name, "inventory"));
    }

    private void regBlock(net.minecraft.block.Block block, String name) {
        regItem(net.minecraft.item.Item.getItemFromBlock(block), name);
    }
}
