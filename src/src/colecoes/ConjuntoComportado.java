package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		Set<String> aprovados = new TreeSet<>();
		aprovados.add("João");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Joaquim");
		
		for(Object nome: aprovados) {
			System.out.println(nome);
		}		
	}
}
