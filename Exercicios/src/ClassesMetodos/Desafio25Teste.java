package ClassesMetodos;

public class Desafio25Teste {
	public static void main(String[] args) {
		
		Desconto25Desafio p1 = new Desconto25Desafio("Notebook", 4356.89);
		p1.nome = "Notebook";
//		p1.preco = 4356.89;
//		p1.desconto = 0.25;
		
		var p2 = new Produto("");
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		Desconto25Desafio.desconto = 0.50;
		
		System.out.println(p1.nome + "" + p1.precoComDesconto());
		System.out.println(p2.nome + "" + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto(0);//preco * (1 - p1.desconto);
		double precoFinal2 = p2.precoComDesconto(0.1);//preco * (1 - p2.desconto);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		System.out.printf("Média do Carrinho = %.2f.", mediaCarrinho);
		
	}
		
	}


