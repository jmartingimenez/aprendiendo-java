/*La m�s compleja de las cuentas, �sta permite establecer una cantidad de dinero 
 * a girar en descubierto. Es por ello que cada vez que se desee extraer dinero, 
 * no s�lo se considera el que se posee, sino el l�mite adicional que el banco 
 * estar� brindando. Por supuesto esto no es gratis, ya que el banco nos cobrar� 
 * un 5% como comisi�n sobre todo el monto en descubierto consumido en la 
 * operaci�n. Por ejemplo, si tuvi�ramos $ 100 en la cuenta, y quisi�ramos 
 * retirar $ 200 (con un descubierto de $ 150), podremos hacerlo. Pasaremos a 
 * deberle al banco $ 105 en total: los $ 100 que nos cubri�, m�s el 5% adicional 
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
			
			//Cuanto te cobro por comisi�n/interes? (5% de lo que te falta)
			double comisionBanco = prestamo * (0.01 * porcentajeComision);
			
			/*Le doy a tu cuenta lo que te falta (menos la comisi�n) y de 
			 * la cantidad inicialmente pedida le descuento el adicional por 
			 * extracci�n si es que lo tenes que pagar*/
			cantidad -= comisionBanco;
			saldo += cantidad;
			if(numeroExtracciones > 4) cantidad-=costoExtraccion;
			
			//Cuanto te puedo seguir prestando?
			this.setLimitePrestamo(prestamo);
			
			//Lo que nos queda a nosotros (Nos gusta la plata)
			System.out.println("Te quito por el prestamo: " + comisionBanco);
		}
		
		//Realizamos la operaci�n de extracci�n		
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