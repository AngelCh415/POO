import java.lang.Math;

public class Punto{
    private int x;
    private int y;
    private String nombre;

    public Punto(){ 
        nombre="Sin nombre"; 
        x = y = 0;
    }

    public Punto(String nom, int i, int j){ 
        nombre=nom; 
        x = i; 
        y = j;
    }
    public Punto (Punto i, Punto j){
        x = i.getX(); 
        y = j.getY();
    }

    public Punto(int i, int j){ 
        nombre="Sin nombre"; 
        x = i; 
        y = j; 
    }

    public int getX(){ 
        return x; 
    }

    public int getY(){ 
        return y; 
    }

    public String getNom(){ 
        return nombre; 
    }
    
    public void setX(int i){ 
        x = i; 
    }

    public void setY(int j){ 
        y = j; 
    }

    public void setNom(String nom){ 
        nombre = nom; 
    }

    public String toString(){
        return nombre+"("+x+","+y+")";
    }
    
    public double distancia(){
        return Math.sqrt( x*x + y*y );
    }
    public double distancia(Punto A){
        double d; 
        d = Math.pow(x-A.getX(),2) + Math.pow(y-A.getY(),2);
        d = Math.sqrt(d);
        return d;
    }

    public int cuadrante(){
        if(x>=0 && y>=0) return 1; 
        else if(x<0 && y>=0) return 2; 
        else if(x<0 && y<0) return 3;
        else return 4;
    }
    
    public Punto neg(){
            return new Punto( -1 * this.getX(), -1 * this.getY());
        } 

    public Punto add(Punto p){
        return new Punto(this.getX() + p.getX(), this.getY() + p.getY());
    }

    public Punto clone(){ 
        return new Punto( this.getX(), this.getY() ); 
    }
}
