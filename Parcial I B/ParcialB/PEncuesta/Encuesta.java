package PEncuesta;
	
	import java.io.*;

public class Encuesta {
	
	public static String[] estados() throws IOException {
		
		BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
		String esta[] = new String [5];
		int i;
		for (i = 0 ; i < esta.length ; i ++) {
			System.out.print("Estado encuestado: ");
			System.out.flush();
			esta[i] = leer.readLine();
		}
		return esta;
		
	}
	
	public static int[][] consumo() {
		
		int consu[][] = new int[5][20];
		int i, j;
		for (i = 0 ; i < consu.length ; i ++) {
			for (j = 0 ; j < consu[0].length ; j ++) {
				consu[i][j] = (int)((46 - 1) * Math.random() + 1);
			}
		}
		return consu;
		
	}
	
	public static void mostrarDatos(String esta[], int consu[][]) {
		
		int i, j;
		for(i = 0 ; i < consu.length ; i ++) {
			System.out.printf("%1$-10s" , esta[i]);
			for (j = 0 ; j < consu[0].length ; j ++) {
				System.out.printf("%1$4d" , consu[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static void resultados(String esta[], int consu[][]) {
	
	int fuma[] = new int[5];
	double porc[] = new double[5];
	int band = 0, total = 0, mayor = 0, pf = 0, pc = 0, uf = 0, uc = 0, i, j;
	String pri = null, seg = null;
	// Primero //
	for (i = 0 ; i < consu.length ; i ++) {
		for (j = 0 ; j < consu[0].length ; j ++) {
			fuma[i] += consu[i][j];
			if (consu[i][j] > mayor) {
				mayor = consu[i][j];
				pf = i+1;
				pc = j+1;
			}
		
		}
		total += fuma[i];
	}
	for (i = 0 ; i < consu.length ; i ++) {
		porc[i] = ((fuma[i] * 100.00) / total);
		System.out.printf("%1$-10s Consumo: %2$4d %3$4.2f%% \n" , esta[i] , fuma[i] , porc[i]);
		
	}
	System.out.print("\nConsumo total: " +(total)+ ".\n");
	// Segundo //
	for (i = 0 ; i < consu.length ; i ++) {
		for (j = 0 ; j < consu[0].length ; j ++) {
			if (consu[i][j] == mayor && i != pf && j != pc) {
				uf = i+1;
				uc = j+1;
			}
		}
	}
	if (uf == 0 && uc == 0) {
		System.out.print("\nMayor valor localizado (" +(pf)+ "," +(pc)+ "). Ningun otro valor semejante.\n");
	} else {
		System.out.print("\nMayor valor localizado (" +(pf)+ "," +(pc)+ "). Ultimo valor semejante localizado (" +(uf)+ "," +(uc)+ ").\n");
	}
	// Tercero //
	for (i = 0 ; i < porc.length ; i ++) {
		if (porc[i] > 20) {
			if (band == 0) {
				pri = esta[i];
				band = 1;
			} else {
				seg = esta[i];
			}
		}
	}
	if (pri != null || seg != null) {
		if (pri != null && seg != null) {
			System.out.print("\nEstados con más del 20%: " +(pri)+ " y " +(seg)+ ".\n");
		} else if (pri != null && seg == null) {
			System.out.print("\nEstado con más del 20%: " +(pri)+ ". Ningun otro estado con más del 20%.\n");
		}		
	} else {
		System.out.print("\nNingun estado tuvo un consumo más del 20%.\n");
	}
	
	}		
}
