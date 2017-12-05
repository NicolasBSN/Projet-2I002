package tuto;

public class TestTerrain {
	public static void main(String[] args) {
		
		Terrain[][] t =(MapFactoryFromFile_Matrix .build("terrain1.trk"));
		Salle s = new Salle(t);
	}
	
}
