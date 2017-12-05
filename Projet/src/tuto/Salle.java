package tuto;

import java.util.ArrayList;

public class Salle {
	
	private ArrayList<Vecteur2D> listeCibles;
	private Terrain[][] terr;
	private int cote;
	
	public Salle( Terrain[][] terr) {
		super();
		this.listeCibles = new ArrayList<Vecteur2D>();
		this.terr = terr;
		this.cote = 10;
	}
	
	public void add(Vecteur2D t) {
		listeCibles.add(t);
	}

	public ArrayList<Vecteur2D> getListeCibles() {
		return listeCibles;
	}
	
	public Terrain get(int i, int j) {
		return terr[i][j];
		
	}
	
	public Terrain get(Vecteur2D v) {
		return terr[(int)(v.getX()/cote)][(int)(v.getY()/cote)];
			
	}
	
	public int getHaut() {
		return 10*terr.length;
	}
	
	public int getLarg() {
		return 10*terr[0].length;
	}
	
	 public boolean isVisible(Vecteur2D source, Vecteur2D target){
	      Vecteur2D dir = target.minus(source);
	      dir.normalize();
	      while(get(source) != Terrain.Mur){
	          source = source.add(dir);
	          if(source.distance(target) < 2)
	              return true;
	      }
	      return false;
	  }
	
	


}
