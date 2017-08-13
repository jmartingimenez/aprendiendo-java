/*Ejemplo de uso de una variable y un método estatico.
 * Tambien se ve la implementación de la interfaz Comparable y la
 * sobreescritura del método 'compareTo(Object o)'*/
package poo;

public class EmpleadoStatic extends Persona implements Comparable<EmpleadoStatic>,TrabajadorI{
	private final int id;
	private static int idDisponible=1;
	
	EmpleadoStatic(String nombre){
		super(nombre);
		this.id = idDisponible;
		idDisponible++;
	}

	public int getId() {
		return id;
	}

	public static int getIdDisponible() {
		return idDisponible;
	}

	public String getDescripcion() {
		return "Clase Empleado que use para ejemplo de clases/métodos static";
	}	
	
	//Método compareTo de la interfaz Comparable implementado
	public int compareTo(EmpleadoStatic aux) {
		if(this.id > aux.id)		return 1;
		if(this.id < aux.id)		return -1;
		return 0;
	}

	//Implementación de un método de TrabajadorI
	public double setBonus(double bonus) {
		return TrabajadorI.bonusMinimo + bonus;
	}
}
