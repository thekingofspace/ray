package net.mcreator.rayokistone.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.rayokistone.RayokiStoneMod;

import java.util.Map;

public class MagmaniteChunksItemIsDroppedByPlayerProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RayokiStoneMod.LOGGER.warn("Failed to load dependency x for procedure MagmaniteChunksItemIsDroppedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RayokiStoneMod.LOGGER.warn("Failed to load dependency y for procedure MagmaniteChunksItemIsDroppedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RayokiStoneMod.LOGGER.warn("Failed to load dependency z for procedure MagmaniteChunksItemIsDroppedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RayokiStoneMod.LOGGER.warn("Failed to load dependency world for procedure MagmaniteChunksItemIsDroppedByPlayer!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.FIRE.getDefaultState(), 3);
	}
}
