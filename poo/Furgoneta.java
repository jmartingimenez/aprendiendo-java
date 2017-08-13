//Ejemplo simple de Herencia
package poo;

public class Furgoneta extends Coche{
	private int capacidadExtra;
	private int plazasExtra;
	
	public Furgoneta(int capacidadExtra,int plazasExtra){
		super();	//Llama al constructor de la clase padre
		this.capacidadExtra = capacidadExtra;
		this.plazasExtra = plazasExtra;
	}
	
	//Getters y Setters
	public int getCapacidadExtra() {
		return capacidadExtra;
	}

	public void setCapacidadExtra(int capacidadExtra) {
		this.capacidadExtra = capacidadExtra;
	}

	public int getPlazasExtra() {
		return plazasExtra;
	}

	public void setPlazasExtra(int plazasExtra) {
		this.plazasExtra = plazasExtra;
	}
}
