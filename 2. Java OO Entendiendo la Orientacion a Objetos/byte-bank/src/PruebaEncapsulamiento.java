
public class PruebaEncapsulamiento {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1);
		Cliente cliente = new Cliente();
		
		cliente.setNombre("Diego");
		cliente.setDocumento("dfdsgdg");
		
		cuenta.setTitular(cliente);
		
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());
		
		System.out.println(cliente);//Referencia al mismo
		System.out.println(cuenta.getTitular()); //Referencia al mismo
		
		
		
	}

}
