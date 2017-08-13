/*Se crean figuras geometricas y luego se muestra los datos. El m�todo 'area' 
 * esta implementado de distinta manera seg�n la figura correspondiente*/
package ejFigurasInterfaces;

public class Main {
	public static void main(String[] args) {
		Figura[] listaFiguras = new Figura[3] ;
		
		Figura cuadrado = new Cuadrado(6.21);
		Figura circulo = new Circulo(11.387);
		Figura triangulo = new Triangulo(6.01,3.03);
		
		listaFiguras[0] = cuadrado;
		listaFiguras[1] = circulo;
		listaFiguras[2] = triangulo;
		
		for(Figura f:listaFiguras)
			System.out.printf("�rea del %s: %.2f\n",
					f.getClass().getSimpleName(),f.area());
	}
}
