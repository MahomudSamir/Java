	import java.io.*;
	import PCultivo.*;
		
	/*
	 * 
	 *|~~~~~~~~~~~| |~~~~~|
	 *|Práctica II|~|HECHO|
	 *|~~~~~~~~~~~| |~~~~~|
	 *
	 */

public class Principal {
	
	public static void main(String[] args) throws IOException {
	
	System.out.print("\nParcelas y Cultivos\n");
	String cu[][];
	cu = Cultivo.cultivos();
	System.out.print("\nDatos\n");
	Cultivo.mostrarDatos(cu);
	System.out.print("\nResultados\n");
	Cultivo.resultados(cu);
	
	}	
}
