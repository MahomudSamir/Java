package PCultivo;

	import java.io.*;

public class Cultivo {
	
	public static String[][] cultivos() throws IOException {
		
		BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
		String cu[][] = new String[4][3];
		int i, j;
		for (i = 0 ; i < cu.length ; i ++) {
			for (j = 0 ; j < cu[0].length ; j ++) {
				System.out.print("Parcela " + (i+1) + " Cultivo " + (j+1) + ".\n");
				System.out.print("Cultivo y peso en Kg: ");
				System.out.flush();
				cu[i][j] = leer.readLine();
			}
		}
		return cu;
		
	}
	
	public static void mostrarDatos(String cu[][]) {
		
		int i, j;
		for (i = 0 ; i < cu.length ; i ++) {
			for (j = 0 ; j < cu[0].length ; j ++) {
				System.out.printf("%1$20s" , cu[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static void resultados(String cu[][]) {
	
	int pesoverdu[] = new int[3];
	int mayor = 0, peso = 0, band, x, i, j, k;
	// Primero //
	String frase = null, verdura = null;
	for (i = 0 ; i < cu.length ; i ++) {
		for (j = 0 ; j < cu[0].length ; j ++) {
			frase = cu[i][j];
			x = 0;
			band = 0;
			for (k = 0 ; k < frase.length() ; k ++) {
				if (frase.charAt(k) == ' ') {
					if (band == 0) {
						verdura = frase.substring(x,k);
						x = k + 1;
						band = 1;
					} else {
						peso = Integer.parseInt(frase.substring(x,k));
					}
				}
			}
			if (verdura.equalsIgnoreCase("Tomates")) {
				pesoverdu[0] += peso;
			} else if (verdura.equalsIgnoreCase("Papas")) {
				pesoverdu[1] += peso;
			} else if (verdura.equalsIgnoreCase("Lechugas")) {
				pesoverdu[2] += peso;
			}
		}
	}
	// Segundo //
	band = 0;
	verdura = null;
	for (i = 0 ; i < 3 ; i ++) {
		if (band == 0) {
			mayor = pesoverdu[0];
			verdura = "Tomates";
			band = 1;
		} else if (pesoverdu[i] > mayor) {
			mayor = pesoverdu[i];
			if (i == 1) {
				verdura = "Papas";
			} else if (i == 2) {
				verdura = "Lechugas";
			}
		}
	}
	for (i = 0 ; i < 3 ; i ++) {
		if (i == 0) {
			System.out.printf("%1$-10s %2$5d Kg\n" , "Tomates" , pesoverdu[i]);
		} else if (i == 1) {
			System.out.printf("%1$-10s %2$5d Kg\n" , "Papas" , pesoverdu[i]);
		} else if (i == 2) {
			System.out.printf("%1$-10s %2$5d Kg\n" , "Lechugas" , pesoverdu[i]);
		}
	}
	System.out.print("Mayor recolecta: " + (verdura) + " (" + (mayor) + "Kg).\n");
		
	}
}