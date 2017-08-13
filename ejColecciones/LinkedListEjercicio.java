/*Ejercicio:
 * 1 - 	Crear una LinkedList con 4 pa�ses
 * 2 - 	Crear otra LinkedList con 4 capitales (correspondientes a los 4 pa�ses)
 * 3 - 	Agregar a la LinkedList de pa�ses las 4 capitales (quedando pais-capital, 
 * 		pais-capital,pais-capital,pais-capital)
 * 4 - 	Eliminar de la LinkedList de capitales los elementos que se encuentran en 
 * 		posici�n impar. Ver como influye esto en la LinkedList de capitales y como 
 * 		lo hace en la de pa�ses (desp�es de haber agregado las capitales). */

package ejColecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEjercicio {
	public static void main(String[] args) {
		//Declaraci�n de las listas
		LinkedList<String> pais 	= 	new LinkedList<String>();
		LinkedList<String> capital 	= 	new LinkedList<String>();
		
		//Agregando los paises y capitales
		pais.add("Argentina");
		pais.add("Francia");
		pais.add("Peru");
		pais.add("Nigeria");		
		capital.add("Buenos Aires");
		capital.add("Paris");
		capital.add("Lima");
		capital.add("Lagos");
		
		//Creando los iteradores
		ListIterator<String> pIt = pais.listIterator();
		ListIterator<String> cIt = capital.listIterator();
		
		//Agregando las capitales a los paises
		String temp;							//Guardo la capital leida
		while(pIt.hasNext() && cIt.hasNext()){
			pIt.next();							//Salteo 1 lugar (cap luego de pais)
			temp = cIt.next();					//Guardo la capital
			pIt.add(temp);						//La inserto en despues del pais
		}

		//Viendo las listas
		getLista(pais,"---- LinkedList 'paises y capitales juntas' ----");
		getLista(capital,"---- LinkedList 'capitales' ----");
		
		/*Eliminando de la LinkedList elementos de posici�n impar
		 * EXPLICACI�N: Al principio estoy desp�es de la �ltima posici�n por la 
		 * recorrida anterior. El while es b�sicamente para recorrer hacia atras.
		 * Al entrar al while, primero me muevo una posici�n hacia atras por lo 
		 * que quedar�a entre la posici�n 2 y la posici�n 3. Entonces pregunto 
		 * si el �ndice de la posici�n siguiente (3) es impar, si se cumple lo 
		 * remuevo.*/		
		while(cIt.hasPrevious()){			
			cIt.previous();
			if(cIt.nextIndex()%2==1)	cIt.remove();		
		}
		
		//Viendo la LinkedList de capitales desp�es de eliminar elementos
		getLista(capital,"---- LinkedList 'capitales' sin posiciones impares----");
		
		/*Mostrando la lista de paises y capitales excluyendo a las capitales 
		 * que estan en la lista de capitales*/
		pais.removeAll(capital);		//Quita una colecci�n de otra
		getLista(pais,"---- LinkedList 'paises y capitales juntas (menos las 2 de arriba)' ----");
	}
	
	public static void getLista(LinkedList<String> lista,String msj){
		System.out.println(msj + "\n" + lista);
	}
}
