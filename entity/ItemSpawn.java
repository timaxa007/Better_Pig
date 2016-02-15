package timaxa007.entity;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSpawn extends Item {

	public ItemSpawn(int par1) {
		super(par1);
		setCreativeTab(CreativeTabs.tabMisc);
	}

	public boolean onItemUse(ItemStack is, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		if (world.isAirBlock(x, y + 1, z) && side == 1) {
			if (!world.isRemote) {
				EntityBetterPig entity = new EntityBetterPig(world);
				entity.setPosition((double)x + 0.5D, (double)y + 1.5D, (double)z + 0.5D);
				world.spawnEntityInWorld(entity);
			}
			return true;
		}
		return false;
	}
}
