public class CtaCheques extends Cuenta {
	private double sobregiro;
	private double deuda;

	public CtaCheques(double saldo, double sobre){
		super( saldo );
		sobregiro = sobre;
	}
	
	public void depositar(double monto){
		if( deuda > 0 )
			if( deuda > monto ){
				deuda -= monto;
				return;
			}else {
				monto -= deuda;
				deuda = 0;
			}
		saldo += monto;
		mov.add(Fecha.hoy().toString()+ operaciones[0]+ "\n Su nuevo saldo es: " + saldo + "mx." );

	}
	public void retirar(double monto){
		if( saldo > monto ){
			saldo -= monto;
			mov.add(Fecha.hoy().toString()+ operaciones[2]+ "\n Su nuevo saldo es: " + saldo + "mx." );
			return;
		}
		if( saldo + ( sobregiro - deuda )  > monto && apertura.pasoAnio(Fecha.hoy()) ==1 ){
			saldo = 0;
			deuda += monto - saldo;
			System.out.println("No hay suficientes fondos en su cuenta");
			return;
		}
	}
}