package EstruturasDeControle;


public class Switch1 {
	
	public static void main(String[] args) {
		
		String faixa = "verde";

		

		// if(bool) ...
		// while(bool) ...
		// for(;bool;) ...
		
		
		// Com o Break
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan ");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break; // ele vai ate o amarelo nao imprimi o default
		default:
			System.out.println("Não sei nada");
//		default:
//		System.out.println("Não sei nada");
			
		}
		System.out.println("Fim!");
		// Sem o Break
		int idade = 2;
		switch(idade) {
		case 3:
			System.out.println("Sabe programar");
		case 2: 
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe respirar");
			
			
		}
	}

}
