import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Conversor {
	public static void main(String[] args) {
		double cantidad;
		double resultado;
		
		boolean repetir=true;
		
		do{
			cantidad=Double.parseDouble(JOptionPane.showInputDialog(
					"Ingresa la cantidad de dinero que deseas convertir"));
			
			String[] opciones = {"Peso mexicano a Dolar", "Peso a Euro", "Peso a Libra esterlina",
					"Peso a Yen japones","Peso a Won surcoreano","Dolar a Peso mexicano",
					"Euro a Peso mexicano","Libra esterlina a Peso mexicano","Yen japones a Peso mexicano",
					"Won surcoreano a Peso mexicano"};
			
			String seleccion = (String) JOptionPane.showInputDialog(null, 
					"Selecciona una opción", "Lista de opciones", 
					JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
			
			if (seleccion != null) {
			    
			    System.out.println("Seleccionaste: " + seleccion);
			} else {
			   
			    System.out.println("No seleccionaste ninguna opción");
			}
			
			if(seleccion==opciones[0]) {
				DecimalFormat df = new DecimalFormat("#.###");
				
				resultado=cantidad/17.11;
				String numero=df.format(resultado);
				JOptionPane.showMessageDialog(null,"Tienes "+numero+" $Dolares");
			}else if(seleccion==opciones[1]) {
				DecimalFormat df = new DecimalFormat("#.###");
				resultado=cantidad/18.60;
				String numero=df.format(resultado);
				JOptionPane.showMessageDialog(null,"Tienes "+numero+" €Euros");
				
			}else if(seleccion==opciones[2]){
				DecimalFormat df = new DecimalFormat("#.###");
				resultado=cantidad/21.61;
				String numero=df.format(resultado);
				JOptionPane.showMessageDialog(null,"Tienes "+numero+" £Libras esterlinas");
				
			}else if(seleccion==opciones[3]) {
				DecimalFormat df = new DecimalFormat("#.###");
				resultado=cantidad/0.12;
				String numero=df.format(resultado);
				JOptionPane.showMessageDialog(null,"Tienes "+numero+" ¥Yenes japoneses");
				
			}else if(seleccion==opciones[4]) {
				DecimalFormat df = new DecimalFormat("#.###");
				resultado=cantidad/0.013;
				String numero=df.format(resultado);
				JOptionPane.showMessageDialog(null,"Tienes "+numero+" ₩Wones surcoreanos");
			}else if(seleccion==opciones[5]) {
				DecimalFormat df = new DecimalFormat("#.###");
				resultado=17.11/cantidad;
				String numero=df.format(resultado);
				JOptionPane.showMessageDialog(null,"Tienes "+numero+" $Pesos mexicanos");
			}else if(seleccion==opciones[6]) {
				DecimalFormat df = new DecimalFormat("#.###");
				resultado=18.60/cantidad;
				String numero=df.format(resultado);
				JOptionPane.showMessageDialog(null,"Tienes "+numero+" $Pesos mexicanos");
			}else if(seleccion==opciones[7]) {
				DecimalFormat df = new DecimalFormat("#.###");
				resultado=21.61/cantidad;
				String numero=df.format(resultado);
				JOptionPane.showMessageDialog(null,"Tienes "+numero+" $Pesos mexicanos");
			}else if(seleccion==opciones[8]) {
				DecimalFormat df = new DecimalFormat("#.###");
				resultado=0.12/cantidad;
				String numero=df.format(resultado);
				JOptionPane.showMessageDialog(null,"Tienes "+numero+" $Pesos mexicanos");
			}else if(seleccion==opciones[9]) {
				DecimalFormat df = new DecimalFormat("#.###");
				resultado=0.013/cantidad;
				String numero=df.format(resultado);
				JOptionPane.showMessageDialog(null,"Tienes "+numero+" $Pesos mexicanos");
			}
			
			int opcion=JOptionPane.showConfirmDialog(null, "Desea continuar?","Cancelar",
					JOptionPane.YES_NO_OPTION);
			
			if(opcion==JOptionPane.YES_OPTION) {
				System.out.println("El usuario seleccionó 'Sí'");
				
				repetir=true;
				
			}else if(opcion==JOptionPane.NO_OPTION) {
				System.out.println("El usuario seleccionó 'No'");
				repetir=false;
			}else if(opcion==JOptionPane.CANCEL_OPTION){
				System.out.println("El usuario cerró el diálogo sin seleccionar una opción");
				repetir=false;
			}else {
                System.out.println("El usuario seleccionó 'Salir'");
                repetir = false; 
            }
			
		}while(repetir);
		
					
	}

}
