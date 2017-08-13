package ejFigurasInterfaces;

public class Circulo implements Figura{
	private double radio;
	
	public Circulo(double radio){
		this.radio = radio;
	}
	
	public double area(){
		return PI * (this.radio * this.radio);
	}
}
