package com.mkforge.mksgemsmod;

import com.mkforge.mksgemsmod.blocks.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import java.util.Random;

public class ModOreGeneration implements IWorldGenerator {

    private static final int OVERWORLD_DIMENSION = 0;
    private static final int VEIN_SIZE = 4;
    private static final int CHANCES = 3;
    private static final int MIN_Y = 5;
    private static final int MAX_Y = 30;

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (world.provider.getDimension() == OVERWORLD_DIMENSION) {
            generateOre(world, random, chunkX, chunkZ, ModBlocks.RUBY_ORE.getDefaultState());
            generateOre(world, random, chunkX, chunkZ, ModBlocks.ONYX_ORE.getDefaultState());
            generateOre(world, random, chunkX, chunkZ, ModBlocks.TOPAZ_ORE.getDefaultState());
            generateOre(world, random, chunkX, chunkZ, ModBlocks.SAPPHIRE_ORE.getDefaultState());
            generateOre(world, random, chunkX, chunkZ, ModBlocks.JADE_ORE.getDefaultState());
        }
    }

    private void generateOre(World world, Random random, int chunkX, int chunkZ, IBlockState ore) {
        WorldGenMinable generator = new WorldGenMinable(ore, VEIN_SIZE);

        for (int i = 0; i < CHANCES; i++) {
            int posX = chunkX * 16 + random.nextInt(16);
            int posY = MIN_Y + random.nextInt(MAX_Y - MIN_Y);
            int posZ = chunkZ * 16 + random.nextInt(16);
            generator.generate(world, random, new BlockPos(posX, posY, posZ));
        }
    }
}