package ClassesMetodos;

public class Data_97 {
	
	int dia;
	int mes;
	int ano;
	
	Data_97(){
		dia = 1;;
		mes = 1;
		ano = 1970;
	}

	Data_97(int diaInicial, int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
}
