package _03classes_metodos;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc a1 = new AreaCirc (10, 0);
		a1.raio = 10;
		
		
		
		System.out.println(a1.area());
		
		System.out.println(AreaCirc.area(100));
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
	}
	
	
}
