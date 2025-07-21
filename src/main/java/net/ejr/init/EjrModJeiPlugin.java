
package net.ejr.init;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.ejr.jei_recipes.GrinderJEIRecipeTypeRecipeCategory;
import net.ejr.jei_recipes.GrinderJEIRecipeTypeRecipe;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;
import java.util.List;

@JeiPlugin
public class EjrModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<GrinderJEIRecipeTypeRecipe> GrinderJEIRecipeType_Type = new mezz.jei.api.recipe.RecipeType<>(GrinderJEIRecipeTypeRecipeCategory.UID, GrinderJEIRecipeTypeRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("ejr:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new GrinderJEIRecipeTypeRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<GrinderJEIRecipeTypeRecipe> GrinderJEIRecipeTypeRecipes = recipeManager.getAllRecipesFor(GrinderJEIRecipeTypeRecipe.Type.INSTANCE);
		registration.addRecipes(GrinderJEIRecipeType_Type, GrinderJEIRecipeTypeRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(EjrModBlocks.GRINDER.get().asItem()), GrinderJEIRecipeType_Type);
	}
}
