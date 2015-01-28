package net.famzangl.minecraft.minebot.build.block;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

/**
 * A type of wood used in the game.
 * @see LogItemFilter
 * @see WoodItemFilter
 * @author michael
 *
 */
public enum WoodType {
	OAK(Blocks.log, 0),
	SPRUCE(Blocks.log, 1),
	BIRCH(Blocks.log, 2),
	JUNGLE(Blocks.log, 3),
	ACACIA(Blocks.log2, 0),
	DARK_OAK(Blocks.log2, 1);

	public final Block block;
	public final int lowerBits;

	private WoodType(Block block, int lowerBits) {
		this.block = block;
		this.lowerBits = lowerBits;

	}
}