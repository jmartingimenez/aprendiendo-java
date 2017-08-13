//Ejemplo de input

import java.util.Scanner;

public class E07_InputScanner {
	public static void main(String[] args) {
		//Objeto de tipo Scanner, como parametro: lo que se ingrese
		Scanner Entrada= new Scanner(System.in);
		
		//Variables para pruebas
		int a,b;
		String miNombre;
		
		//Los métodos next refieren a como tomara el scanner la proxima entrada
		System.out.print("Ingrese su nombre: ");
		miNombre=Entrada.nextLine();	//String
		
		System.out.println("Hola " + miNombre);
		System.out.println("Ingrese dos numeros: ");
		a=Entrada.nextInt();			//Int
		b=Entrada.nextInt();
		
		System.out.println(a + " + " + b + " = " + (a+b));
		
		//Se cierra el scanner
		Entrada.close();
	}
}
