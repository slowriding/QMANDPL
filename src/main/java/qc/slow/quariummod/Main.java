package qc.slow.quariummod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import qc.slow.quariummod.CSP.CommonLoad;
import qc.slow.quariummod.blocks.blocks;
import qc.slow.quariummod.crafts.Crafts;
import qc.slow.quariummod.event.Event;
import qc.slow.quariummod.items.items;
import qc.slow.quariummod.world.WorldRegister;

@Mod(modid=Ref.MOD_ID,name=Ref.MOD_NAME,version = Ref.VERSION)
public class Main {
	@SidedProxy(clientSide = Ref.CLIENT_P, serverSide = Ref.SERVER_P)
	public static CommonLoad proxy;
	public static CreativeTabs QuariumTab= new CreativeTabs("Quarium Tab") {
		
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {

		//return Item.getItemFromBlock( blocks.Quarium_Block);
		return items.Samarium_Chunk;
	}};
	@EventHandler
public void preinit(FMLPreInitializationEvent e) {
	//BECTE.mainRegistry();
	blocks.init();
	blocks.register();
	items.init();
	items.register();

	Crafts.register();
	Event.Init();
	WorldRegister.Registery();
}
	@EventHandler
public void init(FMLInitializationEvent e) {
		proxy.registerRenders();
	
	
}
	@EventHandler
public void postinit(FMLPostInitializationEvent e) {
	
	
}
}
