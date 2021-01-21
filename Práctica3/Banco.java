import java.util.ArrayList;
import java.util.Random;

public class Banco{
	public static void main( String args[] ){
		Random cantidad = new Random();
		System.out.println("\nCreando usarios");
		Cliente[] clientes ={ 
			new Cliente("Andres", 	new ArrayList<Cuenta>() 	),
			new Cliente("Mauricio", 		new ArrayList<Cuenta>() 	),
			new Cliente("Angel",	new ArrayList<Cuenta>() 	),
		};
		System.out.println("\nPrimeros movimientos");
		clientes[2].agregarCuenta( new CtaAhorros(9060,2.8) 	);
		clientes[0].agregarCuenta( new CtaCredito(1000,16) 		);
		clientes[1].agregarCuenta( new CtaCheques(3000,1000) 	);
		clientes[2].agregarCuenta( new CtaCredito(1200,1.6) 	);
		clientes[0].agregarCuenta( new CtaAhorros(5000,1.8) 	);
		clientes[0].agregarCuenta( new CtaCheques(300,100) 		);
		clientes[1].agregarCuenta( new CtaAhorros(7000,2.1) 	);
		clientes[2].agregarCuenta( new CtaCheques(300,10) 		);
		clientes[1].agregarCuenta( new CtaCredito(10000,0.5) 	);

		
		for(int i=0; i<clientes.length; i++  ){
			clientes[i].reportarEdosCtas();
		}
		
		
		for(int i =0; i<clientes.length;i++){
			for(int j=0; j< 5; j++){
				clientes[i].getCuentas().get(0).depositar(cantidad.nextInt(5000));
				clientes[i].getCuentas().get(1).depositar(cantidad.nextInt(5000));
				clientes[i].getCuentas().get(2).depositar(cantidad.nextInt(5000));
				}
		}	
		for(int i=0; i<clientes.length;i++){
			for(int j=0; j< 5; j++){
				clientes[i].getCuentas().get(0).retirar(cantidad.nextInt(5000));
				clientes[i].getCuentas().get(1).retirar(cantidad.nextInt(5000));
				clientes[i].getCuentas().get(2).retirar(cantidad.nextInt(5000));
				}
		}
		
		for(int i=0; i<clientes.length; i++  ){
			clientes[i].reportarEdosCtas();
		}	
	}
}
