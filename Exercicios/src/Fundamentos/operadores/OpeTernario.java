package Fundamentos.operadores;

public class OpeTernario {
	
	public static void main(String[] args) {
		
		double media = 5.6;
		//String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado";  ou
		String resultadoFinal = media >= 7.0 ?"Aprovado" : media >= 5.0 ? "em recuperação" : "reprovado";
		
		System.out.println("O aluno está " + resultadoFinal);
		
		
		
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		System.out.printf("Tem desconto? %s ", resultado); 
	}

}
