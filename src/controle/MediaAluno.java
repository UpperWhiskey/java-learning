package controle;

import javax.swing.JOptionPane;

public class MediaAluno {
	public static void main(String[] args) {
		String nota1 = JOptionPane.showInputDialog("Primeira nota");
		String nota2 = JOptionPane.showInputDialog("Segunda nota");
		
		Double peso1 = Double.parseDouble(nota1);
		Double peso2 = Double.parseDouble(nota2);
		
		double media = (peso1+peso2)/2;
		
		
		if(media > 7 || media == 7) {
			System.out.println("Aluno aprovado com a nota " + media);
		}else if(media < 7 && media > 4) {
			System.out.println("Aluno em recuperação com a nota " + media);
		}else{
			System.out.println("Reprovado");
		}
	}
}
