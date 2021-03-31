package net.villagerer.villageria.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelBuilder;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.villagerer.villageria.VillageriaMod;
import net.villagerer.villageria.setup.ModItems;

import java.util.function.Supplier;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, VillageriaMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        ModelFile itemHandheld = getExistingFile(mcLoc("item/handheld"));
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        ItemGenerated(ModItems.NOVA_TOOL_UPGRADE_KIT);
        ItemGenerated(ModItems.NOVA_ARMOR_UPGRADE_KIT);
        ItemGenerated(ModItems.NOVA_BOW_UPGRADE_KIT);

        ItemGenerated(ModItems.NOVA_HELMET);
        ItemGenerated(ModItems.NOVA_CHESTPLATE);
        ItemGenerated(ModItems.NOVA_LEGGINGS);
        ItemGenerated(ModItems.NOVA_BOOTS);

        ItemHandheld(ModItems.NOVA_SWORD);
        ItemHandheld(ModItems.NOVA_AXE);
        ItemHandheld(ModItems.NOVA_PICKAXE);
        ItemHandheld(ModItems.NOVA_SHOVEL);
        ItemHandheld(ModItems.NOVA_HOE);

        //ComplexItemGenerated(ModItems.TEST_ITEM);
        ItemBow(ModItems.NOVA_BOW);

        //builder(itemGenerated, "nova_bow");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }

    public void ItemGenerated (Supplier<? extends Item> itemSupplier){
        ResourceLocation location = itemSupplier.get().getRegistryName();
        this.getBuilder(location.getPath())
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", VillageriaMod.getId("item/"+ location.getPath()));
    }

    public void ItemHandheld (Supplier<? extends Item> itemSupplier){
        ResourceLocation location = itemSupplier.get().getRegistryName();
        this.getBuilder(location.getPath())
                .parent(new ModelFile.UncheckedModelFile("item/handheld"))
                .texture("layer0", VillageriaMod.getId("item/" + location.getPath()));
    }

    public void ComplexItemGenerated (Supplier<? extends Item> itemSupplier){
        ResourceLocation location = itemSupplier.get().getRegistryName();
        this.getBuilder(location.getPath())
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", VillageriaMod.getId("item/"+ location.getPath()))
                .transforms()
                .transform(ModelBuilder.Perspective.THIRDPERSON_RIGHT).rotation(0,-90,55).translation(0,4.0F,0.5F).scale(0.85F).end()
                .transform(ModelBuilder.Perspective.THIRDPERSON_LEFT).rotation(0,90,-55).translation(0,4.0F,0.5F).scale(0.85F).end()
                .transform(ModelBuilder.Perspective.FIRSTPERSON_RIGHT).rotation(0,-90,25).translation(1.13F, 3.2F, 1.13F).scale(0.68F).end()
                .transform(ModelBuilder.Perspective.FIRSTPERSON_LEFT).rotation(0,90,-25).translation(1.13F, 3.2F, 1.13F).scale(0.68F).end()
                .end();
    }


    public void ItemBow (Supplier<? extends Item> itemSupplier){
        ResourceLocation location = itemSupplier.get().getRegistryName();
        this.getBuilder(location.getPath())
                .parent(new ModelFile.UncheckedModelFile("item/bow"))
                .texture("layer0", VillageriaMod.getId("item/"+ location.getPath()))
                .override()
                .predicate(new ResourceLocation("pulling"), 1).model(new ModelFile.UncheckedModelFile(VillageriaMod.getId("item/nova_bow_pulling_0"))).end()
                .override()
                .predicate(new ResourceLocation("pulling"), 1).predicate(new ResourceLocation("pull"), 0.65F).model(new ModelFile.UncheckedModelFile(VillageriaMod.getId("item/nova_bow_pulling_1"))).end()
                .override()
                .predicate(new ResourceLocation("pulling"), 1).predicate(new ResourceLocation("pull"), 0.9F).model(new ModelFile.UncheckedModelFile(VillageriaMod.getId("item/nova_bow_pulling_2"))).end();

        this.getBuilder(location.getPath() + "_pulling_0")
                .parent(new ModelFile.UncheckedModelFile(VillageriaMod.getId("item/nova_bow")))
                .texture("layer0", VillageriaMod.getId("item/"+ location.getPath()) + "_pulling_0");

        this.getBuilder(location.getPath() + "_pulling_1")
                .parent(new ModelFile.UncheckedModelFile(VillageriaMod.getId("item/nova_bow")))
                .texture("layer0", VillageriaMod.getId("item/"+ location.getPath()) + "_pulling_1");

        this.getBuilder(location.getPath() + "_pulling_2")
                .parent(new ModelFile.UncheckedModelFile(VillageriaMod.getId("item/nova_bow")))
                .texture("layer0", VillageriaMod.getId("item/"+ location.getPath()) + "_pulling_2");
    }
}
