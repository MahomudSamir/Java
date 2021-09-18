	import java.io.*;
	import PVotos.*;
	
	/*
	 *
	 *|~~~~~~~~~~| |~~~~~|
	 *|Práctica I|~|HECHO|
	 *|~~~~~~~~~~| |~~~~~|
	 *
	 */

public class Principal {

	public static void main(String[] args) throws IOException {
	
	System.out.print("\nCandidatos\n");
	String can[];
	can = Votos.candidatos();
	System.out.print("\nVotaciones realizadas...\n");
	int vot[][];
	vot = Votos.votosObtenidos();
	System.out.print("\nDatos\n");
	Votos.mostrarDatos(can, vot);
	System.out.print("\nResultados\n");
	Votos.resultados(can, vot);
	
	}
}
