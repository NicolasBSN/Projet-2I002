package tuto;

import java.util.Comparator;

public class ComparateurPosition implements Comparator<Vecteur2D>{
	private Salle s;
	private Vecteur2D perso;
	
	public ComparateurPosition(Salle s, Vecteur2D vpers){
		this.s = s;
		perso = vpers;
	}
	

	@Override
	public int compare(Vecteur2D c1, Vecteur2D c2) {
		if (!(s.isVisible(perso, c1) && s.isVisible(perso, c2))){
			return 0;
		}
		else{
			int lvl1 = s.get(c1).level(s.get(c1));
			int lvl2 = s.get(c2).level(s.get(c2));
			double scoreC1 = perso.distance(c1) + lvl1 *1000;
			double scoreC2 = perso.distance(c2) + lvl2 *1000;
			if (scoreC1 < scoreC2){
				return 1;
			}
			if (scoreC1 > scoreC2){
				return -1;
			}
			else{
				return 0;
			}
		}
	}
	

}
