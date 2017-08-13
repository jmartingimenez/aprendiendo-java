/*Una persona, que tiene un nombre y una alarma.
 * Aca se ve que en el método 'getAlarma()', la información de la alarma no la 
 * da la persona, si no la alarma en si*/
package ejDelegacionComposicion;

public class Persona {
	private String nombre;
	private Alarma miAlarma;							//Composición
	
	public Persona(String nombre,Alarma miAlarma){
		this.nombre = nombre;
		this.miAlarma = miAlarma;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getAlarma(){							//Delegación
		return "Marca: " + miAlarma.getMarca() + "\nSonido: " + miAlarma.getSonido();
	}	
}