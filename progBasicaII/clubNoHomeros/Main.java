/*CONSIGNA:
 * Modelar el “Club de los No Homeros“; se trata de un Bar muy particular donde
 *  no se admiten clientes con el mismo nombre. Ya que “Homero” tiene control 
 *  sobre los clientes que admite, su Bar debe permitir presentar a sus clientes 
 *  ordenados alfabéticamente. El Bar debe permitir abrirse sin clientes. 
 *  Los Clientes deben poder compararse entre ellos estando o no, dentro del Bar.
 *  (Esto último lo tome como que una persona pregunta si puede entrar) 
 *  Por último, mientras el Bar está abierto, “Homero” puede requerir que se
 *   presenten ordenados por edad.
 * */
package progBasicaII.clubNoHomeros;

public class Main {
	public static void espacio(){
		System.out.println("[===             ------                ===]");
	}
	
	public static void main(String[] args) {
		//Creamos el bar
		Bar ClubDeLosNoHomeros = new Bar();
		
		//Creamos dos clientes
		Cliente flanders = new Cliente("Flanders",60);
		Cliente jimbo = new Cliente("Jimbo",60);
		
		//Esta abierto o cerrado? (A esta altura esta cerrado, no pueden mostrarse)
		ClubDeLosNoHomeros.getEstadoBar();
		ClubDeLosNoHomeros.mostrarClientes();
		ClubDeLosNoHomeros.mostrarClientesPorEdad();
		
		espacio();
		
		//Flanders quiere entrar al bar
		ClubDeLosNoHomeros.agregarCliente(flanders);
		System.out.println(ClubDeLosNoHomeros.comprobarSiPersonaPuedeEntrar(flanders));
				
		espacio();
		
		//El bar se abre
		ClubDeLosNoHomeros.abrir();
		ClubDeLosNoHomeros.getEstadoBar();
		
		espacio();
		
		//Entran clientes
		ClubDeLosNoHomeros.agregarCliente(new Cliente("Homero",30));
		ClubDeLosNoHomeros.agregarCliente(new Cliente("Marge",28));
		ClubDeLosNoHomeros.agregarCliente(new Cliente("Bart",15));
		ClubDeLosNoHomeros.agregarCliente(new Cliente("Flanders",56));
		ClubDeLosNoHomeros.agregarCliente(new Cliente("Lisa",18));
		
		/*Flanders quiere entrar al bar (Algún imitador suyo le gano de mano)
		 * Jimbo si puede entrar*/
		System.out.println(ClubDeLosNoHomeros.comprobarSiPersonaPuedeEntrar(flanders));
		System.out.println(ClubDeLosNoHomeros.comprobarSiPersonaPuedeEntrar(jimbo));
		
		espacio();
		
		//Lista de clientes ordenados alfabeticamente
		ClubDeLosNoHomeros.mostrarClientes();
		
		espacio();
		
		//Lista de clientes ordenados por edad
		ClubDeLosNoHomeros.mostrarClientesPorEdad();
		
		espacio();
		
		//Se cierra el bar		
		ClubDeLosNoHomeros.cerrar();
		ClubDeLosNoHomeros.getEstadoBar();		
	}
}
