package ClassesMetodos;

import java.util.Scanner;

public class DataTeste {
	
	public static void main(String[] args) {
		DesafioClassData i = new DesafioClassData();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Infome um dia:");
		i.dia = entrada.nextInt();
		
		System.out.println("Infome um mês:");
		i.mês = entrada.nextInt();
		
		System.out.println("Infome um ano:");
		i.ano = entrada.nextInt();
	
		System.out.println(i.obterDataFormatada());
		
		//ou
//		System.out.printf("A data / mês / ano: %d/%d/%d%n",
//				i.dia, i.mês, i.ano);
		entrada.close();

		
		var ii = new DesafioClassData();
		ii.dia = 31;
		ii.mês = 12;
		ii.ano = 2020;
		System.out.println(ii.obterDataFormatada());
	
/*		System.out.printf("Hoje é dia: %d, no mês %d,\n no ano %d",
				ii.obterDataFormatada());*/
	
	
	
	}

}
