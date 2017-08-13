package poo;

//Ejemplo de clase final, no habra clases que la extiendan
public final class ClaseHija extends ClasePadre{

	private int atributoRandom;
	
	ClaseHija(String msj,int atributoRandom){
		super(msj);
		this.atributoRandom = atributoRandom;
	}
	
	public String getMsj(){
		return "Mensaje proveniente de la clase Hija: " + msj + "/Desc: " + atributoRandom;
	}
	
	public int getAtributoRandom(){
		return atributoRandom;
	}
	
	public void setAtributoRandom(int atributoRandom){
		this.atributoRandom = atributoRandom;
	}
}
