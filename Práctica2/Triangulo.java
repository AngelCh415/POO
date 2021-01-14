import java.lang.Math;
public class Triangulo {
	private Punto a;
	private Punto b;
	private Punto c;
	private String nombre;

	public Triangulo (){
		nombre = "Incognito";
		a = new Punto();
		b = new Punto();
		c = new Punto();
	  }
		
	  public Triangulo (String nom){
		nombre = nom;
		a = new Punto();
		b = new Punto();
		c = new Punto();
	  }
	
	  public Triangulo (String nom, Punto p1, Punto p2, Punto p3){
		nombre = nom;
		a = p1;
		b = p2;
		c = p3;
	  }
	
	  public Triangulo (Punto p1, Punto p2, Punto p3){
		nombre= "Incognito";
		a = p1;
		b = p2;
		b = p3;
	  }
	
	  public Triangulo(String nom, int x1, int y1, int x2, int y2, int x3, int y3){
		nombre=nom;
		a = new Punto(x1,y1);
		b = new Punto(x2,y2);
		c = new Punto(x3,y3);
	  }
	
	  public Triangulo(int x1, int y1, int x2, int y2, int x3, int y3){
		nombre= "Incognito";
		a = new Punto(x1,y1);
		b = new Punto(x2,y2);
		c = new Punto(x3,y3);
	  }
	
	  public Triangulo (Triangulo triang){
		  this.nombre = triang.nombre;
		  this.a = triang.a; 
		  this.b = triang.b;
		  this.c = triang.c;	  
	  }
	public int tipTriang (){
		double distAB, distBC, distCA;
		distAB = a.distancia(b);
		distBC = b.distancia(c);
		distCA = c.distancia(a);
		if(distAB==distBC && distBC==distCA) return 0; // Son Equilateros
		else if(distAB!=distBC && distBC!=distCA && distAB!=distCA) return 1; //Son Escalenos
		else return 2; //Son Isoceles
	}
	public Punto ga(){ 
		return a;
	}
	public Punto gb(){ 
		return b;
	}
	public Punto gc(){ return c;
	}
	public String gn(){ 
		return nombre;
	}
	public void sa(Punto p){ 
		a = p; 
	}
	public void sb(Punto p){ 
		b = p; 
	}
	public void sc(Punto p){ 
		c = p; 
	}

	public String toString (){
		return nombre + ":[" + a.toString () + "," + b.toString () + "," + c.toString() + "]";
	  }

	public double area(){ 
		//Usando la formula de Heron 
		double da,db,dc,sp, Area; 
		da = a.distancia(b);
		db = b.distancia(c);
		dc = c.distancia(a); 
		sp = (da+db+dc)/2;
		Area = Math.sqrt(sp * (sp-da) * (sp-db) * (sp-dc));
		return Area;
	}

	public int comparar(Triangulo t){ 
		/*
      -1 = A < B
      0 = A=B
      1 = A > B 
       */
		double area1, area2; 
		area1 = this.area(); 
		area2 = t.area(); 
		if(area1<area2) return -1;
		else if(area1==area2) return 0; 
		else return 1;
	}
	public int comparar(Rectangulo rec){ 
		/*
      -1 = A < B
      0 = A=B
      1 = A > B 
       */
		double area1, area2; 
		area1 = this.area(); 
		area2 = rec.area(); 
		if(area1<area2) return -1;
		else if(area1==area2) return 0; 
		else return 1;
	}
	public void movTriang (Punto a1, Punto a2, Punto a3){
		this.a = a1;
		this.b = a2; 
		this.c = a3;
	}

	public int cuadTriang (){
		return a.cuadrante ();
	}
	private int orientar (Punto a, Punto b, Punto c){
		return ((a.getX() - c.getX()) * (b.getY() - c.getY())) - ((a.getY() - c.getY()) * (b.getX() - c.getX()));
	}
	public boolean puntoDentro( Punto p ){
		int orientacionT, orientacionTp1, orientacionTp2, orientacionTp3; 
		
		orientacionT = orientar(this.a, this.b, this.c); 
		orientacionTp1 = orientar(this.a, this.b, p);
		orientacionTp2 = orientar(this.b, this.c, p);
		orientacionTp3 = orientar(this.c, this.a,p);
		if(orientacionT >=0){
			if(orientacionTp1>=0 && orientacionTp2>=0 && orientacionTp3>=0) return true;
			else return false;
		}
		else{
			if(orientacionTp1<0 && orientacionTp2<0 && orientacionTp3<0) return true;
			else return false;
		}
	}

	public Triangulo interseccion( Triangulo t ){//Usando el caso de que un triangulo este dentro del otro
		if(this.puntoDentro(t.a)== true && this.puntoDentro(t.b)== true && this.puntoDentro(t.c)== true) return t;
		else if(t.puntoDentro(this.a)== true && t.puntoDentro(this.b)== true && t.puntoDentro(this.c)== true) return this;
		else return null;
	}
}

