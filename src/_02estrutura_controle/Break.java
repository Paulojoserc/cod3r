package _02estrutura_controle;

public class Break {
public static void main(String[] args) {
	for (int i = 1; i < 10; i++) {
		if(i == 5) {
			break;//Quando chegar no 5 ele para o processo
		}
		
		System.out.println(i);
	}
	System.out.println("Fim");
}
}