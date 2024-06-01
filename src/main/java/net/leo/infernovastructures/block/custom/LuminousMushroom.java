package net.leo.infernovastructures.block.custom;

import net.leo.infernovastructures.block.InfernovaStructuresBlocks;
import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;

public class LuminousMushroom extends Block {

    private static final VoxelShape SHAPE = Block.createCuboidShape(0, 0, 0, 16, 16, 16);
    public LuminousMushroom(Settings settings) {
        super(settings);
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }


    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        if (floor.isOf(InfernovaStructuresBlocks.LUMINOUS_MUSHROOM)) {
            return false;

        }
        return floor.isIn(BlockTags.DIRT);

    }


    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.down();
        return this.canPlantOnTop(world.getBlockState(blockPos), world, blockPos);

    }

}
