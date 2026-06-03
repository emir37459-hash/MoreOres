package com.moreores.init;

import com.moreores.MoreOresMod;
import com.moreores.items.*;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

public class ModItems {

    // ===== TOOL MATERIALS =====
    public static final ToolMaterial RUBY_TOOL      = EnumHelper.addToolMaterial("RUBY",      2, 512,  7.5f, 2.5f, 12);
    public static final ToolMaterial SAPPHIRE_TOOL  = EnumHelper.addToolMaterial("SAPPHIRE",  2, 600,  7.5f, 2.5f, 10);
    public static final ToolMaterial TOPAZ_TOOL     = EnumHelper.addToolMaterial("TOPAZ",     2, 450,  7.0f, 2.0f, 14);
    public static final ToolMaterial AMETHYST_TOOL  = EnumHelper.addToolMaterial("AMETHYST",  2, 580,  7.5f, 2.5f, 11);
    public static final ToolMaterial TITANIUM_TOOL  = EnumHelper.addToolMaterial("TITANIUM",  3, 2000, 9.0f, 4.0f, 8);
    public static final ToolMaterial COPPER_TOOL    = EnumHelper.addToolMaterial("COPPER",    1, 200,  5.0f, 1.5f, 14);
    public static final ToolMaterial TIN_TOOL       = EnumHelper.addToolMaterial("TIN",       1, 180,  4.5f, 1.0f, 14);
    public static final ToolMaterial SILVER_TOOL    = EnumHelper.addToolMaterial("SILVER",    2, 400,  7.0f, 2.0f, 20);

