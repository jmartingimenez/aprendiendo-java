package poo;

public class ClasePadre {
	String msj;
	
	ClasePadre(String msj){
		this.msj = msj;
	}
	
	public String getMsj(){
		return "Mensaje proveniente de la clase Padre: " + msj;
	}
}
