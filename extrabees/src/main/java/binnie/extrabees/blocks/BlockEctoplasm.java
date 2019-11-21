package binnie.extrabees.blocks;

import net.minecraft.block.BlockWeb;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockEctoplasm extends BlockWeb {

	public BlockEctoplasm() {
		this.setLightOpacity(1);
		this.setHardness(0.5f);
		setRegistryName("ectoplasm");
	}

	@Override
	public int quantityDropped(final Random rand) {
		return (rand.nextInt(5) == 0) ? 1 : 0;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Items.SLIME_BALL;
	}

	@Override
	public String getTranslationKey() {
		return "extrabees.block.ectoplasm";
	}
}
