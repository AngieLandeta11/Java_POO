
public class PruebaConstructor {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(5);
		Cuenta cuenta2 = new Cuenta(5);
		Cuenta cuenta3 = new Cuenta(5);
		
		System.out.println(Cuenta.getTotal());
		System.out.println(cuenta.getAgencia());
		System.out.println(cuenta2.getAgencia());
		System.out.println(cuenta3.getAgencia());
	}

}
