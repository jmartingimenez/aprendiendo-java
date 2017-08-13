/*Clase para ejemplificar bien lo del polimorfismo y casting de objetos*/

package poo;

public class PolimorfismoEj {

	public static void main(String[] args) {
		//Declaracion de un array de objetos de tipo ClasePadre
		ClasePadre[] miArray = new ClasePadre[6];
		
		/*Polimorfismo: Llenando manualmente el array de tipo 'ClasePadre', en 
		 * la anteúltima posición le estoy asignando un objeto de tipo 'ClaseHija'. 
		 * El programa espera un objeto de la SuperClase y le estoy dando uno 
		 * de la SubClase.*/
		miArray[0] = new ClasePadre("Boca");
		miArray[1] = new ClasePadre("Xeneize");
		miArray[2] = new ClasePadre("El mejor");
		miArray[3] = new ClaseHija("Riber",2011);
		miArray[4] = new ClasePadre("Boca > Riber");
		
		
		/*Casting de objetos, poder modificar un elemento de tipo 'ClaseHija' 
		 * del array de tipo 'ClasePadre' y acceder a métodos especificos de 
		 * 'ClaseHija'. Haciendo esto se modifica el elemento de posición 5. 
		 * Ahora en vez de 51, saldra 4193*/		
		miArray[5] = new ClaseHija("X",51);
		ClaseHija variable = (ClaseHija)miArray[5];
		variable.setAtributoRandom(4193);
		miArray[5] = variable;
		
		/*Mostrando los datos, notese que el objeto del for es de tipo 'ClasePadre'.
		 * Al iterar sobre la posición 3 o la 5, La maquina virtual de Java 
		 * reconoce que es un elemento de la clase hija y llama al método de 
		 * esta (que esta sobreescrito)	*/
		for(ClasePadre e:miArray)	System.out.println(e.getMsj());		
	}
}
