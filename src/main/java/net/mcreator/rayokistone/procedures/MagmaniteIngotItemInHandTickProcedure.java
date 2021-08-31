package net.mcreator.rayokistone.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.rayokistone.RayokiStoneMod;

import java.util.Map;

public class MagmaniteIngotItemInHandTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RayokiStoneMod.LOGGER.warn("Failed to load dependency entity for procedure MagmaniteIngotItemInHandTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.ON_FIRE, (float) 1);
	}
}
