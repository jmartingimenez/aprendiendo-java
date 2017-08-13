//Main para la clase Coche

package poo;

public class UsoVehiculo {
	public static void main(String[] args) {
		Coche Renault = new Coche();
		Renault.saludo();
		System.out.println("Largo del coche: " + Renault.getLargo());
		Renault.setColor("Azul");
		System.out.println("Color: " + Renault.getColor());
		
		
		/*Ejemplo de Herencia, ver la clase Furgoneta
		 * Tecnicamente una Furgoneta no es un coche, la herencia estaría mal 
		 * planteada pero es a modo de ejemplo. Deberían heredar Coche y 
		 * Furgoneta de una clase Vehiculo.*/
		Furgoneta miFurgoneta = new Furgoneta(8,750);
		miFurgoneta.setColor("Violeta");
		System.out.println("Color de la furgoneta: " + miFurgoneta.getColor());
	}
}