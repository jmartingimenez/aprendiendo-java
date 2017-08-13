/*Serializando: Guardar un objeto en otro medio y ser capaz de recuperarlo. Los 
 * valores para la constante deben ser iguales tanto para el emisor como para el 
 * receptor.*/
package ejSerializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Serializando implements Serializable{
	private static final long serialVersionUID = 1L;
	private int n;
	
	public Serializando(int n){
		this.n = n;
	}
	
	public int getN(){
		return n;
	}
	
	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		int n;
		
		System.out.print("Ingrese un número: ");
		n = Entrada.nextInt();
		Entrada.close();
		
		Serializando objTest = new Serializando(n);
		
		//Guardando
		try{
			ObjectOutputStream escribiendo = new ObjectOutputStream(new FileOutputStream("C:/Serializacion/num.data"));
			escribiendo.writeObject(objTest);
			escribiendo.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		//Leyendo
		try{
			ObjectInputStream leyendo = new ObjectInputStream(new FileInputStream("C:/Serializacion/num.data"));
			try {
				Serializando objLeido = (Serializando)leyendo.readObject();
				System.out.println("Número: " + objLeido.n);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			leyendo.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
