/*Este programa convierte centimetros a pulgadas.
 * Ejemplo de uso de una constante (final)*/
public class E04_Constante {
	public static void main(String[] args) {
		final double aPulgada=2.54;
		
		double cm=6;
		double resultado=cm/aPulgada;
		
		System.out.println("En " + cm + "cm hay " + resultado + " pulgadas.");
	}
}
