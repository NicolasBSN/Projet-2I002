package tuto;

import java.awt.Color;
import java.awt.Graphics;

public class VueParticule implements Drawable {
	private CerclePhysique c1;
	

	public VueParticule(CerclePhysique c1) {
		
		this.c1 = c1;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.drawOval((int) c1.getPosX(), (int) c1.getPosY(), (int) (2*c1.getRayon()), (int) (2*c1.getRayon()));

	}

	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return 0;
	}

}
