	import java.io.*;
	import PVotos.*;
		
	/*
	 *
	 *|~~~~~~~~~~~~| |~~~~~|
	 *|Pr�ctica III|~|HECHO|
	 *|~~~~~~~~~~~~| |~~~~~|
	 *
	 */

public class Principal {
	
	public static void main(String[] args) throws IOException {

	System.out.print("\nCandidatos\n");
	String can[];
	can = Votos.candidatos();
	System.out.print("\nVotaci�n realizada...\n");
	int vot[][];
	vot = Votos.votoObt();
	System.out.print("\nDatos\n");
	Votos.mostrarDatos(can, vot);
	System.out.print("\nResultados\n");
	Votos.resultados(can, vot);

	}	
}
