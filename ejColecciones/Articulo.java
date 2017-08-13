/*Ejemplo de uso de TreeSet. Se ve el ordenamiento a través de la sobreescritura 
 * del método compareTo ya que la clase Articulo implementa la interfaz 
 * comparable. Tambien se crea un objeto de tipo ComparadorArticulos para 
 * mostrar otro criterio de ordenamiento.*/
package ejColecciones;

import java.util.Set;
import java.util.TreeSet;

public class Articulo implements Comparable<Articulo>{
	private String nombre;
	private double precio;
	
	public Articulo(String nombre,double precio){
		this.nombre = nombre;
		this.precio = precio;
	}
	
	@Override		//Método de la interfaz Comparable (Comparo de mayor a menor)
	public int compareTo(Articulo o) {		
		if(this.precio == o.precio)	return 0;
		if(this.precio > o.precio)	return -1;
		return 1;
	}	
	
	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public static void main(String[] args) {
		//Definición del TreeSet
		Set<Articulo> treeSet = new TreeSet<Articulo>();
		
		//Creo articulos y los agrego al treeSet
		Articulo a1 = new Articulo("Mesa",489.99);
		Articulo a2 = new Articulo("Escoba",15.75);
		Articulo a3 = new Articulo("Silla",125.80);
		Articulo a4 = new Articulo("Pantalon",600.00);		
		treeSet.add(a1);
		treeSet.add(a2);
		treeSet.add(a3);
		treeSet.add(a4);
		
		//Listado de articulos ordenados por precio (método compareTo sobreescrito)
		System.out.println("Orden por precio de mayor a menor");		
		for (Articulo a : treeSet)
			System.out.println("Articulo: " + a.getNombre() + ", Precio: " + a.getPrecio());
		
		/*Creación de otro TreeSet al que se le da por parametro al constructor 
		 * un objeto de tipo 'ComparadorArticulos' que a través de la sobreescritura 
		 * del método compare, hara la comparación por orden alfabetico*/
		ComparadorArticulos ordenAlfabetico = new ComparadorArticulos();		
		Set<Articulo> treeSet2 = new TreeSet<Articulo>(ordenAlfabetico);		
		treeSet2.addAll(treeSet);		//Pasando la colección anterior a esta
		
		//Mostrando el TreeSet ordenado alfabeticamente
		System.out.println("Orden alfabetico por nombre de articulo");		
		for (Articulo a : treeSet2)
			System.out.println("Articulo: " + a.getNombre() + ", Precio: " + a.getPrecio());
	}
}
