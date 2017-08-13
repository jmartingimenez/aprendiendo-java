//Programa que detecta si una palabra tiene o no arroba
import java.util.Scanner;

public class E11_EncontrarArroba {
	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		String miPalabra;
		boolean tieneArroba = false;
		
		System.out.print("Ingrese un E-mail: ");
		miPalabra = Entrada.nextLine();
		
		for(int letra=0;letra<miPalabra.length() && tieneArroba==false;letra++)
			if(miPalabra.charAt(letra) == '@') tieneArroba = true;		
		
		if(tieneArroba) System.out.println("Se encontro el arroba");
		else System.out.println("No se encontro el arroba");
		
		
		Entrada.close();
	}
}
