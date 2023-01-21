package _03classes_metodos.desafio;

public class Jantar {
	public static void main(String[] args) {
		Comida c1 = new Comida("Arroz", 0.180);
		Comida c2 = new Comida("Feijão", 0.300);
		
		Pessoa p = new Pessoa("João", 99.80);
		
		System.out.println(p.dadosPessois());
		
		p.comer(c1);
		
		System.out.println(p.dadosPessois());
		
		p.comer(c2);
		System.out.println(p.dadosPessois());
	}
}
