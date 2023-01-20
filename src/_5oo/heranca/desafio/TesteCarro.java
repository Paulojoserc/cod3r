package _5oo.heranca.desafio;

public class TesteCarro {
public static void main(String[] args) {
	Civic civic = new Civic();
	Ferrari ferrari = new Ferrari(400);
	
	
	System.out.println("Velocidade atual do Civic é: "+civic);
	civic.acelera();
	System.out.println("Velocidade atual do Civic é: "+civic);

	civic.acelera();
	System.out.println("Velocidade atual do Civic é: "+civic);
	System.out.println("-----------");
	System.out.println();
	ferrari.ligarTurbo();
	ferrari.ligarAr();
	System.out.println(ferrari.velocidadeDoAr());	
	ferrari.acelera();
	ferrari.freia();
	System.out.println("Velocidade atual da Ferrari é: "+ferrari);
	ferrari.acelera();
	ferrari.freia();
	System.out.println("Velocidade atual da Ferrari é: "+ferrari);
	ferrari.acelera();
	System.out.println("Velocidade atual da Ferrari é: "+ferrari);
	
}
}
