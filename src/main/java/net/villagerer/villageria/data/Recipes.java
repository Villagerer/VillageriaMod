package net.villagerer.villageria.data;

import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.data.*;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.villagerer.villageria.VillageriaMod;
import net.villagerer.villageria.setup.ModItems;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider {


    public Recipes(DataGenerator generatorIn) { super(generatorIn); }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.NOVA_TOOL_UPGRADE_KIT.get())
                .setGroup("villageria")
                .addIngredient(Ingredient.fromItems(Items.NETHER_STAR))
                .addIngredient(Ingredient.fromItems(Items.BLAZE_ROD))
                .addIngredient(Ingredient.fromItems(Items.STRING))
                .addCriterion("got_netherstar", InventoryChangeTrigger.Instance.forItems(Items.NETHER_STAR))
                .build(consumer, VillageriaMod.getId("nova_tool_upgrade_kit"));

        ShapedRecipeBuilder.shapedRecipe(ModItems.NOVA_ARMOR_UPGRADE_KIT.get())
                .patternLine("xlx")
                .patternLine("bbb")
                .key('x', Items.NETHER_STAR)
                .key('l', Items.LEATHER)
                .key('b', Items.BLAZE_POWDER)
                .setGroup("villageria")
                .addCriterion("got_netherstar", InventoryChangeTrigger.Instance.forItems(Items.NETHER_STAR))
                .build(consumer, "nova_armor_upgrade_kit");

        ShapedRecipeBuilder.shapedRecipe(ModItems.NOVA_BOW_UPGRADE_KIT.get())
                .patternLine(" bx")
                .patternLine("bn ")
                .patternLine(" bx")
                .key('x', Items.NETHER_STAR)
                .key('n', Items.NETHERITE_INGOT)
                .key('b', Items.BLAZE_ROD)
                .setGroup("villageria")
                .addCriterion("got_netherstar", InventoryChangeTrigger.Instance.forItems(Items.NETHER_STAR))
                .build(consumer, "nova_bow_upgrade_kit");
/*
        ShapedRecipeBuilder.shapedRecipe(ModItems.NOVA_SWORD.get())
                .patternLine("x")
                .patternLine("x")
                .patternLine("s")
                .key('x', Tags.Items.NETHER_STARS)
                .key('s', Items.STICK)
                .setGroup("villageria")
                .addCriterion("got_netherstar", InventoryChangeTrigger.Instance.forItems(Items.NETHER_STAR))
                .build(consumer, "nova_sword");
*/
        SmithingRecipeBuilder.smithingRecipe(Ingredient.fromItems(Items.NETHERITE_SWORD), Ingredient.fromItems(ModItems.NOVA_TOOL_UPGRADE_KIT.get()), ModItems.NOVA_SWORD.get())
                .addCriterion("got_netherstar", InventoryChangeTrigger.Instance.forItems(Items.NETHER_STAR))
                .build(consumer, VillageriaMod.getId("nova_sword_smithing"));

        SmithingRecipeBuilder.smithingRecipe(Ingredient.fromItems(Items.NETHERITE_AXE), Ingredient.fromItems(ModItems.NOVA_TOOL_UPGRADE_KIT.get()), ModItems.NOVA_AXE.get())
                .addCriterion("got_netherstar", InventoryChangeTrigger.Instance.forItems(Items.NETHER_STAR))
                .build(consumer, VillageriaMod.getId("nova_axe_smithing"));

        SmithingRecipeBuilder.smithingRecipe(Ingredient.fromItems(Items.NETHERITE_PICKAXE), Ingredient.fromItems(ModItems.NOVA_TOOL_UPGRADE_KIT.get()), ModItems.NOVA_PICKAXE.get())
                .addCriterion("got_netherstar", InventoryChangeTrigger.Instance.forItems(Items.NETHER_STAR))
                .build(consumer, VillageriaMod.getId("nova_pickaxe_smithing"));

        SmithingRecipeBuilder.smithingRecipe(Ingredient.fromItems(Items.NETHERITE_SHOVEL), Ingredient.fromItems(ModItems.NOVA_TOOL_UPGRADE_KIT.get()), ModItems.NOVA_SHOVEL.get())
                .addCriterion("got_netherstar", InventoryChangeTrigger.Instance.forItems(Items.NETHER_STAR))
                .build(consumer, VillageriaMod.getId("nova_shovel_smithing"));

        SmithingRecipeBuilder.smithingRecipe(Ingredient.fromItems(Items.NETHERITE_HOE), Ingredient.fromItems(ModItems.NOVA_TOOL_UPGRADE_KIT.get()), ModItems.NOVA_HOE.get())
                .addCriterion("got_netherstar", InventoryChangeTrigger.Instance.forItems(Items.NETHER_STAR))
                .build(consumer, VillageriaMod.getId("nova_hoe_smithing"));

        //Helmet
        SmithingRecipeBuilder.smithingRecipe(Ingredient.fromItems(Items.NETHERITE_HELMET), Ingredient.fromItems(ModItems.NOVA_ARMOR_UPGRADE_KIT.get()), ModItems.NOVA_HELMET.get())
                .addCriterion("got_netherstar", InventoryChangeTrigger.Instance.forItems(Items.NETHER_STAR))
                .build(consumer, VillageriaMod.getId("nova_helmet_smithing"));
        //Chestplate
        SmithingRecipeBuilder.smithingRecipe(Ingredient.fromItems(Items.NETHERITE_CHESTPLATE), Ingredient.fromItems(ModItems.NOVA_ARMOR_UPGRADE_KIT.get()), ModItems.NOVA_CHESTPLATE.get())
                .addCriterion("got_netherstar", InventoryChangeTrigger.Instance.forItems(Items.NETHER_STAR))
                .build(consumer, VillageriaMod.getId("nova_chestplate_smithing"));
        //Leggings
        SmithingRecipeBuilder.smithingRecipe(Ingredient.fromItems(Items.NETHERITE_LEGGINGS), Ingredient.fromItems(ModItems.NOVA_ARMOR_UPGRADE_KIT.get()), ModItems.NOVA_LEGGINGS.get())
                .addCriterion("got_netherstar", InventoryChangeTrigger.Instance.forItems(Items.NETHER_STAR))
                .build(consumer, VillageriaMod.getId("nova_leggings_smithing"));
        //Boots
        SmithingRecipeBuilder.smithingRecipe(Ingredient.fromItems(Items.NETHERITE_BOOTS), Ingredient.fromItems(ModItems.NOVA_ARMOR_UPGRADE_KIT.get()), ModItems.NOVA_BOOTS.get())
                .addCriterion("got_netherstar", InventoryChangeTrigger.Instance.forItems(Items.NETHER_STAR))
                .build(consumer, VillageriaMod.getId("nova_boots_smithing"));

    }
}
