import java.awt.Color;
import java.awt.Graphics;

public class Mur {
	private Color c;
	public Mur()
	{
		c=Color.black;
	}
	public void murHaut(Graphics g){
		g.setColor(c);
		g.fillRect(0, 0, Constance.LONG_MUR,Constance.HAUT_MUR );
	}
	public void murBas(Graphics g){
		g.setColor(c);
		g.fillRect(0,Constance.LONG_MUR-Constance.HAUT_MUR, Constance.LONG_MUR,Constance.HAUT_MUR );
	}
	public void murGauche(Graphics g){
		g.setColor(c);
		g.fillRect(0,0, Constance.HAUT_MUR,Constance.LONG_MUR );
	}
	public void murDroite(Graphics g){
		g.setColor(c);
		g.fillRect(Constance.LONG_MUR-Constance.HAUT_MUR,0, Constance.HAUT_MUR,Constance.LONG_MUR);
	}
}
