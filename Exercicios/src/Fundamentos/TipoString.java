package Fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Ol� pessoal".charAt(2));
		
		String s = "Boa tarde " ;
		System.out.println(s.concat("!!"));
		System.out.println(s + "!!!!");
		System.out.println(s.startsWith("Bom"));
		
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE "));
		System.out.println(s.length());
		System.out.println(s.equals("Boa tarde !"));
		System.out.println(s.equalsIgnoreCase("bOa tArDe !"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 23;
		var salario = 12_345.948;
		
		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome 
				+ "\nidade: "	+ idade + "\nsalario: " + salario + "\n\n";
		System.out.println(maisUmaFrase);
	
		//ou
		
/*		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome 
		+ "\nidade: "	+ idade + "\nsalario: " + salario + "\n\n");
		// ou
	
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.3f.",
				nome, sobrenome, idade, salario);*/
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.3f.", nome, 
				sobrenome, idade, salario);
		System.out.println(frase);
		/*System.out.printf("Nome: %s", nome);
		System.out.printf("Nome: %s %s", nome, sobrenome);
		System.out.printf("Nome: %s %s %s", nome, sobrenome, idade);
		System.out.printf("Nome: %s %s %s %s", nome, sobrenome, idade, salario);*/
		
		System.out.println("Frase qualquer".contains("rase"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
	}
	/* 1-Bom dia  /    2-Boa noite 
	 * - s.sartsWith("bom") � falso pq o bom � com maiusculo
	 * se fosse maiuscula seria verdadeiro (Booleano)
	 * tradu�a�(inicia com)
	 * 
	 * - s.endWith("noite") � verdadeiro pq ele termina com noite
	 * se fosse dia seria falso (Booleano) 
	 * tradu�a�(final com)
	 * 
	 * - s.length ele vai dizer quantas palavras tem na frase
	 * 
	 * - s.equals ele vai ver se esta igual
	 * tradu�a�(igual)
	 * 
	 * - s.equalsIgnoreCase ele vai ver se esta igual mesmo estando com
	 * letras maiuscula ou minusculas
	 * tradu�a�(igual ignorando os casos)
	 * 
	 * 
	 * Linha 28 - outra forma de fazer 
	 * 
	 * Linha 46 - "Frase qualquer".contais(rase)
	 * esse contais vai dizer se tem essa palavra na frase por exemplo
	 * esse rase � da palavra Frase -- F(rase)
	 * 
	 * Linha 47 - indexOf vai dizer aonde come�a a palavra qual ( esse "qual"
	 * � da palavra "qualquer")
	 * 
	 * Linha 48 - substring - quando voce coloca um numero int
	 * ele vai mostar qual a palavra esta , exemplo:
	 * System.out.println("Frase qualquer".substring(6)) a partir da posi��o
	 * 6 � o "q" mas ele mostrara "qualquer"
	 * 
	 * Linha 49 - � mesma da linha 48 s� que tera um numero inicial e final
	 */
}
