package classe;

public class ValorVsReferencia {
	static void porValor(double num) {
		num++;
	}
	
	static void porReferencia(Produto produto) {
		produto.preco++;
	}
	
	public static void main(String[] args) {
		double num =1;
		//Entendi foi poarr nehuma...
		final Produto produto = new Produto("Caneta", 1);
		Produto produto2 = produto;		
		produto2.nome = "lapis";
		//A tá... Entendi...
		
		porValor(num);
		porReferencia(produto);
		
		System.out.println(num);
		System.out.println(produto.preco);
		System.out.println(produto.nome);
	}	
}
