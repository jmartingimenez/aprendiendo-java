//Este es el primer ejemplo de todos de POO, atributos y un constructor

package poo;//Indica que esta clase pertenece a ese paquete. Abajo van los imports

public class Coche {
	private byte ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	
	private String color;
	private int pesoFinal; 
	
	public Coche(){
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		pesoPlataforma=500;
	}
	
	public String saludo(){
		return "Hola";
	}

	public byte getRuedas() {
		return ruedas;
	}

	public void setRuedas(byte ruedas) {
		this.ruedas = ruedas;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public int getPesoPlataforma() {
		return pesoPlataforma;
	}

	public void setPesoPlataforma(int pesoPlataforma) {
		this.pesoPlataforma = pesoPlataforma;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPesoFinal() {
		return pesoFinal;
	}

	public void setPesoFinal(int pesoFinal) {
		this.pesoFinal = pesoFinal;
	}
	

}
