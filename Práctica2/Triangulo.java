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
		else if(distAB != distBC && distBC!= distCA && distAB != distCA) return 1; //Son Escalenos
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

	public double area()
		{ return ( a.gx()(b.gy()-c.gy()) + b.gx()(c.gy()-a.gy()) + c.gx()(a.gy()-b.gy()) )/2;}
	public int comparar(Triangulo t)
		{ return area()>t.area()? 1: area()<t.area() -1:0; }
	public int comparar(Triangulo t)
		{ return area()>t.area()? 1: area()<t.area() -1:0; }
	
	public boolean puntoDentro( Punto p ){
		Punto v1 = this.gb().add(this.ga().neg());
		Punto v2 = this.gc().add(this.ga().neg());
		double d1 = ( v2.gx()( p.gy() + this.a.gy() ) + v2.gy()*( p.gx() - this.ga.gx() ))/( v1.gx()*v2.gy() - v1.gy()*v2.gx() )
		double d2 = ( p.gy() - this.ga.gy() - d1*v1.gy() ) / v2.gy();
		if( d1 || d2 < 0 ) return false;
		if( d1 <= this.ga().distancia(this.gb()) ){
			double p2 = 1 - ( d1 / this.ga().distancia(this.gb()) );
			if( d2 <= this.ga().distancia(this.gc()) * p2 ) return true;
		}else{ return false }
	}

	public Triangulo interseccion( Triangulo t ){
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
		}
		
	}
}

