package net.villagerer.villageria.items;

import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;

public class NovaHoe extends HoeItem {
    public NovaHoe(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {return true;}
}
