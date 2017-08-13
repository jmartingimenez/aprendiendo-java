/*Ejemplo para usar un HashSet para agregar y leer elementos de una colección.
 * Al estar sobreescrito el equals/hashcode, no agrega el quinto elemento
 * - Se ve manejo de iteradores recorriendo, reasignando y modificando*/
package ejColecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CuentasUsuariosMain {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Pepe","38125",500.21);
		Cliente c2 = new Cliente("Jose","01276",0.67);
		Cliente c3 = new Cliente("Juan","15661",24000.51);
		Cliente c4 = new Cliente("Luca","00833",183000.00);
		Cliente c5 = new Cliente("Pepe","38125",500.21);
		
		//Sintaxis para crear la colección
		Set<Cliente> clientesBancos = new HashSet<Cliente>();
		
		//Agregando clientes
		clientesBancos.add(c1);
		clientesBancos.add(c2);
		clientesBancos.add(c3);
		clientesBancos.add(c4);
		clientesBancos.add(c5);
		
		//Mostrando los elementos de la colección
		for (Cliente c : clientesBancos) {
			System.out.println(	"Nombre: " 	+ c.getNombre() 		+ ", " +
								"Cuenta: " 	+ c.getNumeroCuenta() 	+ ", " +
								"Saldo: "	+ c.getSaldo());
		}
		
		//Usando un iterador
		Iterator<Cliente> it = clientesBancos.iterator();
		
		//Eliminando un elemento en base al nombre
		String n;
		while(it.hasNext()){
			n = it.next().getNombre();
			if(n.equals("Luca")) 	it.remove();
		}

		/*Volviendo a la primera posición. Medio raro usarlo aca, pero para saberlo.
		 * De stackoverflow: 'Once you read a stream, you can't re-read it without
		 *  opening the source again. That's how streams and iterators work.'*/
		it = clientesBancos.iterator();
		
		//Mostrando todos los nombres (Con el foreach es mas fácil mostrar todo)
		while(it.hasNext())			System.out.println(it.next().getNombre());	
	}
}
