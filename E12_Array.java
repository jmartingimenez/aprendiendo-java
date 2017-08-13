//Diferentes declaraciones para un array y sus inicializaciones

import java.util.Scanner;

public class E12_Array {
	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		
		//Array ya definido
		byte[] arrayInicializado = {1,2,3,4};
		
		//Array al que se le pediran datos
		int[] arrayALlenar = new int[5]; 
		
		//Mostrando los valores del array ya inicializado
		for(int i=0;i<arrayInicializado.length;i++)
			System.out.println("Matriz inicializada en pos " + i + ": " + arrayInicializado[i]);
		
		//Pidiendo 4 de las 5 posiciones. La última se llenara con un -30
		for(int i=0;i<arrayALlenar.length - 1;i++){
			System.out.printf("Ingrese un numero: ");
			arrayALlenar[i]=Entrada.nextInt();
		}
		
		//Seteando el valor que falta
		arrayALlenar[4] = -30;
		
		//Mostrando los valores
		System.out.println("Numeros ingresados: ");
		for(int i=0;i<arrayALlenar.length;i++)
			System.out.print(arrayALlenar[i] + ". ");
		
		Entrada.close();
	}
}
