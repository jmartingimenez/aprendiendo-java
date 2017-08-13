//Main para la clase Empleado
package poo;

public class UsoEmpleado {
	public static void main(String[] args) {
		Empleado Secretaria = new Empleado("Maria",20000,	2000,9,23);
		Empleado Informatico = new Empleado("Jorge",10000,	1993,11,5);
		
		System.out.println("Secretaria: " + Secretaria.getNombre() + 		"\n"
							+"Sueldo: "	  +	Secretaria.getSueldo() + 		"\n"
							+"Alta: "	  + Secretaria.getFechaAlta() + 	"\n"
							+"Actual: "	  + Secretaria.getFechaActual());
		
		System.out.println("Informatico: " + Informatico.getNombre() + 		"\n"
				+"Sueldo: "	  +	Informatico.getSueldo() + 					"\n"
				+"Alta: "	  + Informatico.getFechaAlta() + 				"\n"
				+"Actual: "	  + Informatico.getFechaActual());		

		Informatico.subirSueldo(15.00);
		
		System.out.println("Nuevo sueldo del informatico: " + Informatico.getSueldo());
	}
}
