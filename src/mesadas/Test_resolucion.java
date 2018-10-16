package mesadas;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Test_resolucion {
	
	@Test
	void caso1() throws FileNotFoundException {
		Procesador_entrada procesador = new Procesador_entrada("caso1.in");
		Generador_Salida generador = new Generador_Salida("salida.out");
		ArrayList<Mesada> arr = new ArrayList<Mesada>();
		
		procesador.preparar_array(arr);
		Assert.assertEquals(3, generador.cantidad_pilas(arr));
	}
	@Test
	void caso2() throws FileNotFoundException {
		Procesador_entrada procesador = new Procesador_entrada("caso2.in");
		Generador_Salida generador = new Generador_Salida("salida.out");
		ArrayList<Mesada> arr = new ArrayList<Mesada>();
		
		procesador.preparar_array(arr);
		Assert.assertEquals(4, generador.cantidad_pilas(arr));
	}
	@Test
	void caso3() throws FileNotFoundException {
		Procesador_entrada procesador = new Procesador_entrada("caso3.in");
		Generador_Salida generador = new Generador_Salida("salida.out");
		ArrayList<Mesada> arr = new ArrayList<Mesada>();
		
		procesador.preparar_array(arr);
		Assert.assertEquals(2, generador.cantidad_pilas(arr));
	}
	@Test
	void caso4() throws FileNotFoundException {
		Procesador_entrada procesador = new Procesador_entrada("caso4.in");
		Generador_Salida generador = new Generador_Salida("salida.out");
		ArrayList<Mesada> arr = new ArrayList<Mesada>();
		
		procesador.preparar_array(arr);
		Assert.assertEquals(2, generador.cantidad_pilas(arr));
	}
}
