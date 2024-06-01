package net.leo.infernovastructures.world.tree;

import net.leo.infernovastructures.InfernovaStructures;
import net.leo.infernovastructures.mixin.TrunkPlacerTypeInvoker;
import net.leo.infernovastructures.world.tree.custom.CrystalTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class INTrunkPlacerTypes {
    public static final TrunkPlacerType<?> CRYSTAL_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("crystal_trunk_placer", CrystalTrunkPlacer.CODEC);

    public static void register() {
        InfernovaStructures.LOGGER.info("Registering Trunk Placers for " + InfernovaStructures.MOD_ID);
    }
}
