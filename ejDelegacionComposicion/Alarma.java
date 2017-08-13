//Una Alarma, solo brinda detalles de la marca y el sonido que hace
package ejDelegacionComposicion;

public class Alarma {
	private String marca;
	private String sonido;
	
	public Alarma(String marca,String sonido){
		this.marca = marca;
		this.sonido = sonido;
	}
	
	public String getMarca(){
		return marca;
	}
	
	public String getSonido(){
		return sonido;
	}
}
