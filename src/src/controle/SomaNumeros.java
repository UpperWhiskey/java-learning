package controle;

import java.util.Scanner;

public class SomaNumeros {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int somador = 0;
		int numero = 0;

		while(numero > 0){
			System.out.println("Digite algum número para somar");
			numero = scanner.nextInt();
			
			if(numero >= 0) {
			somador+=numero;			
			System.out.println("Soma até agora: " + somador);
			}
		}
		scanner.close();
	}	
}
