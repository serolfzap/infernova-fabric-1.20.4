package net.leo.infernovastructures.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.leo.infernovastructures.item.InfernovaStructuresItems;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class INCustomTrades {
    public static void registerCustomTrades(){
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 25),
                            new ItemStack(InfernovaStructuresItems.EXPLOSIVE_GLOVE, 1),
                            3, 5, 0.08f
                    ));
                });
    }
}
