/*Métodos sqrt, pow, round de la clase Math y una Refundición o Casting*/

public class E05_ClaseMath {
	public static void main(String[] args) {
		double raizEjemplo=Math.sqrt(81);
		double potenciaEjemplo=Math.pow(2,5);
		
		//Al ser Double, siempre mostrara decimal: 9.0
		System.out.println("Raiz de 81 sin redondeo: " + raizEjemplo);
		
		//Con esto se redondea para que solo muestre 9
		System.out.println("Raiz de 81 Con redondeo: " + Math.round(raizEjemplo));
		
		//Prueba de elevación
		System.out.println("2^5: " + Math.round(potenciaEjemplo));
		
		/*Ejemplo de redefinir un tipo de dato(Refundicion):
		 * Math.round no devuelve un entero en este caso a
		 *  pesar de estar redondeando.
		 * */
		int numeroConvertidoAInt=(int)Math.round(5.49);
		System.out.println("Refundicion: " + numeroConvertidoAInt);
		
		//Ejemplo de printf para redondear. Notese que puse decimales (Da error sino)
		System.out.printf("Numero redondeado a dos decimales: %.2f",(1000.0/3.0));
	}
}
