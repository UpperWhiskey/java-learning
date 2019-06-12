package fundamentos;

import javax.swing.JOptionPane;

public class IndiceMassaCorporal {
	public static void main(String[] args) {
		String pes = JOptionPane.showInputDialog("Insira o peso");
		String alt = JOptionPane.showInputDialog("Insira a altura");
		
		double peso = Double.parseDouble(pes);
		double altura = Double.parseDouble(alt);
		
		double imc = peso / Math.pow(altura, 2);	
		
			System.out.println("Seu indíce atual é: "+imc);
		
	}
}
