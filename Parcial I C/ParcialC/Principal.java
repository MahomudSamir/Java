	import java.io.*;
	import PComercio.*;
		
	/*
	 *
	 *|~~~~~~~~~| |~~~~~|
	 *|Parcial C|~|HECHO|
	 *|~~~~~~~~~| |~~~~~|
	 *
	 */
		 
public class Principal {

	public static void main(String[] args) throws IOException {
	
	System.out.print("\nVendedores\n");
	String vende[];
	vende = Comercio.vendedores();
	System.out.print("\nArtículos vendidos...\n");
	int arti[][];
	arti = Comercio.articulos();
	System.out.print("\nDatos\n");
	Comercio.mostrarDatos(vende, arti);
	System.out.print("\nResultados\n");
	Comercio.resultados(vende, arti);

	}	
}
