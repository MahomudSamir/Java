	import java.io.*;
	import PNotas.*;
	
	/*
	 *
	 *|~~~~~~~~~~~| |~~~~~|
	 *|Práctica IV|~|HECHO|
	 *|~~~~~~~~~~~| |~~~~~|
	 *
	 */

public class Principal {
	
	public static void main(String[] args) throws IOException {
		
		System.out.print("\nEstudiantes\n");
		String estu[];
		estu = Notas.estudiantes();
		System.out.print("\nPreguntas realizadas...\n");
		int preg[];
		preg = Notas.preguntas();
		System.out.print("\nEstudiantes evaluados...\n");
		int resp[][];
		resp = Notas.respuestas();
		System.out.print("\nDatos\n");
		Notas.mostrarDatos(estu, preg, resp);
		System.out.print("\n\nResultados\n");
		Notas.resultados(estu, preg, resp);
		
	}	
}
