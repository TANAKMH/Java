package EstruturasDeControle;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		/*Criar um programa informa se o ano atual � um ano 
		 * bissexto;
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o ano:");
		int ano = entrada.nextInt();
		
		int bissexto = ano % 4;
		
		if(bissexto == 0) {
			System.out.println(ano + "� um ano bissexto");
		}else {
			System.out.println(ano + "n�o � um ano bissexto" );
		}
		

		entrada.close();
	}

}
