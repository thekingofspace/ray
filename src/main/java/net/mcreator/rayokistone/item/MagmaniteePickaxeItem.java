
package net.mcreator.rayokistone.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.rayokistone.RayokiStoneModElements;

@RayokiStoneModElements.ModElement.Tag
public class MagmaniteePickaxeItem extends RayokiStoneModElements.ModElement {
	@ObjectHolder("rayoki_stone:magmanitee_pickaxe")
	public static final Item block = null;
	public MagmaniteePickaxeItem(RayokiStoneModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 660;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 28;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MagmaniteIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("magmanitee_pickaxe"));
	}
}
