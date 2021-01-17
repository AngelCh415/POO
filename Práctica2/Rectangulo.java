public class Rectangulo{
  private String nombre;
  private Punto a;
  private Punto b;

  public Rectangulo (){
    nombre = "Incognito";
    a = new Punto (0,0);
    b = new Punto (1,1);
  }
    
  public Rectangulo (String nom){
    nombre = nom;
    a = new Punto (0,0);
    b = new Punto (1,1);
  }

  public Rectangulo (String nom, Punto p1, Punto p2){
    nombre = nom;
    a = p1;
    b = p2;
  }

  public Rectangulo (Punto p1, Punto p2){
    nombre= "Incognito";
    a = p1;
    b = p2;
  }

  public Rectangulo(String nom, int x1, int y1, int x2, int y2){
    nombre=nom;
    a = new Punto(x1,y1);
    b= new Punto(x2,y2);
  }

  public Rectangulo(int x1, int y1, int x2, int y2){
    nombre= "Incognito";
    a = new Punto(x1,y1);
    b = new Punto(x2,y2);
  }

  public Rectangulo (Rectangulo rec){
      this.nombre = rec.nombre;
      this.a = rec.a; 
      this.b = rec.b;  
  }

  public Punto geta (){
    return a;
  }
  
  public Punto getb (){
    return b;
  }
  
  public String getnombre (){
    return nombre;
  }

  public void seta (Punto x){
    a = x;
  }
  
  public void setb (Punto y){
    b = y;
  }

  public void setnombre (String s){
    nombre = s;
  }

  public String toString (){
    return nombre + ":[" + a.toString () + "," + b.toString () + "]";
  }

  public Rectangulo union (Rectangulo r){ //tomamos para el punto 1, con los valores xy mas chicos. El segundo punto con los calores xy mas lejanos
    int x1, y1, x2, y2;
    Punto punto1,punto2; 
    x1 = Math.min(this.a.getX(), r.a.getX());
    x2 = Math.max(this.b.getX(), r.b.getX());
    y1 = Math.min(this.a.getY(), r.a.getY());
    y2 = Math.max(this.b.getY(), r.b.getY());
    punto1 = new Punto(x1,y1);
    punto2 = new Punto (x2,y2); 
    return new Rectangulo ("Union",punto1, punto2);
  }
  public Rectangulo inter (Rectangulo r){
    int x1, y1, x2, y2;
    Punto punto1,punto2, aux1, aux2, raux1, raux2;
    //Puntos que faltan del rectangulo
    aux1 = new Punto (this.a.getX(), this.b.getY()); 
    aux2 = new Punto( this.b.getX(), this.a.getY()); 
    raux1 = new Punto (r.a.getX(), r.b.getY()); 
    raux2 = new Punto( r.b.getX(), r.a.getY());

    if((r.dentroDe(this.a) == false && r.dentroDe(this.b) == false && r.dentroDe(aux1) == false && r.dentroDe(aux2) == false) && 
    (this.dentroDe(r.a) == false && this.dentroDe(r.b) == false && this.dentroDe(raux1) == false && this.dentroDe(raux2) == false)) return null;
    else{
      x1 = Math.max(this.a.getX(), r.a.getX());
      x2 = Math.min(this.b.getX(), r.b.getX());
      y1 = Math.max(this.a.getY(), r.a.getY());
      y2 = Math.min(this.b.getY(), r.b.getY());
      punto1 = new Punto(x1,y1);
      punto2 = new Punto (x2,y2); 
      return new Rectangulo ("Interseccion",punto1, punto2);
    }
  }
  public boolean dentroDe (Punto p){
    return (p.getX () >= a.getX () && p.getX () <= b.getX () && p.getY () >= a.getY () && p.getY () <= b.getY ());
  }
  public double area (){
    double ar = (b.getX () - a.getX ()) * (b.getY () - a.getY ());
    return Math.abs(ar);
  }
  
  public int comparar (Rectangulo rect){
      /*
      -1 = A < B
      0 = A=B
      1 = A > B 
       */
    double area1 = this.area();
    double area2 = rect.area();
    if(area1<area2) return -1; 
    else if( area1==area2) return 0;
    else return 1;
  }
  public int comparar (Triangulo trian){
    /*
    -1 = A < B
    0 = A=B
    1 = A > B 
     */
  double area1 = this.area();
  double area2 = trian.area();
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
