package ClassesMetodos;

//import java.util.Scanner;

public class DataTesteDesafio97 {
	public static void main(String[] args) {
	/*	Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o dia:");
		i.dia = entrada.nextInt();
		entrada.close();*/
		Data_97 d1 = new Data_97();
		d1.ano = 2021;
		
		var ii = new Data_97(31, 12, 2020);
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(ii.obterDataFormatada());
		
		d1.imprimirDataFormatada();
		ii.imprimirDataFormatada();
	
		
		

	}

}
