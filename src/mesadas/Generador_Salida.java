package mesadas;

import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Generador_Salida {
	String path;

	public Generador_Salida(String path) {
		this.path = path;
	}
	
	public int cantidad_pilas(ArrayList<Mesada> arr) {
		int cant=0;
		ArrayList<Mesada> eliminar = new ArrayList<Mesada>();
		while(!arr.isEmpty())
		{
			Mesada pila = new Mesada(arr.get(0));
			arr.remove(0);
			for(Mesada o: arr)
			{
				if (pila.compare(pila,o)>0)
				{
					pila = o;
					eliminar.add(o);
				}	
			}
			arr.removeAll(eliminar);
			eliminar.clear();
			cant++;
		}
		return cant;
	}
	public void crear_arch_salida(int cant_pilas) throws IOException
	{
		PrintWriter fw = new PrintWriter(new FileWriter(path));
		fw.print(cant_pilas);
		fw.close();
	}
}
