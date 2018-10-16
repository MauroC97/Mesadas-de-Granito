package mesadas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Procesador_entrada {
	String path;

	public Procesador_entrada(String path) {
		this.path = path;
	}
	
	public void preparar_array(ArrayList<Mesada> arr) throws FileNotFoundException {
		Scanner sc= new Scanner(new File(path));
		int tam=sc.nextInt();
		
		for(int i=0;i<tam;i++)
		{
			arr.add(new Mesada(sc.nextInt(),sc.nextInt()));
		}
		Collections.sort(arr);
		Collections.reverse(arr);//mayor a menor
		sc.close();
	}
	
}
