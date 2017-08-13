//Puse los requerimientos de cada clase en las mismas y no aca
package progBasicaII.cuentaBancaria;

public class Main {
	public static void main(String[] args) {
		//Creamos la cuenta
		CuentaSueldo cuentaSimple = new CuentaSueldo(4000.00);
		CajaDeAhorro cajaAhorro = new CajaDeAhorro(5000);
		CuentaCorriente cuentaCorriente = new CuentaCorriente(1000);
		
		
		//Probando la cuentaSaldo
		cuentaSimple.depositar(1500);
		System.out.println("Nuevo saldo cuentaSimple: " + cuentaSimple.getSaldo());
		System.out.println(cuentaSimple.extraer(500));
		
		sp();
		
		
		//Probando la cajaAhorro. 5 extracciones para ver el adicional cobrado
		cajaAhorro.depositar(1000);
		System.out.println("Nuevo saldo cajaAhorro: " + cajaAhorro.getSaldo());
		
		cajaAhorro.extraer(100);cajaAhorro.extraer(100);cajaAhorro.extraer(100);
		cajaAhorro.extraer(100);cajaAhorro.extraer(100);
		
		System.out.println("Saldo cajaAhorro: " + cajaAhorro.getSaldo());
		System.out.println(cajaAhorro.extraer(100));
		
		sp();
		
		
		//Probando la cuentaCorriente
		System.out.println("Nuevo saldo cuentaCorriente: " + cuentaCorriente.getSaldo());
		
		/*Dejando la cuenta en 0 para ver si puedo pedir el limite cuando no 
		 * tengo saldo y ademas tengo que pagar adicional por extracciones*/
		cuentaCorriente.extraer(100);
		cuentaCorriente.extraer(100);
		cuentaCorriente.extraer(100);
		cuentaCorriente.extraer(200);
		cuentaCorriente.extraer(500);
		
		System.out.println("saldo cuentaCorriente: " + cuentaCorriente.getSaldo());
		
		/*Pido el limite sin tener nada (ademas tengo que pagar adicional por 
		 * extracción, por lo que necesito $6 mas)*/
		System.out.println(cuentaCorriente.extraer(2000));
		
		//Cuanto puede el banco seguirme prestando
		System.out.println("Te puedo dar: " + cuentaCorriente.getLimitePrestamo());
	}
	
	public static void sp(){
		System.out.println();
	}
}
