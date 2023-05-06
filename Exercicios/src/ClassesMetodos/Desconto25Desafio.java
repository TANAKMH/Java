package ClassesMetodos;

public class Desconto25Desafio {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	
	
	
	Desconto25Desafio(String nomeinicial){
		nome = nomeinicial;
		
	}
	Desconto25Desafio(String nomeinicial, double precoInicial){
		nome = nomeinicial;
		preco = precoInicial;

		}
		
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	
	}
}