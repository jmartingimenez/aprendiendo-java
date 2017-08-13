/*Ejemplo de Herencia, donde se reciben parametros en el constructor y se 
 * sobreescribe un método de la clase padre*/
package poo;

public class Jefe extends Empleado{
	private double incentivo;
	
	public Jefe(String nombre,double sueldo,int anioAlta,int mes,int dia){
		super(nombre,sueldo,anioAlta,mes,dia);
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	/*Sobreescritura del método GetSueldo(), 'pesa mas' el método de la clase hija.
	 * Se especifica con super que se llame al método de la clase padre*/
	public double getSueldo(){
		double sueldoJefe=super.getSueldo();
		return sueldoJefe + incentivo;
	}
}
