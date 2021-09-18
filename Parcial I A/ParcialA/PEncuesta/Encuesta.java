package PEncuesta;

	import java.io.*;

public class Encuesta {
	
	public static String[] ciudades() throws IOException {
		
		BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
		String ciu[] = new String[5];
		int i;
		for (i = 0 ; i < ciu.length ; i ++) {
			System.out.print("Ciudad encuestada: ");
			System.out.flush();
			ciu[i] = leer.readLine();
		}
		return ciu;
		
	}
	
	public static int[][] consumo() {
		
		int consu[][] = new int[5][10];
		int i, j;
		for (i = 0 ; i < consu.length ; i ++) {
			for (j = 0 ; j < consu[0].length ; j ++) {
				consu[i][j] = (int)((36 - 1) * Math.random() + 1);
			}
		}
		return consu;
		
	}
	
	public static void mostrarDatos(String ciu[], int consu[][]) {
		
		int i, j;
		for (i = 0 ; i < consu.length ; i ++) {
			System.out.printf("%1$-10s" , ciu[i]);
			for (j = 0 ; j < consu[0].length ; j ++) {
				System.out.printf("%1$4d" , consu[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static void resultados(String ciu[], int consu[][]) {
		
		double prom[] = new double[5];
		int band = 0, menor = 35, cant = 0, fi = 0, co = 0, suma, i, j;
		String pri = null, seg = null;
		// Primero //
		System.out.printf("%1$-10s %2$-8s \n" , "Ciudad" , "Promedio");
		for (i = 0 ; i < consu.length ; i ++) {
			suma = 0;
			for (j = 0 ; j < consu[0].length ; j ++) {
				suma += consu[i][j];
				if (consu[i][j] < menor) {
					menor = consu[i][j];
					fi = i;
					co = j;
				}
			}
			prom[i] = (suma / 10.00);
			System.out.printf("%1$-10s %2$5.2f \n" , ciu[i] , prom[i]);
		}
		// Segundo //
		for (i = 0 ; i < consu.length ; i ++) {
			for(j = 0 ; j < consu[0].length ; j ++) {
				if (consu[i][j] == menor && i != fi && j != co){
					cant ++;
				}
			}
		}
		if (cant == 0) {
			System.out.print("\nMenor consumo localizado (" +(fi+1)+ "," +(co+1)+ "); unico valor encontrado.\n");
		} else {
			System.out.print("\nMenor consumo localizado (" +(fi+1)+ "," +(co+1)+ "); " +(cant)+ " valores semejantes.\n");
		}
		// Tercero //
		band = 0;
		for (i = 0 ; i < prom.length ; i ++) {
			if (prom[i] < 15) {
				if (band == 0) {
					pri = ciu[i];
					band = 1;
				} else {
					seg = ciu[i];
				}
			}
		}
		if (pri != null || seg != null) {
			if (pri != null && seg != null) {
				System.out.print("\nCiudades con consumo menor al 15%: " +(pri)+ " y " +(seg)+ ".\n");
			} else if (pri != null && seg == null) {
				System.out.print("\nCiudad con consumo menor al 15%: " +(pri)+ "; Ninguna otra ciudad.\n");
			}
		} else {
			System.out.print("\nNo se encontró ciudad con consumo menor al 15%.\n");
		}
				
	}
}
