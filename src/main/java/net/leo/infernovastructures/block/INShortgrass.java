package net.leo.infernovastructures.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class Tamariskplant extends PlantBlock implements Fertilizable {

    public static final MapCodec<net.minecraft.block.ShortPlantBlock> CODEC = net.minecraft.block.ShortPlantBlock.createCodec(net.minecraft.block.ShortPlantBlock::new);
    protected static final VoxelShape SHAPE = Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

    protected Tamariskplant(Settings settings) {
        super(settings);
    }

    public MapCodec<net.minecraft.block.ShortPlantBlock> getCodec() {
            return CODEC;
        }



        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return SHAPE;
        }

        @Override
        public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
            return false;
        }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return false;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {

    }

}
