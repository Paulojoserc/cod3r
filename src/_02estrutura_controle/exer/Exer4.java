package _02estrutura_controle.exer;

import java.util.Scanner;

public class Exer4 {
// Criar um programa que recaba um número e diga se ele é um número primo.
	
	public static void main(String[] args) {
		int contadorDeDivisores = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nDigite um número para verificar se é primo:");
		int numero = sc.nextInt();
		
		for (int i = 2; i < numero; i++) {
			if (numero % i==0) {
				contadorDeDivisores++;
			}
		}
		
		if(contadorDeDivisores == 0) {
			System.out.println("\nO número "+ numero + " é primo");
		}else {
			System.out.println("\nO numero "+ numero + " não é primo");
		}
		sc.close();
	}
}
