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
	
	public static int[][] votoObt() {
		
		int vot[][] = new int[5][4];
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
		System.out.printf("%1$23s\n%2$13c %3$3c %4$3c %5$3c \n%6$-10s\n" , "Distritos" , 'A' , 'B' , 'C' , 'D' , "Candidatos");
		for (i = 0 ; i < vot.length ; i ++) {
			System.out.printf("%1$-10s" , can[i]);
			for (j = 0 ; j < vot[0].length ; j ++) {
				System.out.printf("%1$4d" , vot[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static void resultados(String can[], int vot[][]) {
	
	int suma[] = new int[5];
	double porc[] = new double[5];	
	int band = 0, total = 0, i, j;
	double mayor = 0, votos = 0;
	String gan = null, pri = null, seg = null;
	// Primero //
	for(i = 0 ; i < vot.length ; i ++) {
		for (j = 0 ; j < vot[0].length ; j ++) {
			suma[i] += vot[i][j];
		}
		total += suma[i];
	}
	for (i = 0 ; i < 5 ; i ++) {
		porc[i] = ((suma[i] * 100.00) / total);
		System.out.printf("%1$-10s Votos: %2$5d Porcentaje: %3$5.2f \n" , can[i] , suma[i] , porc[i]);
		if (porc[i] > 50) {
			gan = can[i];
			votos = porc[i];
		} else {
			if (porc[i] > mayor) {
				mayor = porc[i];
				pri = can[i];
			}	
		}
	}
	// Segundo //	
	if (gan != null) {
		System.out.print("\nCandidato ganador: " +(gan)+ " (" +(votos)+ "%).\n");
	} else {
		mayor = 0;
		for (i = 0 ; i < 5 ; i ++) {
			if (porc[i] > mayor && can[i] != pri) {
			mayor = porc[i];	
			seg = can[i];
			}
		}
		System.out.print("\nNo hubo ganador, " +(pri)+ " y " +(seg)+ " irán a la segunda votación.\n");
	}
		
	}
}
