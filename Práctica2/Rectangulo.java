import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rectangulo{
  private String nombre;
  private Punto a;
  private Punto b;

  public Rectangulo (){
    nombre = "Incognito";
    a = new Punto ();
    b = new Punto ();
  }
    
  public Rectangulo (String nom){
    nombre = nom;
    a = new Punto ();
    b = new Punto ();
  }

  public Rectangulo (String nom, Punto p1, Punto p2){
    nombre = nom;
    a = p1;
    b = p2;
  }
  public Rectangulo(String nom, int x1, int y1, int x2, int y2){
    nombre=nom;
    a = new Punto(x1,y1);
    b= new Punto(x2,y2);
  }

  public Rectangulo(int x1, int y1, int x2, int y2){
    nombre= "";
    a = new Punto(x1,y1);
    b = new Punto(x2,y2);
  }

  public Rectangulo (Punto p1, Punto p2){
    a = p1;
    b = p2;
  }


  public Rectangulo (Rectangulo rec){
      this.nombre = rec.nombre;
      this.a = rec.a; 
      this.b = rec.b;
      
  }

  public Punto ga (){
    return a;
  }
  
  public Punto gb (){
    return b;
  }
  
  public String gn (){
    return nombre;
  }

  public void sa (Punto x){
    a = x;
  }
  
  public void sb (Punto y){
    b = y;
  }

  public void sn (String s){
    nombre = s;
  }
  public String toString (){
    return nombre + ":[" + a.toString () + "," + b.toString () + "]";
  }
  public Rectangulo union (Rectangulo r){ //tomamos para el punto 1, con los valores xy mas chicos. El segundo punto con los calores xy mas lejanos
    int x1, y1, x2, y2;
    Punto punto1,punto2; 
    x1 = Math.min(this.a.getX(), r.a.getX());
    x2 = Math.min(this.b.getX(), r.b.getX());
    x1 = Math.min(x1, x2);
    y1 = Math.min(this.b.getY(), r.b.getY());
    y2 = Math.min(this.a.getY(), r.b.getY()); 
    y1 =Math.min(y1, y2);
    punto1 = new Punto(x1,y1);
    x1 = Math.max(this.a.getX(), r.a.getX());
    x2 = Math.max(this.b.getX(), r.b.getX());
    x2 = Math.max(x1, x2);
    y1 = Math.max(this.b.getY(), r.b.getY());
    y2 = Math.max(this.a.getY(), r.b.getY()); 
    y2 =Math.max(y1, y2);
    punto2 = new Punto (x2,y2); 
    return new Rectangulo (punto1, punto2);
  }
  public Rectangulo inter (Rectangulo r){ //Suponiendo que los rectangulos siempre se intersecan
    //agarramos los de enmedio
    int x1, y1, x2, y2;
    Punto punto1,punto2; 
    x1 = Math.min(this.a.getX(), r.a.getX());
    x2 = Math.min(this.b.getX(), r.b.getX());
    x1 = Math.min(x1, x2);
    y1 = Math.min(this.b.getY(), r.b.getY());
    y2 = Math.min(this.a.getY(), r.b.getY()); 
    y1 =Math.max(y1, y2);
    punto1 = new Punto(x1,y1);
    x1 = Math.max(this.a.getX(), r.a.getX());
    x2 = Math.max(this.b.getX(), r.b.getX());
    x2 = Math.max(x1, x2);
    y1 = Math.max(this.b.getY(), r.b.getY());
    y2 = Math.max(this.a.getY(), r.b.getY()); 
    y2 =Math.min(y1, y2);
    punto2 = new Punto (x2,y2); 
    return new Rectangulo (punto1, punto2);
  }
  public boolean dentroDe (Punto p){
    return (p.getX () > a.getX () && p.getX () < b.getX () && p.getY () > a.getY () && p.getY () < b.getY ());
  }
  public double area (){
    double ar = (b.getX () - a.getX ()) * (b.getY () - a.getY ());
    if(ar<0) ar*=-1; //Por si hay un area negativa
    return ar;
  }
  public int comparar (Rectangulo B){
      /*
      -1 = A < B
      0 = A=B
      1 = A > B 
       */
    double area1 = this.area();
    double area2 = B.area();
    if(area1<area2) return -1; 
    else if( area1==area2) return 0;
    else return 1;
  }
  public int cuadRect (){
    return a.cuadrante ();
  }
  public void moverRect (Punto p1, Punto p2){
    a = p1;
    b = p2;
  }
}
