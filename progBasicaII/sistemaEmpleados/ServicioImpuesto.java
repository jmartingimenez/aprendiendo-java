//Tengo que ver luego como armar esto de una forma mas elegante
package progBasicaII.sistemaEmpleados;

public class ServicioImpuesto {
	public String obtenerImpuesto(Empleado empleado) throws IllegalArgumentException{
		throw new IllegalArgumentException("El tipo no puede ser 'Empleado'");
	}
	
	public double obtenerImpuesto(Secretaria secretaria){
		return secretaria.getSalario() * 0.15;
	}
	
	public double obtenerImpuesto(Ingeniero ingeniero){
		return ingeniero.getSalario() * 0.2;
	}

	public double obtenerImpuesto(Gerente gerente){
		return gerente.getSalario() * 0.25;
	}	
	
	//Notese que este impuesto incluye el extra
	public double obtenerImpuesto(Director director){
		return director.getSalario() * 0.3;
	}	
}