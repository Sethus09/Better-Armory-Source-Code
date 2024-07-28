package net.setho.betterarmorymod.procedures;

import net.setho.betterarmorymod.BetterArmoryModMod;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class Spectra_HittingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 2));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 100, 2, false, false));
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("better_armory_mod:spectra_hit")), SoundSource.PLAYERS, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("better_armory_mod:spectra_hit")), SoundSource.PLAYERS, 1, 1, false);
			}
		}
		if (entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(MobEffects.WITHER)) {
			BetterArmoryModMod.queueServerWork(10, () -> {
				if (!entity.isAlive()) return;
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SOUL, (entity.getX()), (entity.getY()), (entity.getZ()), 16, 0, 1.5, 0, 0.1);
			});
			BetterArmoryModMod.queueServerWork(20, () -> {
				if (!entity.isAlive()) return;
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SOUL, (entity.getX()), (entity.getY()), (entity.getZ()), 16, 0, 1.5, 0, 0.1);
			});
			BetterArmoryModMod.queueServerWork(40, () -> {
				if (!entity.isAlive()) return;
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SOUL, (entity.getX()), (entity.getY()), (entity.getZ()), 16, 0, 1.5, 0, 0.1);
			});
			BetterArmoryModMod.queueServerWork(60, () -> {
				if (!entity.isAlive()) return;
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SOUL, (entity.getX()), (entity.getY()), (entity.getZ()), 16, 0, 1.5, 0, 0.1);
			});
			BetterArmoryModMod.queueServerWork(70, () -> {
				if (!entity.isAlive()) return;
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SOUL, (entity.getX()), (entity.getY()), (entity.getZ()), 12, 0, 1.5, 0, 0.1);
			});
		}
	}
}
