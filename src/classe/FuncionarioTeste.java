package classe;

public class FuncionarioTeste {
	public static void main(String[] args) {
		
		Funcionario local = new Funcionario();
			local.nome    = "Cazalbé";
			local.salario = 2000.80;
			local.funcao  = "Programador";
			
		Funcionario posto = new Funcionario("Carlos", 2000.80 , "Programador");
		
		System.out.print(local.formatacao());
		System.out.println(posto.formatacao().toUpperCase());
	}
}
