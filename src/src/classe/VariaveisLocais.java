package classe;

public class VariaveisLocais {
	
	int a = 2;
	
	void teste () {
		
		int a1 = 2;
		
		System.out.println(a);
		System.out.println(a1);		
		
		if(a1 > 3){
			int a2 = a1;
		}		
	}
	
	void teste2() {
		int a1 = 7;
		System.out.println(a1);
		
			for (int i = 0; i < 10; i++) {			
		
		}
		
		//variável i do for não disponível por estar fora do escopo
		
	}	
}
