package com.moreores.items;

import com.moreores.MoreOresMod;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase(String name) {
        setRegistryName(MoreOresMod.MODID, name);
        setUnlocalizedName(MoreOresMod.MODID + "." + name);
        setCreativeTab(MoreOresMod.TAB);
    }
}
