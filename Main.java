import java.awt.Dimension;

import javax.swing.JFrame;

public class Main extends JFrame{
	private Ecran e;
	

	public Main() {
		e=new Ecran();
		this.setSize(new Dimension(Constance.LONGUEUR_FEN+15,Constance.LARGEUR_FEN+40));
		this.setContentPane(e);
		this.setResizable(false);
		this.addKeyListener(e);
		this.setVisible(true);
		while(true) {
		while(!Constance.GameOver)
		{
			e.repaint();
			e.anim();
			e.Logic();
			try {
			Thread.sleep(150);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	/*	if(Constance.GameOver)
		{
			e.changeGO();
			e.repaint();
			}*/
		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main fenetre=new Main();
	}

}
