package _6.lambdas;
@FunctionalInterface
public interface Calculo {

	public abstract double exercutar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	static String muitoLegal() {
		return "muito legal";
	}
}
