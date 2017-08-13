//El salario maximo depende del tipo de Empleado, ver el método 'getTope()'
package progBasicaII.sistemaEmpleados;

import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Empleado {
	private String nombre;
	private double salario;
	private Date fechaCumpleanios;
	private double tope;
	
	//No valide la fecha, solo que el salario no pase el tope
	public Empleado(String nombre,double salario,int anio,int mes,int dia) throws IllegalArgumentException{
		GregorianCalendar fecha = new GregorianCalendar(anio,mes-1,dia);
		
		this.tope = this.getTope();
		if(salario > this.tope)
			throw new IllegalArgumentException("Este empleado no puede cobrar tanto");
		
		this.nombre = nombre;
		this.salario = salario;
		this.fechaCumpleanios = fecha.getTime();
	}
	
	public void setTope(double tope){
		this.tope = tope;
	}
	
	public abstract double getTope();

	public String brindarDetalles(){
		return "[Nombre: " + nombre + ", Salario: " + salario + 
				", Cumple: " + fechaCumpleanios + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getFechaCumpleanios() {
		return fechaCumpleanios;
	}

	public void setFechaCumpleanios(Date fechaCumpleanios) {
		this.fechaCumpleanios = fechaCumpleanios;
	}
}