//Despúes del constructor, se le agrega el extra de 10% al salario
package progBasicaII.sistemaEmpleados;

public class Director extends Gerente{
	private static final double maximo = 70000;
	private final static double extra = 1.1;	//10%
	
	public Director(String nombre,double salario,int anio,int mes,int dia,int numeroCochera) {
		super(nombre, salario, anio, mes, dia, numeroCochera);
		this.setSalario(salario * extra);
	}
	
	public double getExtra(){
		return extra;
	}
	
	@Override
	public double getTope() {
		return maximo;
	}
}