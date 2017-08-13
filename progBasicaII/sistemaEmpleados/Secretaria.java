package progBasicaII.sistemaEmpleados;

public class Secretaria extends Empleado{
	private static final double maximo = 20000;
	
	public Secretaria(String nombre,double salario,int anio,int mes,int dia) {
		super(nombre, salario, anio, mes, dia);
	}

	@Override
	public double getTope() {
		return maximo;
	}
}