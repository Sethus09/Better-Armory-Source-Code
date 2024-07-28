
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.setho.betterarmorymod.init;

import net.setho.betterarmorymod.client.particle.SandustParticle;
import net.setho.betterarmorymod.client.particle.IceflakeParticle;
import net.setho.betterarmorymod.client.particle.DragonSparkParticle;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BetterArmoryModModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(BetterArmoryModModParticleTypes.DRAGON_SPARK.get(), DragonSparkParticle::provider);
		event.registerSpriteSet(BetterArmoryModModParticleTypes.ICEFLAKE.get(), IceflakeParticle::provider);
		event.registerSpriteSet(BetterArmoryModModParticleTypes.SANDUST.get(), SandustParticle::provider);
	}
}
