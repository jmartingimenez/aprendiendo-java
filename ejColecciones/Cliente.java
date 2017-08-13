/*Clase con sobreescritura de equals y hashcode. El hashCode() esta generado 
 * automaticamente por eclipse, el equals() lo deje con mi versión para dejar 
 * explicado los pasos*/
package ejColecciones;

public class Cliente {
	private String nombre;
	private String numeroCuenta;		//Como String solo para seguir el ejemplo
	private double saldo;
	
	public Cliente(String nombre,String numeroCuenta,double saldo){
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;		
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroCuenta == null) ? 0 : numeroCuenta.hashCode());
		return result;
	}	
	
	
	@Override
	public boolean equals(Object obj){
		//Es un objeto de esta clase?
		if(!(obj instanceof Cliente)) return false;
		
		//Casting para poder comparar atributos (obj no es Cliente)
		Cliente otro = (Cliente)obj;
		
		//Comparando el número de cuenta
		if(this.numeroCuenta.equals(otro.numeroCuenta))	return true;
		
		//Si no son iguales, pues retornamos 'false'
		return false;
	}
}
