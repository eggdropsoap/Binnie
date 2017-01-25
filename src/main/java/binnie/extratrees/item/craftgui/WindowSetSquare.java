package binnie.extratrees.item.craftgui;

import binnie.core.AbstractMod;
import binnie.craftgui.minecraft.Window;
import binnie.extratrees.ExtraTrees;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;

public class WindowSetSquare extends Window {
	public WindowSetSquare(final EntityPlayer player, final IInventory inventory, final Side side) {
		super(150, 150, player, inventory, side);
	}

	@Override
	protected AbstractMod getMod() {
		return ExtraTrees.instance;
	}

	@Override
	protected String getBackgroundTextureName() {
		return null;
	}

	@Override
	public void initialiseClient() {
	}

	public static Window create(final EntityPlayer player, final World world, final int x, final int y, final int z, final Side side) {
		return new WindowSetSquare(player, null, side);
	}
}