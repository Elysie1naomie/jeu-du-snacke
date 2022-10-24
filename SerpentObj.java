import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class SerpentObj extends Entite {
	public SerpentObj(int x,int y,int w,int h,Color c)
	{
		SetX(x);
		SetY(y);
		SetLong(w);
		SetLarg(h);
		SetCouleur(c);
		
	}
	@Override
	public void Desiner(Graphics g) {
		g.setColor(getCouleur());
		g.fillRect(getX(), getY(), getLong(), getLarg());
	}
	
	

}
