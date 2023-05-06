package Fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena %d - %d - %d - %d - %d - %d\n",
				1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f %n", 1234.5678);
		System.out.printf("Nome: %s %n", "João");
		
		
		Scanner entrada = new Scanner(System.in);
		
/* 1 */	System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Nome: " + nome);
		
/* 2 */	System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Sobrenome: " + sobrenome);
		
/* 3 */	System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n",
				nome, sobrenome, idade);
		
		entrada.close(); //No momento que voce parou de mexer no scanner
						 //vc fecha ele
		/*
		 * Linha 20 - Scanner(java.util) é uma importação
		 * para que possamos escrever no console
		 * e a palavra entrada é so uma forma de falar mas 
		 * pode ser outra palavra. O "new" nao foi explicado ainda
		 * so na proxima aula. O "Scanner(System.in);" significa hà 
		 * entrada do sistema , ele vai monitorar tudo aquilo que vc
		 * for digitar
		 * 
		 * Linha 23 - entrada.nextLine: o nextLine so 
		 * é usada se for String
		 * 
		 * Linha 33 - entrada.nextInt: o nextInt é usado para numeros
		 * inteiros
		 */
	}

}
