package ejFigurasInterfaces;

public class Cuadrado implements Figura{
	private double lado;
	
	public Cuadrado(double lado){
		this.lado = lado;
	}
	
	public double area(){
		return lado * lado;
	}
}
