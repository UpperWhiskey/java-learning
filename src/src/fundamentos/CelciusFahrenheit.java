package fundamentos;

import javax.swing.JOptionPane;

public class CelciusFahrenheit {
	public static void main(String[] args) {
		String fht = JOptionPane.showInputDialog("Entre com o valor em Celcius: ");
		
		double valor = Double.parseDouble(fht);	
		
		double f =  1.8 * valor + 32;
		
		System.out.println(f);
		
	}
}
