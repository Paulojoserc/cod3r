package _02estrutura_controle.exer;

import java.util.Scanner;
/** Refatorar o exerciÌ�cio 04, utilizando a estrutura switch. */
public class Exer5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contadorDeDivisores = 0;
		System.out.println("\nDigite um nÃºmero para verificar se Ã© primo:");
		int numero = sc.nextInt();
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		switch (contadorDeDivisores) {
		case 0:
			System.out.println("\nO nÃºmero " + numero + " Ã© primo");
			break;

		default:
			System.out.println("\nO numero " + numero + " nÃ£o Ã© primo");
			sc.close();

		}
	}
}
