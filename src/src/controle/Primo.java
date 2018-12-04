package controle;

import java.util.Scanner;

public class Primo {

		public static void main(String[] args) {
			
			Scanner leitor = new Scanner(System.in);
			int numPrimo;
			int numDivisores = 0;

			System.out.println("Digite um número");
			numPrimo = leitor.nextInt();
			
			for(int i = 1; i <= numPrimo; i++) {
				if(numPrimo % i == 0) {
					numDivisores++;
			}
		}			
			if(numDivisores == 2) {
				System.out.println("O número é primo");
			}else {
				System.out.println("O número não é primo");
		}					
	}		
}