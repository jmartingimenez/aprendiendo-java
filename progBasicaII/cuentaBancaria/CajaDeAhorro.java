/*Similar a la anterior, pero se pide que luego de la quinta extracci�n de 
 * dinero se cobre un costo adicional por extracci�n de $ 6*/
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
					+ "recuerda que debes pagar un adicional por extracci�n");
		
		/*Se contabiliza la extracci�n recien en el m�todo de la clase padre. 
		 * Como a esta altura ya estoy seguro que el saldo es suficiente por el 
		 * if de arriba, puedo cobrar la extracci�n sin problemas. */
		if(numeroExtracciones > 4){
			saldo -= costoExtraccion;
			System.out.println("Adicional por extracci�n: $" + costoExtraccion);
		}
		
		/*El m�todo padre controlara si el saldo (sin contar el adicional como 
		 * arriba) es suficiente*/
		return super.extraer(cantidad);
	}
}