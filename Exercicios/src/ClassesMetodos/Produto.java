package ClassesMetodos;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	
	
	
	Produto(String nomeinicial){
		nome = nomeinicial;
		
	}
	Produto(String nomeinicial, double precoInicial,
			double descontoInicial){
		nome = nomeinicial;
		preco = precoInicial;
		desconto = descontoInicial;
		}
		
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	
	}
}
	
/*	double precoDeDocumento(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	
	}
	// ou
	float precoDeDocumento() {
			return (float) (preco * (1 - desconto ));
	}*/
