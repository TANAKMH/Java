package Fundamentos.operadores;

public class OpeTernario {
	
	public static void main(String[] args) {
		
		double media = 5.6;
		//String resultadoParcial = media >= 5.0 ? "em recupera��o" : "reprovado";  ou
		String resultadoFinal = media >= 7.0 ?"Aprovado" : media >= 5.0 ? "em recupera��o" : "reprovado";
		
		System.out.println("O aluno est� " + resultadoFinal);
		
		
		
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "N�o.";
		System.out.printf("Tem desconto? %s ", resultado); 
	}

}
