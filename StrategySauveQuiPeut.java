package tuto;

import java.util.Collections;

public class StrategySauveQuiPeut implements Strategy{
	private Salle s;
	
	public StrategySauveQuiPeut(Salle s){
		this.s = s;
	}
	
	@Override
	public Vecteur2D deplacement(Personne p) {
		Vecteur2D cibleOpt = Collections.min(s.getListeCibles(), new ComparateurPosition(s, p.getPos()));
		p.setDir(p.getPos().minus(cibleOpt));
		return p.getPos().minus(cibleOpt);
	}

}
