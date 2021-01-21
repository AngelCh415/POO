public class CtaCredito extends Cuenta {
	private double tasa;
	private double deficit;

	public CtaCredito(double saldo, double tasa){
		super( saldo );
		deficit = 0;
		this.tasa = tasa;
	}
	public void depositar(double monto){
		mov.add(Fecha.hoy().toString()+ operaciones[0]+ "\n Su nuevo saldo es: " + saldo + "mx." );
		if( deficit > 0 )
			if( deficit > monto ){
				deficit -= monto;
				return;
			} else {
				monto -= deficit;
				deficit = 0;
			}
		saldo += monto;
	}
	public void retirar(double monto){
		mov.add(Fecha.hoy().toString()+ operaciones[2]+ "\n Su nuevo saldo es: " + saldo + "mx." );
		if( monto <= saldo ){
			saldo -= monto;
			return;
		}
		deficit += monto - saldo;
		saldo = 0;
	}
}


/* 

*/