
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.setho.betterarmorymod.init;

import net.setho.betterarmorymod.BetterArmoryModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

public class BetterArmoryModModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, BetterArmoryModMod.MODID);
	public static final RegistryObject<SimpleParticleType> DRAGON_SPARK = REGISTRY.register("dragon_spark", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> ICEFLAKE = REGISTRY.register("iceflake", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SANDUST = REGISTRY.register("sandust", () -> new SimpleParticleType(false));
}
