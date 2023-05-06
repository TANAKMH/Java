package EstruturasDeControle;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		/*
		 * 1. Criar um programa que receba um número e se ele está entre 0 e
		 * 10 e é par;
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		int num = entrada.nextInt();
		
		if(num >= 0 && num <= 10) {
			if(num %2 == 0) {
				System.out.println("O numero " + num + "está entre 0 e 10 e é um par");
			}else {
				System.out.println("O numero " + num + "está entre 0 e 10 mas não é um par");
			}
		}else {
			System.out.println("O numero " + num + "não está entre 0 e 10");
		}
		

		entrada.close();
			}
		
	}
/*		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int cont = entrada.nextInt();
		
		if(cont % 2 == 0) {
			System.out.println("É PAR o " + cont);
		}else {
			System.out.println("É IMPAR o "+ cont);
		}
		System.out.println("Encerrando...");
		

		entrada.close();*/



