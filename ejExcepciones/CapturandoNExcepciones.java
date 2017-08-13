/*Ejemplo para capturar varias excepciones
 *  - Si se ingresa letra en el menú
 *  - Si se intenta asignar a una variable entera la división '3/0'
 *  - Si se intenta parsear a int un string con caracteres no numericos*/
package ejExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CapturandoNExcepciones{
	public static void menu(){
		String datoNumerico = "2578";
		String datoNoNumerico = "abcd";
		int conversion,opcion;
		Scanner Entrada = new Scanner(System.in);
		
		System.out.print("Selecciona la opción:\n"
				+ "1 - Convertir '2578'		\n"
				+ "2 - Elegir 3/0			\n"
				+ "3 - Convertir 'abcd'		\n"
				+ "Seleccion: ");
		opcion = Entrada.nextInt();
		
		if(opcion==1)				conversion = Integer.parseInt(datoNumerico);
		else if(opcion==2)			conversion = 3/0;
			else 					conversion = Integer.parseInt(datoNoNumerico);
		
		System.out.println("Número: " + conversion);
		
		Entrada.close();		
	}
	
	public static void main(String[] args){
		try{
			menu();
		}catch(InputMismatchException e){
			System.out.println("Solo se pueden usar números en el menú");
		}catch(NumberFormatException e){
			System.out.println("El dato seleccionado no es un número");
		}catch(ArithmeticException e){
			System.out.println("DIVIDOR POR CERO?, SOS PELOTUDO?");
		}
	}
}
