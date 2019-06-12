package colecoes;

import java.util.Stack;

public class Pilha {
	public static void main(String[] args) {
		Stack <String> pilha = new Stack<>();
		
		pilha.push("The little prince");
		pilha.push("The hobbit");
		pilha.push("Don Quixote");
		
			System.out.println("peek...");
			System.out.println(pilha.peek());
			
			System.out.println("Pop...");
			System.out.println(pilha.pop());
			System.out.println(pilha.pop());
			System.out.println(pilha.pop());
			
			//System.out.println(pilha.pop());
			
	}
}
