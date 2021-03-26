package net.villagerer.villageria.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class NovaAxe extends AxeItem {

    public NovaAxe(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {return true;}

    /**
     * Adds a weakness effect to target entity. 3 seconds duration and no particle effects
     */
    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity entity, LivingEntity player) {
        super.hitEntity(stack, entity, player);
        entity.addPotionEffect(new EffectInstance(Effects.WEAKNESS, 3*20, 2, false, false));
        return true;
    }
}
