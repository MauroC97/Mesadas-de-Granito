package mesadas;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Test_resolucion {
	
	@Test
	void caso1() throws IOException {
		Procesador_entrada procesador = new Procesador_entrada("Pruebas/caso1.in");
		Generador_Salida generador = new Generador_Salida("Pruebas/salida1.out");
		ArrayList<Mesada> arr = new ArrayList<Mesada>();
		int cant;
		procesador.preparar_array(arr);
		Assert.assertEquals(3, cant= generador.cantidad_pilas(arr));
		generador.crear_arch_salida(cant);
	}
	@Test
	void caso2() throws IOException {
		Procesador_entrada procesador = new Procesador_entrada("Pruebas/caso2.in");
		Generador_Salida generador = new Generador_Salida("Pruebas/salida2.out");
		ArrayList<Mesada> arr = new ArrayList<Mesada>();
		int cant;
		procesador.preparar_array(arr);
		Assert.assertEquals(4,cant= generador.cantidad_pilas(arr));
		generador.crear_arch_salida(cant);
	}
	@Test
	void caso3() throws IOException {
		Procesador_entrada procesador = new Procesador_entrada("Pruebas/caso3.in");
		Generador_Salida generador = new Generador_Salida("Pruebas/salida3.out");
		ArrayList<Mesada> arr = new ArrayList<Mesada>();
		int cant;
		procesador.preparar_array(arr);
		Assert.assertEquals(2, cant= generador.cantidad_pilas(arr));
		generador.crear_arch_salida(cant);
	}
	@Test
	void caso4() throws IOException {
		Procesador_entrada procesador = new Procesador_entrada("Pruebas/caso4.in");
		Generador_Salida generador = new Generador_Salida("Pruebas/salida4.out");
		ArrayList<Mesada> arr = new ArrayList<Mesada>();
		int cant;
		procesador.preparar_array(arr);
		Assert.assertEquals(2, cant=generador.cantidad_pilas(arr));
		generador.crear_arch_salida(cant);
	}
}
