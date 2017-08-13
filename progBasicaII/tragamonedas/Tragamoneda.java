package progBasicaII.tragamonedas;

public class Tragamoneda {
	private Tambor[] tambor = new Tambor[3];
	
	public Tragamoneda(int carasDelTambor){
		for(int i=0;i<3;i++){
			tambor[i] = new Tambor(carasDelTambor);
		}
	}
	
	public void giro(){
		String resultado="";
		for (Tambor t : tambor) {
			resultado+="[" + t.getValor() + "] ";
		}
		System.out.println(resultado);
		
		if((tambor[0].getValor() == tambor[1].getValor()) && 
				tambor[1].getValor() == tambor[2].getValor())
			System.out.println("Ganaste 1000");
		else if((tambor[0].getValor() == tambor[1].getValor()) 	|| 
				tambor[1].getValor() == tambor[2].getValor()	||
				tambor[0].getValor() == tambor[2].getValor())
			System.out.println("Ganaste 500");
			else System.out.println("Mala suerte!"); 
	}
}