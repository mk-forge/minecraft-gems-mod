package com.mkforge.mksgemsmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

public class ModOres extends Block {

    private final Item dropItem;

    public ModOres(Item dropItem) {
        super(Material.ROCK);
        this.dropItem = dropItem;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return dropItem;
    }

    @Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
        return 1 + RANDOM.nextInt(3); // 1–3 XP
    }
}