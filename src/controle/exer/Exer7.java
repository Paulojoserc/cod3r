package controle.exer;

import java.util.Scanner;

public class Exer7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int soma = 0;

		while (num >= 0) {
			System.out.println("Digite um n�mero");
			num = sc.nextInt();

			if (num >= 0) {
				soma += num;
				System.out.println("A soma � " + soma);
			}

		}
		sc.close();
	}
}
