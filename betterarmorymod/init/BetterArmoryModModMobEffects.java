
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.setho.betterarmorymod.init;

import net.setho.betterarmorymod.potion.EchoCorruptionMobEffect;
import net.setho.betterarmorymod.BetterArmoryModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class BetterArmoryModModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, BetterArmoryModMod.MODID);
	public static final RegistryObject<MobEffect> ECHO_CORRUPTION = REGISTRY.register("echo_corruption", () -> new EchoCorruptionMobEffect());
}
