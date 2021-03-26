package net.villagerer.villageria.util;

import net.minecraft.util.ResourceLocation;
import net.villagerer.villageria.VillageriaMod;

public class ModResourceLocation extends ResourceLocation {
    public ModResourceLocation(String resourceName){
        super(addModNamespace(resourceName));
    }

    private static String addModNamespace(String resourcename) {
        if (resourcename.contains(":"))
            return resourcename;
        return VillageriaMod.MOD_ID + ":" + resourcename;
    }
}
