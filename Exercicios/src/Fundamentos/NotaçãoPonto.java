package Fundamentos;

public class NotaçãoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora"); // Replace vai substituir uma palavra pela outra
		s = s.toUpperCase(); // toUpperCase vai aumentar as letras em maiusculas 
		s = s.concat("!!!");// concat ele ira acrescentar algo a mais
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		// ou
// 		System.out.println("Leo".toUpperCase());
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toLowerCase()//toLower coloca palavras minusculas
				.concat("!!!");
		
		System.out.println(y);
		
		// Tipos primitivos não tem operador
		int a = 3;
		System.out.println(a);
			
	}

}
