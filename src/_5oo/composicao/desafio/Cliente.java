package _5oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	final String name;

	final List<Compra> compras = new ArrayList<>();

	Cliente(String name) {
		this.name = name;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double obterValorTotal() {
		double total = 0;

		for (Compra compra : compras) {
			total += compra.obterValorTotal();
		}
		return total;
	}
}
