package net.villagerer.villageria.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;

public class NovaShovel extends ShovelItem {
    public NovaShovel(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {return true;}
}
