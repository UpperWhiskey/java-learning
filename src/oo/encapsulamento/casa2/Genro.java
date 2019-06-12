package oo.encapsulamento.casa2;


import oo.encapsulamento.casa1.Sogra;
//Sessão dos imports 
import oo.encapsulamento.casa1.Sogro;

public class Genro {
	private String segredo = "Sogra fala demais";
	
	public static void main(String[] args) {
		Genro euMesmo = new Genro();
		System.out.println("Nunca falarei... " + euMesmo.segredo);
		
		Filha meuAmor = new Filha();
		System.out.println(meuAmor.segredoDoCasal);
		
		Sogro sograo = new Sogro();
		System.out.print(sograo.gostaDeCerveja);
		
		//Sogra sogrinha = new Sogra();
		//System.out.println(sogrinha.segredoDefamilia);
		
	}
}