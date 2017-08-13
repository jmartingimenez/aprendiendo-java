//Clase Alumno para probar un caso de Herencia con una clase abstracta.
package poo;

public class Alumno extends Persona{
	private String carrera;
	
	public Alumno(String nombre,String carrera){
		super(nombre);
		this.carrera = carrera;
	}
	
	public String getDescripcion(){
		return "Alumno, carrera: " + carrera + ". Ejemplo de Herencia y clase abstracta.";
	}
}
