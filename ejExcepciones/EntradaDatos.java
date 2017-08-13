/*EJEMPLO: Excepción en el método 'pedirDatos()
 * Hacer una excepción para esto (habiendo otras alternativas)no es 
 * buena practica, pero es para ejemplificar
 * Si todo sale bien, se ejecuta todo el método, de lo contrario, 
 * lanza la excepción. Si no se agrega el try-catch, sigue generando 
 * el error aunque se usara el 'throws...'*'
 * 
 * NOTA: Si bien poner 'Exception' en el catch para generalizar, es 
 * recomendable poner el nombre de la clase exacta. Quizas con varios 
 * errores sea mas complejo determinar de donde vino
* */
package ejExcepciones;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDatos {
	
	//Con el throws lanzamos la excepción y con el bloque catch la capturamos
	public static void pedirDatos(){
		String nombre;
		int edad;
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre y luego tu edad:");
		nombre = Entrada.nextLine();
		edad = Entrada.nextInt();
			
		System.out.println("Nombre: " + nombre + ", Edad: " + edad);
		
		Entrada.close();
	}
	
	//No puse validación en el menú. Para probar, meter un String en la edad
	public static void main(String[] args) {
		System.out.println("Selecciona una opción:");
		System.out.println("1 - Ingresar datos");
		System.out.println("2 - Salir del programa");
		
		Scanner Entrada = new Scanner(System.in);
		
		if(Entrada.nextInt()==1){
			try{
				pedirDatos();
			}catch(InputMismatchException e){
				System.out.println("Datos no permitidos");
				//e.printStackTrace();	//Saca todo el mensaje en rojo
			}			
		}
		
		System.out.println("Adios!");
		
		Entrada.close();
	}
}
