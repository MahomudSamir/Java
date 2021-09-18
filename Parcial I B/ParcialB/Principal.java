	import java.io.*;
	import PEncuesta.*;
	
	/*
	 *
	 *|~~~~~~~~~| |~~~~~|
	 *|Parcial B|~|HECHO|
	 *|~~~~~~~~~| |~~~~~|
	 *
	 */

public class Principal {
	
	public static void main(String[] args) throws IOException {
		
		System.out.print("\nEstados\n");
		String esta[];
		esta = Encuesta.estados();
		System.out.print("\nEncuesta realizada...\n");
		int consu[][];
		consu = Encuesta.consumo();
		System.out.print("\nDatos\n");
		Encuesta.mostrarDatos(esta, consu);
		System.out.print("\nResultados\n");
		Encuesta.resultados(esta, consu);

	}	
}
