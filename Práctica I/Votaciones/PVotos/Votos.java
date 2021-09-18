package PVotos;

	import java.io.*;

public class Votos {
	
	public static String[] candidatos() throws IOException {
		
		BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
		String can[] = new String[5];
		int i;
		for (i = 0 ; i < can.length ; i ++) {
			System.out.print("Nombre del candidato: ");
			System.out.flush();
			can[i] = leer.readLine();
		}
		return can;
		
	}
	
	public static int[][] votosObtenidos() {
		
		int vot[][] = new int[5][3];
		int i, j;
		for (i = 0 ; i < vot.length ; i ++) {
			for (j = 0 ; j < vot[0].length ; j ++) {
				vot[i][j] = (int)((1000 - 10) * Math.random() + 10);
			}
		}
		return vot;
		
	}
	
	public static void mostrarDatos(String can[], int vot[][]) {
		
		int i, j;
		System.out.printf("%1$13c %2$3c %3$3c \n" , 'A' , 'B' , 'C');
		for (i = 0 ; i < vot.length ; i ++) {
			System.out.printf("%1$-10s" , can[i]);
			for (j = 0 ; j < vot[0].length ; j ++) {
				System.out.printf("%1$4d" , vot[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static void resultados(String can[], int vot[][]) {
		
	int mayor = 0, total, i, j;
	String nombre = null;
	for (i = 0 ; i < vot.length ; i ++) {
		total = 0;
		for (j = 0 ; j < vot[0].length ; j ++) {
			total += vot[i][j];
		}
		if (total > mayor) {
			mayor = total;
			nombre = can[i];
		}
	}
	System.out.print("Candidato ganador: " + (nombre) + " (" + (mayor) + ").\n");	
		
	}
}
