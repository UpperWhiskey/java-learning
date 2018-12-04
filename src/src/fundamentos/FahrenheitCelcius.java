package fundamentos;

import javax.swing.JOptionPane;

public class FahrenheitCelcius {
	public static void main(String[] args) {
		String fht = JOptionPane.showInputDialog("Entre com o valor em Fahrenheit: ");
			
			double valor = Double.parseDouble(fht);				
			double c =  (valor - 32) / 1.8;
		
		System.out.println("O valor para Celcius é: " + c);
	}
}
