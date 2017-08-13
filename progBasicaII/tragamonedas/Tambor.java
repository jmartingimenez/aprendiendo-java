package progBasicaII.tragamonedas;

public class Tambor {
	private int valor;
	
	/*El '+ 1' es para que el rango por ej sea [1,10] en vez de [0,9]
	 * Si se diera el valor de 10*/
	public Tambor(int caras) throws IllegalArgumentException{
		if(caras <= 1) throw new IllegalArgumentException("La cantidad de caras debe ser mayor a uno");		
		valor = (int)((Math.random() * caras) + 1);
	}
	
	public int getValor(){
		return valor;
	}
}