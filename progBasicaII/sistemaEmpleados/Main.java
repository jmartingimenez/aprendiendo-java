/*NOTA: Si se agregan nuevos tipos de empleados, debe agregarse en la nueva 
 * clase una constante static de tipo doble con el tope y sobreescribir el 
 * método 'getTope()' para retornar ese valor. También debe agregarse el 
 * método correspondiente en el la clase 'ServicioImpuesto'. 
 * (Cuando tenga mas practica y se me ocurra otra forma mas sencilla de 
 * encararlo lo arreglare...)
 * 
 * CONSIGNA:
 * Se solicita realizar un Sistema de empleados que registre el nombre, el salario 
 * y fecha de cumpleaños y, además, el comportamiento brindarDetalles que devuelve 
 * los detalles del empleado. El organigrama de la empresa, determina que está 
 * organizada en diferentes departamentos, siendo que cada departamento está 
 * administrado por un gerente, quienes a su vez tienen una cochera asignada. 
 * El director de la empresa, además de tener su cochera, tiene recibe un extra a 
 * su salario para los gastos del vehículo. Existen otros dos tipos de empleados, 
 * ingeniero y secretaria. Además, se debe modelar una clase de aplicación que 
 * reciba un empleado y lo compare con cierto tope de salarios para determinar 
 * los impuestos correspondientes a ese empleado (nada se expresa sobre las 
 * escalas, se brinda libertad de elección).*/

package progBasicaII.sistemaEmpleados;

public class Main {	
	public static void main(String[] args) {		
		//Empleados
		Secretaria secretaria	=	new Secretaria("Julia",20000,1991,11,28);
		Ingeniero ingeniero 	=	new Ingeniero("Jorge",30000,1981,5,3);
		Gerente gerente 		=	new Gerente("Lucas",50000,1977,5,13,14);
		Director director 		=	new Director("Gonzalo",70000,1969,1,26,1);
		
		/*Detalles de los empleados, también del Director que gana un 10% mas
		 * (No sobreescribi el 'brindarDetalles(), por lo que no saldra que el 
		 * número de cochera del Gerente y que el Director gana mas')*/
		System.out.println("Secretaria: " + secretaria.brindarDetalles());
		System.out.println("Ingeniero: " + ingeniero.brindarDetalles());
		System.out.println("Gerente: " + gerente.brindarDetalles());
		System.out.println("Director: " + director.brindarDetalles());
		
		//Departamento
		Departamento departamento = new Departamento("Finanzas",gerente);
		System.out.println("Departamento: " + departamento.getNombre() + 
						", Gerente: "+ departamento.getGerente().getNombre());		
		
		ServicioImpuesto impSvc = new ServicioImpuesto();
		System.out.println("Impuestos para esta secretaria: " + 
							impSvc.obtenerImpuesto(secretaria));
		System.out.println("Impuestos para este ingeniero: " + 
							impSvc.obtenerImpuesto(ingeniero));
		System.out.println("Impuestos para este gerente: " + 
							impSvc.obtenerImpuesto(gerente));
		System.out.println("Impuestos para este director: " + 
							impSvc.obtenerImpuesto(director));
	}
}
