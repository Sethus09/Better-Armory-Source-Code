
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.setho.betterarmorymod.init;

import net.setho.betterarmorymod.item.VenossaItem;
import net.setho.betterarmorymod.item.TidanirItem;
import net.setho.betterarmorymod.item.TecpatlItem;
import net.setho.betterarmorymod.item.SwordFishItem;
import net.setho.betterarmorymod.item.SpectraItem;
import net.setho.betterarmorymod.item.SouldreadItem;
import net.setho.betterarmorymod.item.SonicBoomTextureItem;
import net.setho.betterarmorymod.item.SandryctItem;
import net.setho.betterarmorymod.item.RadianceItem;
import net.setho.betterarmorymod.item.IgnitusItem;
import net.setho.betterarmorymod.item.IcicleItem;
import net.setho.betterarmorymod.item.GildedSwordItem;
import net.setho.betterarmorymod.item.EndslashItem;
import net.setho.betterarmorymod.item.EchoSwordItem;
import net.setho.betterarmorymod.item.DragonFlameTextureItem;
import net.setho.betterarmorymod.item.BetterArmoryIconItem;
import net.setho.betterarmorymod.item.AvaritiaItem;
import net.setho.betterarmorymod.BetterArmoryModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class BetterArmoryModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BetterArmoryModMod.MODID);
	public static final RegistryObject<Item> ICICLE_SWORD = REGISTRY.register("icicle_sword", () -> new IcicleItem());
	public static final RegistryObject<Item> VENOSSA_SWORD = REGISTRY.register("venossa_sword", () -> new VenossaItem());
	public static final RegistryObject<Item> SPECTRA_SWORD = REGISTRY.register("spectra_sword", () -> new SpectraItem());
	public static final RegistryObject<Item> TIDANIR_SWORD = REGISTRY.register("tidanir_sword", () -> new TidanirItem());
	public static final RegistryObject<Item> AVARITIA_SWORD = REGISTRY.register("avaritia_sword", () -> new AvaritiaItem());
	public static final RegistryObject<Item> IGNITUS_SWORD = REGISTRY.register("ignitus_sword", () -> new IgnitusItem());
	public static final RegistryObject<Item> SOULDREAD_SWORD = REGISTRY.register("souldread_sword", () -> new SouldreadItem());
	public static final RegistryObject<Item> SANDRYCT_SWORD = REGISTRY.register("sandryct_sword", () -> new SandryctItem());
	public static final RegistryObject<Item> TECPATL_DAGGER = REGISTRY.register("tecpatl_dagger", () -> new TecpatlItem());
	public static final RegistryObject<Item> GILDED_SWORD = REGISTRY.register("gilded_sword", () -> new GildedSwordItem());
	public static final RegistryObject<Item> RADIANCE_SWORD = REGISTRY.register("radiance_sword", () -> new RadianceItem());
	public static final RegistryObject<Item> SPEAR_FISH = REGISTRY.register("spear_fish", () -> new SwordFishItem());
	public static final RegistryObject<Item> ENDSLASH_SWORD = REGISTRY.register("endslash_sword", () -> new EndslashItem());
	public static final RegistryObject<Item> ECHO_SWORD = REGISTRY.register("echo_sword", () -> new EchoSwordItem());
	public static final RegistryObject<Item> DRAGON_FLAME_TEXTURE = REGISTRY.register("dragon_flame_texture", () -> new DragonFlameTextureItem());
	public static final RegistryObject<Item> SONIC_BOOM_TEXTURE = REGISTRY.register("sonic_boom_texture", () -> new SonicBoomTextureItem());
	public static final RegistryObject<Item> BETTER_ARMORY_ICON = REGISTRY.register("better_armory_icon", () -> new BetterArmoryIconItem());
	// Start of user code block custom items
	// End of user code block custom items
}
