/*Viendo los m�todos b�sicos. Usando un LinkedList y un ListIterator*/
package ejColecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class EjLinkedList {
	public static void main(String[] args) {
		//Declaraci�n
		LinkedList<String> personas = new LinkedList<String>();
		
		//Agregando..
		personas.add("pepe");
		personas.add("juan");
		personas.add("marco");
		personas.add("polo");
		personas.add("hola");
		personas.addFirst("tambienExiste .addLast");
		personas.add(3,"pos3");		//Dandole el �ndice, decido donde se agrege.	
									//Luego estara corrido un �ndice mas

		//Mostrando el tama�o
		System.out.println("Cantidad: " + personas.size());
		
		/*Usando un iterador para agregar un nombre en una posici�n especifica 
		 * sin necesitar un n�mero de �ndice exacto*/		
		ListIterator<String> it = personas.listIterator();
		it.next();
		it.add("soyElSegundo");		//Esto desplaza a 'pos3'. Por eso sale en la 4ta
		
		//Mostrando los nombres
		for (String p:personas)	System.out.println("Nombre: " + p);
	}
}
