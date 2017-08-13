/*Ejercicio:
 * 1 - 	Crear una LinkedList con 4 países
 * 2 - 	Crear otra LinkedList con 4 capitales (correspondientes a los 4 países)
 * 3 - 	Agregar a la LinkedList de países las 4 capitales (quedando pais-capital, 
 * 		pais-capital,pais-capital,pais-capital)
 * 4 - 	Eliminar de la LinkedList de capitales los elementos que se encuentran en 
 * 		posición impar. Ver como influye esto en la LinkedList de capitales y como 
 * 		lo hace en la de países (despúes de haber agregado las capitales). */

package ejColecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEjercicio {
	public static void main(String[] args) {
		//Declaración de las listas
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
		
		/*Eliminando de la LinkedList elementos de posición impar
		 * EXPLICACIÓN: Al principio estoy despúes de la última posición por la 
		 * recorrida anterior. El while es básicamente para recorrer hacia atras.
		 * Al entrar al while, primero me muevo una posición hacia atras por lo 
		 * que quedaría entre la posición 2 y la posición 3. Entonces pregunto 
		 * si el índice de la posición siguiente (3) es impar, si se cumple lo 
		 * remuevo.*/		
		while(cIt.hasPrevious()){			
			cIt.previous();
			if(cIt.nextIndex()%2==1)	cIt.remove();		
		}
		
		//Viendo la LinkedList de capitales despúes de eliminar elementos
		getLista(capital,"---- LinkedList 'capitales' sin posiciones impares----");
		
		/*Mostrando la lista de paises y capitales excluyendo a las capitales 
		 * que estan en la lista de capitales*/
		pais.removeAll(capital);		//Quita una colección de otra
		getLista(pais,"---- LinkedList 'paises y capitales juntas (menos las 2 de arriba)' ----");
	}
	
	public static void getLista(LinkedList<String> lista,String msj){
		System.out.println(msj + "\n" + lista);
	}
}
