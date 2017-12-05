package tuto;

import java.awt.Color;
import java.awt.Graphics;

public class VueMur implements Drawable {
	private RectanglePhysique r1;
	

	public VueMur(RectanglePhysique r1) {
		
		this.r1 = r1;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.drawRect((int) r1.getPosX(), (int) r1.getPosY(), (int) r1.getLarg(), (int) r1.getHaut());
		

	}

	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return 1;
	}

}