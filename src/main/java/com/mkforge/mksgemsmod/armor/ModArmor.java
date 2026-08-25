package com.mkforge.mksgemsmod.armor;

import com.mkforge.mksgemsmod.MKsGemsMod;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.common.util.EnumHelper;

@Mod.EventBusSubscriber(modid = MKsGemsMod.MODID)
public class ModArmor {

    private static final int ARMOR_DURABILITY = 25;
    private static final int[] ARMOR_REDUCTION = { 4, 7, 9, 4 }; // { boots, legs, chest, helmet }
    private static final int ARMOR_ENCHANTABILITY = 12;
    private static final float ARMOR_TOUGHNESS = 2.5F;
    private static final int ARMOR_RENDER_INDEX = 0;

    private static final ItemArmor.ArmorMaterial RUBY_ARMOR_MATERIAL = EnumHelper.addArmorMaterial(
        "RUBY", MKsGemsMod.MODID + ":ruby", ARMOR_DURABILITY, ARMOR_REDUCTION, ARMOR_ENCHANTABILITY, SoundEvents.ITEM_ARMOR_EQUIP_IRON, ARMOR_TOUGHNESS
    );

    private static final ItemArmor.ArmorMaterial ONYX_ARMOR_MATERIAL = EnumHelper.addArmorMaterial(
        "ONYX", MKsGemsMod.MODID + ":onyx", ARMOR_DURABILITY, ARMOR_REDUCTION, ARMOR_ENCHANTABILITY, SoundEvents.ITEM_ARMOR_EQUIP_IRON, ARMOR_TOUGHNESS
    );

    private static final ItemArmor.ArmorMaterial TOPAZ_ARMOR_MATERIAL = EnumHelper.addArmorMaterial(
        "TOPAZ", MKsGemsMod.MODID + ":topaz", ARMOR_DURABILITY, ARMOR_REDUCTION, ARMOR_ENCHANTABILITY, SoundEvents.ITEM_ARMOR_EQUIP_IRON, ARMOR_TOUGHNESS
    );

    private static final ItemArmor.ArmorMaterial SAPPHIRE_ARMOR_MATERIAL = EnumHelper.addArmorMaterial(
        "SAPPHIRE", MKsGemsMod.MODID + ":sapphire", ARMOR_DURABILITY, ARMOR_REDUCTION, ARMOR_ENCHANTABILITY, SoundEvents.ITEM_ARMOR_EQUIP_IRON, ARMOR_TOUGHNESS
    );

    private static final ItemArmor.ArmorMaterial JADE_ARMOR_MATERIAL = EnumHelper.addArmorMaterial(
        "JADE", MKsGemsMod.MODID + ":jade", ARMOR_DURABILITY, ARMOR_REDUCTION, ARMOR_ENCHANTABILITY, SoundEvents.ITEM_ARMOR_EQUIP_IRON, ARMOR_TOUGHNESS
    );

