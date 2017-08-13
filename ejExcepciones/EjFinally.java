/*Ejemplo de uso de la clausula 'finally' que se ejecuta siempre. Lanze o no 
 * una excepción el try-catch*/
package ejExcepciones;

import java.util.Scanner;

public class EjFinally {

	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		int n;
		
		System.out.print("Ingresa un número:");
		try{
			n = Entrada.nextInt();
			System.out.println("Número: " + n);
		}catch(Exception e){
			System.out.println("Ocurrió un error");
		}finally{
			System.out.println("Se cerro la conexión a la consola");
			Entrada.close();
		}
	}
}
