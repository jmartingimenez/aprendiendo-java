/*Ejemplo de Herencia, donde se reciben parametros en el constructor y se 
 * sobreescribe un método de la clase padre
 * 
 * NOTA: Podría haber editado la clase Jefe y que herede de EmpleadoStatic, 
 * pero quería dejar diferenciado las dos cosas. En este ejemplo se ve en la 
 * clase que tiene el main un ejemplo de poliformismo.*/
package poo;

public class Supervisor extends EmpleadoStatic implements JefesI{
	private double incentivo;
	
	public Supervisor(String nombre){
		super(nombre);
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	@Override
	public String tomarDecisiones(String decision) {
		return "El supervisor " + getNombre() + " tomo la decisión de: " + decision;
	}
	
	//Ejemplo de jerarquía de interfaces y acceso a una constante
	@Override
	public double setBonus(double bonus) {
		double prima = 2000.00;
		return TrabajadorI.bonusMinimo + bonus + prima;
	}
}	