package _6.lambdas;

import java.util.function.Function;

public class Funcao {
public static void main(String[] args) {
	Function<Integer, String> parOUImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";
		
	Function<String, String> oResultadoE = valor -> "O resultado é: "+ valor;
		
	Function<String, String> empolgado = valor -> valor + " !!!";
	
	Function<String, String> duvida = valor -> valor + " ???";
	
	String resultadoFinal1 = parOUImpar.andThen(oResultadoE).andThen(empolgado).apply(32);
		
	System.out.println(resultadoFinal1);
	
	String resultadoFinal2 = parOUImpar.andThen(oResultadoE).andThen(duvida).apply(33);
	
	System.out.println(resultadoFinal2);
	
	System.out.println(parOUImpar.apply(32));
	
}
}
