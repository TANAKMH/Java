package Fundamentos.operadores;

public class OpeLogicos {

	public static void main(String[] args) {
		
		boolean condicao1= true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!condicao1);
		System.out.println(!!condicao1);
		System.out.println(!condicao2 + "\n");
		
		System.out.print("Tabela verdade E (AND) abaixo \n");
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.print("\nTabela verdade OU (OR) abaixo \n");
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.print("\nTabela verdade OU Exclusivo (XOR) abaixo \n");
		
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.print("\nTabela verdade NOT \n");
		
		System.out.println(!true);
		System.out.println(!!true);
		System.out.println(!false);
		System.out.println(!!false);
		
	}
}
