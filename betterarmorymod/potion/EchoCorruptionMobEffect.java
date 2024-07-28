
package net.setho.betterarmorymod.potion;

import net.setho.betterarmorymod.procedures.EchoCorruption_ActiveProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class EchoCorruptionMobEffect extends MobEffect {
	public EchoCorruptionMobEffect() {
		super(MobEffectCategory.HARMFUL, -16751002);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EchoCorruption_ActiveProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
