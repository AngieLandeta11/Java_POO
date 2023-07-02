
public class TestReferencia2 {
	
	public static void main(String[] args) {
		
		Cliente diego = new Cliente();//Creamos un cliente
		diego.setNombre("Diego");
		diego.setDocumento("1223323");
		diego.setTelefono("323837382");
		
		Cuenta CuentaDeDiego=new Cuenta(1);//Creamos una cuenta
		CuentaDeDiego.setAgencia(1);
		CuentaDeDiego.setTitular(diego);
		System.out.println(CuentaDeDiego.getTitular().getDocumento());
		System.out.println(CuentaDeDiego.getTitular());
		System.out.println(diego);
	}

}
