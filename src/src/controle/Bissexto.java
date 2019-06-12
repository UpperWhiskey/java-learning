package controle;

import javax.swing.JOptionPane;

public class Bissexto {
	public static void main(String[] args) {
		String ano  = JOptionPane.showInputDialog("Insira o ano: ");
		int anoBi  = Integer.parseInt(ano);
		
		if(anoBi % 400 == 0) {
			System.out.println(anoBi + " é bissexto");
		}else if((anoBi % 4 == 0) && (anoBi % 100 != 0)){
			System.out.println(anoBi + " é bissexto");
		}else {
			System.out.println(anoBi + " não é bissexto");
		}
	}
}



