//Crando una persona que tiene una alarma. Ejemplo de Delegaci�n/Composici�n
package ejDelegacionComposicion;

public class Main {

	public static void main(String[] args) {
		//Existe una alarma
		Alarma a = new Alarma("Patito","ruiiiing");
		
		//Existe una persona que tiene la alarma
		Persona p = new Persona("Pepe",a);
		
		/*La persona te da informaci�n sobre su alarma. Pero esa informaci�n 
		 * que te da, es la que le dio su alarma*/
		System.out.println("Alarma de " + p.getNombre() + "\n" + p.getAlarma());
	}
}
