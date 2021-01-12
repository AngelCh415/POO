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
	
	public boolean puntoDentro( Punto p ){
		/*Punto v1 = this.gb().add(this.ga().neg());
		Punto v2 = this.gc().add(this.ga().neg());
		double d1 = ( v2.gx()( p.gy() + this.a.gy() ) + v2.gy()*( p.gx() - this.ga.gx() ))/( v1.gx()*v2.gy() - v1.gy()*v2.gx() )
		double d2 = ( p.gy() - this.ga.gy() - d1*v1.gy() ) / v2.gy();
		if( d1 || d2 < 0 ) return false;
		if( d1 <= this.ga().distancia(this.gb()) ){
			double p2 = 1 - ( d1 / this.ga().distancia(this.gb()) );
			if( d2 <= this.ga().distancia(this.gc()) * p2 ) return true;
		}else{ return false }*/
		return true;
	}

	public Triangulo interseccion( Triangulo t ){/*
		int counta = 0;
		int countb = 0;
		if(this.puntoDentro(t.ga())) counta++;
		if(this.puntoDentro(t.gb()) )counta++;
		if(this.puntoDentro(t.gc()) )counta++;
		if(t.puntoDentro(this.gc()) )countb++;
		if(t.puntoDentro(this.gc()) )countb++;
		if(t.puntoDentro(this.gc()) )countb++;
		if( counta == 0 || counta == 2 || countb == 0 || countb==2) return null;
		if((counta==1 || counta==3) && (countb!=1 || countb!=3)){
			//Aqui vemos con los puntos del primero
		}else{
			//Aqui vemoc con los puntos del segundo
		}*/	
		return null;
	}
}

