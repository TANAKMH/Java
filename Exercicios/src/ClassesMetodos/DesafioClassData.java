package ClassesMetodos;

public class DesafioClassData {
	
	int dia;
	int m�s;
	int ano;
	
	String obterDataFormatada() {
		return String.format(" %d/%d/%d", dia, m�s, ano);
		//ou
		
	/*void imprimirDataFormatada() {
			System.out.println(obterDataFormatada());*/
		}
}
