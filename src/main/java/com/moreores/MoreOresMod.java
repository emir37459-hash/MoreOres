package com.moreores;

import com.moreores.init.ModBlocks;
import com.moreores.init.ModItems;
import com.moreores.proxy.CommonProxy;
import com.moreores.world.OreWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = MoreOresMod.MODID, name = MoreOresMod.NAME, version = MoreOresMod.VERSION)
public class MoreOresMod {

    public static final String MODID = "moreores";
    public static final String NAME = "More Ores";
    public static final String VERSION = "1.0.0";

    @SidedProxy(clientSide = "com.moreores.proxy.ClientProxy",
                serverSide = "com.moreores.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static final CreativeTabs TAB = new CreativeTabs("moreores") {
        @Override
        public Item getTabIconItem() {
            return ModItems.RUBY_GEM;
        }
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.register();
        ModItems.register();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        ModItems.registerRecipes();
        GameRegistry.registerWorldGenerator(new OreWorldGen(), 0);
        proxy.registerRenderers();
    }
}