    // ===== ARMOR MATERIALS =====
    public static final ArmorMaterial RUBY_ARMOR     = EnumHelper.addArmorMaterial("RUBY",     "moreores:ruby",     20, new int[]{3,6,5,3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f);
    public static final ArmorMaterial SAPPHIRE_ARMOR = EnumHelper.addArmorMaterial("SAPPHIRE", "moreores:sapphire", 22, new int[]{3,6,5,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f);
    public static final ArmorMaterial TOPAZ_ARMOR    = EnumHelper.addArmorMaterial("TOPAZ",    "moreores:topaz",    18, new int[]{2,5,4,2}, 14, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.5f);
    public static final ArmorMaterial AMETHYST_ARMOR = EnumHelper.addArmorMaterial("AMETHYST", "moreores:amethyst", 20, new int[]{3,6,5,3}, 11, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f);
    public static final ArmorMaterial TITANIUM_ARMOR = EnumHelper.addArmorMaterial("TITANIUM", "moreores:titanium", 40, new int[]{4,8,7,4}, 8,  SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0f);
    public static final ArmorMaterial COPPER_ARMOR   = EnumHelper.addArmorMaterial("COPPER",   "moreores:copper",   10, new int[]{2,4,3,2}, 14, SoundEvents.ITEM_ARMOR_EQUIP_IRON,    0.0f);
    public static final ArmorMaterial TIN_ARMOR      = EnumHelper.addArmorMaterial("TIN",      "moreores:tin",       8, new int[]{1,3,2,1}, 14, SoundEvents.ITEM_ARMOR_EQUIP_IRON,    0.0f);
    public static final ArmorMaterial SILVER_ARMOR   = EnumHelper.addArmorMaterial("SILVER",   "moreores:silver",   16, new int[]{2,5,4,2}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,    0.5f);

    // ===== GEMS & INGOTS =====
    public static Item RUBY_GEM, SAPPHIRE_GEM, TOPAZ_GEM, AMETHYST_GEM;
    public static Item TITANIUM_INGOT, COPPER_INGOT, TIN_INGOT, SILVER_INGOT;

    // ===== TOOLS =====
    // Ruby
    public static Item RUBY_SWORD, RUBY_PICKAXE, RUBY_AXE, RUBY_SHOVEL, RUBY_HOE;
    // Sapphire
    public static Item SAPPHIRE_SWORD, SAPPHIRE_PICKAXE, SAPPHIRE_AXE, SAPPHIRE_SHOVEL, SAPPHIRE_HOE;
    // Topaz
    public static Item TOPAZ_SWORD, TOPAZ_PICKAXE, TOPAZ_AXE, TOPAZ_SHOVEL, TOPAZ_HOE;
    // Amethyst
    public static Item AMETHYST_SWORD, AMETHYST_PICKAXE, AMETHYST_AXE, AMETHYST_SHOVEL, AMETHYST_HOE;
    // Titanium
    public static Item TITANIUM_SWORD, TITANIUM_PICKAXE, TITANIUM_AXE, TITANIUM_SHOVEL, TITANIUM_HOE;
    // Copper
    public static Item COPPER_SWORD, COPPER_PICKAXE, COPPER_AXE, COPPER_SHOVEL, COPPER_HOE;
    // Tin
    public static Item TIN_SWORD, TIN_PICKAXE, TIN_AXE, TIN_SHOVEL, TIN_HOE;
    // Silver
    public static Item SILVER_SWORD, SILVER_PICKAXE, SILVER_AXE, SILVER_SHOVEL, SILVER_HOE;

    // ===== ARMOR =====
    // Ruby
    public static Item RUBY_HELMET, RUBY_CHESTPLATE, RUBY_LEGGINGS, RUBY_BOOTS;
    // Sapphire
    public static Item SAPPHIRE_HELMET, SAPPHIRE_CHESTPLATE, SAPPHIRE_LEGGINGS, SAPPHIRE_BOOTS;
    // Topaz
    public static Item TOPAZ_HELMET, TOPAZ_CHESTPLATE, TOPAZ_LEGGINGS, TOPAZ_BOOTS;
    // Amethyst
    public static Item AMETHYST_HELMET, AMETHYST_CHESTPLATE, AMETHYST_LEGGINGS, AMETHYST_BOOTS;
    // Titanium
    public static Item TITANIUM_HELMET, TITANIUM_CHESTPLATE, TITANIUM_LEGGINGS, TITANIUM_BOOTS;
    // Copper
    public static Item COPPER_HELMET, COPPER_CHESTPLATE, COPPER_LEGGINGS, COPPER_BOOTS;
    // Tin
    public static Item TIN_HELMET, TIN_CHESTPLATE, TIN_LEGGINGS, TIN_BOOTS;
    // Silver
    public static Item SILVER_HELMET, SILVER_CHESTPLATE, SILVER_LEGGINGS, SILVER_BOOTS;

    public static void register() {
        // Gems & Ingots
        RUBY_GEM      = reg(new ItemBase("ruby_gem"));
        SAPPHIRE_GEM  = reg(new ItemBase("sapphire_gem"));
        TOPAZ_GEM     = reg(new ItemBase("topaz_gem"));
        AMETHYST_GEM  = reg(new ItemBase("amethyst_gem"));
        TITANIUM_INGOT= reg(new ItemBase("titanium_ingot"));
        COPPER_INGOT  = reg(new ItemBase("copper_ingot"));
        TIN_INGOT     = reg(new ItemBase("tin_ingot"));
        SILVER_INGOT  = reg(new ItemBase("silver_ingot"));

        // Ruby tools
        RUBY_SWORD    = reg(new ItemSword(RUBY_TOOL)    .setRegistryName(MoreOresMod.MODID, "ruby_sword")   .setUnlocalizedName(MoreOresMod.MODID+".ruby_sword")   .setCreativeTab(MoreOresMod.TAB));
        RUBY_PICKAXE  = reg(new ItemPickaxe(RUBY_TOOL)  .setRegistryName(MoreOresMod.MODID, "ruby_pickaxe") .setUnlocalizedName(MoreOresMod.MODID+".ruby_pickaxe") .setCreativeTab(MoreOresMod.TAB));
        RUBY_AXE      = reg(new ItemAxe(RUBY_TOOL, 9.0f, -3.1f).setRegistryName(MoreOresMod.MODID, "ruby_axe").setUnlocalizedName(MoreOresMod.MODID+".ruby_axe").setCreativeTab(MoreOresMod.TAB));
        RUBY_SHOVEL   = reg(new ItemSpade(RUBY_TOOL)    .setRegistryName(MoreOresMod.MODID, "ruby_shovel")  .setUnlocalizedName(MoreOresMod.MODID+".ruby_shovel")  .setCreativeTab(MoreOresMod.TAB));
        RUBY_HOE      = reg(new ItemHoe(RUBY_TOOL)      .setRegistryName(MoreOresMod.MODID, "ruby_hoe")     .setUnlocalizedName(MoreOresMod.MODID+".ruby_hoe")     .setCreativeTab(MoreOresMod.TAB));

        // Sapphire tools
        SAPPHIRE_SWORD   = reg(new ItemSword(SAPPHIRE_TOOL)   .setRegistryName(MoreOresMod.MODID, "sapphire_sword")   .setUnlocalizedName(MoreOresMod.MODID+".sapphire_sword")   .setCreativeTab(MoreOresMod.TAB));
        SAPPHIRE_PICKAXE = reg(new ItemPickaxe(SAPPHIRE_TOOL) .setRegistryName(MoreOresMod.MODID, "sapphire_pickaxe") .setUnlocalizedName(MoreOresMod.MODID+".sapphire_pickaxe") .setCreativeTab(MoreOresMod.TAB));
        SAPPHIRE_AXE     = reg(new ItemAxe(SAPPHIRE_TOOL, 9.0f, -3.1f).setRegistryName(MoreOresMod.MODID, "sapphire_axe").setUnlocalizedName(MoreOresMod.MODID+".sapphire_axe").setCreativeTab(MoreOresMod.TAB));
        SAPPHIRE_SHOVEL  = reg(new ItemSpade(SAPPHIRE_TOOL)   .setRegistryName(MoreOresMod.MODID, "sapphire_shovel")  .setUnlocalizedName(MoreOresMod.MODID+".sapphire_shovel")  .setCreativeTab(MoreOresMod.TAB));
        SAPPHIRE_HOE     = reg(new ItemHoe(SAPPHIRE_TOOL)     .setRegistryName(MoreOresMod.MODID, "sapphire_hoe")     .setUnlocalizedName(MoreOresMod.MODID+".sapphire_hoe")     .setCreativeTab(MoreOresMod.TAB));

        // Topaz tools
        TOPAZ_SWORD   = reg(new ItemSword(TOPAZ_TOOL)   .setRegistryName(MoreOresMod.MODID, "topaz_sword")   .setUnlocalizedName(MoreOresMod.MODID+".topaz_sword")   .setCreativeTab(MoreOresMod.TAB));
        TOPAZ_PICKAXE = reg(new ItemPickaxe(TOPAZ_TOOL) .setRegistryName(MoreOresMod.MODID, "topaz_pickaxe") .setUnlocalizedName(MoreOresMod.MODID+".topaz_pickaxe") .setCreativeTab(MoreOresMod.TAB));
        TOPAZ_AXE     = reg(new ItemAxe(TOPAZ_TOOL, 8.0f, -3.1f).setRegistryName(MoreOresMod.MODID, "topaz_axe").setUnlocalizedName(MoreOresMod.MODID+".topaz_axe").setCreativeTab(MoreOresMod.TAB));
        TOPAZ_SHOVEL  = reg(new ItemSpade(TOPAZ_TOOL)   .setRegistryName(MoreOresMod.MODID, "topaz_shovel")  .setUnlocalizedName(MoreOresMod.MODID+".topaz_shovel")  .setCreativeTab(MoreOresMod.TAB));
        TOPAZ_HOE     = reg(new ItemHoe(TOPAZ_TOOL)     .setRegistryName(MoreOresMod.MODID, "topaz_hoe")     .setUnlocalizedName(MoreOresMod.MODID+".topaz_hoe")     .setCreativeTab(MoreOresMod.TAB));

        // Amethyst tools
        AMETHYST_SWORD   = reg(new ItemSword(AMETHYST_TOOL)   .setRegistryName(MoreOresMod.MODID, "amethyst_sword")   .setUnlocalizedName(MoreOresMod.MODID+".amethyst_sword")   .setCreativeTab(MoreOresMod.TAB));
        AMETHYST_PICKAXE = reg(new ItemPickaxe(AMETHYST_TOOL) .setRegistryName(MoreOresMod.MODID, "amethyst_pickaxe") .setUnlocalizedName(MoreOresMod.MODID+".amethyst_pickaxe") .setCreativeTab(MoreOresMod.TAB));
        AMETHYST_AXE     = reg(new ItemAxe(AMETHYST_TOOL, 9.0f, -3.1f).setRegistryName(MoreOresMod.MODID, "amethyst_axe").setUnlocalizedName(MoreOresMod.MODID+".amethyst_axe").setCreativeTab(MoreOresMod.TAB));
        AMETHYST_SHOVEL  = reg(new ItemSpade(AMETHYST_TOOL)   .setRegistryName(MoreOresMod.MODID, "amethyst_shovel")  .setUnlocalizedName(MoreOresMod.MODID+".amethyst_shovel")  .setCreativeTab(MoreOresMod.TAB));
        AMETHYST_HOE     = reg(new ItemHoe(AMETHYST_TOOL)     .setRegistryName(MoreOresMod.MODID, "amethyst_hoe")     .setUnlocalizedName(MoreOresMod.MODID+".amethyst_hoe")     .setCreativeTab(MoreOresMod.TAB));

        // Titanium tools
        TITANIUM_SWORD   = reg(new ItemSword(TITANIUM_TOOL)   .setRegistryName(MoreOresMod.MODID, "titanium_sword")   .setUnlocalizedName(MoreOresMod.MODID+".titanium_sword")   .setCreativeTab(MoreOresMod.TAB));
        TITANIUM_PICKAXE = reg(new ItemPickaxe(TITANIUM_TOOL) .setRegistryName(MoreOresMod.MODID, "titanium_pickaxe") .setUnlocalizedName(MoreOresMod.MODID+".titanium_pickaxe") .setCreativeTab(MoreOresMod.TAB));
        TITANIUM_AXE     = reg(new ItemAxe(TITANIUM_TOOL, 12.0f, -3.0f).setRegistryName(MoreOresMod.MODID, "titanium_axe").setUnlocalizedName(MoreOresMod.MODID+".titanium_axe").setCreativeTab(MoreOresMod.TAB));
        TITANIUM_SHOVEL  = reg(new ItemSpade(TITANIUM_TOOL)   .setRegistryName(MoreOresMod.MODID, "titanium_shovel")  .setUnlocalizedName(MoreOresMod.MODID+".titanium_shovel")  .setCreativeTab(MoreOresMod.TAB));
        TITANIUM_HOE     = reg(new ItemHoe(TITANIUM_TOOL)     .setRegistryName(MoreOresMod.MODID, "titanium_hoe")     .setUnlocalizedName(MoreOresMod.MODID+".titanium_hoe")     .setCreativeTab(MoreOresMod.TAB));

        // Copper tools
        COPPER_SWORD   = reg(new ItemSword(COPPER_TOOL)   .setRegistryName(MoreOresMod.MODID, "copper_sword")   .setUnlocalizedName(MoreOresMod.MODID+".copper_sword")   .setCreativeTab(MoreOresMod.TAB));
        COPPER_PICKAXE = reg(new ItemPickaxe(COPPER_TOOL) .setRegistryName(MoreOresMod.MODID, "copper_pickaxe") .setUnlocalizedName(MoreOresMod.MODID+".copper_pickaxe") .setCreativeTab(MoreOresMod.TAB));
        COPPER_AXE     = reg(new ItemAxe(COPPER_TOOL, 7.0f, -3.2f).setRegistryName(MoreOresMod.MODID, "copper_axe").setUnlocalizedName(MoreOresMod.MODID+".copper_axe").setCreativeTab(MoreOresMod.TAB));
        COPPER_SHOVEL  = reg(new ItemSpade(COPPER_TOOL)   .setRegistryName(MoreOresMod.MODID, "copper_shovel")  .setUnlocalizedName(MoreOresMod.MODID+".copper_shovel")  .setCreativeTab(MoreOresMod.TAB));
        COPPER_HOE     = reg(new ItemHoe(COPPER_TOOL)     .setRegistryName(MoreOresMod.MODID, "copper_hoe")     .setUnlocalizedName(MoreOresMod.MODID+".copper_hoe")     .setCreativeTab(MoreOresMod.TAB));

        // Tin tools
        TIN_SWORD   = reg(new ItemSword(TIN_TOOL)   .setRegistryName(MoreOresMod.MODID, "tin_sword")   .setUnlocalizedName(MoreOresMod.MODID+".tin_sword")   .setCreativeTab(MoreOresMod.TAB));
        TIN_PICKAXE = reg(new ItemPickaxe(TIN_TOOL) .setRegistryName(MoreOresMod.MODID, "tin_pickaxe") .setUnlocalizedName(MoreOresMod.MODID+".tin_pickaxe") .setCreativeTab(MoreOresMod.TAB));
        TIN_AXE     = reg(new ItemAxe(TIN_TOOL, 6.0f, -3.2f).setRegistryName(MoreOresMod.MODID, "tin_axe").setUnlocalizedName(MoreOresMod.MODID+".tin_axe").setCreativeTab(MoreOresMod.TAB));
        TIN_SHOVEL  = reg(new ItemSpade(TIN_TOOL)   .setRegistryName(MoreOresMod.MODID, "tin_shovel")  .setUnlocalizedName(MoreOresMod.MODID+".tin_shovel")  .setCreativeTab(MoreOresMod.TAB));
        TIN_HOE     = reg(new ItemHoe(TIN_TOOL)     .setRegistryName(MoreOresMod.MODID, "tin_hoe")     .setUnlocalizedName(MoreOresMod.MODID+".tin_hoe")     .setCreativeTab(MoreOresMod.TAB));

        // Silver tools
        SILVER_SWORD   = reg(new ItemSword(SILVER_TOOL)   .setRegistryName(MoreOresMod.MODID, "silver_sword")   .setUnlocalizedName(MoreOresMod.MODID+".silver_sword")   .setCreativeTab(MoreOresMod.TAB));
        SILVER_PICKAXE = reg(new ItemPickaxe(SILVER_TOOL) .setRegistryName(MoreOresMod.MODID, "silver_pickaxe") .setUnlocalizedName(MoreOresMod.MODID+".silver_pickaxe") .setCreativeTab(MoreOresMod.TAB));
        SILVER_AXE     = reg(new ItemAxe(SILVER_TOOL, 8.0f, -3.1f).setRegistryName(MoreOresMod.MODID, "silver_axe").setUnlocalizedName(MoreOresMod.MODID+".silver_axe").setCreativeTab(MoreOresMod.TAB));
        SILVER_SHOVEL  = reg(new ItemSpade(SILVER_TOOL)   .setRegistryName(MoreOresMod.MODID, "silver_shovel")  .setUnlocalizedName(MoreOresMod.MODID+".silver_shovel")  .setCreativeTab(MoreOresMod.TAB));
        SILVER_HOE     = reg(new ItemHoe(SILVER_TOOL)     .setRegistryName(MoreOresMod.MODID, "silver_hoe")     .setUnlocalizedName(MoreOresMod.MODID+".silver_hoe")     .setCreativeTab(MoreOresMod.TAB));

        // Armor
        registerArmorSet("ruby",      RUBY_ARMOR);
        registerArmorSet("sapphire",  SAPPHIRE_ARMOR);
        registerArmorSet("topaz",     TOPAZ_ARMOR);
        registerArmorSet("amethyst",  AMETHYST_ARMOR);
        registerArmorSet("titanium",  TITANIUM_ARMOR);
        registerArmorSet("copper",    COPPER_ARMOR);
        registerArmorSet("tin",       TIN_ARMOR);
        registerArmorSet("silver",    SILVER_ARMOR);
    }

    private static void registerArmorSet(String name, ArmorMaterial mat) {
        Item helmet     = new ItemArmor(mat, 0, EntityEquipmentSlot.HEAD)      .setRegistryName(MoreOresMod.MODID, name+"_helmet")     .setUnlocalizedName(MoreOresMod.MODID+"."+name+"_helmet")     .setCreativeTab(MoreOresMod.TAB);
        Item chest      = new ItemArmor(mat, 0, EntityEquipmentSlot.CHEST)     .setRegistryName(MoreOresMod.MODID, name+"_chestplate") .setUnlocalizedName(MoreOresMod.MODID+"."+name+"_chestplate") .setCreativeTab(MoreOresMod.TAB);
        Item leggings   = new ItemArmor(mat, 0, EntityEquipmentSlot.LEGS)      .setRegistryName(MoreOresMod.MODID, name+"_leggings")   .setUnlocalizedName(MoreOresMod.MODID+"."+name+"_leggings")   .setCreativeTab(MoreOresMod.TAB);
        Item boots      = new ItemArmor(mat, 0, EntityEquipmentSlot.FEET)      .setRegistryName(MoreOresMod.MODID, name+"_boots")      .setUnlocalizedName(MoreOresMod.MODID+"."+name+"_boots")      .setCreativeTab(MoreOresMod.TAB);
        ForgeRegistries.ITEMS.register(helmet);
        ForgeRegistries.ITEMS.register(chest);
        ForgeRegistries.ITEMS.register(leggings);
        ForgeRegistries.ITEMS.register(boots);
        // Store references
        switch(name) {
            case "ruby":     RUBY_HELMET=helmet;     RUBY_CHESTPLATE=chest;     RUBY_LEGGINGS=leggings;     RUBY_BOOTS=boots;     break;
            case "sapphire": SAPPHIRE_HELMET=helmet; SAPPHIRE_CHESTPLATE=chest; SAPPHIRE_LEGGINGS=leggings; SAPPHIRE_BOOTS=boots; break;
            case "topaz":    TOPAZ_HELMET=helmet;    TOPAZ_CHESTPLATE=chest;    TOPAZ_LEGGINGS=leggings;    TOPAZ_BOOTS=boots;    break;
            case "amethyst": AMETHYST_HELMET=helmet; AMETHYST_CHESTPLATE=chest; AMETHYST_LEGGINGS=leggings; AMETHYST_BOOTS=boots; break;
            case "titanium": TITANIUM_HELMET=helmet; TITANIUM_CHESTPLATE=chest; TITANIUM_LEGGINGS=leggings; TITANIUM_BOOTS=boots; break;
            case "copper":   COPPER_HELMET=helmet;   COPPER_CHESTPLATE=chest;   COPPER_LEGGINGS=leggings;   COPPER_BOOTS=boots;   break;
            case "tin":      TIN_HELMET=helmet;      TIN_CHESTPLATE=chest;      TIN_LEGGINGS=leggings;      TIN_BOOTS=boots;      break;
            case "silver":   SILVER_HELMET=helmet;   SILVER_CHESTPLATE=chest;   SILVER_LEGGINGS=leggings;   SILVER_BOOTS=boots;   break;
        }
    }

    private static Item reg(Item item) {
        ForgeRegistries.ITEMS.register(item);
        return item;
    }

    public static void registerRecipes() {
        registerOreRecipes("ruby",      RUBY_GEM,      ModBlocks.RUBY_ORE);
        registerOreRecipes("sapphire",  SAPPHIRE_GEM,  ModBlocks.SAPPHIRE_ORE);
        registerOreRecipes("topaz",     TOPAZ_GEM,     ModBlocks.TOPAZ_ORE);
        registerOreRecipes("amethyst",  AMETHYST_GEM,  ModBlocks.AMETHYST_ORE);
        registerOreRecipes("titanium",  TITANIUM_INGOT,ModBlocks.TITANIUM_ORE);
        registerOreRecipes("copper",    COPPER_INGOT,  ModBlocks.COPPER_ORE);
        registerOreRecipes("tin",       TIN_INGOT,     ModBlocks.TIN_ORE);
        registerOreRecipes("silver",    SILVER_INGOT,  ModBlocks.SILVER_ORE);
    }

    private static void registerOreRecipes(String name, Item gem, net.minecraft.block.Block oreBlock) {
        net.minecraftforge.fml.common.registry.GameRegistry.addSmelting(oreBlock, new net.minecraft.item.ItemStack(gem), 1.0f);

        Item sword=null, pick=null, axe=null, shovel=null, hoe=null;
        Item helmet=null, chest=null, legs=null, boots=null;
        switch(name) {
            case "ruby":     sword=RUBY_SWORD;     pick=RUBY_PICKAXE;     axe=RUBY_AXE;     shovel=RUBY_SHOVEL;     hoe=RUBY_HOE;     helmet=RUBY_HELMET;     chest=RUBY_CHESTPLATE;     legs=RUBY_LEGGINGS;     boots=RUBY_BOOTS;     break;
            case "sapphire": sword=SAPPHIRE_SWORD; pick=SAPPHIRE_PICKAXE; axe=SAPPHIRE_AXE; shovel=SAPPHIRE_SHOVEL; hoe=SAPPHIRE_HOE; helmet=SAPPHIRE_HELMET; chest=SAPPHIRE_CHESTPLATE; legs=SAPPHIRE_LEGGINGS; boots=SAPPHIRE_BOOTS; break;
            case "topaz":    sword=TOPAZ_SWORD;    pick=TOPAZ_PICKAXE;    axe=TOPAZ_AXE;    shovel=TOPAZ_SHOVEL;    hoe=TOPAZ_HOE;    helmet=TOPAZ_HELMET;    chest=TOPAZ_CHESTPLATE;    legs=TOPAZ_LEGGINGS;    boots=TOPAZ_BOOTS;    break;
            case "amethyst": sword=AMETHYST_SWORD; pick=AMETHYST_PICKAXE; axe=AMETHYST_AXE; shovel=AMETHYST_SHOVEL; hoe=AMETHYST_HOE; helmet=AMETHYST_HELMET; chest=AMETHYST_CHESTPLATE; legs=AMETHYST_LEGGINGS; boots=AMETHYST_BOOTS; break;
            case "titanium": sword=TITANIUM_SWORD; pick=TITANIUM_PICKAXE; axe=TITANIUM_AXE; shovel=TITANIUM_SHOVEL; hoe=TITANIUM_HOE; helmet=TITANIUM_HELMET; chest=TITANIUM_CHESTPLATE; legs=TITANIUM_LEGGINGS; boots=TITANIUM_BOOTS; break;
            case "copper":   sword=COPPER_SWORD;   pick=COPPER_PICKAXE;   axe=COPPER_AXE;   shovel=COPPER_SHOVEL;   hoe=COPPER_HOE;   helmet=COPPER_HELMET;   chest=COPPER_CHESTPLATE;   legs=COPPER_LEGGINGS;   boots=COPPER_BOOTS;   break;
            case "tin":      sword=TIN_SWORD;      pick=TIN_PICKAXE;      axe=TIN_AXE;      shovel=TIN_SHOVEL;      hoe=TIN_HOE;      helmet=TIN_HELMET;      chest=TIN_CHESTPLATE;      legs=TIN_LEGGINGS;      boots=TIN_BOOTS;      break;
            case "silver":   sword=SILVER_SWORD;   pick=SILVER_PICKAXE;   axe=SILVER_AXE;   shovel=SILVER_SHOVEL;   hoe=SILVER_HOE;   helmet=SILVER_HELMET;   chest=SILVER_CHESTPLATE;   legs=SILVER_LEGGINGS;   boots=SILVER_BOOTS;   break;
        }
        if(sword==null) return;

        net.minecraft.item.ItemStack g = new net.minecraft.item.ItemStack(gem);
        net.minecraft.item.ItemStack s = new net.minecraft.item.ItemStack(Items.STICK);

        // Sword: gem gem stick
        net.minecraftforge.fml.common.registry.GameRegistry.addRecipe(new net.minecraft.item.ItemStack(sword),
                " G ", " G ", " S ", 'G', g, 'S', s);
        // Pickaxe
        net.minecraftforge.fml.common.registry.GameRegistry.addRecipe(new net.minecraft.item.ItemStack(pick),
                "GGG", " S ", " S ", 'G', g, 'S', s);
        // Axe
        net.minecraftforge.fml.common.registry.GameRegistry.addRecipe(new net.minecraft.item.ItemStack(axe),
                "GG ", "GS ", " S ", 'G', g, 'S', s);
        // Shovel
        net.minecraftforge.fml.common.registry.GameRegistry.addRecipe(new net.minecraft.item.ItemStack(shovel),
                " G ", " S ", " S ", 'G', g, 'S', s);
        // Hoe
        net.minecraftforge.fml.common.registry.GameRegistry.addRecipe(new net.minecraft.item.ItemStack(hoe),
                "GG ", " S ", " S ", 'G', g, 'S', s);
        // Helmet
        net.minecraftforge.fml.common.registry.GameRegistry.addRecipe(new net.minecraft.item.ItemStack(helmet),
                "GGG", "G G", "   ", 'G', g);
        // Chestplate
        net.minecraftforge.fml.common.registry.GameRegistry.addRecipe(new net.minecraft.item.ItemStack(chest),
                "G G", "GGG", "GGG", 'G', g);
        // Leggings
        net.minecraftforge.fml.common.registry.GameRegistry.addRecipe(new net.minecraft.item.ItemStack(legs),
                "GGG", "G G", "G G", 'G', g);
        // Boots
        net.minecraftforge.fml.common.registry.GameRegistry.addRecipe(new net.minecraft.item.ItemStack(boots),
                "   ", "G G", "G G", 'G', g);
    }
}
