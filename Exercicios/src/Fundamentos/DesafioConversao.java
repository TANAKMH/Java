package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro sal�rio: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		System.out.println("O primeiro salario: " + salario1);
		
		
		System.out.print("\nDigite o segundo sal�rio: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		System.out.println("O segundo salario: " + salario2);
		
		
		System.out.print("\nDigite o terceiro salario: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		System.out.println("O terceiro salario: " + salario3);
		
		entrada.close();
		
		double a = Double.parseDouble(salario1);
		double b = Double.parseDouble(salario2);
		double c = Double.parseDouble(salario3);
		
		double soma = a + b + c;
		
		System.out.println("\n A soma �: " + soma);
		System.out.println("\n A m�dia �: " + soma/3);
				
		
		}

}
