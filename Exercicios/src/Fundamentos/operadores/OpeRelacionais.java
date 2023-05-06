package Fundamentos.operadores;

public class OpeRelacionais { 
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		System.out.println(a == b);
		//System.out.println('\u0061');
		
		System.out.println(3 > 4); // maior
		System.out.println(3 >= 4);// maior igual
		System.out.println(3 < 4);// menor
		System.out.println(30 <= 7);// menor igual
		System.out.println(30 != 7);// diferente
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? "+ temDesconto);
	}

}
