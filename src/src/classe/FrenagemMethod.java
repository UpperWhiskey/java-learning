package classe;

import javax.swing.JOptionPane;

public class FrenagemMethod {
	
	
	FrenagemMethod(){}	
	
	double calculoFrenagem(double v, double u){		 			
		String f = JOptionPane.showInputDialog("Instante da frenagem: ");			
		double d = Double.parseDouble(f);
		d = Math.pow(90, 2) / (250*0.8);
		
		return d;
	}
	
}
