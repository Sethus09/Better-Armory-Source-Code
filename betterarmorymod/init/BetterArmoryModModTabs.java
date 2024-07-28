
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.setho.betterarmorymod.init;

import net.setho.betterarmorymod.BetterArmoryModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class BetterArmoryModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterArmoryModMod.MODID);
	public static final RegistryObject<CreativeModeTab> BETTER_ARMORY_TAB = REGISTRY.register("better_armory_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.better_armory_mod.better_armory_tab")).icon(() -> new ItemStack(BetterArmoryModModItems.BETTER_ARMORY_ICON.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BetterArmoryModModItems.ICICLE_SWORD.get());
				tabData.accept(BetterArmoryModModItems.VENOSSA_SWORD.get());
				tabData.accept(BetterArmoryModModItems.SPECTRA_SWORD.get());
				tabData.accept(BetterArmoryModModItems.TIDANIR_SWORD.get());
				tabData.accept(BetterArmoryModModItems.AVARITIA_SWORD.get());
				tabData.accept(BetterArmoryModModItems.IGNITUS_SWORD.get());
				tabData.accept(BetterArmoryModModItems.SOULDREAD_SWORD.get());
				tabData.accept(BetterArmoryModModItems.SANDRYCT_SWORD.get());
				tabData.accept(BetterArmoryModModItems.TECPATL_DAGGER.get());
				tabData.accept(BetterArmoryModModItems.GILDED_SWORD.get());
				tabData.accept(BetterArmoryModModItems.RADIANCE_SWORD.get());
				tabData.accept(BetterArmoryModModItems.SPEAR_FISH.get());
				tabData.accept(BetterArmoryModModItems.ENDSLASH_SWORD.get());
				tabData.accept(BetterArmoryModModItems.ECHO_SWORD.get());
			})

					.build());
}
