//Uso de Math.Random
import java.util.Scanner;

public class E10_AdivinarNumero {
	public static void main(String[] args) {
		/*Math.Random devuelve entre 0 y 1, la idea es multiplicar para 
		 * que sea entre 0 y 100. Después se castea a byte para comparar 
		 * con lo que se ingrese */
		byte numeroOculto = (byte)(Math.random() * 100);
		
		Scanner Entrada = new Scanner(System.in);
		byte numeroIngresado;
		int intentos=0;
		
		do{
			intentos++;
			System.out.print("Ingrese un numero, el oculto esta entre 0 y 100: ");
			numeroIngresado=Entrada.nextByte();
			
			if(numeroOculto==numeroIngresado) break;
			
			if(numeroIngresado < numeroOculto)
				System.out.println("Error!!: Es un poco mas grande");
			else System.out.println("Error!!: Es un poco mas chico");
		
		}while(numeroIngresado != numeroOculto);
		System.out.println("Felicidades!!, te tomo " + intentos + " intento/s");
		Entrada.close();
	}
}
		