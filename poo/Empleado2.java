//Reversión de EmpleadoStatic para ejemplificar clases abstractas (Persona)
package poo;

public class Empleado2 extends Persona{
	private final int id;
	private static int idDisponible=1;
	
	Empleado2(String nombre){
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
	
	public String getDescripcion(){
		return "Empleado de id: " + id +". Ejemplo de Herencia y clase abstracta.";
	}
}
