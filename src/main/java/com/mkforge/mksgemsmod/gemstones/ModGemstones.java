package com.mkforge.mksgemsmod.gemstones;

import com.mkforge.mksgemsmod.MKsGemsMod;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = MKsGemsMod.MODID)
public class ModGemstones {

    public static final Item RUBY = new Item()
        .setRegistryName(MKsGemsMod.MODID, "ruby")
        .setTranslationKey("ruby")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item ONYX = new Item()
        .setRegistryName(MKsGemsMod.MODID, "onyx")
        .setTranslationKey("onyx")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item TOPAZ = new Item()
        .setRegistryName(MKsGemsMod.MODID, "topaz")
        .setTranslationKey("topaz")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item SAPPHIRE = new Item()
        .setRegistryName(MKsGemsMod.MODID, "sapphire")
        .setTranslationKey("sapphire")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item JADE = new Item()
        .setRegistryName(MKsGemsMod.MODID, "jade")
        .setTranslationKey("jade")
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Item[] GEMSTONES = {
        RUBY, ONYX, TOPAZ, SAPPHIRE, JADE
    };

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        for (Item item : GEMSTONES) {
            registry.register(item);
        }
    }
}