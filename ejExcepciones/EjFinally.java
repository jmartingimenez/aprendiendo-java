/*Ejemplo de uso de la clausula 'finally' que se ejecuta siempre. Lanze o no 
 * una excepci�n el try-catch*/
package ejExcepciones;

import java.util.Scanner;

public class EjFinally {

	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		int n;
		
		System.out.print("Ingresa un n�mero:");
		try{
			n = Entrada.nextInt();
			System.out.println("N�mero: " + n);
		}catch(Exception e){
			System.out.println("Ocurri� un error");
		}finally{
			System.out.println("Se cerro la conexi�n a la consola");
			Entrada.close();
		}
	}
}
