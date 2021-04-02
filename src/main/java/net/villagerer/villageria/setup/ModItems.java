package net.villagerer.villageria.setup;


import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.villagerer.villageria.VillageriaMod;
import net.villagerer.villageria.items.*;
import net.villagerer.villageria.util.enums.VillageriaArmorMaterial;
import net.villagerer.villageria.util.enums.VillageriaItemTiers;
import org.lwjgl.system.CallbackI;

public class ModItems {

    //Tool Upgrade Kit
    public static final RegistryObject<Item> NOVA_TOOL_UPGRADE_KIT = Registration.ITEMS.register("nova_tool_upgrade_kit", () ->
            new NovaUpgradeKit(new Item.Properties().group(VillageriaMod.VILLAGERIATAB).rarity(Rarity.RARE)));
    //Armor Upgrade Kit
    public static final RegistryObject<Item> NOVA_ARMOR_UPGRADE_KIT = Registration.ITEMS.register("nova_armor_upgrade_kit", () ->
            new NovaUpgradeKit(new Item.Properties().group(VillageriaMod.VILLAGERIATAB).rarity(Rarity.RARE)));
    //Bow Upgrade Kit
    public static final RegistryObject<Item> NOVA_BOW_UPGRADE_KIT = Registration.ITEMS.register("nova_bow_upgrade_kit", () ->
            new NovaUpgradeKit(new Item.Properties().group(VillageriaMod.VILLAGERIATAB).rarity(Rarity.RARE)));

    //Sword
    public static final RegistryObject<SwordItem> NOVA_SWORD = Registration.ITEMS.register("nova_sword", () ->
            new NovaSword(VillageriaItemTiers.NOVA, 3, -1.4F, new Item.Properties().group(VillageriaMod.VILLAGERIATAB).isImmuneToFire().rarity(Rarity.EPIC)));
    //Axe
    public static final RegistryObject<AxeItem> NOVA_AXE = Registration.ITEMS.register("nova_axe", () ->
            new NovaAxe(VillageriaItemTiers.NOVA, 5, -3.0F, new Item.Properties().group(VillageriaMod.VILLAGERIATAB).isImmuneToFire().rarity(Rarity.EPIC)));
    //Pickaxe
    public static final RegistryObject<PickaxeItem> NOVA_PICKAXE = Registration.ITEMS.register("nova_pickaxe", () ->
            new NovaPickAxe(VillageriaItemTiers.NOVA, 1, -2.8F, new Item.Properties().group(VillageriaMod.VILLAGERIATAB).isImmuneToFire().rarity(Rarity.EPIC)));
    //Shovel
    public static final RegistryObject<ShovelItem> NOVA_SHOVEL = Registration.ITEMS.register("nova_shovel", () ->
            new NovaShovel(VillageriaItemTiers.NOVA, 2, -3.0F, new Item.Properties().group(VillageriaMod.VILLAGERIATAB).isImmuneToFire().rarity(Rarity.EPIC)));
    //Hoe
    public static final RegistryObject<HoeItem> NOVA_HOE = Registration.ITEMS.register("nova_hoe", () ->
            new NovaHoe(VillageriaItemTiers.NOVA, -8, -0.0F, new Item.Properties().group(VillageriaMod.VILLAGERIATAB).isImmuneToFire().rarity(Rarity.EPIC)));

    //TestItem
    //public static final RegistryObject<Item> TEST_ITEM = Registration.ITEMS.register("test_item", () ->
    //        new Item(new Item.Properties().group(VillageriaMod.VILLAGERIATAB)));

    //Bow
    public static final RegistryObject<BowItem> NOVA_BOW = Registration.ITEMS.register("nova_bow", () ->
            new NovaBow(new Item.Properties().group(VillageriaMod.VILLAGERIATAB).isImmuneToFire().rarity(Rarity.EPIC)));

    //Fireball Launcher
    public static final RegistryObject<LauncherItem> FIREBALL_LAUNCHER = Registration.ITEMS.register("fireball_launcher", () ->
            new LauncherItem(new Item.Properties().group(VillageriaMod.VILLAGERIATAB)));

    //Helmet
    public static final RegistryObject<ArmorItem> NOVA_HELMET = Registration.ITEMS.register("nova_helmet", () ->
            new NovaArmorItem(VillageriaArmorMaterial.NOVA, EquipmentSlotType.HEAD, new Item.Properties().group(VillageriaMod.VILLAGERIATAB).isImmuneToFire().rarity(Rarity.EPIC)));
    //Chestplate
    public static final RegistryObject<ArmorItem> NOVA_CHESTPLATE = Registration.ITEMS.register("nova_chestplate", () ->
            new NovaArmorItem(VillageriaArmorMaterial.NOVA, EquipmentSlotType.CHEST, new Item.Properties().group(VillageriaMod.VILLAGERIATAB).isImmuneToFire().rarity(Rarity.EPIC)));
    //Leggings
    public static final RegistryObject<ArmorItem> NOVA_LEGGINGS = Registration.ITEMS.register("nova_leggings", () ->
            new NovaArmorItem(VillageriaArmorMaterial.NOVA, EquipmentSlotType.LEGS, new Item.Properties().group(VillageriaMod.VILLAGERIATAB).isImmuneToFire().rarity(Rarity.EPIC)));
    //Boots
    public static final RegistryObject<ArmorItem> NOVA_BOOTS = Registration.ITEMS.register("nova_boots", () ->
            new NovaArmorItem(VillageriaArmorMaterial.NOVA, EquipmentSlotType.FEET, new Item.Properties().group(VillageriaMod.VILLAGERIATAB).isImmuneToFire().rarity(Rarity.EPIC)));

    static void register (){ }
}
