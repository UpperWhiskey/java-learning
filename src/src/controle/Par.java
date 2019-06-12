package controle;

import javax.swing.JOptionPane;

public class Par {
	public static void main(String[] args) {
		String num  = JOptionPane.showInputDialog("Insira o número");
		int numero  = Integer.parseInt(num);
		
				if(numero % 2 == 0 && numero < 10 && numero > 0) {
					System.out.print("O número " + numero + " está entre 10 e 0 e é par");
				}else {
					System.out.print("O número " + numero + " não está entre 10 e 0 ou não é par");
				}
			}
		}		
