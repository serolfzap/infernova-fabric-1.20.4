package net.leo.infernovastructures.world.tree;

import net.leo.infernovastructures.world.INConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class CrystalSaplingGenerator  {
    public static final SaplingGenerator CRYSTAL =
            new SaplingGenerator("crystal", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(INConfiguredFeatures.CRYSTAL_KEY),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());



}
