package com.mkforge.mksgemsmod;

import com.mkforge.mksgemsmod.gemstones.ModGemstones;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = MKsGemsMod.MODID, name = MKsGemsMod.NAME, version = MKsGemsMod.VERSION)
public class MKsGemsMod {

    public static final String MODID = "mksgemsmod";
    public static final String NAME = "MK's Gems Mod";
    public static final String VERSION = "1.0.0";
    private static final int ORE_GEN_PRIORITY = 0;

    public static final CreativeTabs GEMS_TAB = new CreativeTabs("gems_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModGemstones.RUBY);
        }
    };

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new ModOreGeneration(), ORE_GEN_PRIORITY);
    }
}