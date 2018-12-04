package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
		//Tipo primitivo booleano
		
		boolean bo1 = false;
		boolean bo2 = true;
		
			System.out.printf("%b %b\n", bo1, bo2);
			
			//Tipos primitivo caracter
			
			char c1 = 'a';
			char c2 = '!';
			char c3 = '\u0050';			
			
			
			System.out.printf("%c %c %c\n", c1, c2, c3);
			
					//Tipos primitivos inteiros
			byte b = 127;
			short s = 32767;									
			int i = 2147483647;			
			long l = 9223372036854775807l;
			
			System.out.printf("%d %d %d %d\n", b,s,i,l);
			
			System.out.println(Integer.toBinaryString(b));
			System.out.println(Integer.toBinaryString(s));
			System.out.println(Integer.toBinaryString(i));
			System.out.println(Long.toBinaryString(l));
			
	}
}