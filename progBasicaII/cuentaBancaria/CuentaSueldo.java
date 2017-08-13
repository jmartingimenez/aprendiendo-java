/*Es el tipo de cuenta más simple, ya que se rige por la premisa de que en 
 * tanto y en cuanto se tenga tanto o más dinero en cuenta del que se quiere 
 * extraer, la operación se debe efectuar correctamente.*/
package progBasicaII.cuentaBancaria;

public class CuentaSueldo {
	protected double saldo;
	protected int numeroExtracciones;
	
	public CuentaSueldo(double saldoInicial){
		this.saldo = saldoInicial;
		this.numeroExtracciones = 0;
	}
	
	public void depositar(double saldo){
		this.saldo += saldo;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public String extraer(double cantidad) throws RuntimeException{
		if(cantidad > saldo)
			throw new RuntimeException("No tenes tanto dinero para extraer");
		
		numeroExtracciones++;
		saldo -= cantidad;
		return "Se retiro " + cantidad + ". El saldo disponible es: " + saldo;
	}
}