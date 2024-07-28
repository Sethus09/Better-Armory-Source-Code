
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.setho.betterarmorymod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BetterArmoryModModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(Items.GOLD_INGOT, 15), new ItemStack(BetterArmoryModModItems.AVARITIA_SWORD.get()), 1, 5, 0.05f));
		}
	}
}
