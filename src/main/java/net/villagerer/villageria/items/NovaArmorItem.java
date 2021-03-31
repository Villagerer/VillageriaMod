package net.villagerer.villageria.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.villagerer.villageria.setup.ModItems;

public class NovaArmorItem extends ArmorItem {

    public NovaArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
        super(materialIn, slot, builderIn);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {return true;}

    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        if (player.inventory.armorInventory.get(0).getItem().equals(ModItems.NOVA_BOOTS.get())) {
            player.stepHeight = 1.0f;
            player.addPotionEffect(new EffectInstance(Effects.SPEED, 10, 0, false, false));
        }
    }

    /**
     * Resetting stats when boots are taken off
     */
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected) {
        if (entity instanceof PlayerEntity) {
            PlayerEntity livingEntity = (PlayerEntity) entity;
            if (!(livingEntity.inventory.armorInventory.get(0).getItem().equals(ModItems.NOVA_BOOTS.get()))) {
                livingEntity.stepHeight = 0.5f;
            }
        }
    }
}
