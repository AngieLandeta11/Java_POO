
public class Condicionales2 {

	public static void main(String[] args) {
		int edad = 16;
		int cantidadPersonas=2;
		
		if(edad>=18 || cantidadPersonas>=2){
			System.out.println("Puedes pasar");
		}else {
			System.out.println("No puedes pasar");
		}
		
		if(edad>=18 && cantidadPersonas>=2){
			System.out.println("Puedes pasar");
		}else {
			System.out.println("No puedes pasar");
		}

	}

}
