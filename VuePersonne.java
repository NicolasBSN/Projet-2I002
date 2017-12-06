package tuto;

import java.awt.Color;
import java.awt.Graphics;

public class VuePersonne implements Drawable{
	private Personne p;
	
	public VuePersonne(Personne p){
		this.p = p;
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.drawOval((int) p.getPosX(), (int) p.getPosY(), (int) (2*p.getRayon()), (int) (2*p.getRayon()));
	}

	@Override
	public int getPriority() {
		return 0;
	}

}
