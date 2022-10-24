import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Serpent {
 private ArrayList<SerpentObj> cobra;
 private Direction dir;
 
 public Serpent()
 {
	 cobra=new ArrayList();
	 dir=Direction.GAUCHE;
	 cobra.add(new SerpentObj(Constance.LONGUEUR_FEN/2,Constance.LONGUEUR_FEN/2,Constance.LS,Constance.LS,Color.green));
	 for(int i=0;i<5;i++)
	 {
		cobra.add(new SerpentObj(cobra.get(i).getX()+10,cobra.get(i).getY(),Constance.LS,Constance.LS,Color.black));
	 }
 }
 
 public boolean colisionmur() {
	 // collision des differents mur
	 if(cobra.get(0).getY() <= Constance.HAUT_MUR ) {
		 return true;
	 }else if(cobra.get(0).getY() >= Constance.LONG_MUR-10  -  Constance.HAUT_MUR) {
		 return true;
	 }else if(cobra.get(0).getX() >= Constance.LONG_MUR-10  -  Constance.HAUT_MUR) {
		 return true;
	 }else if(cobra.get(0).getX() <= Constance.HAUT_MUR ) {
		 return true;
	 }else {
		 return false;
	 }
	 
 }
 public boolean collisionFood(int x,int y,int w,int h)
 {
	 Rectangle rn=new Rectangle(x,y,w,h);
	 Rectangle rs=new Rectangle(cobra.get(0).getX(),cobra.get(0).getY(),cobra.get(0).getLong(),cobra.get(0).getLarg());
	 if(rs.intersects(rn))
	 {
		 return true;
	 }
	 return false;
 }
 
 
 	public boolean collisionCorp(){
 		Rectangle rs=new Rectangle(cobra.get(0).getX(),cobra.get(0).getY(),cobra.get(0).getLong(),cobra.get(0).getLarg());
 		boolean test=false;
 		for(int i=1;i<cobra.size();i++)
 		{
 			Rectangle r = new Rectangle(cobra.get(i).getX(),cobra.get(i).getY(),cobra.get(i).getLong(),cobra.get(i).getLarg());
 			if(rs.intersects(r)){
 				 test= true;
 				 break;
 			 }
 			else {
 			 test= false;
 			}
 		}
 		return test;
 	}
 
 
 public void setDir(Direction d)
 {
	 dir=d;
 }
 public Direction getDir()
 {
	 return dir;
 }
 public void deplacer() {
	 for(int i=cobra.size()-1;i>0;i--)
	 {
		cobra.get(i).SetX(cobra.get(i-1).getX());
		cobra.get(i).SetY(cobra.get(i-1).getY());

	 }
	 switch(dir)
	 {
	 case GAUCHE:
		 cobra.get(0).SetX(cobra.get(0).getX()-10);
		 break;
	 case DROITE:
		 cobra.get(0).SetX(cobra.get(0).getX()+10);
		 break;
	 case BAS:
		cobra.get(0).SetY(cobra.get(0).getY()+10) ;
		break;
	 case HAUT:
		 cobra.get(0).SetY(cobra.get(0).getY()-10) ;
		 break;
	 }
	 
 }
 public void grandir() {
	 SerpentObj clone=new SerpentObj(0,0,10,10,Color.black);
	 switch(dir)
	 {
	 case GAUCHE:
		 clone.SetX(cobra.get(cobra.size()-1).getX()+10);
		 clone.SetY(cobra.get(cobra.size()-1).getY());

		 break;
	 case DROITE:
		 clone.SetX(cobra.get(cobra.size()-1).getX()-10);
		 clone.SetY(cobra.get(cobra.size()-1).getY());
		 break;
	 case BAS:
		 clone.SetX(cobra.get(cobra.size()-1).getX());
		 clone.SetY(cobra.get(cobra.size()-1).getY()-10);		
		 break;
	 case HAUT:
		 clone.SetX(cobra.get(cobra.size()-1).getX());
		 clone.SetY(cobra.get(cobra.size()-1).getY()+10);		
		 break;
	 }
	 
	 cobra.add(clone);
 }

 public void desiner(Graphics g)
 {
	 for(int i=0;i<cobra.size();i++)
	 {
		 //g.setColor(cobra.get(i).getCouleur());
		 //g.drawRect(cobra.get(i).getX(), cobra.get(i).getY(), cobra.get(i).getLong(), cobra.get(i).getLarg());
		 cobra.get(i).Desiner(g);
	 }
 }
}
