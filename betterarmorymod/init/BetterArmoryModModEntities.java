
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.setho.betterarmorymod.init;

import net.setho.betterarmorymod.entity.SonicBoomEntity;
import net.setho.betterarmorymod.entity.DragonFlameEntity;
import net.setho.betterarmorymod.BetterArmoryModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BetterArmoryModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BetterArmoryModMod.MODID);
	public static final RegistryObject<EntityType<DragonFlameEntity>> DRAGON_FLAME = register("dragon_flame",
			EntityType.Builder.<DragonFlameEntity>of(DragonFlameEntity::new, MobCategory.MISC).setCustomClientFactory(DragonFlameEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SonicBoomEntity>> SONIC_BOOM = register("sonic_boom",
			EntityType.Builder.<SonicBoomEntity>of(SonicBoomEntity::new, MobCategory.MISC).setCustomClientFactory(SonicBoomEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
