package net.villagerer.villageria.items;

import net.minecraft.enchantment.IVanishable;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ShootableItem;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;

import java.util.function.Predicate;

public class LauncherItem extends ShootableItem implements IVanishable {
    public static final Predicate<ItemStack> FIREBALLS = (stack) -> {
        return stack.getItem().isIn(ItemTags.makeWrapperTag(""));
    };

    public LauncherItem(Properties properties) {
        super(properties);
    }

    @Override
    public Predicate<ItemStack> getInventoryAmmoPredicate() {
        return ARROWS;
    }

    @Override
    public int func_230305_d_() {
        return 0;
    }
}
