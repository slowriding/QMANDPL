package qc.slow.quariummod.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import qc.slow.quariummod.items.items;

public class QuariumOre extends Basicblock{

	public QuariumOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {

		return this == blocks.Samarium_ore ? items.Samarium_Chunk : (this == blocks.Samarium_ore ? items.Samarium_Chunk :(this == blocks.prometium_ore ? items.prometium_ingot:(this == blocks.erbium_ore ? items.erbium_ingot: Item.getItemFromBlock(this))));
	}
	private Random rand = new Random();
    @Override
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
    {
        if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
        {
            int j1 = 0;
            
            if (this == blocks.Quarium_ore)
            {
                j1 = MathHelper.getRandomIntegerInRange(rand, 0, 10);
            }
            else if (this == blocks.Samarium_ore)
            {
                j1 = MathHelper.getRandomIntegerInRange(rand, 0, 20);
            }


            return j1;
        }
        return 0;
    }
}
