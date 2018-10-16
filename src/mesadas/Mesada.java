package mesadas;

import java.util.Comparator;

public class Mesada implements Comparator<Mesada>, Comparable<Mesada> {
	int a,b;

	public Mesada(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public Mesada(Mesada m)
	{
		this.a=m.a;
		this.b=m.b;
	}
	@Override
	public int compareTo(Mesada o) {
		return (this.a*this.b)-(o.a*o.b);//comparo por superficie para ordenar el arraylist
	}

	@Override
	public int compare(Mesada o1, Mesada o2) {//comparo buscando que ambos valores sean menores para apilar.
		if ((o1.a<=o2.a&&o1.b<=o2.b)||(o1.a<=o2.b&&o1.b<=o2.a))
			return -1;
		if ((o1.a>=o2.a&&o1.b>=o2.b)||(o1.a>=o2.b&&o1.b>=o2.a))
			return 1;
		return 0;
	}
	
}
