
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.setho.betterarmorymod.init;

import net.setho.betterarmorymod.BetterArmoryModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class BetterArmoryModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BetterArmoryModMod.MODID);
	public static final RegistryObject<SoundEvent> FREEZE_HIT = REGISTRY.register("freeze_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("better_armory_mod", "freeze_hit")));
	public static final RegistryObject<SoundEvent> SPECTRA_HIT = REGISTRY.register("spectra_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("better_armory_mod", "spectra_hit")));
	public static final RegistryObject<SoundEvent> IGNITUS_HIT = REGISTRY.register("ignitus_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("better_armory_mod", "ignitus_hit")));
	public static final RegistryObject<SoundEvent> SANDRYCT_HIT = REGISTRY.register("sandryct_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("better_armory_mod", "sandryct_hit")));
	public static final RegistryObject<SoundEvent> TIDANIR_HIT = REGISTRY.register("tidanir_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("better_armory_mod", "tidanir_hit")));
	public static final RegistryObject<SoundEvent> VENOSSA_HIT = REGISTRY.register("venossa_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("better_armory_mod", "venossa_hit")));
	public static final RegistryObject<SoundEvent> RADIANCE_HIT = REGISTRY.register("radiance_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("better_armory_mod", "radiance_hit")));
	public static final RegistryObject<SoundEvent> SWORDFISH_HIT = REGISTRY.register("swordfish_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("better_armory_mod", "swordfish_hit")));
	public static final RegistryObject<SoundEvent> ENDSLASH_HIT = REGISTRY.register("endslash_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("better_armory_mod", "endslash_hit")));
	public static final RegistryObject<SoundEvent> ECHO_HIT = REGISTRY.register("echo_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("better_armory_mod", "echo_hit")));
	public static final RegistryObject<SoundEvent> DRAGONFLAME_HIT = REGISTRY.register("dragonflame_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("better_armory_mod", "dragonflame_hit")));
}
