package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) { 
		Queue<String> fila = new LinkedList<>();
		
		fila.offer("Maria");		
		fila.offer("João");
		
		System.out.println("Peek/Element...");
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		System.out.println("Poll/Remove...");
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
	}
}
