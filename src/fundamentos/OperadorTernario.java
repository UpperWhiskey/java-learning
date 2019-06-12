package fundamentos;


/** 
 * Classe que indica a utilização dos operados ternários
 * @author marcio
 * @version 1.0.0
 * @since 2.2
 */

public class OperadorTernario {
	public static void main(String[] args) {
		double nota = 8.0;
		String resultado = nota >= 7 ? "Aprovado" : "Recuperação";
		System.out.println(resultado);
	}
}
