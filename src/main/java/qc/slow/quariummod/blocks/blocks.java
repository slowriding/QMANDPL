package qc.slow.quariummod.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.util.EnumHelper;
import qc.slow.quariummod.Main;
import qc.slow.quariummod.Ref;

public class blocks {
	public static Block Quarium_SB;
	public static Block Quarium_Block;
	public static Block  Quarium_ore ;
	
	public static Block Cuprite_Block;
	public static Block Cuprite_ore ;
	
	public static Block Samarium_Block;
	public static Block  Samarium_ore ;
	
	public static Block rutherium_Block;
	public static Block rutherium_ore ;
	
	public static Block prometium_Block;
	public static Block  prometium_ore ;
	
	public static Block erbium_Block;
	public static Block erbium_ore ;
	
	/*public static Block Quarium_Block;
	public static Block  Quarium_ore ;*/
public static void init() {
	//barril=  new Barril(0).setCreativeTab(Main.QuariumTab).setBlockTextureName(Ref.MOD_ID+":barry");
	
	Quarium_Block = new Basicblock(Material.rock).setCreativeTab(Main.QuariumTab).setBlockName("Quarium block").setBlockTextureName(Ref.MOD_ID+":quarium_block").setHardness(2.5f);
	Quarium_ore = new QuariumOre(Material.iron).setCreativeTab(Main.QuariumTab).setBlockName("Quarium ore").setBlockTextureName(Ref.MOD_ID+":quarium_ore").setHardness(2.5f);
	
	Cuprite_Block = new Basicblock(Material.rock).setCreativeTab(Main.QuariumTab).setBlockName("Cuprite block").setBlockTextureName(Ref.MOD_ID+":Cuprite_block").setHardness(1.3f);
	Cuprite_ore = new QuariumOre(Material.iron).setCreativeTab(Main.QuariumTab).setBlockName("Cuprite ore").setBlockTextureName(Ref.MOD_ID+":Cuprite_ore").setHardness(1.3f);
	
	Samarium_Block=new Basicblock(Material.rock).setCreativeTab(Main.QuariumTab).setBlockName("Samarium block").setBlockTextureName(Ref.MOD_ID+":Samarium_block").setHardness(3.3f);
	Samarium_ore= new QuariumOre(Material.iron).setCreativeTab(Main.QuariumTab).setBlockName("Samarium ore").setBlockTextureName(Ref.MOD_ID+":Samarium_ore").setHardness(3.3f);
	
	rutherium_Block=new Basicblock(Material.rock).setCreativeTab(Main.QuariumTab).setBlockName("rutherium block").setBlockTextureName(Ref.MOD_ID+":rutherium_block").setHardness(1.7f);
	rutherium_ore=new Basicblock(Material.iron).setCreativeTab(Main.QuariumTab).setBlockName("rutherium ore").setBlockTextureName(Ref.MOD_ID+":rutherium_ore").setHardness(1.7f);
	
	prometium_Block=new Basicblock(Material.rock).setCreativeTab(Main.QuariumTab).setBlockName("prometium block").setBlockTextureName(Ref.MOD_ID+":prometium_block").setHardness(1.7f);
	prometium_ore=new Basicblock(Material.iron).setCreativeTab(Main.QuariumTab).setBlockName("prometium ore").setBlockTextureName(Ref.MOD_ID+":prometium_ore").setHardness(1.7f);
	
	erbium_Block=new Basicblock(Material.rock).setCreativeTab(Main.QuariumTab).setBlockName("erbium block").setBlockTextureName(Ref.MOD_ID+":erbiumblock").setHardness(1.7f);
	erbium_ore=new Basicblock(Material.iron).setCreativeTab(Main.QuariumTab).setBlockName("erbium ore").setBlockTextureName(Ref.MOD_ID+":erbium_ore").setHardness(1.7f);
	Quarium_SB=new Quarium_SBC().setBlockName("Quarium_SB").setCreativeTab(Main.QuariumTab).setBlockTextureName(Ref.MOD_ID+":Quarium_SB");
	//flower=new QFlower(90).setBlockName("flower").setCreativeTab(Main.QuariumTab);
}
public static void register() {
	GameRegistry.registerBlock(Quarium_Block, "Quarium_Block");
	GameRegistry.registerBlock(Quarium_ore, "Quarium_ore");
	
	GameRegistry.registerBlock(Cuprite_Block, "Cuprite_Block");
	GameRegistry.registerBlock(Cuprite_ore, "Cuprite_ore");
	
	GameRegistry.registerBlock(Samarium_Block, "Samarium_Block");
	GameRegistry.registerBlock(Samarium_ore, "Samarium_ore");
	
	GameRegistry.registerBlock(rutherium_Block, "rutherium_Block");
	GameRegistry.registerBlock(rutherium_ore, "rutherium_ore");
	
	GameRegistry.registerBlock(prometium_Block, "prometium_Block");
	GameRegistry.registerBlock(prometium_ore, "prometium_ore");
	
	GameRegistry.registerBlock(erbium_Block, "erbium_Block");
	GameRegistry.registerBlock(erbium_ore, "erbium_ore");
	GameRegistry.registerBlock(Quarium_SB, "Quarium_SB");
	//GameRegistry.registerBlock(barril, "Barril");
	

}
}