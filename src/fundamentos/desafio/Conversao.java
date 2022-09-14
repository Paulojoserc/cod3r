package fundamentos.desafio;

import java.util.Scanner;

public class Conversao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro salário");
		String salario1 = sc.nextLine().replace(",", ".");

		System.out.println("Digite o segundo salário");
		String salario2 = sc.nextLine().replace(",", ".");

		System.out.println("Digite o terceiro salário");
		String salario3 = sc.nextLine().replace(",", ".");

		double sal1 = Double.parseDouble(salario1);

		double sal2 = Double.parseDouble(salario2);

		double sal3 = Double.parseDouble(salario3);

		double soma = sal1 + sal2 + sal3;

		System.out.println("A soma dos salário é: " + soma);

		System.out.println("A média dos salários é: " + soma / 3);

		sc.close();
	}
}
