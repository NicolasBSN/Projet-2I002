package tuto;

import java.awt.Color;
import java.awt.Graphics;

public class VueMur implements Drawable {
	private Mur m1;

	public VueMur(Mur m1) {

		this.m1 = m1;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawRect((int) m1.getPosX(), (int) m1.getPosY(), (int) m1.getLarg(),
				(int) m1.getHaut());

	}

	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return 1;
	}

}