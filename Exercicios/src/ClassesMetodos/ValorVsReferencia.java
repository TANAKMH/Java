package ClassesMetodos;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a;// atribui��o por valor(Tipo Primitivo)
		
		a++;
		b--;
		System.out.println(a + " " + b);
		
		Data_97 d1 = new Data_97(1, 6, 2022);
		Data_97 d2 = d1; // atribui��o por referencia(Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}
	static void voltarDataParaValorPadrao( Data_97 d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
		
		
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
}