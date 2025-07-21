
package net.ejr.jei_recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.ejr.init.EjrModJeiPlugin;
import net.ejr.init.EjrModBlocks;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class GrinderJEIRecipeTypeRecipeCategory implements IRecipeCategory<GrinderJEIRecipeTypeRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("ejr", "grinder_jei_recipe_type");
	public final static ResourceLocation TEXTURE = new ResourceLocation("ejr", "textures/screens/grinder_jei_gui.png");
	private final IDrawable background;
	private final IDrawable icon;

	public GrinderJEIRecipeTypeRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 80);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(EjrModBlocks.GRINDER.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<GrinderJEIRecipeTypeRecipe> getRecipeType() {
		return EjrModJeiPlugin.GrinderJEIRecipeType_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Grinder");
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, GrinderJEIRecipeTypeRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 42, 32).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 114, 32).addItemStack(recipe.getResultItem(null));
	}
}
