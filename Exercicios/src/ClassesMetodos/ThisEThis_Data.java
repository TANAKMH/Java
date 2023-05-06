package ClassesMetodos;

public class ThisEThis_Data {
	int dia;
	int mes;
	int ano;
	
	ThisEThis_Data(){
		/*dia = 1;
		mes = 1;
		ano = 1970;*/
		//this(1, 1, 1970);
	}
	
	ThisEThis_Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		String formatado = "%d/%d/%d%n";
		return String.format(formatado, this.dia, mes, ano);
		//return String.format("%d/%d/%d%n", this.dia, mes, ano);
	}
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}


}
