package tuto;

public class Personne extends CerclePhysique {
	private int id ;
	private static int cpt=0;
	private Vecteur2D target;
	
	private Strategy str;

	public Personne(double x, double y, Strategy s1) {
		super(x, y);
		id = cpt;
		cpt ++;
		str = s1;
		
	}
	
	public void setDir(Vecteur2D v) {
		 super.setDir(v);
		
	}
	
	public void move(){
		target = str.deplacement(this);
		super.setVit(1.);
	    setDir(target);
	                         
	}

	public Vecteur2D getTarget() {
		return target;
	}
	
	public int getId() {
		return id;
	}

}
