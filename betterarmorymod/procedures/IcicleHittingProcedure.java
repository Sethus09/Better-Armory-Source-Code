package net.setho.betterarmorymod.procedures;

import net.setho.betterarmorymod.init.BetterArmoryModModParticleTypes;
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
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

public class IcicleHittingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 1, false, false));
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("better_armory_mod:freeze_hit")), SoundSource.PLAYERS, (float) 0.5, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("better_armory_mod:freeze_hit")), SoundSource.PLAYERS, (float) 0.5, 1, false);
			}
		}
		if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(MobEffects.MOVEMENT_SLOWDOWN)) {
			BetterArmoryModMod.queueServerWork(10, () -> {
				if (!entity.isAlive()) return;
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (BetterArmoryModModParticleTypes.ICEFLAKE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 25, 0, 0.7, 0, 0.1);
			});
			BetterArmoryModMod.queueServerWork(20, () -> {
				if (!entity.isAlive()) return;
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (BetterArmoryModModParticleTypes.ICEFLAKE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 25, 0, 0.7, 0, 0.1);
			});
			BetterArmoryModMod.queueServerWork(30, () -> {
				if (!entity.isAlive()) return;
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (BetterArmoryModModParticleTypes.ICEFLAKE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 25, 0, 0.7, 0, 0.1);
			});

			BetterArmoryModMod.queueServerWork(40, () -> {
				if (!entity.isAlive()) return;
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (BetterArmoryModModParticleTypes.ICEFLAKE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 25, 0, 0.7, 0, 0.1);
			});
			BetterArmoryModMod.queueServerWork(50, () -> {
				if (!entity.isAlive()) return;
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (BetterArmoryModModParticleTypes.ICEFLAKE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 25, 0, 0.7, 0, 0.1);
			});

			BetterArmoryModMod.queueServerWork(60, () -> {
				if (!entity.isAlive()) return;
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (BetterArmoryModModParticleTypes.ICEFLAKE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 25, 0, 0.7, 0, 0.1);
			});
		}
	}
}