    public static final Item RUBY_HELMET = new ItemArmor(RUBY_ARMOR_MATERIAL, ARMOR_RENDER_INDEX, EntityEquipmentSlot.HEAD)
        .setRegistryName(MKsGemsMod.MODID, "ruby_helmet")
        .setTranslationKey("ruby_helmet")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item RUBY_CHESTPLATE = new ItemArmor(RUBY_ARMOR_MATERIAL, ARMOR_RENDER_INDEX, EntityEquipmentSlot.CHEST)
        .setRegistryName(MKsGemsMod.MODID, "ruby_chestplate")
        .setTranslationKey("ruby_chestplate")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item RUBY_LEGGINGS = new ItemArmor(RUBY_ARMOR_MATERIAL, ARMOR_RENDER_INDEX, EntityEquipmentSlot.LEGS)
        .setRegistryName(MKsGemsMod.MODID, "ruby_leggings")
        .setTranslationKey("ruby_leggings")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item RUBY_BOOTS = new ItemArmor(RUBY_ARMOR_MATERIAL, ARMOR_RENDER_INDEX, EntityEquipmentSlot.FEET)
        .setRegistryName(MKsGemsMod.MODID, "ruby_boots")
        .setTranslationKey("ruby_boots")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item ONYX_HELMET = new ItemArmor(ONYX_ARMOR_MATERIAL, ARMOR_RENDER_INDEX, EntityEquipmentSlot.HEAD)
        .setRegistryName(MKsGemsMod.MODID, "onyx_helmet")
        .setTranslationKey("onyx_helmet")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item ONYX_CHESTPLATE = new ItemArmor(ONYX_ARMOR_MATERIAL, ARMOR_RENDER_INDEX, EntityEquipmentSlot.CHEST)
        .setRegistryName(MKsGemsMod.MODID, "onyx_chestplate")
        .setTranslationKey("onyx_chestplate")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item ONYX_LEGGINGS = new ItemArmor(ONYX_ARMOR_MATERIAL, ARMOR_RENDER_INDEX, EntityEquipmentSlot.LEGS)
        .setRegistryName(MKsGemsMod.MODID, "onyx_leggings")
        .setTranslationKey("onyx_leggings")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item ONYX_BOOTS = new ItemArmor(ONYX_ARMOR_MATERIAL, ARMOR_RENDER_INDEX, EntityEquipmentSlot.FEET)
        .setRegistryName(MKsGemsMod.MODID, "onyx_boots")
        .setTranslationKey("onyx_boots")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item TOPAZ_HELMET = new ItemArmor(TOPAZ_ARMOR_MATERIAL, ARMOR_RENDER_INDEX, EntityEquipmentSlot.HEAD)
        .setRegistryName(MKsGemsMod.MODID, "topaz_helmet")
        .setTranslationKey("topaz_helmet")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item TOPAZ_CHESTPLATE = new ItemArmor(TOPAZ_ARMOR_MATERIAL, ARMOR_RENDER_INDEX, EntityEquipmentSlot.CHEST)
        .setRegistryName(MKsGemsMod.MODID, "topaz_chestplate")
        .setTranslationKey("topaz_chestplate")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item TOPAZ_LEGGINGS = new ItemArmor(TOPAZ_ARMOR_MATERIAL, ARMOR_RENDER_INDEX, EntityEquipmentSlot.LEGS)
        .setRegistryName(MKsGemsMod.MODID, "topaz_leggings")
        .setTranslationKey("topaz_leggings")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item TOPAZ_BOOTS = new ItemArmor(TOPAZ_ARMOR_MATERIAL, ARMOR_RENDER_INDEX, EntityEquipmentSlot.FEET)
        .setRegistryName(MKsGemsMod.MODID, "topaz_boots")
        .setTranslationKey("topaz_boots")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item SAPPHIRE_HELMET = new ItemArmor(SAPPHIRE_ARMOR_MATERIAL, ARMOR_RENDER_INDEX, EntityEquipmentSlot.HEAD)
        .setRegistryName(MKsGemsMod.MODID, "sapphire_helmet")
        .setTranslationKey("sapphire_helmet")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item SAPPHIRE_CHESTPLATE = new ItemArmor(SAPPHIRE_ARMOR_MATERIAL, ARMOR_RENDER_INDEX, EntityEquipmentSlot.CHEST)
        .setRegistryName(MKsGemsMod.MODID, "sapphire_chestplate")
        .setTranslationKey("sapphire_chestplate")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item SAPPHIRE_LEGGINGS = new ItemArmor(SAPPHIRE_ARMOR_MATERIAL, ARMOR_RENDER_INDEX, EntityEquipmentSlot.LEGS)
        .setRegistryName(MKsGemsMod.MODID, "sapphire_leggings")
        .setTranslationKey("sapphire_leggings")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item SAPPHIRE_BOOTS = new ItemArmor(SAPPHIRE_ARMOR_MATERIAL, ARMOR_RENDER_INDEX, EntityEquipmentSlot.FEET)
        .setRegistryName(MKsGemsMod.MODID, "sapphire_boots")
        .setTranslationKey("sapphire_boots")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item JADE_HELMET = new ItemArmor(JADE_ARMOR_MATERIAL, ARMOR_RENDER_INDEX, EntityEquipmentSlot.HEAD)
        .setRegistryName(MKsGemsMod.MODID, "jade_helmet")
        .setTranslationKey("jade_helmet")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item JADE_CHESTPLATE = new ItemArmor(JADE_ARMOR_MATERIAL, ARMOR_RENDER_INDEX, EntityEquipmentSlot.CHEST)
        .setRegistryName(MKsGemsMod.MODID, "jade_chestplate")
        .setTranslationKey("jade_chestplate")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item JADE_LEGGINGS = new ItemArmor(JADE_ARMOR_MATERIAL, ARMOR_RENDER_INDEX, EntityEquipmentSlot.LEGS)
        .setRegistryName(MKsGemsMod.MODID, "jade_leggings")
        .setTranslationKey("jade_leggings")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item JADE_BOOTS = new ItemArmor(JADE_ARMOR_MATERIAL, ARMOR_RENDER_INDEX, EntityEquipmentSlot.FEET)
        .setRegistryName(MKsGemsMod.MODID, "jade_boots")
        .setTranslationKey("jade_boots")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item[] ARMOR = {
        RUBY_HELMET, RUBY_CHESTPLATE, RUBY_LEGGINGS, RUBY_BOOTS,
        ONYX_HELMET, ONYX_CHESTPLATE, ONYX_LEGGINGS, ONYX_BOOTS,
        TOPAZ_HELMET, TOPAZ_CHESTPLATE, TOPAZ_LEGGINGS, TOPAZ_BOOTS,
        SAPPHIRE_HELMET, SAPPHIRE_CHESTPLATE, SAPPHIRE_LEGGINGS, SAPPHIRE_BOOTS,
        JADE_HELMET, JADE_CHESTPLATE, JADE_LEGGINGS, JADE_BOOTS
    };

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        for (Item item : ARMOR) {
            registry.register(item);
        }
    }
}