/*Ejemplo de un HashMap. Se agrega, elimina y recorre*/
package ejColecciones;

import java.util.HashMap;
import java.util.Map;

public class EjMapa {
	public static void main(String[] args) {
		//Declaración
		Map<String,Empleado> personal = new HashMap<String,Empleado>();
		
		//Añadiendo
		personal.put("0009",new Empleado("Rabiot"));
		personal.put("0203",new Empleado("Neymar"));
		personal.put("0015",new Empleado("Alves"));
		personal.put("a",new Empleado("Trap"));
		
		personal.remove("a");						//Elimina basado en la clave
		personal.put("0009",new Empleado("Pastore"));//Reemplaza al de la misma clave
		
		//Mostrando la colección
		System.out.println(personal + "\n");
		
		/*Eliminando a Pastore...
		 *  - El personal.entrySet() devuelve la colección en forma de set<Map.Entry>
		 *  - Por cada entrada/registro de <clave,valor>, voy preguntando 
		 *    si el método 'getNombre()' correspondiente al valor actual del 
		 *    registro analizado es igual a 'Pastore'. Si esto se cumple, 
		 *    procedo a eliminar de la colección el registro que tiene la 
		 *    clave analizada actual*/
		for(Map.Entry<String,Empleado> registro: personal.entrySet())
			if(registro.getValue().getNombre().equals("Pastore"))
				personal.remove(registro.getKey());		
	
		//Mostrando ahora como quedo
		for(Map.Entry<String,Empleado> registro : personal.entrySet())
			System.out.println(	"Clave = " + registro.getKey() + 
								", Nombre = " + registro.getValue().getNombre() +
								", Sueldo = " + registro.getValue().getSueldo());
	}
}