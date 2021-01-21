
import java.util.ArrayList;


public class Cuenta{
	protected int id;
	protected double saldo;
	protected Fecha apertura;
	public ArrayList<String> mov; 
	public String[] operaciones = new String []{"Deposito", "Consulta", "Retiro"};

	public Cuenta(double saldo){
		this( 0, Fecha.generadora(), saldo );
	}

	public Cuenta(int id, Fecha apertura, double saldo ){
		this.id = id;
		this.apertura = apertura;
		this.saldo = saldo;
		mov = new ArrayList<>();
		
	}
	public void consultar(){
		mov.add(Fecha.hoy().toString()+operaciones[1]+ "\n Su saldo es: " + saldo + "mx." );
		for(int i=0;i < mov.size(); i++){
			System.out.println(mov.get(i));
		}
	}
	public void depositar(double monto){
		saldo += monto;
	
		mov.add(Fecha.hoy().toString()+ operaciones[0]+ "\n Su nuevo saldo es: " + saldo + "mx." );
	}
	public void retirar(double monto){
		if( monto <= saldo ){
			saldo -= monto;
			mov.add(Fecha.hoy().toString()+ operaciones[2]+ "\n Su nuevo saldo es: " + saldo + "mx." );
		}else{
			System.out.println("No tiene suficiente dinero ");
		}
	}
}