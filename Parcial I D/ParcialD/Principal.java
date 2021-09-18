	import java.io.*;
	import PHorario.*;
	
	/*
	 *
	 *|~~~~~~~~~| |~~~~~|
	 *|Parcial D|~|HECHO|
	 *|~~~~~~~~~| |~~~~~|
	 *
	 */
	 
public class Principal {
	
	public static void main(String[] args) throws IOException {

	System.out.print("\nEstudiantes\n");
	String estu[];
	estu = Horario.estudiantes();
	System.out.print("\nPrueba realizada...\n");
	String tiem[][];
	tiem = Horario.tiempo();
	System.out.print("\nResultados\n");
	Horario.resultados(estu, tiem);

	}	
}
