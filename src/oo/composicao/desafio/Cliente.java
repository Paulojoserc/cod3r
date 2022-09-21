package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	final String name;

	final List<Compra> compras = new ArrayList<>();

	Cliente(String name) {
		this.name = name;
	}
	
	double obterValorTotal() {
		double total = 0;

		for (Compra compra : compras) {
			total += compra.obterValorTotal();
		}
		return total;
	}
}
