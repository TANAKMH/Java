package ClassesMetodos;

public class DesafioClassData {
	
	int dia;
	int mês;
	int ano;
	
	String obterDataFormatada() {
		return String.format(" %d/%d/%d", dia, mês, ano);
		//ou
		
	/*void imprimirDataFormatada() {
			System.out.println(obterDataFormatada());*/
		}
}
