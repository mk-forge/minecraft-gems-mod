package com.mkforge.mksgemsmod;

import com.mkforge.mksgemsmod.armor.ModArmor;
import com.mkforge.mksgemsmod.blocks.ModBlocks;
import com.mkforge.mksgemsmod.gemstones.ModGemstones;
import com.mkforge.mksgemsmod.tools.ModTools;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = MKsGemsMod.MODID, value = Side.CLIENT)
public class ModModels {

    @SubscribeEvent
    public static void onModelRegistry(ModelRegistryEvent event) {
        for (Item item : ModGemstones.GEMSTONES)
            registerItemModel(item);

        for (Item item : ModTools.TOOLS)
            registerItemModel(item);

        for (Item item : ModArmor.ARMOR)
            registerItemModel(item);

        registerItemModel(Item.getItemFromBlock(ModBlocks.RUBY_ORE));
        registerItemModel(Item.getItemFromBlock(ModBlocks.ONYX_ORE));
        registerItemModel(Item.getItemFromBlock(ModBlocks.TOPAZ_ORE));
        registerItemModel(Item.getItemFromBlock(ModBlocks.SAPPHIRE_ORE));
        registerItemModel(Item.getItemFromBlock(ModBlocks.JADE_ORE));

        registerItemModel(Item.getItemFromBlock(ModBlocks.RUBY_BLOCK));
        registerItemModel(Item.getItemFromBlock(ModBlocks.ONYX_BLOCK));
        registerItemModel(Item.getItemFromBlock(ModBlocks.TOPAZ_BLOCK));
        registerItemModel(Item.getItemFromBlock(ModBlocks.SAPPHIRE_BLOCK));
        registerItemModel(Item.getItemFromBlock(ModBlocks.JADE_BLOCK));
    }

    private static void registerItemModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}