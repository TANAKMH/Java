package ClassesMetodos;

public class ValorNulo {
	
	public static void main(String[] args) {
		
		String s1 = "Ola";
		
		System.out.println(s1.concat("!!!!!"));
		
		Data_97 d1 = Math.random() > 0.5 ? new Data_97(): null;
		
		if(d1 != null) {
			d1.mes = 3;
			System.out.println(d1.obterDataFormatada());
		}
		
		String s2 = Math.random()> 0.5 ? "opa" : null;
		
		
		if(s2 != null) {
			System.out.println(s2.concat("?????"));	
		}
	}

}
