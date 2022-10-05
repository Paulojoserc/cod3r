package lambdas;

public class Produto {
	final String name;
	final double preco;
	final double desconto;

	public Produto(String name, double preco, double desconto) {
		
		this.name = name;
		this.preco = preco;
		this.desconto = desconto;
	}
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return name + " tem preço de R$" + precoFinal;
	}
}
