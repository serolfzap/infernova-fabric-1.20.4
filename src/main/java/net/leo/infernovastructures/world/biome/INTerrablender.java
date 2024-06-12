package net.leo.infernovastructures.world.biome;

import net.leo.infernovastructures.InfernovaStructures;
import net.leo.infernovastructures.world.biome.surface.INMaterialRules;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class INTerrablender implements TerraBlenderApi {

    @Override
    public void onTerraBlenderInitialized(){
        Regions.register(new INOverworldRegion(new Identifier(InfernovaStructures.MOD_ID, "overworld"), 4));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, InfernovaStructures.MOD_ID, INMaterialRules.makeRules());
    }
}
