package Arrays.Desafio;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.print("Quantas notas: ");
		
		int qntdNotas = entrada.nextInt();
		double[] notas = new double [qntdNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota " + (i + 1) + ":");
			notas[i] = entrada.nextDouble();
		}
		System.out.println(Arrays.toString(notas));
		
		double total = 0;
		for (double nota : notas) {
			total += nota;
		}
		double media = total / notas.length;
		System.out.println(" A média é: " + media + "!!!" );
		
		entrada.close(); 
	}
}
