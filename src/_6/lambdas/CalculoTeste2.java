package _6.lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
		Calculo calc = (x, y) -> {
			return x + y;
		};

		System.out.println(calc.exercutar(2, 3));
		calc = (x, y) -> x * y;
		System.out.println(calc.exercutar(2, 3));
	}
}
