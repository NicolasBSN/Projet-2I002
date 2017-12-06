package tuto;

public class TestProjet {
	public static void main(String[] args) {

		Fenetre mgraph = new Fenetre();
		Terrain[][] t = (MapFactoryFromFile_Matrix.build("terrain1.trk"));
		int cote = 10;
		Salle s = new Salle(t,cote);

		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[0].length; j++) {
				if (s.get(i, j) == Terrain.Mur)
					
					mgraph.add(new VueTerrain(i*cote, j*cote, cote, cote, VueTerrain.C_MUR));
				if (s.get(i, j) == Terrain.Scene)
					mgraph.add(new VueTerrain(i*cote, j, cote, cote, VueTerrain.C_SCENE));

				if (s.get(i, j) == Terrain.Safe)
					mgraph.add(new VueTerrain(i*cote, j*cote, cote, cote, VueTerrain.C_SAFE));
				if (s.get(i, j) == Terrain.Vide)
					mgraph.add(new VueTerrain(i*cote, j*cote, cote, cote, VueTerrain.C_VIDE));
				else
					mgraph.add(new VueTerrain(i*cote, j*cote, cote, cote, VueTerrain.C_EXIT));
			}

		}

	}

}
