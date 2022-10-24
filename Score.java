import java.awt.Font;
import java.awt.Graphics;

public class Score extends Entite{
	
	
	private int score;
	private String strs;
	public Score() {
		score = 0;
		strs=new String("SCORE :");
	}
	
	public void increscore()
	{
		score ++;
	}
	public int getScore()
	{
		return score ;
	}
	public void setTexte(String s)
	{
	strs=s;	
	}
	// Definition d'une methode construite dans une autre classe
	@Override
	public void Desiner(Graphics g) {
		String str=strs+String.valueOf(score);
		Font font = new Font("Courier", Font.BOLD, 20);
		g.setFont(font);
		g.setColor(getCouleur());
		g.drawString(str, getX(), getY());
		
	}
		
		
	

}
