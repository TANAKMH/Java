package EstruturasDeControle;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		/*
		 * 1. Criar um programa que receba um n�mero e se ele est� entre 0 e
		 * 10 e � par;
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		int num = entrada.nextInt();
		
		if(num >= 0 && num <= 10) {
			if(num %2 == 0) {
				System.out.println("O numero " + num + "est� entre 0 e 10 e � um par");
			}else {
				System.out.println("O numero " + num + "est� entre 0 e 10 mas n�o � um par");
			}
		}else {
			System.out.println("O numero " + num + "n�o est� entre 0 e 10");
		}
		

		entrada.close();
			}
		
	}
/*		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um n�mero: ");
		int cont = entrada.nextInt();
		
		if(cont % 2 == 0) {
			System.out.println("� PAR o " + cont);
		}else {
			System.out.println("� IMPAR o "+ cont);
		}
		System.out.println("Encerrando...");
		

		entrada.close();*/



