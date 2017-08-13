//Ejemplo de sobreescritura del método equals()/hashcode()
public class TestEqualsObj {
	//Atributos random de esta clase
	private int edad;
	private String cadena;
	
	//Constructor
	public TestEqualsObj(String cadenaDada, int edadDada){
		this.cadena=cadenaDada;
		this.edad=edadDada;
	}
	
	//Getter para la cadena
	public String getCadena(){
		return this.cadena;
	}
	
	//Getter para la edad
	public int getEdad(){
		return this.edad;
	}

	//Sobreescritura del método equals.
	@Override			
	public boolean equals(Object obj){
		
		//Si es la misma referencia, es el mismo objeto. No tiene sentido seguir..
		if(this==obj) return true;
		
		//Si el objeto a comparar es null o no es de la misma clase...
		if((obj==null) || (obj.getClass() != this.getClass())) return false;
		
		//Esto permite comparar atributos entre si
		TestEqualsObj test = (TestEqualsObj)obj;
		
		return this.cadena.equals(test.cadena) &&
				this.edad==test.edad;	
	}
	
	//Sobreescritura del método HashCode. En teoría, usar primos ayuda a evitar colisiones
	@Override
	public int hashCode(){
		int numeroRandom = 17;
		numeroRandom = 31 * numeroRandom + this.cadena.hashCode();
		numeroRandom = 31 * numeroRandom + this.edad;
		return numeroRandom;
	}
	
	//Main para realizar la prueba
	public static void main(String[] args) {
		//Dos instancias que reciben lo mismo para el constructor
		TestEqualsObj ObjetoA = new TestEqualsObj("1234",1);
		TestEqualsObj ObjetoB = new TestEqualsObj("abcd",1);
		TestEqualsObj ObjetoC = new TestEqualsObj("1234",1);
		
		//Muestro los valores
		System.out.println("ObjetoA.getCadena() = " + ObjetoA.getCadena());
		System.out.println("ObjetoB.getCadena() = " + ObjetoB.getCadena());
		
/*COMPARACIONES:
 * NOTA:Como compara objetos, con que sean de la misma clase y no sean
 * null ya es suficiente. No checkea, por ej.. que el atributo 'cadena'
 * de cada objeto sea igual..
 * */
		
		//A y B. Debería dar FALSE
		if(ObjetoA.equals(ObjetoB)) System.out.println("ObjA y ObjB = TRUE");
		else System.out.println("ObjB y ObjB = FALSE");	

		//B y C. Debería dar FALSE
		if(ObjetoB.equals(ObjetoC)) System.out.println("ObjB y ObjC = TRUE");
		else System.out.println("ObjB y ObjC = FALSE");		
		
		//A y C. Debería dar TRUE
		if(ObjetoA.equals(ObjetoC)) System.out.println("ObjA y ObjC = TRUE");
		else System.out.println("ObjA y ObjC = FALSE");			
	}	
}
