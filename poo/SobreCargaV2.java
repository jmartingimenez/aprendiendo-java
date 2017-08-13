/*Test para setear valores por default.
 * El nombre seria el unico valor totalmente requerido. Pero se puede dar o no 
 * los demas parametros, en caso de un parametro faltante, se setea en algo por
 * defecto.
 * */
package poo;

public class SobreCargaV2 {
	private String nombre;
	private int edad;
	private String seccion;
	
	public SobreCargaV2(String nombre,int edad,String seccion){
		this.nombre = nombre;
		this.edad = edad;
		this.seccion = seccion;
	}
	
	public SobreCargaV2(String nombre){
		this(nombre,0,"Desconocida");
	}
	
	public SobreCargaV2(String nombre, int edad){
		this(nombre,edad,"Desconocida");
	}
	
	public SobreCargaV2(String nombre, String seccion){
		this(nombre,0,seccion);
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getSeccion() {
		return seccion;
	}

	public static void main(String[] args) {
		//Mostrando el objeto con todos los datos dados
		SobreCargaV2 ejCompleto = new SobreCargaV2("Pedro",36,"Ventas");
		System.out.println(	"Nombre: " 	+ 	ejCompleto.getNombre() 	+ 	"\n"	+
							"Edad: " 	+ 	ejCompleto.getEdad() 	+	"\n" 	+
							"Seccion: " + 	ejCompleto.getSeccion());
		
		//Mostrando objetos sin todos los datos
		SobreCargaV2 soloNombre = new SobreCargaV2("Javier");
		System.out.println(	"Nombre: " 	+ 	soloNombre.getNombre() 	+ 	"\n"	+
							"Edad: " 	+ 	soloNombre.getEdad() 	+	"\n" 	+
							"Seccion: " + 	soloNombre.getSeccion());
		SobreCargaV2 faltaEdad = new SobreCargaV2("Lucas","RRHH");
		System.out.println(	"Nombre: " 	+ 	faltaEdad.getNombre() 	+ 	"\n"	+
							"Edad: " 	+ 	faltaEdad.getEdad() 	+	"\n" 	+
							"Seccion: " + 	faltaEdad.getSeccion());	
		SobreCargaV2 faltaSeccion = new SobreCargaV2("Maria",39);
		System.out.println(	"Nombre: " 	+ 	faltaSeccion.getNombre() 	+ 	"\n"	+
							"Edad: " 	+ 	faltaSeccion.getEdad() 		+	"\n" 	+
							"Seccion: " + 	faltaSeccion.getSeccion());			
	}
}
