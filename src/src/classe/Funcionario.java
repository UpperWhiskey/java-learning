package classe;

public class Funcionario {

	String nome;
	double salario;
	String funcao;
	
	 Funcionario(String n, double s, String f) {
		nome    = n;
		salario = s;
		funcao  = f;
	}
	 
	 Funcionario(){
		 
	 }
	 
	 String formatacao() {
		 return String.format("Nome: %s \nSalário: R$%4.2f \nCargo:%s \n", nome, salario, funcao);
	 }
	 
}
