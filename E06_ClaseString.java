/*Métodos length, charAt, substring, equals, equalsIgnoreCase de la clase String*/

public class E06_ClaseString {
	public static void main(String[] args) {
		String miPrimerNombre="Jonatan";
		String miSegundoNombre="Martin";
		String subS="123456789";
		
		//Método lenght()
		System.out.println(miPrimerNombre + " tiene " + miPrimerNombre.length() + " caracteres.");
		
		//Método charAt(n). Notese que empieza de 0, por eso puse 3(0,1,2,3)
		System.out.println("La cuarta letra en " + miSegundoNombre + " es: " + miSegundoNombre.charAt(3));
		
		 /*Método substring(x)/substring(x,y)
		 * - Si no se le indica segundo parametro, corta desde el valor
		 * dado hasta el final.
		 * - En el caso de ejempo de abajo, usando la cadena '123456789', 
		 * se trae desde la posición 2(3) incluída hasta la posición 5 (5) 
		 * sin incluír == Algo como este intervalo[2,5) ==.
		 */
		System.out.println("Variable subS antes de substring (2,5): " + subS);
		subS=subS.substring(2,5);//Devuelve "345"
		System.out.println("Variable subS despues de substring (2,5): " + subS);
		
		//Comparación con equals(Puede ponerse un objeto o un string en este caso)
		if(miPrimerNombre.equals("Jonatan")) System.out.println("Mis dos nombres comparados son iguales");

		//Comparación con el equalsIgnoreCase
		if(miPrimerNombre.equalsIgnoreCase("jONATAn")) System.out.println("Comprobacion del equalsIgnoreCase OK");		
		
		//Comparacion con una cadena de caracteres		
		if(miSegundoNombre.equals("Martin")) System.out.println("Mi segundo nombre es Martin");
		/*equals en este caso dara positivo. Pero hay que tener en cuenta que este 
		 * método compara según la posición de memoria, si yo crease objetos 
		 * anteponiendo el 'new' daría falso, aun si por ejemplo el 'getName()' 
		 * devolviese la misma cadena. Ahí entra en juego la sobreescritura.
		 * */
		String objeto1="aeiou";
		String objeto2="aeiou";
		
		System.out.print("equals entre 'objeto1' y 'objeto2' da como resultado: ");
		if(objeto1.equals(objeto2)) System.out.print("TRUE");
	}
}
