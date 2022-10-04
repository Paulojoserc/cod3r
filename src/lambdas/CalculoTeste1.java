package lambdas;

public class CalculoTeste1 {
public static void main(String[] args) {
	Somar somar = new Somar();
	Multiplicar mult = new Multiplicar();
	
	System.out.println(somar.exercutar(5, 10));
	System.out.println(mult.exercutar(5, 10));
}
}
