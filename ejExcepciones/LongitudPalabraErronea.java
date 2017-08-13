//Excepción creada (propia)
package ejExcepciones;

public class LongitudPalabraErronea extends Exception{
	private static final long serialVersionUID = 1L;
	public LongitudPalabraErronea(){}
	
	public LongitudPalabraErronea(String msjError){
		super(msjError);
	}
}
