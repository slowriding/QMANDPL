package qc.slow.quariummod.event;

import java.util.Random;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import qc.slow.quariummod.blocks.blocks;
import qc.slow.quariummod.items.items;

public class DropsBlock {
	Random rand = new Random(); 
	@SubscribeEvent
	public void OnBlockDestroyed(HarvestDropsEvent e) {
		if (e.block==Blocks.tallgrass) {
			if (rand.nextInt(100)==1) { 
			e.drops.add(new ItemStack(items.Quarium_SEED,1));
		}
		}
	}
	@SubscribeEvent
	public void OnBonemeal(BonemealEvent e) {
	if (e.block==blocks.Quarium_SB) {
		e.setCanceled(true);
		
	}
	}
	
}
