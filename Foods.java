import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

public class Foods extends SerpentObj {
	private Random r ;

	public Foods(int x, int y, int w, int h, Color c) {
	//
		super(x, y, w, h, c);
		r = new Random();
		// TODO Auto-generated constructor stub
	}
	
	public void changer() {
		
		SetX((Math.abs((r.nextInt()%250) + 30)));
		SetY( Math.abs((r.nextInt()%250) + 30));
	
		
	}
	
		
	public void Desiner(Graphics g) {

		g.setColor(getCouleur());
		g.fillRect(getX(), getY(), getLong(), getLarg());
		
			
		}
		

	
	
	

}
