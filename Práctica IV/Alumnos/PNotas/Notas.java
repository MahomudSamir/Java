package PNotas;

	import java.io.*;

public class Notas {
	
	public static String[] estudiantes() throws IOException {
		
		BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
		String estu[] = new String[6];
		int i;
		for (i = 0 ; i < estu.length ; i ++) {
			System.out.print("Nombre del estudiante: ");
			System.out.flush();
			estu[i] = leer.readLine();
		}
		return estu;
		
	}
	
	public static int[] preguntas() {
		
		int preg[] = new int[5];
		int i;
		for (i = 0 ; i < preg.length ; i++) {
			preg[i] = (int)((3 - 1) * Math.random() + 1);
		}
		return preg;
		
	}
	
	public static int[][] respuestas() {
		
		int resp[][] = new int[6][5];
		int i, j;
		for (i = 0 ; i < resp.length ; i ++) {
			for (j = 0 ; j < resp[0].length ; j++) {
				resp[i][j] = (int)((3 - 1) * Math.random() + 1);
			}
		}
		return resp;
		
	}
	
	public static void mostrarDatos(String estu[], int preg[], int resp[][]) {
		
		int i, j;
		for (i = 0 ; i < resp.length ; i ++) {
			System.out.printf("%1$-10s" , estu[i]);
			for (j = 0 ; j < resp[0].length ; j ++) {
				System.out.printf("%1$3d" , resp[i][j]);
			}
			System.out.println();
		}
		System.out.printf("%1$-10s" , "Respuestas" );
		for(i = 0 ; i < preg.length ; i ++) {
			System.out.printf("%1$3d" , preg[i]);
		}
		
	}
	
	public static void resultados(String estu[], int preg[], int resp[][]) {
		
	int band = 0, total = 0, nota = 0, i, j;
	String prib = null;
	// Primero //
	for (i = 0 ; i < resp.length ; i ++) {
		nota = 0;
		for (j = 0 ; j < resp[0].length ; j ++) {
			if (resp[i][j] == preg[j]) {
				nota += 4;
			}
		}
		if (nota >= 16 && nota <= 20) {
			System.out.printf("%1$-10s %2$3c \n" , estu[i] , 'A');
		} else if (nota < 16 && nota >= 10) {
			System.out.printf("%1$-10s %2$3c \n" , estu[i] , 'B');
			if (band == 0) {
				prib = estu[i];
				band = 1;
			}
		} else if (nota < 10 && nota >= 0) {
			System.out.printf("%1$-10s %2$3c \n" , estu[i] , 'C');
		}
		total += nota;
	}
	// Segundo //
	if (prib == null) {
		System.out.print("\nNingun estudiante con calificación B.\n");
	} else {
		System.out.print("\nEstudiante con calificación B: " +(prib)+ ".\n");
	}
	// Tercero //
	total /= 6;
	if (nota >= 16 && nota <= 20) {
		System.out.print("\nCalificación promedia: A.\n");
	} else if (nota < 16 && nota >= 10) {
		System.out.print("\nCalificación promedia: B.\n");
	} else if (nota < 10 && nota >= 0) {
		System.out.print("\nCalificación promedia: C.\n");
	}
	
	}
}
