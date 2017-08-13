/*Ejemplo para crear un temporizador que mande un msj cada X segundos.
 * Especificado en milisegundos. El programa finaliza al cerrarse la ventana.
 * Por cada print, debería sonar un beep..*/
package poo;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Hora implements ActionListener{
	//Este método es llamado cuando ocurre una acción
	public void actionPerformed(ActionEvent e) {
		Date horaActual = new Date();
		System.out.println("Hora actual: " + horaActual);
		Toolkit.getDefaultToolkit().beep();
	}
}
