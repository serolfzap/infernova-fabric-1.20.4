package net.leo.infernovastructures.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.leo.infernovastructures.InfernovaStructures;
import net.leo.infernovastructures.block.InfernovaStructuresBlocks;
import net.leo.infernovastructures.item.custom.CoconutItem;
import net.leo.infernovastructures.item.custom.ExplosiveGlove;
import net.leo.infernovastructures.item.custom.LuminousMushroomItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class InfernovaStructuresItems {

    public static final Item COCONUT = registerItem("coconut", new CoconutItem(InfernovaStructuresBlocks.COCONUT_BLOCK, new FabricItemSettings()));
    public static final Item SUGILITE = registerItem("sugilite", new Item(new FabricItemSettings()));

    public static final Item LEAVES = registerItem("leaves",new PlaceableOnWaterItem(InfernovaStructuresBlocks.LEAVES_BLOCK, new FabricItemSettings()));




    public static final Item QUICKSAND_BUCKET = registerItem("quicksand_bucket",
            new PowderSnowBucketItem(InfernovaStructuresBlocks.QUICKSAND,  SoundEvents.ITEM_BUCKET_EMPTY,
                    new Item.Settings().maxCount(1)));

    public static final Item QUICKREDSAND_BUCKET = registerItem("quickredsand_bucket",
            new PowderSnowBucketItem(InfernovaStructuresBlocks.QUICKREDSAND,  SoundEvents.ITEM_BUCKET_EMPTY,
                    new Item.Settings().maxCount(1)));

    public static final Item FLOWING_MUD_BUCKET = registerItem("flowing_mud_bucket",
            new PowderSnowBucketItem(InfernovaStructuresBlocks.FLOWING_MUD,  SoundEvents.ITEM_BUCKET_EMPTY,
                    new Item.Settings().maxCount(1)));

    public static final Item SILTY_CLAY_BUCKET = registerItem("silty_clay_bucket",
            new PowderSnowBucketItem(InfernovaStructuresBlocks.SILTY_CLAY,  SoundEvents.ITEM_BUCKET_EMPTY,
                    new FabricItemSettings().maxCount(1)));

    public static final Item EXPLOSIVE_GLOVE = registerItem("explosive_glove",new ExplosiveGlove(INToolMaterial.IRON_GLOVE, new FabricItemSettings()));


    public static final Item LUMINOUS_MUSHROOM = registerItem("luminous_mushroom",new LuminousMushroomItem(InfernovaStructuresBlocks.LUMINOUS_MUSHROOM, new FabricItemSettings()));

    public static final Item SUGILSHARD_IRON_PICKAXE = registerItem("sugilshard_iron_pickaxe", new PickaxeItem(ToolMaterials.IRON, 2, -2.8F, new FabricItemSettings()));

    public static final Item SUGILSHARD_IRON_SHOVEL = registerItem("sugilshard_iron_shovel", new ShovelItem(ToolMaterials.IRON, 2.5F, -2.9F, new FabricItemSettings()));











    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries ){
        entries.add(COCONUT);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(InfernovaStructures.MOD_ID, name), item);
    }
    public static void registerInfernovaStructuresItems() {
        InfernovaStructures.LOGGER.info("Registering Mod Items for " + InfernovaStructures.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(InfernovaStructuresItems::addItemsToIngredientItemGroup);
    }
}
