package net.setho.betterarmorymod.events;

import net.setho.betterarmorymod.procedures.GildedGoldSystemProcedure;
import net.setho.betterarmorymod.procedures.AvaritiaEmeraldSystemProcedure;
import net.setho.betterarmorymod.item.GildedSwordItem;
import net.setho.betterarmorymod.item.AvaritiaItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class EntityDeathEventHandler {

    @SubscribeEvent
    public static void onEntityDeath(LivingDeathEvent event) {
        LivingEntity entity = (LivingEntity) event.getEntity();
        DamageSource source = event.getSource();
        
        if (source.getEntity() instanceof Player) {
            Player player = (Player) source.getEntity();
            ItemStack mainHandItem = player.getMainHandItem();
            
            if (mainHandItem.getItem() instanceof AvaritiaItem) {
                AvaritiaEmeraldSystemProcedure.execute(entity.getCommandSenderWorld(), entity, source);
            }
            if (mainHandItem.getItem() instanceof GildedSwordItem) {
                GildedGoldSystemProcedure.execute(entity.getCommandSenderWorld(), entity, source);
            }
        }
    }
}
