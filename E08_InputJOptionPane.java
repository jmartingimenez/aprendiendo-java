//Ventanita pidiendo un dato

import javax.swing.JOptionPane;

public class E08_InputJOptionPane {
	public static void main(String[] args) {
		//Muestra una ventana para input. Lo escrito se guarda en 'miNombre'
		String miNombre=JOptionPane.showInputDialog("Introduce tu nombre: ");
		
		//Pido la edad, este método devuelve un String..
		String edadAux=JOptionPane.showInputDialog("Introduce tu edad: ");
		
		//Por lo que con el método siguiente lo pasamos a Int
		int miEdad=Integer.parseInt(edadAux);

		//Muestro, se nota que es un Int al sumar un año
		System.out.println(miNombre + ", tu edad sera el proximo anio: " + (miEdad+1));
	}
}
