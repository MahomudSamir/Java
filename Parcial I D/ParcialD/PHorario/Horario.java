package PHorario;

	import java.io.*;

public class Horario {
	
	public static String[] estudiantes() throws IOException {
		
		BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
		String estu[] = new String[4];
		int i;
		for (i = 0 ; i < estu.length ; i ++) {
			System.out.print("Nombre del estudiante: ");
			System.out.flush();
			estu[i] = leer.readLine();
		}
		return estu;
		
	}
	
	public static String[][] tiempo() throws IOException {
		
		BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
		String tiem[][] = new String[4][2];
		int i, j;
		System.out.print("\nIndicará primero la hora de entrada y segundo la duración.\n");
		for (i = 0 ; i < tiem.length ; i ++) {
			for (j = 0 ; j < tiem[0].length ; j ++) {
				if (j == 0) {
					System.out.print("Indique la hora de entrada del alumno " +(i+1)+ ": ");
					System.out.flush();
					tiem[i][j] = leer.readLine();
				} else {
					System.out.print("Indique la duración del alumno " +(i+1)+ ": ");
					System.out.flush();
					tiem[i][j] = leer.readLine();
				}
			}
		}
		return tiem;
				
	}
	
	public static void resultados(String estu[], String tiem[][]) {
	
	int ht[] = new int[4];
	int mt[] = new int[4];	
	int hm = 0, mm = 0, he = 0, me = 0, hd = 0, md = 0, x, i, j, k;
	String frase = null, nomb = null;
	// Primero //
	for (i = 0 ; i < tiem.length ; i ++) {
		for (j = 0 ; j < tiem[0].length ; j ++) {
			frase = tiem[i][j];
			x = 0;
			if (j == 0) {
				for (k = 0 ; k < frase.length() ; k ++) {
					if (frase.charAt(k) == ':') {
							he = Integer.parseInt(frase.substring(x,k));
							x = (k + 1);
					} else if (x != 0) {
						k = 5;
						me = Integer.parseInt(frase.substring(x,k));
					}
				}
			} else {
				for (k = 0 ; k < frase.length() ; k ++) {
					if (frase.charAt(k) == ':') {
							hd = Integer.parseInt(frase.substring(x,k));
							x = (k + 1);
					} else if (x != 0) {
						k = 5;
						md = Integer.parseInt(frase.substring(x,k));
					}
				}
			}
		}
		ht[i] = he + hd;
		mt[i] = me + md;
	}
	// Segundo //
	for (i = 0 ; i < estu.length ; i ++) {
		System.out.printf("%1$-10s %2$2d:%3$2d \n" , estu[i] , ht[i] , mt[i]);
		if (ht[i] > hm) {
			if (mt[i] > mm) {
				hm = ht[i];
				mm = mt[i];
				nomb = estu[i];
			}
		}
	}
	System.out.print("\n" +(nomb)+ " (" +(hm)+ ":" +(mm)+ ") fue el estudiante que salió mas tarde.\n");	
		
	}	
}
