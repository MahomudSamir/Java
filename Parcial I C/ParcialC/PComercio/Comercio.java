package PComercio;

	import java.io.*;

public class Comercio {
	
	public static String[] vendedores() throws IOException {
		
		BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
		String vende[] = new String[4];
		int i;
		for (i = 0 ; i < vende.length ; i ++) {
			System.out.print("Nombre del vendedor: ");
			System.out.flush();
			vende[i] = leer.readLine();
		}
		return vende;
		
	}
	
	public static int[][] articulos() {
		
		int arti[][] = new int[4][6];
		int i, j;
		for (i = 0 ; i < arti.length ; i ++) {
			for (j = 0 ; j < arti[0].length ; j ++) {
				arti[i][j] = (int)((91 - 10) * Math.random() + 10);
			}
		}
		return arti;
		
	}
	
	public static void mostrarDatos(String vende[], int arti[][]) {
		
		int i, j;
		for (i = 0 ; i < arti.length ; i ++) {
			System.out.printf("%1$-10s" , vende[i]);
			for (j = 0 ; j < arti[0].length ; j ++) {
				System.out.printf("%1$4d" , arti[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static void resultados(String vende[], int arti[][]) {
		
		int mayor = 0, venta, i, j;
		String nomb = null;
		// Primero //
		for (i = 0 ; i < arti.length ; i ++) {
			venta = 0;
			for (j = 0 ; j < arti[0].length ; j ++) {
				venta += arti[i][j];
			}
			if (venta > mayor) {
				mayor = venta;
				nomb = vende[i];
			}
			System.out.printf("%1$-10s %2$5.2f \n" , vende[i] , (venta/6.00));
		}
		// Segundo //
		System.out.print("\nVendedor con la mayor venta de artículos: " +(nomb)+ ".\n");
		
	}
}
