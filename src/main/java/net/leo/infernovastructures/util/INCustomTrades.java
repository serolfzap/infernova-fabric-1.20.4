package net.leo.infernovastructures.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.leo.infernovastructures.entity.villager.INVillager;
import net.leo.infernovastructures.item.InfernovaStructuresItems;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class INCustomTrades {
    public static void registerCustomTrades(){
        TradeOfferHelper.registerVillagerOffers(INVillager.MINER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 30),
                            new ItemStack(InfernovaStructuresItems.EXPLOSIVE_GLOVE, 1),
                            3, 5, 0.08f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 25),
                            new ItemStack(Items.IRON_PICKAXE, 1),
                            3, 5, 0.08f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 25),
                            new ItemStack(Items.IRON_SHOVEL, 1),
                            3, 5, 0.08f
                    ));
                });

        TradeOfferHelper.registerVillagerOffers(INVillager.MINER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 30),
                            new ItemStack(Items.DIAMOND_PICKAXE, 1),
                            3, 5, 0.08f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 25),
                            new ItemStack(Items.DIAMOND_SHOVEL, 1),
                            3, 5, 0.08f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD_BLOCK, 5),
                            new ItemStack(Items.DIAMOND, 2),
                            new ItemStack(InfernovaStructuresItems.SUGILITE, 8),
                            3, 5, 0.08f
                    ));
                });
    }
}
