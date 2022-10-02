package oo.encapsulamento;

public class PessoaTeste {
public static void main(String[] args) {
	Pessoa p1 = new Pessoa("Paulo", "Costa", -45);
	p1.setIdade(250); // alterar
	
	System.out.println(p1.getIdade()); //ler
	System.out.println(p1.toString()); //toString
	System.out.println(p1.getNomeCompleto()); // atributo calculado
}
}
