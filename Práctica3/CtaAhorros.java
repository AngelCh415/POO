public class CtaAhorros extends Cuenta implements Impuestos {
	private double tasa;

	public CtaAhorros(double saldo, double tasa){
		super(saldo);
		this.tasa = tasa;
	}

	public void consultar(){
		Fecha hoy = Fecha.hoy();
		mov.add(hoy.toString()+operaciones[1]+ "\n Su saldo es: " + saldo + "mx." );
		int mesH = hoy.sacarMes();
		int mesAp = apertura.sacarMes();

		if(mesH> mesAp){
			if(hoy.sacarDia()> apertura.sacarDia()) this.saldo += this.saldo * tasa;
		} 
			for(int i=0;i < mov.size(); i++){
				System.out.println(mov.get(i));
			}
	}
	public void pagarISRmensual(){
		if( saldo > 10000 )
			saldo *= 1 - ISRm;
	}
	public void pagarISRanual(){
		if( saldo > 50000 )
			saldo *= 1 - ISRa;
	}
}
