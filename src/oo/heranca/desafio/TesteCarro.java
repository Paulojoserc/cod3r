package oo.heranca.desafio;

public class TesteCarro {
public static void main(String[] args) {
	Civic civic = new Civic();
	Ferrari ferrari = new Ferrari();
	
	
	System.out.println("Velocidade atual do Civic é: "+civic);
	civic.acelera();
	civic.acelera();
	System.out.println("Velocidade atual do Civic é: "+civic);
	System.out.println("-----------");
	System.out.println();
	System.out.println("Velocidade atual da Ferrari é: "+ferrari);
	ferrari.acelera();
	ferrari.acelera();
	System.out.println("Velocidade atual da Ferrari é: "+ferrari);
	
}
}
