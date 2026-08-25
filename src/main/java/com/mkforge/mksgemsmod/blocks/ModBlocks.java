package com.mkforge.mksgemsmod.blocks;

import com.mkforge.mksgemsmod.MKsGemsMod;
import com.mkforge.mksgemsmod.gemstones.ModGemstones;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = MKsGemsMod.MODID)
public class ModBlocks {

    private static final float ORE_HARDNESS = 3.0F;
    private static final float ORE_RESISTANCE = 5.0F;
    private static final float BLOCK_HARDNESS = 5.0F;
    private static final float BLOCK_RESISTANCE = 6.0F;
    private static final int HARVEST_LEVEL = 2;

    public static final Block RUBY_ORE = new ModOres(ModGemstones.RUBY)
        .setRegistryName(MKsGemsMod.MODID, "ruby_ore")
        .setTranslationKey("ruby_ore")
        .setHardness(ORE_HARDNESS)
        .setResistance(ORE_RESISTANCE)
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Block ONYX_ORE = new ModOres(ModGemstones.ONYX)
        .setRegistryName(MKsGemsMod.MODID, "onyx_ore")
        .setTranslationKey("onyx_ore")
        .setHardness(ORE_HARDNESS)
        .setResistance(ORE_RESISTANCE)
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Block TOPAZ_ORE = new ModOres(ModGemstones.TOPAZ)
        .setRegistryName(MKsGemsMod.MODID, "topaz_ore")
        .setTranslationKey("topaz_ore")
        .setHardness(ORE_HARDNESS)
        .setResistance(ORE_RESISTANCE)
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Block SAPPHIRE_ORE = new ModOres(ModGemstones.SAPPHIRE)
        .setRegistryName(MKsGemsMod.MODID, "sapphire_ore")
        .setTranslationKey("sapphire_ore")
        .setHardness(ORE_HARDNESS)
        .setResistance(ORE_RESISTANCE)
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Block JADE_ORE = new ModOres(ModGemstones.JADE)
        .setRegistryName(MKsGemsMod.MODID, "jade_ore")
        .setTranslationKey("jade_ore")
        .setHardness(ORE_HARDNESS)
        .setResistance(ORE_RESISTANCE)
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Block RUBY_BLOCK = new Block(Material.ROCK)
        .setRegistryName(MKsGemsMod.MODID, "ruby_block")
        .setTranslationKey("ruby_block")
        .setHardness(BLOCK_HARDNESS)
        .setResistance(BLOCK_RESISTANCE)
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Block ONYX_BLOCK = new Block(Material.ROCK)
        .setRegistryName(MKsGemsMod.MODID, "onyx_block")
        .setTranslationKey("onyx_block")
        .setHardness(BLOCK_HARDNESS)
        .setResistance(BLOCK_RESISTANCE)
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Block TOPAZ_BLOCK = new Block(Material.ROCK)
        .setRegistryName(MKsGemsMod.MODID, "topaz_block")
        .setTranslationKey("topaz_block")
        .setHardness(BLOCK_HARDNESS)
        .setResistance(BLOCK_RESISTANCE)
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Block SAPPHIRE_BLOCK = new Block(Material.ROCK)
        .setRegistryName(MKsGemsMod.MODID, "sapphire_block")
        .setTranslationKey("sapphire_block")
        .setHardness(BLOCK_HARDNESS)
        .setResistance(BLOCK_RESISTANCE)
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    public static final Block JADE_BLOCK = new Block(Material.ROCK)
        .setRegistryName(MKsGemsMod.MODID, "jade_block")
        .setTranslationKey("jade_block")
        .setHardness(BLOCK_HARDNESS)
        .setResistance(BLOCK_RESISTANCE)
        .setCreativeTab(MKsGemsMod.GEMS_TAB);

    static {
        RUBY_ORE.setHarvestLevel("pickaxe", HARVEST_LEVEL);
        ONYX_ORE.setHarvestLevel("pickaxe", HARVEST_LEVEL);
        TOPAZ_ORE.setHarvestLevel("pickaxe", HARVEST_LEVEL);
        SAPPHIRE_ORE.setHarvestLevel("pickaxe", HARVEST_LEVEL);
        JADE_ORE.setHarvestLevel("pickaxe", HARVEST_LEVEL);
        RUBY_BLOCK.setHarvestLevel("pickaxe", HARVEST_LEVEL);
        ONYX_BLOCK.setHarvestLevel("pickaxe", HARVEST_LEVEL);
        TOPAZ_BLOCK.setHarvestLevel("pickaxe", HARVEST_LEVEL);
        SAPPHIRE_BLOCK.setHarvestLevel("pickaxe", HARVEST_LEVEL);
        JADE_BLOCK.setHarvestLevel("pickaxe", HARVEST_LEVEL);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(RUBY_ORE);
        registry.register(ONYX_ORE);
        registry.register(TOPAZ_ORE);
        registry.register(SAPPHIRE_ORE);
        registry.register(JADE_ORE);
        registry.register(RUBY_BLOCK);
        registry.register(ONYX_BLOCK);
        registry.register(TOPAZ_BLOCK);
        registry.register(SAPPHIRE_BLOCK);
        registry.register(JADE_BLOCK);
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(new ItemBlock(RUBY_ORE).setRegistryName(RUBY_ORE.getRegistryName()));
        registry.register(new ItemBlock(ONYX_ORE).setRegistryName(ONYX_ORE.getRegistryName()));
        registry.register(new ItemBlock(TOPAZ_ORE).setRegistryName(TOPAZ_ORE.getRegistryName()));
        registry.register(new ItemBlock(SAPPHIRE_ORE).setRegistryName(SAPPHIRE_ORE.getRegistryName()));
        registry.register(new ItemBlock(JADE_ORE).setRegistryName(JADE_ORE.getRegistryName()));
        registry.register(new ItemBlock(RUBY_BLOCK).setRegistryName(RUBY_BLOCK.getRegistryName()));
        registry.register(new ItemBlock(ONYX_BLOCK).setRegistryName(ONYX_BLOCK.getRegistryName()));
        registry.register(new ItemBlock(TOPAZ_BLOCK).setRegistryName(TOPAZ_BLOCK.getRegistryName()));
        registry.register(new ItemBlock(SAPPHIRE_BLOCK).setRegistryName(SAPPHIRE_BLOCK.getRegistryName()));
        registry.register(new ItemBlock(JADE_BLOCK).setRegistryName(JADE_BLOCK.getRegistryName()));
    }
}