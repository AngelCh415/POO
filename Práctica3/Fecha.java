import java.util.Random;


public class Fecha{
	private int dia;
	private int mes;
	private int anio;
	public Fecha(int d, int m, int a){
		this.dia = d;
		this.mes = m;
		this.anio= a;
	}
	public Fecha obtenerFecha(){
		return this;
	}
	public void establecerFecha(int d, int m, int a){
		this.dia = d;
		this.mes = m;
		this.anio = a;
	}

	public int sacarMes(){
		return this.mes;
	}
	public String toString() {
		String fechaHoy = dia+"/"+mes+"/"+anio;
		return fechaHoy;
	}
	public static Fecha hoy(){	//Valido de que no haya fechas extrañas
		Random aleatorio = new Random();
		Fecha fecha = new Fecha( aleatorio.nextInt(27)+1, aleatorio.nextInt(11)+1, aleatorio.nextInt(120)+1900);
		return fecha;
	}
	public int sacarDia(){
		return this.dia;
	}
	public int pasoAnio(Fecha f){
		if(this.anio < f.anio){
			if(this.mes < f.mes){
				return 1;
			}
			else if(this.mes== f.mes){
				if(this.dia<=f.dia) return 1;
			}
		}
		return 0;
	}
	public static Fecha generadora(){
		Random aleatorio = new Random();
		Fecha fecha = new Fecha( aleatorio.nextInt(28)+1, aleatorio.nextInt(11)+1, aleatorio.nextInt(110)+1900);
		return fecha;
	}
}
