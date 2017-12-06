package tuto;

import java.awt.Color;
import java.awt.Graphics;

public class VueTerrain implements Drawable {

	private int x, y, larg, haut;
	private Color c;
	public final static Color C_SCENE = Color.WHITE;
	public final static Color C_SAFE = Color.black;
	public final static Color C_EXIT = Color.PINK;
	public final static Color C_VIDE = Color.GRAY;
	public final static Color C_MUR = Color.yellow;

	public VueTerrain(int x, int y, int larg, int haut, Color c) {
		this.x = x;
		this.y = y;
		this.larg = larg;
		this.haut = haut;
		this.c = c;

	}

	@Override
	public void draw(Graphics g) {
		g.setColor(c);
		g.fillRect(x, y, larg, haut);

	}

	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return 0;
	}

}
