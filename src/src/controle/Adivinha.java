package controle;

import java.util.Scanner;

public class Adivinha {
	public static void main(String[] args) {			
		
		Scanner scanner = new Scanner(System.in);
		int numCerto = 17;					
		System.out.println("Tente adivinhar o número. Você tem 10 tentativas.");				
		int entrada;
		
		 for(int i = 10; i >= 0; i--){					
			 entrada = scanner.nextInt(); 			 
			 if(numCerto > entrada) {
				 System.out.println("Você errou. O número " + entrada + " é maior que o número correto." + " Você ainda tem " + i + " tentativas");
			 }else if(numCerto < entrada) {
				 System.out.println("Você errou. O número " + entrada + " é menor que o número correto." + " Você ainda tem " + i + " tentativas");
			 }else if(entrada == numCerto){
				System.out.println("Você acertou!");
			 }else {			 			 
				System.out.println("Acabou as tentativas");
			}			 
		}
		scanner.close();
	}
}