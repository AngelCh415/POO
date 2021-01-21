import java.util.ArrayList;
import java.util.Random;

public class Cliente{
	private String				nombre;
	private ArrayList<Cuenta>	cuentas;
	private String				numCliente;

	public Cliente(String nom, ArrayList<Cuenta> ctas){
		this.nombre = nom;
		this.cuentas = ctas;
		this.numCliente = nom.substring(0,5) +  new Random().nextInt(500) ;
	}
	public ArrayList<Cuenta> getCuentas(){return cuentas;}
	public void agregarCuenta(Cuenta cta){
		cta.id =  cuentas.size() + 1 ;
		cuentas.add(cta);
	}
	public Cuenta obtenerCuenta(int index){
		return this.cuentas.get(index);
	}
	public void reportarEdosCtas(){
		System.out.println("Cliente: " + nombre +" No.Cuenta: " + numCliente );
		for(int i=0; i< cuentas.size();i++){
			cuentas.get(i).consultar();
		}
	}
}
