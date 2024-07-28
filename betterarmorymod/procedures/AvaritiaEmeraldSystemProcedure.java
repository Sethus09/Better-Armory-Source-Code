package net.setho.betterarmorymod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.level.Level;

public class AvaritiaEmeraldSystemProcedure {
    public static void execute(Level world, LivingEntity entity, DamageSource source) {
if (entity == null || source == null) return;

    if (source.getEntity() instanceof Player) { // Cheque al jugador
        Player player = (Player) source.getEntity();

        if (player.getMainHandItem().getItem() instanceof net.setho.betterarmorymod.item.AvaritiaItem) {
            // Probabilidad de soltar una esmeralda
            if (world.random.nextDouble() < 0.25) { // 25% de probabilidad
                entity.spawnAtLocation(new ItemStack(Items.EMERALD));
            }
        }
    }
}
}
    

