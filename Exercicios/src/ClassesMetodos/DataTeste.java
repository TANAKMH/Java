package ClassesMetodos;

import java.util.Scanner;

public class DataTeste {
	
	public static void main(String[] args) {
		DesafioClassData i = new DesafioClassData();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Infome um dia:");
		i.dia = entrada.nextInt();
		
		System.out.println("Infome um m�s:");
		i.m�s = entrada.nextInt();
		
		System.out.println("Infome um ano:");
		i.ano = entrada.nextInt();
	
		System.out.println(i.obterDataFormatada());
		
		//ou
//		System.out.printf("A data / m�s / ano: %d/%d/%d%n",
//				i.dia, i.m�s, i.ano);
		entrada.close();

		
		var ii = new DesafioClassData();
		ii.dia = 31;
		ii.m�s = 12;
		ii.ano = 2020;
		System.out.println(ii.obterDataFormatada());
	
/*		System.out.printf("Hoje � dia: %d, no m�s %d,\n no ano %d",
				ii.obterDataFormatada());*/
	
	
	
	}

}
