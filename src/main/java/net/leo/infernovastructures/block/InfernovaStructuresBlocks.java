package net.leo.infernovastructures.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.leo.infernovastructures.InfernovaStructures;
import net.leo.infernovastructures.block.custom.CoconutBlock;
import net.leo.infernovastructures.block.custom.LeavesBlockSimple;
import net.leo.infernovastructures.block.custom.LuminousMushroom;
import net.leo.infernovastructures.world.tree.CrystalSaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;


public class InfernovaStructuresBlocks {

    public  static final Block SANDSTONE_PILLAR = registerBlock("sandstone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));

    public  static final Block SANDSTONE_SPIRAL = registerBlock("sandstone_spiral",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));

    public  static final Block P_SANDSTONE = registerBlock("p_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));

    public  static final Block S_SANDSTONE = registerBlock("s_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));

    public  static final Block CRYSTAL_LEAVES = registerBlock("crystal_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().strength(0.18f)));



    public  static final Block STRIPPED_CRYSTAL_LOG = registerBlock("stripped_crystal_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));

    public  static final Block STRIPPED_CRYSTAL_WOOD = registerBlock("stripped_crystal_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public  static final Block CRYSTAL_PLANKS = registerBlock("crystal_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public  static final Block SUGILITE_ORE = registerBlock("sugilite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));

    public  static final Block DEEPSLATE_SUGILITE_ORE = registerBlock("deepslate_sugilite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE)));

    public  static final Block CRYSTAL_LOG = registerBlock("crystal_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));

    public  static final Block CRYSTAL_WOOD = registerBlock("crystal_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));



    public  static final Block CRYSTAL_STAIRS = registerBlock("crystal_stairs",
            new StairsBlock(InfernovaStructuresBlocks.CRYSTAL_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public  static final Block CRYSTAL_BUTTON = registerBlock("crystal_button",
            new ButtonBlock(BlockSetType.OAK, 10 , FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public  static final Block CRYSTAL_SLAB = registerBlock("crystal_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public  static final Block CRYSTAL_PRESSURE_PLATE = registerBlock("crystal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block CRYSTAL_FENCE = registerBlock("crystal_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block CRYSTAL_FENCE_GATE = registerBlock("crystal_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block CRYSTAL_DOOR = registerBlock("crystal_door",
            new DoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block CRYSTAL_TRAPDOOR = registerBlock("crystal_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    public  static final Block CRACKED_SMOOTH_SANDSTONE = registerBlock("cracked_smooth_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));

















    public static final Block QUICKSAND  = registerBlockWithoutItem( "quicksand", new QuickSandBlock(FabricBlockSettings.copyOf(Blocks.POWDER_SNOW).strength(0.25f).
            sounds(BlockSoundGroup.SAND).mapColor(MapColor.PALE_YELLOW)));

    public static final Block QUICKREDSAND = registerBlockWithoutItem( "quickredsand", new QuickredsandBlock(FabricBlockSettings.copyOf(Blocks.POWDER_SNOW).strength(0.25f).
            sounds(BlockSoundGroup.SAND).mapColor(MapColor.ORANGE)));

    public static final Block FLOWING_MUD = registerBlockWithoutItem( "flowing_mud", new FlowingMudBlock(FabricBlockSettings.copyOf(Blocks.POWDER_SNOW).strength(0.5f).
            sounds(BlockSoundGroup.MUD).mapColor(MapColor.TERRACOTTA_CYAN)));

    public static final Block SILTY_CLAY = registerBlockWithoutItem( "silty_clay", new SiltyClayBlock(FabricBlockSettings.copyOf(Blocks.POWDER_SNOW).strength(0.6f).
            sounds(BlockSoundGroup.GRAVEL).mapColor(MapColor.LIGHT_BLUE_GRAY)));



    public  static final Block CRYSTAL_FLOWER = registerBlock("crystal_flower",
            new FlowerBlock(StatusEffects.HASTE, 10,  FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));

    public  static final Block POTTED_CRYSTAL_FLOWER = registerBlock("potted_crystal_flower",
            new FlowerPotBlock(CRYSTAL_FLOWER, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));

    public static final Block TAMARISK = registerBlock("tamarisk", new INShortgrass
            (FabricBlockSettings.copyOf(Blocks.SHORT_GRASS).mapColor(MapColor.PALE_YELLOW).nonOpaque()));


    public static final Block REED = registerBlock("reed", new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH).nonOpaque().noCollision()));

    public static final Block WICKER = registerBlock("wicker", new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH).nonOpaque().noCollision()));

    public static final Block COCONUT_BLOCK = registerBlockWithoutItem("coconut_block",
            new CoconutBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    public  static final Block SPARKLEFLORA = registerBlock("sparkleflora",
            new FlowerBlock(StatusEffects.GLOWING, 8,  FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));

    public  static final Block POTTED_SPARKLEFLORA = registerBlock("potted_sparklefora",
            new FlowerPotBlock(SPARKLEFLORA, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));

    public  static final Block BEGONIA = registerBlock("begonia",
            new FlowerBlock(StatusEffects.SATURATION, 9,  FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));

    public  static final Block POTTED_BEGONIA = registerBlock("potted_begonia",
            new FlowerPotBlock(BEGONIA, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));

    public static final Block LEAVES_BLOCK = registerBlockWithoutItem("leaves_block", new LeavesBlockSimple(FabricBlockSettings.copyOf(Blocks.LILY_PAD).nonOpaque().noCollision().replaceable()));










    public  static final Block CRYSTAL_SAPLING = registerBlock("crystal_sapling",
            new SaplingBlock(CrystalSaplingGenerator.CRYSTAL, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).nonOpaque().noCollision()));


    public  static final Block LUMINOUS_MUSHROOM = registerBlockWithoutItem("luminous_mushroom",
            new LuminousMushroom(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).sounds(BlockSoundGroup.GRASS).noCollision()));
















    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(InfernovaStructures.MOD_ID, name ), block);

    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(InfernovaStructures.MOD_ID, name ),
                new BlockItem(block, new FabricItemSettings()));

    }

    private static Block registerBlockWithoutItem (String name, Block block){
        return Registry.register(Registries.BLOCK, new Identifier(InfernovaStructures.MOD_ID, name), block);

    }

    public static void registerInfernovaStructuresBlocks(){
        InfernovaStructures.LOGGER.info("Registering Mod Blocks for "+ InfernovaStructures.MOD_ID);
    }
}
