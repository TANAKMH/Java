package EstruturasDeControle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);//ctrl + shift + o

		String texto = "por favor";
		
		do {
			System.out.println("Voc� precisa falar"
		+ "\nas palavras m�gicas...");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!");

		entrada.close();
	}

}
