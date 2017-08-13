package progBasicaII.sistemaEmpleados;

public class Gerente extends Empleado{
	private static final double maximo = 50000;
	private int numeroCochera;
	
	public Gerente(String nombre,double salario,int anio,int mes,int dia,int numeroCochera) {
		super(nombre,salario,anio,mes,dia);
		this.numeroCochera = numeroCochera;
	}

	public int getNumeroCochera() {
		return numeroCochera;
	}

	@Override
	public double getTope() {
		return maximo;
	}
}