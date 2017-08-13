//Crando una persona que tiene una alarma. Ejemplo de Delegación/Composición
package ejDelegacionComposicion;

public class Main {

	public static void main(String[] args) {
		//Existe una alarma
		Alarma a = new Alarma("Patito","ruiiiing");
		
		//Existe una persona que tiene la alarma
		Persona p = new Persona("Pepe",a);
		
		/*La persona te da información sobre su alarma. Pero esa información 
		 * que te da, es la que le dio su alarma*/
		System.out.println("Alarma de " + p.getNombre() + "\n" + p.getAlarma());
	}
}
