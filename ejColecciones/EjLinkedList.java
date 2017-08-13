/*Viendo los métodos básicos. Usando un LinkedList y un ListIterator*/
package ejColecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class EjLinkedList {
	public static void main(String[] args) {
		//Declaración
		LinkedList<String> personas = new LinkedList<String>();
		
		//Agregando..
		personas.add("pepe");
		personas.add("juan");
		personas.add("marco");
		personas.add("polo");
		personas.add("hola");
		personas.addFirst("tambienExiste .addLast");
		personas.add(3,"pos3");		//Dandole el índice, decido donde se agrege.	
									//Luego estara corrido un índice mas

		//Mostrando el tamaño
		System.out.println("Cantidad: " + personas.size());
		
		/*Usando un iterador para agregar un nombre en una posición especifica 
		 * sin necesitar un número de índice exacto*/		
		ListIterator<String> it = personas.listIterator();
		it.next();
		it.add("soyElSegundo");		//Esto desplaza a 'pos3'. Por eso sale en la 4ta
		
		//Mostrando los nombres
		for (String p:personas)	System.out.println("Nombre: " + p);
	}
}
