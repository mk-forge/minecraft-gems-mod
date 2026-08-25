package com.mkforge.mksgemsmod.tools;

import com.mkforge.mksgemsmod.MKsGemsMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSword;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.common.util.EnumHelper;

@Mod.EventBusSubscriber(modid = MKsGemsMod.MODID)
public class ModTools {

    private static final int HARVEST_LEVEL = 4;
    private static final int DURABILITY = 2000;
    private static final float MINING_SPEED = 9.0F;
    private static final float DAMAGE = 4.0F;
    private static final int ENCHANTABILITY = 12;

    private static final float AXE_DAMAGE = 6.0F;
    private static final float AXE_SPEED = -2.9F;

    private static final Item.ToolMaterial GEM_TOOL = EnumHelper.addToolMaterial(
        "GEM", HARVEST_LEVEL, DURABILITY, MINING_SPEED, DAMAGE, ENCHANTABILITY
    );

    public static final Item RUBY_PICKAXE = new ModPickaxes(GEM_TOOL)
        .setRegistryName(MKsGemsMod.MODID, "ruby_pickaxe")
        .setTranslationKey("ruby_pickaxe")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item RUBY_AXE = new ModAxes(GEM_TOOL, AXE_DAMAGE, AXE_SPEED)
        .setRegistryName(MKsGemsMod.MODID, "ruby_axe")
        .setTranslationKey("ruby_axe")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item RUBY_SHOVEL = new ItemSpade(GEM_TOOL)
        .setRegistryName(MKsGemsMod.MODID, "ruby_shovel")
        .setTranslationKey("ruby_shovel")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item RUBY_HOE = new ItemHoe(GEM_TOOL)
        .setRegistryName(MKsGemsMod.MODID, "ruby_hoe")
        .setTranslationKey("ruby_hoe")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item RUBY_SWORD = new ItemSword(GEM_TOOL)
        .setRegistryName(MKsGemsMod.MODID, "ruby_sword")
        .setTranslationKey("ruby_sword")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item ONYX_PICKAXE = new ModPickaxes(GEM_TOOL)
        .setRegistryName(MKsGemsMod.MODID, "onyx_pickaxe")
        .setTranslationKey("onyx_pickaxe")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item ONYX_AXE = new ModAxes(GEM_TOOL, AXE_DAMAGE, AXE_SPEED)
        .setRegistryName(MKsGemsMod.MODID, "onyx_axe")
        .setTranslationKey("onyx_axe")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item ONYX_SHOVEL = new ItemSpade(GEM_TOOL)
        .setRegistryName(MKsGemsMod.MODID, "onyx_shovel")
        .setTranslationKey("onyx_shovel")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item ONYX_HOE = new ItemHoe(GEM_TOOL)
        .setRegistryName(MKsGemsMod.MODID, "onyx_hoe")
        .setTranslationKey("onyx_hoe")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item ONYX_SWORD = new ItemSword(GEM_TOOL)
        .setRegistryName(MKsGemsMod.MODID, "onyx_sword")
        .setTranslationKey("onyx_sword")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item TOPAZ_PICKAXE = new ModPickaxes(GEM_TOOL)
        .setRegistryName(MKsGemsMod.MODID, "topaz_pickaxe")
        .setTranslationKey("topaz_pickaxe")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item TOPAZ_AXE = new ModAxes(GEM_TOOL, AXE_DAMAGE, AXE_SPEED)
        .setRegistryName(MKsGemsMod.MODID, "topaz_axe")
        .setTranslationKey("topaz_axe")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item TOPAZ_SHOVEL = new ItemSpade(GEM_TOOL)
        .setRegistryName(MKsGemsMod.MODID, "topaz_shovel")
        .setTranslationKey("topaz_shovel")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item TOPAZ_HOE = new ItemHoe(GEM_TOOL)
        .setRegistryName(MKsGemsMod.MODID, "topaz_hoe")
        .setTranslationKey("topaz_hoe")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item TOPAZ_SWORD = new ItemSword(GEM_TOOL)
        .setRegistryName(MKsGemsMod.MODID, "topaz_sword")
        .setTranslationKey("topaz_sword")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item SAPPHIRE_PICKAXE = new ModPickaxes(GEM_TOOL)
        .setRegistryName(MKsGemsMod.MODID, "sapphire_pickaxe")
        .setTranslationKey("sapphire_pickaxe")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item SAPPHIRE_AXE = new ModAxes(GEM_TOOL, AXE_DAMAGE, AXE_SPEED)
        .setRegistryName(MKsGemsMod.MODID, "sapphire_axe")
        .setTranslationKey("sapphire_axe")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item SAPPHIRE_SHOVEL = new ItemSpade(GEM_TOOL)
        .setRegistryName(MKsGemsMod.MODID, "sapphire_shovel")
        .setTranslationKey("sapphire_shovel")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item SAPPHIRE_HOE = new ItemHoe(GEM_TOOL)
        .setRegistryName(MKsGemsMod.MODID, "sapphire_hoe")
        .setTranslationKey("sapphire_hoe")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item SAPPHIRE_SWORD = new ItemSword(GEM_TOOL)
        .setRegistryName(MKsGemsMod.MODID, "sapphire_sword")
        .setTranslationKey("sapphire_sword")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item JADE_PICKAXE = new ModPickaxes(GEM_TOOL)
        .setRegistryName(MKsGemsMod.MODID, "jade_pickaxe")
        .setTranslationKey("jade_pickaxe")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item JADE_AXE = new ModAxes(GEM_TOOL, AXE_DAMAGE, AXE_SPEED)
        .setRegistryName(MKsGemsMod.MODID, "jade_axe")
        .setTranslationKey("jade_axe")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item JADE_SHOVEL = new ItemSpade(GEM_TOOL)
        .setRegistryName(MKsGemsMod.MODID, "jade_shovel")
        .setTranslationKey("jade_shovel")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item JADE_HOE = new ItemHoe(GEM_TOOL)
        .setRegistryName(MKsGemsMod.MODID, "jade_hoe")
        .setTranslationKey("jade_hoe")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item JADE_SWORD = new ItemSword(GEM_TOOL)
        .setRegistryName(MKsGemsMod.MODID, "jade_sword")
        .setTranslationKey("jade_sword")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item[] TOOLS = {
        RUBY_PICKAXE, RUBY_AXE, RUBY_SHOVEL, RUBY_HOE, RUBY_SWORD,
        ONYX_PICKAXE, ONYX_AXE, ONYX_SHOVEL, ONYX_HOE, ONYX_SWORD,
        TOPAZ_PICKAXE, TOPAZ_AXE, TOPAZ_SHOVEL, TOPAZ_HOE, TOPAZ_SWORD,
        SAPPHIRE_PICKAXE, SAPPHIRE_AXE, SAPPHIRE_SHOVEL, SAPPHIRE_HOE, SAPPHIRE_SWORD,
        JADE_PICKAXE, JADE_AXE, JADE_SHOVEL, JADE_HOE, JADE_SWORD
    };

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        for (Item item : TOOLS) {
            registry.register(item);
        }
    }
}