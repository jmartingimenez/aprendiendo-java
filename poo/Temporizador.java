//Clase Temporizador usada en 'Hora.java', es para mostrar el tiempo cada X segundos.
package poo;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Temporizador {
	public static void main(String[] args) {
		Hora listener = new Hora();
		Timer t = new Timer(1000,listener);	
		
		t.start();
		JOptionPane.showMessageDialog(null,"Pulsa aceptar para detener el programa");
		t.stop();
	}
}
