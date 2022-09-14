package controle.exer;

import java.util.Scanner;
/** Refatorar o exercício 04, utilizando a estrutura switch. */
public class Exer5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contadorDeDivisores = 0;
		System.out.println("\nDigite um número para verificar se é primo:");
		int numero = sc.nextInt();
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		switch (contadorDeDivisores) {
		case 0:
			System.out.println("\nO número " + numero + " é primo");
			break;

		default:
			System.out.println("\nO numero " + numero + " não é primo");
			sc.close();

		}
	}
}
