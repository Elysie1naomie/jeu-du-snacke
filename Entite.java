import java.awt.Color;
import java.awt.Graphics;

public class Entite {
	protected int x;
	protected int y;
	protected int Long;
	protected int Larg;
	protected Color Couleur;
	
	//Accesseurs
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getLong() {
		return Long;
	}
	public int getLarg() {
		return Larg;
	}

	public Color getCouleur() {
		return Couleur;
	}
	
	//Mutateur
	
	public void SetX(int Val) {
		this.x=Val;
	}
	public void SetY(int Val) {
		this.y=Val;
	}
	public void SetLong(int Val) {
		this.Long=Val;
	}
	public void SetLarg(int Val) {
		this.Larg=Val;
	}
	public void SetCouleur(Color Val) {
		this.Couleur=Val;
	}
	public void Desiner(Graphics g) {
		
	}
}
