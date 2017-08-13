//Ejemplo de uso de un array bidimiensional(matriz) con las dos versiones de for

public class E14_ArrayBidimiensional {
	public static void main(String[] args) {
		
		//Array inicializado
		int[][] arrayInicializado = {{1,2,3},{4,5,6}};
		
		//Mostrando
		System.out.println("Con for normal: ");
		for(int fila=0;fila<2;fila++){
			for(int columna=0;columna<3;columna++)
				System.out.print(	"pos " + fila + "," + columna + ": " +
									arrayInicializado[fila][columna] + "\t");
			System.out.println();
		}
		
		System.out.println("Con for reversionado: ");
		for(int[]fila:arrayInicializado){
			for(int columna:fila)
				System.out.print(columna + " ");			
			System.out.println();	
		}			
	}	
}
