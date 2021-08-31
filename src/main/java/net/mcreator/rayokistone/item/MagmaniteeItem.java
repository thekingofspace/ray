
package net.mcreator.rayokistone.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.rayokistone.procedures.MagmaniteeHelmetTickEventProcedure;
import net.mcreator.rayokistone.RayokiStoneModElements;

import java.util.Map;
import java.util.HashMap;

@RayokiStoneModElements.ModElement.Tag
public class MagmaniteeItem extends RayokiStoneModElements.ModElement {
	@ObjectHolder("rayoki_stone:magmanitee_helmet")
	public static final Item helmet = null;
	@ObjectHolder("rayoki_stone:magmanitee_chestplate")
	public static final Item body = null;
	@ObjectHolder("rayoki_stone:magmanitee_leggings")
	public static final Item legs = null;
	@ObjectHolder("rayoki_stone:magmanitee_boots")
	public static final Item boots = null;
	public MagmaniteeItem(RayokiStoneModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 30;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 12;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "magmanitee";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items
				.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "rayoki_stone:textures/models/armor/magmanite_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}

					@Override
					public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
						super.onArmorTick(itemstack, world, entity);
						double x = entity.getPosX();
						double y = entity.getPosY();
						double z = entity.getPosZ();
						{
							Map<String, Object> $_dependencies = new HashMap<>();
							$_dependencies.put("entity", entity);
							$_dependencies.put("x", x);
							$_dependencies.put("y", y);
							$_dependencies.put("z", z);
							$_dependencies.put("world", world);
							MagmaniteeHelmetTickEventProcedure.executeProcedure($_dependencies);
						}
					}
				}.setRegistryName("magmanitee_helmet"));
		elements.items
				.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "rayoki_stone:textures/models/armor/magmanite_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}

					@Override
					public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
						double x = entity.getPosX();
						double y = entity.getPosY();
						double z = entity.getPosZ();
						{
							Map<String, Object> $_dependencies = new HashMap<>();
							$_dependencies.put("entity", entity);
							$_dependencies.put("x", x);
							$_dependencies.put("y", y);
							$_dependencies.put("z", z);
							$_dependencies.put("world", world);
							MagmaniteeHelmetTickEventProcedure.executeProcedure($_dependencies);
						}
					}
				}.setRegistryName("magmanitee_chestplate"));
		elements.items
				.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "rayoki_stone:textures/models/armor/magmanite_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}

					@Override
					public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
						double x = entity.getPosX();
						double y = entity.getPosY();
						double z = entity.getPosZ();
						{
							Map<String, Object> $_dependencies = new HashMap<>();
							$_dependencies.put("entity", entity);
							$_dependencies.put("x", x);
							$_dependencies.put("y", y);
							$_dependencies.put("z", z);
							$_dependencies.put("world", world);
							MagmaniteeHelmetTickEventProcedure.executeProcedure($_dependencies);
						}
					}
				}.setRegistryName("magmanitee_leggings"));
		elements.items
				.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "rayoki_stone:textures/models/armor/magmanite_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}

					@Override
					public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
						double x = entity.getPosX();
						double y = entity.getPosY();
						double z = entity.getPosZ();
						{
							Map<String, Object> $_dependencies = new HashMap<>();
							$_dependencies.put("entity", entity);
							$_dependencies.put("x", x);
							$_dependencies.put("y", y);
							$_dependencies.put("z", z);
							$_dependencies.put("world", world);
							MagmaniteeHelmetTickEventProcedure.executeProcedure($_dependencies);
						}
					}
				}.setRegistryName("magmanitee_boots"));
	}
}
