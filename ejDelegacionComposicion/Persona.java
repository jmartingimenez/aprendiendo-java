/*Una persona, que tiene un nombre y una alarma.
 * Aca se ve que en el m�todo 'getAlarma()', la informaci�n de la alarma no la 
 * da la persona, si no la alarma en si*/
package ejDelegacionComposicion;

public class Persona {
	private String nombre;
	private Alarma miAlarma;							//Composici�n
	
	public Persona(String nombre,Alarma miAlarma){
		this.nombre = nombre;
		this.miAlarma = miAlarma;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getAlarma(){							//Delegaci�n
		return "Marca: " + miAlarma.getMarca() + "\nSonido: " + miAlarma.getSonido();
	}	
}