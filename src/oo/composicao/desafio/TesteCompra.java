package oo.composicao.desafio;

import oo.composicao.Compra;
import oo.composicao.Item;

public class TesteCompra {
public static void main(String[] args) {
	Cliente c1 = new Cliente(null);
	c1.name = "João Pedro";
	c1.compras.add()
	c1.itens.add(new Item("Caneta", 3, 18.79));

	System.out.println(c1.itens.size());
	System.out.println(c1.obterValorTotal());

}
}
