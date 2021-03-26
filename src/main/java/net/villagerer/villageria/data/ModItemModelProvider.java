package net.villagerer.villageria.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.villagerer.villageria.VillageriaMod;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, VillageriaMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        ModelFile itemHandheld = getExistingFile(mcLoc("item/handheld"));
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "nova_tool_upgrade_kit");
        builder(itemGenerated, "nova_armor_upgrade_kit");
        builder(itemGenerated, "nova_bow_upgrade_kit");

        builder(itemHandheld, "nova_sword");
        builder(itemHandheld, "nova_axe");
        builder(itemHandheld, "nova_pickaxe");
        builder(itemHandheld, "nova_shovel");
        builder(itemHandheld, "nova_hoe");

        builder(itemGenerated, "nova_helmet");
        builder(itemGenerated, "nova_chestplate");
        builder(itemGenerated, "nova_leggings");
        builder(itemGenerated, "nova_boots");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
