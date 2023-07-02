
public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta=new Cuenta(1);
		miCuenta.depositar(300);
		miCuenta.depositar(200);
		System.out.println(miCuenta.getSaldo());
		miCuenta.retirar(100);
		System.out.println(miCuenta.getSaldo());
		
		Cuenta CuentaDeJimena=new Cuenta(3);
		CuentaDeJimena.depositar(1000);
		
		boolean puedeTransferir=CuentaDeJimena.transferir(400, miCuenta);
		
		if(puedeTransferir) {
			System.out.println("Transferencia exitosa");
		}else {
			System.out.println("Transferencia fallida");
		}
		
		System.out.println(CuentaDeJimena.getSaldo());
		System.out.println(miCuenta.getSaldo());
	}

}
