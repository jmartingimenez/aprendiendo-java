/*NOTA: 
 * 1 - 	Pongo las clases como 'static' para evitar necesitar instanciar la clase
 * 2 - 	El Scanner aparentemente espera el decimal según algún tipo de 
 * 		configuración local. Si al poner algo como '2.3' arroja una	excepción, 
 * 		es debido a que espera una coma en lugar de un punto ('2,3')	
 * */

import java.util.Scanner;

public class E09_SwitchAreas {
	
	public static final void calculoCuadrado(){
		Scanner Entrada = new Scanner(System.in);
		System.out.printf("Ingrese la cantidad de centimetros de un lado: ");		
		double lado = Entrada.nextDouble();
		System.out.printf("El cuadrado tiene %.2f cm^2/s",Math.pow(lado,2.0));
		Entrada.close();
	}
	
	public static final void calculoRectangulo(){
		Scanner Entrada = new Scanner(System.in);
		System.out.printf("Ingrese la cantidad de centimetros de la base: ");		
		double b = Entrada.nextDouble();
		System.out.printf("Ingrese la cantidad de centimetros de la altura: ");
		double h = Entrada.nextDouble();
		System.out.printf("El rectangulo tiene %.2f cm^2/s",(b*h));
		Entrada.close();		
	}
	
	public static final void calculoTriangulo(){
		Scanner Entrada = new Scanner(System.in);
		System.out.printf("Ingrese la cantidad de centimetros de la base: ");		
		double b = Entrada.nextDouble();
		System.out.printf("Ingrese la cantidad de centimetros de la altura: ");
		double h = Entrada.nextDouble();
		System.out.printf("El triangulo tiene %.2f cm^2/s",((b*h)/2));
		Entrada.close();		
	}
	
	public static final void calculoCirculo(){
		Scanner Entrada = new Scanner(System.in);
		System.out.printf("Ingrese el radio: ");
		double radio=Entrada.nextDouble();
		double area=Math.PI * (Math.pow(radio,2));
		System.out.printf("El circulo tiene %.2f cm^2/s",area);
		Entrada.close();
	}
	
	public static void main(String[] args) {
		//Menú con opciones
		System.out.printf(		"1 - Area de un cuadrado	\n"
							+ 	"2 - Area de un rectangulo	\n"
							+	"3 - Area de un triangulo	\n"
							+	"4 - Area de un circulo		\n"
							+ 	"Seleccion: ");
		
		//Objeto de tipo Scanner que tomara lo ingresado
		Scanner Entrada=new Scanner(System.in);
		
		//Seteo en opcion, como lo siguiente ingresado de tipo byte
		byte opcion=Entrada.nextByte();		
		
		switch(opcion){
			case 1:
				calculoCuadrado();
				break;
			case 2:
				calculoRectangulo();
				break;
			case 3:
				calculoTriangulo();
				break;
			case 4:
				calculoCirculo();
				break;
			default:
				System.out.println("No sabes leer pelotudo?");
		}
		
		Entrada.close();
	}
}
