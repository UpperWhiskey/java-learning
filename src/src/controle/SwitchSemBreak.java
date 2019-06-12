package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		String faixa = "roxa";
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Consegue fazer o 'Bassai/Jion/Kanku-dai'");
		case "marrom":
			System.out.println("Consegue fazer o 'Tekki Shodan'");
		case "roxa":
			System.out.println("Consegue fazer o Heian Godan");
		case "verde":
			System.out.println("Consegue fazer o Heian Yondan");
		case "laranja":
			System.out.println("Consegue fazer o Heian Sandan");
		case "vermelha":
			System.out.println("Consegue fazer o Heian Nidan");
		case "amarela":
			System.out.println("Consegue fazer o Heian Shodan");
		default:
			System.out.println("Bota casaco...");
		}
	}
}
