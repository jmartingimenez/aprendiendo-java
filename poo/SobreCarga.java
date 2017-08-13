/*Ejemplo de sobrecarga de métodos (incluído el constructor). Dar valores por default*/

package poo;

public class SobreCarga {
	
	private byte parametros;
	
	public SobreCarga(){
		System.out.println("obj1 no recibio parametros");
		parametros=0;
	}
	
	public SobreCarga(int numero1){
		System.out.println("El argumento dado para obj2 es: " + numero1);
		parametros=1;
	}
	
	public SobreCarga(int numero1,int numero2){
		System.out.println(numero1 + " + " + numero2 + " = " + (numero1+numero2));
		parametros=2;
	}
	
	/*Se va ejecutar el constructor de arriba usando estos parametros
	 * por Default (Ver mas abajo para una explicación mas completa.)
	 * Luego de ejecutarse el otro constructor, muestra el print y
	 * vuelve a setear la variable parametros, ya que el otro 
	 * constructor la seteo en 2. Con esa linea la ponemos en 1 
	 * como debe ser*/
	public SobreCarga(String mensaje){
		this(31,223);
		System.out.println("obj4 busca el constructor de obj3");
		parametros=1;
	}
	
	public byte getParametros(){
		return parametros;
	}
	
	public String getParametros(int numero){
		return "Segun lo que pusiste, el constructor recibio " + numero + " parametro/s.";
	}
	
	public static void main(String[] args) {
		//Objetos de prueba
		SobreCarga obj1 = new SobreCarga();
		SobreCarga obj2 = new SobreCarga(18);
		SobreCarga obj3 = new SobreCarga(15,13);
		
		/*Este constructor al pasarle el String hara una cuenta con numeros por 
		 * default. Los numeros son 31 y 223, por lo que la suma se mostrara 254.
		 * La suma se ejecuta, porque en este constructor el this(31,223) al 
		 * estar puesto de esa forma, busca el constructor que tenga la misma 
		 * cantidad de argumentos y el mismo tipo. Al encontrar coincidencia con 
		 * el constructor que realiza la suma que recibe 2 parametros, pues suma.
		 * En la clase 'SobreCargaV2' hice un ejemplo especifico de esto.*/
		SobreCarga obj4 = new SobreCarga("Suma default");
		
		//Llamada al método sin parametros, da la respuesta correcta
		System.out.println("Parametros para obj1: " + obj1.getParametros());
		System.out.println("Parametros para obj2: " + obj2.getParametros());
		System.out.println("Parametros para obj3: " + obj3.getParametros());
		System.out.println("Parametros para obj4: " + obj4.getParametros());
		
		//Llamada al método con un parametro, da la respuesta que le pasaste
		System.out.println("Parametros para obj1: " + obj1.getParametros(84));		
	}
}
