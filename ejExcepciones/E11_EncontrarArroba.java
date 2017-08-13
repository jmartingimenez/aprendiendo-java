/*NOTA: Este es el 'E11_EncontrarArroba' del paquete por defecto, lo copie para 
 * dejar las cosas juntas nomas. (No quería reeditar el original para dejarlo 
 * bien simple a ese)*/
package ejExcepciones;
import java.util.Scanner;

public class E11_EncontrarArroba{
	public static void busqueda(String miPalabra) throws LongitudPalabraErronea{
		if(miPalabra.length() <=3)
			throw new LongitudPalabraErronea("La palabra es muy corta");
		
		boolean tieneArroba = false;
		for(int letra=0;letra<miPalabra.length() && tieneArroba==false;letra++)
			if(miPalabra.charAt(letra) == '@') tieneArroba = true;		
		
		if(tieneArroba) System.out.println("Se encontro el arroba");
		else System.out.println("No se encontro el arroba");		
	}
	
	public static void main(String[] args){
		Scanner Entrada = new Scanner(System.in);
		String miPalabra;
				
		System.out.print("Ingrese una palabra que lleve '@': ");
		miPalabra = Entrada.nextLine();	
		
		Entrada.close();
		
		try {
			busqueda(miPalabra);
		} catch (LongitudPalabraErronea e) {
			System.out.println("Error!!: " + e.getMessage());
			//e.printStackTrace();
		}
		
		System.out.println("Adios!");
	}
}
