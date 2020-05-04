package qc.slow.quariummod.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldRegister {

	public static void Registery() {
		regsiterWorldGen(new WorldGen(),-1);
		regsiterWorldGen(new WorldGen(),0);
		regsiterWorldGen(new WorldGen(),1);
	}

	public static void regsiterWorldGen(IWorldGenerator iG,int p) {
		GameRegistry.registerWorldGenerator(iG, p);
		
		
	}
}
