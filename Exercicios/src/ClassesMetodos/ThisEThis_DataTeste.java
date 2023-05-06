package ClassesMetodos;

public class ThisEThis_DataTeste {

	public static void main(String[] args) {
		
		ThisEThis_Data d1 = new ThisEThis_Data();
		d1.obterDataFormatada();
		 /*d1.dia = 4;
		d1.mes = 07;
		d1.ano = 2002;*/
		
		var d2 = new ThisEThis_Data();
		d2.dia = 31;
		d2.mes = 8;
		d2.ano = 2007;
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		d1.imprimirDataFormatada(); 
		d2.imprimirDataFormatada();
	}
}
