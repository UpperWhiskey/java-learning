package fundamentos;

public class VariaveisEConstantes {
	public static void main(String[] args) {
		double raio = 4.5;
		final double PI = 3.1416;
		double area = PI * raio * raio;
		
			System.out.println("A área é "+area+"m²." );
			System.out.printf("A área é %f m². \n", area);
			System.out.printf("A área é %.2f m².", area);		
	}
}
