/*Esta clase implementa la interfaz Comparator y sobreescribe el método 
 * 'compare'. Es usada en 'Articulo.java' para ejemplificar como en dos o mas  
 * TreeSets que actuan sobre objetos de la misma clase, pueden tener distintos 
 * criterios de ordenamiento*/

package ejColecciones;

import java.util.Comparator;

public class ComparadorArticulos implements Comparator<Articulo>{

	@Override
	public int compare(Articulo o1, Articulo o2) {
		String primerArticulo = o1.getNombre();
		String segundoArticulo = o2.getNombre();
		
		return primerArticulo.compareTo(segundoArticulo);
	}	
}
