package Fundamentos.operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		// Trabalho na terça ( V ou F )
		// Trabalho na quinta ( V ou F )
		
		boolean trabalho1 = false;  // pode trocar 
		boolean trabalho2 = false;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		// Operador Unário !
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comrprou Tv 50\"? " + comprouTv50);
		System.out.println("Comprou Tv 32\"?" + comprouTv32);
		System.out.println("Comprou Sorvete\"?" + comprouSorvete);
		System.out.println("Comprou Sorvete\"?" + comprouSorvete);
		
		System.out.println("Mais saudavel? " + maisSaudavel);
	}

}
