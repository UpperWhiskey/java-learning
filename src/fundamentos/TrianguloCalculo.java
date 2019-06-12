package fundamentos;

import javax.swing.JOptionPane;

public class TrianguloCalculo {
	public static void main(String[] args) {
		String bas  = JOptionPane.showInputDialog("Insira a base");
		String alt  = JOptionPane.showInputDialog("Insira a altura");
		
		double base   = Double.parseDouble(bas);
		double altura = Double.parseDouble(alt);
		
		double area   = (base * altura) / 2;
		
			System.out.println("A área total é: " + area);		
	}
}