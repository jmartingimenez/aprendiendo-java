//Ejemplo de herencia utilizando una clase abstracta
package poo;

public abstract class Persona {
	private String nombre;			//Puede tener atributos
	
	public Persona(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){		//Puede tener métodos no abstractos
		return nombre;
	};

	public abstract String getDescripcion();
	
	public static void main(String[] args) {
		/*Array de tipo 'Persona'. Gracias al polimorfismo se ejecuta el 
		 * constructor correspondiente de las clases que extienden a esta.
		 * Se ve tambíen esto en el for que trae la descripción según 
		 * el tipo de objeto. */
		Persona[] listaPersonas = new Persona[2];
		listaPersonas[0] = new Empleado2("Mateo");
		listaPersonas[1] = new Alumno("Dionisio","Ing. Informatica");
		
		for(Persona p:listaPersonas) System.out.println("Nombre: " + p.getNombre()
				+ "\nDescripcion: " + p.getDescripcion());
	}
}
