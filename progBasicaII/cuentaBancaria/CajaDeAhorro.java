/*Similar a la anterior, pero se pide que luego de la quinta extracción de 
 * dinero se cobre un costo adicional por extracción de $ 6*/
package progBasicaII.cuentaBancaria;

public class CajaDeAhorro extends CuentaSueldo{
	protected double costoExtraccion;
	
	public CajaDeAhorro(double saldoInicial){
		super(saldoInicial);
		this.costoExtraccion = 6;
	}
	
	@Override
	public String extraer(double cantidad) throws RuntimeException{
		if(numeroExtracciones > 5 && ((cantidad+costoExtraccion) > saldo))
			throw new RuntimeException("No tenes tanto dinero para extraer, "
					+ "recuerda que debes pagar un adicional por extracción");
		
		/*Se contabiliza la extracción recien en el método de la clase padre. 
		 * Como a esta altura ya estoy seguro que el saldo es suficiente por el 
		 * if de arriba, puedo cobrar la extracción sin problemas. */
		if(numeroExtracciones > 4){
			saldo -= costoExtraccion;
			System.out.println("Adicional por extracción: $" + costoExtraccion);
		}
		
		/*El método padre controlara si el saldo (sin contar el adicional como 
		 * arriba) es suficiente*/
		return super.extraer(cantidad);
	}
}