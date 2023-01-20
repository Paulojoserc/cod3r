package _5oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	final List<Item> itens = new ArrayList<>();

	void adicionarItem(Produto produto, Integer qtde) {
		this.itens.add(new Item(produto, qtde));
	}
	void adicionarItem(String nome, double preco, int qtde) {
		var Produto = new Produto(nome, preco);
		this.itens.add(new Item(Produto, qtde));
	}

	double obterValorTotal() {
		double total = 0;
		for (Item item : itens) {
			total += item.qtde * item.produto.preco;
		}
		return total;
	}
}
