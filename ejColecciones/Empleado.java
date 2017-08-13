//Clase usada para el ejemplo de Map
package ejColecciones;

public class Empleado {
	private String nombre;
	private double sueldo;
	
	public Empleado(String nombre){
		this.nombre = nombre;
		this.sueldo = 2000.00;
	}
	
	@Override	//el toString() es de la clase Object
	public String toString(){
		return "[*Nombre: " + nombre + ", Sueldo: " + sueldo + "*]";
	}

	public String getNombre() {
		return nombre;
	}

	public double getSueldo() {
		return sueldo;
	}	
}
