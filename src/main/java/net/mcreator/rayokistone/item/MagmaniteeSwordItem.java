
package net.mcreator.rayokistone.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.Entity;

import net.mcreator.rayokistone.procedures.MagmaniteeHelmetTickEventProcedure;
import net.mcreator.rayokistone.RayokiStoneModElements;

import java.util.Map;
import java.util.HashMap;

@RayokiStoneModElements.ModElement.Tag
public class MagmaniteeSwordItem extends RayokiStoneModElements.ModElement {
	@ObjectHolder("rayoki_stone:magmanitee_sword")
	public static final Item block = null;
	public MagmaniteeSwordItem(RayokiStoneModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 660;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 10f;
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
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
				super.inventoryTick(itemstack, world, entity, slot, selected);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					MagmaniteeHelmetTickEventProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("magmanitee_sword"));
	}
}
