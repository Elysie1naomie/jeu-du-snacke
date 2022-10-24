import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

//J
public class Ecran extends JPanel implements KeyListener{
	private Mur m;
	private Serpent python;
	private Score s;
	private Foods food;
	//private Score got;	
	public Ecran()
	{
		/*got=new Score();
		got.setTexte("GAME OVER");
		got.SetX(1000);
		got.SetY(10000);;*/
		m=new Mur();
		python=new Serpent();
		
		s=new Score();
		s.SetX(380);
		s.SetY(60);
		s.SetCouleur(Color.green);
		food=new Foods(250,250,10,10,Color.red);
	}
	
public void paintComponent(Graphics g)
{
	g.setColor(Color.white);

	g.fillRect(0, 0, Constance.LONGUEUR_FEN, Constance.LARGEUR_FEN);
	m.murBas(g);
	m.murDroite(g);
	m.murHaut(g);
	m.murGauche(g);
	python.desiner(g);
	s.Desiner(g);
	food.Desiner(g);
	//got.Desiner(g);
	}
/*public void gameOverMsg(Graphics g)
{
	Font font = new Font("Courier", Font.BOLD, 20);
	g.setFont(font);
	g.drawString("GAME OVER",250, 250);

}*/
private void reset()
{
	python=new Serpent();
	s=new Score();
	s.SetX(380);
	s.SetY(60);
	food=new Foods(250,250,10,10,Color.red);
	/*got.SetX(1000);
	got.SetY(10000);*/


}
/*public void changeGO()
{
	got.SetX(250);
	got.SetY(250);
}*/
//logique du jeu
public void Logic() {
	if(python.colisionmur())
	{
		Constance.GameOver=true;
	}
	if(python.collisionFood(food.getX(), food.getY(), food.getLong(), food.getLarg()))
	{
		food.changer();
		python.grandir();
		s.increscore();
	}
	if(python.collisionCorp())
	{
		Constance.GameOver=true;
	}
}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	if(e.getKeyChar()=='w')
	{
		if(python.getDir()!=Direction.BAS)
		python.setDir(Direction.HAUT);
	}
	if(e.getKeyChar()=='s')
	{
		if(python.getDir()!=Direction.HAUT)

		python.setDir(Direction.BAS);

	}
	if(e.getKeyChar()=='a')
	{
		if(python.getDir()!=Direction.DROITE)

		python.setDir(Direction.GAUCHE);

	}
	if(e.getKeyChar()=='d')
	{
		if(python.getDir()!=Direction.GAUCHE)

		python.setDir(Direction.DROITE);

		
	}
	if(e.getKeyChar()=='r')
	{
		if(Constance.GameOver)
		{
			this.repaint();

		reset();
		Constance.GameOver=false;
		}

		
	}
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
public void anim() {
	//this.repaint();
	python.deplacer();
}

}
