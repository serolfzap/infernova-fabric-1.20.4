package net.leo.infernovastructures.entity.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.leo.infernovastructures.InfernovaStructures;
import net.leo.infernovastructures.block.InfernovaStructuresBlocks;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class INVillager {


    public static final RegistryKey<PointOfInterestType> MINER_POI_KEY = poiKey("minerpoi");
    public static  final PointOfInterestType MINER_POI = registerpoi("minerpoi",
            InfernovaStructuresBlocks.SANDSTONE_PILLAR);

    public static final VillagerProfession MINER = registerProfession("miner", MINER_POI_KEY);


    private static VillagerProfession registerProfession(String name,  RegistryKey<PointOfInterestType> type){
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(InfernovaStructures.MOD_ID, name),
                new VillagerProfession(name, pointOfInterestTypeRegistryEntry ->
                        pointOfInterestTypeRegistryEntry.matchesKey(type),
                        pointOfInterestTypeRegistryEntry -> pointOfInterestTypeRegistryEntry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_ARMORER
                ));

    }

    private static PointOfInterestType registerpoi(String name, Block block ){
        return PointOfInterestHelper.register(new Identifier(InfernovaStructures.MOD_ID, name),
                1, 1, block);

    }

    private static RegistryKey<PointOfInterestType> poiKey(String name){
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE,new Identifier(InfernovaStructures.MOD_ID, name));
    }
    public static void  registerVillagers(){
        InfernovaStructures.LOGGER.info("Registering Villagers " + InfernovaStructures.MOD_ID);
    }
}
