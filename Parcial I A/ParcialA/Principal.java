	import java.io.*;
	import PEncuesta.*;

public class Principal {
	
	/*
	 *
	 *|~~~~~~~~~| |~~~~~|
	 *|Parcial A|~|HECHO|
	 *|~~~~~~~~~| |~~~~~|
	 *
	 */
	
	public static void main(String[] args) throws IOException {
		
		System.out.print("\nCiudades\n");
		String ciu[];
		ciu = Encuesta.ciudades();
		System.out.print("\nEncuesta realizada...\n");
		int consu[][];
		consu = Encuesta.consumo();
		System.out.print("\nDatos\n");
		Encuesta.mostrarDatos(ciu, consu);
		System.out.print("\nResultados\n");
		Encuesta.resultados(ciu, consu);

	}	
}
