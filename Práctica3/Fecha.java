import java.util.Random;

public class Fecha{
	private int dia;
	private int mes;
	private int anio;
	private static int ANIO = 365;
	public Fecha(int d, int m, int a){
		this.dia = d;
		this.mes = m;
		this.anio= a;
		//Perro del mal
	}
	public Fecha obtenerFecha(){return this;}
	public void establecerFecha(int d, int m, int a){
		this.dia = d;
		this.mes = m;
		this.anio = a;
	}

	public int toDays(){
		int days = this.dia;
		for( int i = 0; i < this.mes; i++ )
			days += 30;
		 days += ( this.anio - 1 ) * ANIO;
		return days;
	}

	public int diferencia( Fecha f ){
		return f.toDays() - this.toDays();
	}

	public String toString() {
		return dia+"/"+mes+"/"+anio;
	}

	public void agregandoDias( int d ){
		ANIO += d % ANIO;
		
		if(d>ANIO){
			d /= ANIO;
		}
		 //d /= d > ANIO ? ANIO : 1;
		mes += d % 30;
		if(d>30){
			d/=30;
		}
		
		dia += d;
		if( mes  > 12 ){
			anio= mes % 12;
			mes /= 12;
		}
	}

	public static Fecha toDay(){
		java.util.Date d = new java.util.Date();
		Random aleatorio = new Random();
		Fecha f = new Fecha( d.getDay() + 17 , d.getMonth() + 1, d.getYear() + 1900 );
		f.agregandoDias(aleatorio.nextInt(60) );
		return f;
	}
}
