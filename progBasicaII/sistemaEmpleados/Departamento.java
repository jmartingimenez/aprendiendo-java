package progBasicaII.sistemaEmpleados;

public class Departamento {
	private String nombre;
	private Gerente gerente;
	
	public Departamento(String nombre,Gerente gerente){
		this.nombre = nombre;
		this.gerente = gerente;
	}

	public String getNombre() {
		return nombre;
	}

	public Gerente getGerente() {
		return gerente;
	}	
}
