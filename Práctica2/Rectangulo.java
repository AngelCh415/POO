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
  public Rectangulo(String nom, double x1, double y1, double x2, double y2){
    nombre=nom;
    a= new Punto(x1,y1);
    b= new Punto(x2,y2);
  }

  public Rectangulo(double x1, double y1, double x2, double y2){
    nombre= "";
    a= new Punto(x1,y1);
    b= new Punto(x2,y2);
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

  public Rectangulo inter (Rectangulo r){ //Suponiendo que los rectangulos siempre se intersecan
    List < Double > ex =
      new ArrayList < Double >
      (Arrays.asList (a.gx (), b.gx (), r.a.gx (), r.b.gx ()));
    List < Double > ey =
      new ArrayList < Double >
      (Arrays.asList (a.gy (), b.gy (), r.a.gy (), r.b.gy ()));
    Collections.sort (ex);
    Collections.sort (ey);
    return new Rectangulo (ex.get (1), ey.get (1), ex.get (2), ey.get (2));
  }

  public Rectangulo union (Rectangulo r){
    List < Double > ex =
      new ArrayList < Double >
      (Arrays.asList (a.gx (), b.gx (), r.a.gx (), r.b.gx ()));
    List < Double > ey =
      new ArrayList < Double >
      (Arrays.asList (a.gy (), b.gy (), r.a.gy (), r.b.gy ()));
    Collections.sort (ex);
    Collections.sort (ey);
    return new Rectangulo (ex.get (0), ey.get (0), ex.get (3), ey.get (3));
  }

  public boolean dentroDe (Punto p){
    return (p.gx () > a.gx () && p.gx () < b.gx () &&
	    p.gy () > a.gy () && p.gy () < b.gy ());
  }

  public double area (){
    double ar = (b.gx () - a.gx ()) * (b.gy () - a.gy ());
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
