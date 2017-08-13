package progBasicaII.clubNoHomeros;

public class Cliente implements Comparable<Cliente>{
	private String nombre;
	private int edad;
	
	public Cliente(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}

	/*Si sobreescribo equals(), necesito sobreescribir hashCode()*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	/*Sobreescribo equals() para determinar que los objetos van a ser iguales si el 
	 * nombre es el mismo*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	//Implementación de la interfaz. Alfabeticamente los nombres
	@Override
	public int compareTo(Cliente c) {
		return this.getNombre().compareTo(c.getNombre());
	}	
}
