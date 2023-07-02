
public class TestReferencia{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cuenta primeraCuenta=new Cuenta(1);
		primeraCuenta.depositar(200);
		
		Cuenta segundaCuenta=primeraCuenta;
		segundaCuenta.depositar(200);
		
		System.out.println("Saldo 1ra cuenta "+primeraCuenta.getSaldo());
		System.out.println("Saldo 2da cuenta "+segundaCuenta.getSaldo());
		
		//segundaCuenta.saldo+=400;
		segundaCuenta.depositar(400);
		System.out.println("Saldo 2da cuenta "+segundaCuenta.getSaldo());
		
	}

}
