package progBasicaII.clubNoHomeros;

import java.util.Comparator;

public class CompararClientesPorEdad implements Comparator<Cliente>{

	//Implementación para comparar por edad
	@Override
	public int compare(Cliente c1, Cliente c2) {
		return c1.getEdad() - c2.getEdad();
	}
}