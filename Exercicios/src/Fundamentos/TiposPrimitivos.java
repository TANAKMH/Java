package Fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do funcionário.
		
		// Tipos númericos inteiros
		byte anosDeEmpresa = 23;   //-128 ate +127
		short numeroDeVoos = 542;  // +-32767 
		int id = 56789; // ate 2 milhoes
		long pontosAcumulados = 3_124_845_223L;  // numeros longos
			
		// Tipos numericos
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false;//true
		
		// Tipo caractere
		char status = 'A'; // ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias ?" + estaDeFerias);
		System.out.println("Status:" + status);
		
	}
}
