package progBasicaII.clubNoHomeros;

import java.util.Set;
import java.util.TreeSet;

public class Bar {
	private boolean abierto = false;
	private Set<Cliente> listaClientes = new TreeSet<Cliente>();
	
	public void abrir(){
		if(!abierto) abierto = true;
		else System.out.println("El bar ya esta abierto.");
	}
	
	public void cerrar(){
		if(abierto) abierto = false;
		else System.out.println("El bar ya esta cerrado.");
	}
	
	public void getEstadoBar(){
		if(abierto)	System.out.println("Estado del bar: Abierto");
		else System.out.println("Estado del bar: Cerrado");
	}
	
	public void agregarCliente(Cliente nuevoCliente){
		if(abierto)		listaClientes.add(nuevoCliente);
		else System.out.println("Bar esta cerrado. No pueden entrar nuevos clientes");
	}
	
	public void mostrarClientes(){
		if(!abierto)
			System.out.println("Bar cerrado. No se pueden presentar los clientes por orden alfabetico");
		else{		
			System.out.println("Lista de clientes ordenados alfabeticamente:");
			for (Cliente c : listaClientes) {
				System.out.println("Nombre: " + c.getNombre() + ", Edad: " + c.getEdad());
			}	
		}
	}	
	
	public void mostrarClientesPorEdad(){
		if(!abierto)
			System.out.println("Bar cerrado. No se pueden presentar los clientes por edad");
		else{
			Set<Cliente> listaClientesPorEdad = new TreeSet<Cliente>(new CompararClientesPorEdad());
			listaClientesPorEdad.addAll(listaClientes);
			System.out.println("Lista de clientes ordenados por edad:");
			for (Cliente c : listaClientesPorEdad) {
				System.out.println("Nombre: " + c.getNombre() + ", Edad: " + c.getEdad());
			}			
		}
	}
	
	public String comprobarSiPersonaPuedeEntrar(Cliente o){
		if(!abierto) return "El bar esta cerrado. No podes entrar " + o.getNombre();
		for (Cliente c : listaClientes) {
			if(c.getNombre().equals(o.getNombre()))
				return "Ya existe un cliente con el nombre de " + o.getNombre();	
		}		
		return "Podes entrar " + o.getNombre() + ", ningún cliente tiene tu nombre";		
	}	
}
