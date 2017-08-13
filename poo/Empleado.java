/*Uso de fechas: Se crea un objeto de la clase GregorianCalendar. Si 
 * se le da argumentos en forma 'YYYY-MM-DD' usara eso, si no se le da 
 * nada toma la fecha actual. Una vez construido el objeto, a traves
 * del método 'getTime()' se obtiene un valor de tipo Date que se asigna 
 * a la variable 'fechaAlta'.
 * NOTA: Los meses van de 0 a 11, si pasas 2 referis a marzo en lugar de febrero.
 * */

package poo;
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
	private final String nombre;		//El nombre no debería poder cambiarse
	private double sueldo;
	private Date fechaAlta;
	private Date fechaActual;
	
	Empleado(String nombre,double sueldo,int anio,int mes,int dia){
		GregorianCalendar fechaAlta = new GregorianCalendar(anio,mes-1,dia);
		GregorianCalendar fechaActual = new GregorianCalendar();		
		
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.fechaAlta = fechaAlta.getTime();
		this.fechaActual = fechaActual.getTime();
	}

	public void subirSueldo(double porcentaje){
		double aumento = this.sueldo * (porcentaje/100);
		this.sueldo += aumento;
	}
	
	//Setters y Getters
	public String getNombre() {
		return nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaActual() {
		return fechaActual;
	}

	public void setFechaActual(Date fechaActual) {
		this.fechaActual = fechaActual;
	}	
}
