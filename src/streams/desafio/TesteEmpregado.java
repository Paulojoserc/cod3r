package streams.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class TesteEmpregado {
public static void main(String[] args) {
	Empregado em1 = new Empregado("Paulo", 1000, 1);
	Empregado em2 = new Empregado("João", 1800, 2);
	Empregado em3 = new Empregado("Maria", 2000, 1);
	Empregado em4 = new Empregado("Ana", 1500, 5);
	Empregado em5 = new Empregado("Layla", 1200, 4);
	
	List<Empregado> empregados = Arrays.asList(em1, em2, em3, em4, em5);
	
	Predicate<Empregado> anos = em -> em.getQuantDeAnos() >=2 && em.getSalario() >=1500;
	Function<Empregado, String> tempoDeEmpresa = em -> "Parabéns "+em.getNome() + "! pelo seu tempo dedicado a empresa!";
	empregados.stream().filter(anos).map(tempoDeEmpresa).forEach(System.out::println);
	
	
}
}
