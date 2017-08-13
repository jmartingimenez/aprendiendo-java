/*Main que llama a un método estatico. También se ve polimorfismo.
 * Se usa el Arrays.Sort() para ordenar los objetos. Para usar esto, la
 * clase 'Comparable' debe estar implementada. (Hecho en la clase 
 * 'EmpleadoStatic')*/
package poo;
import java.util.Arrays;
import java.util.Scanner;

public class usoEmpleadoStatic {
	public static void main(String[] args) {
		//Objeto de tipo Supervisor, al ser el primer objeto, obtiene la ID 1
		Supervisor miSupervisor = new Supervisor("Raul");
		
		//Array de Empleados
		EmpleadoStatic[] listaEmpleados = new EmpleadoStatic[7];
		Scanner Entrada = new Scanner(System.in);
		
		//Pedido de Empleados
		for(int i=0;i<5;i++){	//for(int i=0;i<listaEmpleados.length;i++){	
			System.out.print("Ingrese nombre: ");
			listaEmpleados[i] = new EmpleadoStatic(Entrada.nextLine());
		}
		
		/*POLIMORFISMO: El programa espera un objeto de la clase padre (Empleado).
		 * Pero yo estoy asignando objetos de la clase hija (Supervisor)*/
		listaEmpleados[5] = miSupervisor;
		listaEmpleados[6] = new Supervisor("Fabio");	//última ID
				
		/*Uso de Arrays.sort() para ordenar los empleados por id, ya que por 
		 * ejemplo, la primer posición del array tiene al empleado de id 2.
		 * Require la interfaz Comparable, agregada en EmpleadoStatic*/
		Arrays.sort(listaEmpleados);
		
		/*Recorrida, si en la clase hija se sobreescribe un método, al momento de
		 * pasar por ese objeto, se llama al método de la clase hija. Comportamiento 
		 * según el contexto (Polimorfismo)*/
		for(EmpleadoStatic e:listaEmpleados)
			System.out.println("id: " + e.getId() + "\t nombre: " + e.getNombre());
		
		System.out.println("Proximo ID a asignar: " + EmpleadoStatic.getIdDisponible());
		
		/*Ejemplo para demostrar el acceso a un método de la interfaz JefesI
		 * implementado por la clase Supervisor*/
		Supervisor s = new Supervisor("Macri");
		System.out.println(s.tomarDecisiones("Un nuevo tarifazo. Vamos juntos!"));
		
			Entrada.close();
	}
}
