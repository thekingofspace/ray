
package net.mcreator.rayokistone;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.rayokistone.item.MagmaniteIngotItem;
import net.mcreator.rayokistone.item.MagmaniteChunksItem;

@RayokiStoneModElements.ModElement.Tag
public class CraftIngotBrewingRecipe extends RayokiStoneModElements.ModElement {
	public CraftIngotBrewingRecipe(RayokiStoneModElements instance) {
		super(instance, 24);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}
	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == Items.IRON_INGOT;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == MagmaniteChunksItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(MagmaniteIngotItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
