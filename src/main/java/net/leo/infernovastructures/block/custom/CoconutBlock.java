package net.leo.infernovastructures.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;


public class CoconutBlock extends Block  {


    private static final VoxelShape SHAPE = Block.createCuboidShape(4, 0, 4, 12, 8, 12);



    public CoconutBlock(Settings settings) {
        super(settings);
    }

    public static DirectionProperty FACING = DirectionProperty.of("number",
            Direction.UP,
            Direction.NORTH,
            Direction.EAST,
            Direction.SOUTH,
            Direction.WEST,
            Direction.DOWN);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return getRandomBlockState();
    }
    public BlockState getRandomBlockState() {
        return this.getDefaultState().with(FACING, getRandomDirection());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    private Direction getRandomDirection() {
        Direction[] dirs = new Direction[] {
                Direction.UP,
                Direction.NORTH,
                Direction.EAST,
                Direction.SOUTH,
                Direction.WEST,
                Direction.DOWN
        };

        return dirs[Random.create().nextBetween(0, dirs.length-1)];
    }


    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }



}
