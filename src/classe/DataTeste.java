package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data nascimento = new Data();
		 
//		nascimento.dia = 8;		 
//		nascimento.mes = 07;
//		nascimento.ano = 1993;		
		
		Data casamento = new Data(8, 9, 2010);
		
		System.out.println(nascimento.formatar());	
		System.out.print(casamento.formatar());
	}
}
