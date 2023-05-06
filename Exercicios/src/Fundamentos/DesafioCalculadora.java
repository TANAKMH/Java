package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o número: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Informe o número: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("Informe a operação: ");
		String op = entrada.next();
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f",
				num1, op, num2, resultado);
		
		
		entrada.close();
		
		
/*		String valor1 = JOptionPane.showInputDialog("Digite um valor: ");
		String valor2 = JOptionPane.showInputDialog("Digite um valor: ");		
		System.out.println(valor1 + valor2);
		
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		
		double soma = num1 + num2;
		double sub = num1 - num2;
		double multi = num1 * num2;
		double div = num1 / num2;
		double por = num1 % num2;
		
		System.out.printf("Soma é " + soma);
		System.out.printf("\nSub: " + sub);
		System.out.printf("\nA Multi: " + multi);
		System.out.printf("\nA div: " + div);
		System.out.printf("\nA porcentagem: " + por);
*/
	}

}
