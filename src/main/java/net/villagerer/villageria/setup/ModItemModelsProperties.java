package net.villagerer.villageria.setup;

import net.minecraft.item.ItemModelsProperties;
import net.villagerer.villageria.VillageriaMod;

public class ModItemModelsProperties {
    public static void registerModelProperty (){

        ItemModelsProperties.registerProperty(ModItems.NOVA_BOW.get(), VillageriaMod.getId("pull"), (stack, world, player) -> {
            if (player == null)
                return 0.0F;
            else
                return player.getActiveItemStack() != stack ? 0.0F : (float)(stack.getUseDuration() - player.getItemInUseCount()) * 1.5F / 20.0F;
        });
        ItemModelsProperties.registerProperty(ModItems.NOVA_BOW.get(), VillageriaMod.getId("pulling"), (stack, world, player) ->
                player != null && player.isHandActive() && player.getActiveItemStack() == stack ? 1.0F : 0.0F);
    }
}
