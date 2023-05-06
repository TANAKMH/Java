package EstruturasDeControle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite aqui: ");
		
		String dataSemana = entrada.next();
		
		if(dataSemana.equals("Domingo")) {
			System.out.println(1);
		}else if(dataSemana.equalsIgnoreCase("Segunda")) {
			System.out.println(2);
		}else if(dataSemana.equalsIgnoreCase("Terça") 
				|| "Terca".equalsIgnoreCase(dataSemana)) {
			System.out.println(3);
		}else if(dataSemana.equalsIgnoreCase ("Quarta")) {
			System.out.println(4);
		}else if(dataSemana.equalsIgnoreCase("Quinta")) {
			System.out.println(5);
		}else if(dataSemana.equalsIgnoreCase("Sexta")) {
			System.out.println(6);
		}else if(dataSemana.equalsIgnoreCase("Sabado") 
				|| "Sábado".equalsIgnoreCase(dataSemana)) {
			System.out.println(7);
		}else {
			System.out.println("Dia inválido!");
		}
		//ou 
		//if("domingo".equalsIgnoreCase(dataSemana))
		//	  System.out.println(1);
		// equalsIgnoreCase ignora as letras maiusculas e minusculas
		
		entrada.close();
	}

}
