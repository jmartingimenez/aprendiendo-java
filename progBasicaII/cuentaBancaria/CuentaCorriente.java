/*La más compleja de las cuentas, ésta permite establecer una cantidad de dinero 
 * a girar en descubierto. Es por ello que cada vez que se desee extraer dinero, 
 * no sólo se considera el que se posee, sino el límite adicional que el banco 
 * estará brindando. Por supuesto esto no es gratis, ya que el banco nos cobrará 
 * un 5% como comisión sobre todo el monto en descubierto consumido en la 
 * operación. Por ejemplo, si tuviéramos $ 100 en la cuenta, y quisiéramos 
 * retirar $ 200 (con un descubierto de $ 150), podremos hacerlo. Pasaremos a 
 * deberle al banco $ 105 en total: los $ 100 que nos cubrió, más el 5% adicional 
 * sobre el descubierto otorgado.
 * NOTA: Interprete 'girar en descubierto' como que el banco te preste lo que te 
 * falta*/
package progBasicaII.cuentaBancaria;

public class CuentaCorriente extends CajaDeAhorro{
	private double limitePrestamo;			//Maximo que puedo prestar
	private double porcentajeComision;		//Cantidad en % que te cobro por prestar
	
	public CuentaCorriente(double saldoInicial) {
		super(saldoInicial);
		this.limitePrestamo = 2000;
		this.porcentajeComision = 5;
	}

	@Override
	public String extraer(double cantidad) throws RuntimeException{
		/*Si la cantidad de dinero que queres extraer, requiere un prestamo que 
		 *  excede el limite de lo que puedo darte..*/
		if(cantidad > (saldo + limitePrestamo))
			throw new RuntimeException("No te podemos prestar tanto");
		
		/*Si queres extraer mas de lo que tenes, pero la diferencia no supera 
		 * el limite...*/
		if(cantidad > saldo){			
			//Cuanto te falta para llegar a lo que necesitas?
			double prestamo = cantidad - saldo;
			
			//Cuanto te cobro por comisión/interes? (5% de lo que te falta)
			double comisionBanco = prestamo * (0.01 * porcentajeComision);
			
			/*Le doy a tu cuenta lo que te falta (menos la comisión) y de 
			 * la cantidad inicialmente pedida le descuento el adicional por 
			 * extracción si es que lo tenes que pagar*/
			cantidad -= comisionBanco;
			saldo += cantidad;
			if(numeroExtracciones > 4) cantidad-=costoExtraccion;
			
			//Cuanto te puedo seguir prestando?
			this.setLimitePrestamo(prestamo);
			
			//Lo que nos queda a nosotros (Nos gusta la plata)
			System.out.println("Te quito por el prestamo: " + comisionBanco);
		}
		
		//Realizamos la operación de extracción		
		return super.extraer(cantidad);
	}
	
	public double getLimitePrestamo() {
		return limitePrestamo;
	}
	
	public void setLimitePrestamo(double nuevoLimite){
		this.limitePrestamo -= nuevoLimite;
	}
	
	public double getPorcentajeComision(){
		return porcentajeComision;
	}
}