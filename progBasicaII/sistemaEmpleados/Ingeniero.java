package progBasicaII.sistemaEmpleados;

public class Ingeniero extends Empleado{
	private static final double maximo = 30000;
	
	public Ingeniero(String nombre,double salario,int anio,int mes,int dia) {
		super(nombre,salario,anio,mes,dia);
	}

	@Override
	public double getTope() {
		return maximo;
	}
}