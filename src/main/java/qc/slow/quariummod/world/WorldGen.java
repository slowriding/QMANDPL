package qc.slow.quariummod.world;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import qc.slow.quariummod.blocks.blocks;
import qc.slow.quariummod.world.struct.StructGenH;

public class WorldGen implements IWorldGenerator {

@Override
public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
		IChunkProvider chunkProvider) {
	
	switch(world.provider.dimensionId) {
	case -1:
		generatenether(world,chunkX*16,chunkZ*16,random);
		break;
	case 0:
		
		generateover(world,chunkX*16,chunkZ*16,random);
		generateover64(world,chunkX*256,chunkZ*256,random);
		generateover64s(world,chunkX*64,chunkZ*64,random);
		break;
	case 1:
		generateend(world,chunkX*16,chunkZ*16,random);
		break;
	}
	
}
private void AddOre(Block b,Block bs,Random r, World w, int X, int Z,int minY,int maxY,int MinF,int MaxF,int MaxSC) {
	
	for(int i=0;i<MaxSC;i++) {
		int CS=32;
		int x=X+r.nextInt(CS);
		int y=minY+r.nextInt(maxY-minY);
		int z=Z+r.nextInt(CS);
		new WorldGenMinable(b,MaxF).generate(w, r, x, y, z);
	}
	
}
private void AddOre64(Block b,Block bs,Random r, World w, int X, int Z,int minY,int maxY,int MinF,int MaxF,int MaxSC) {
	
	for(int i=0;i<MaxSC;i++) {
		int CS=256;
		int x=X+r.nextInt(CS);
		int y=minY+r.nextInt(maxY-minY);
		int z=Z+r.nextInt(CS);
		new WorldGenMinable(b,MaxF).generate(w, r, x, y, z);
	}
	
}
private void addStructure(String s, Random r,World w,int X ,int Z,int MY,int MXY,int chance) {
		for(int i=0;i<chance;i++) {
			int CS=64;
			int x=X+r.nextInt(CS);
			int y=MY+r.nextInt(MXY-MY);
			int z=Z+r.nextInt(CS);
			new StructGenH().gen(s, w, r, x, y, z);
		
	}
}
private void generateend(World world, int i, int j, Random random) {
	
}

private void generateover64(World world, int i, int j, Random random) {

	AddOre64(blocks.Samarium_ore,Blocks.stone,random,world,i,j,6,12,2,3,3);


}
private void generateover64s(World world, int i, int j, Random random) {

	addStructure(StructGenH.struct,random,world,i,j,63,76,5);


}
private void generateover(World world, int i, int j, Random random) {

	AddOre(blocks.Quarium_ore,Blocks.stone,random,world,i,j,6,14,1,3,4);
	AddOre(blocks.rutherium_ore,Blocks.stone,random,world,i,j,8,14,3,5,4);
	

}

private void generatenether(World world, int i, int j, Random random) {
	
}
}
