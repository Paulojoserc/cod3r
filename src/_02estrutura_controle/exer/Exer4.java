package _02estrutura_controle.exer;

import java.util.Scanner;

public class Exer4 {
// Criar um programa que recaba um n�mero e diga se ele � um n�mero primo.
	
	public static void main(String[] args) {
		int contadorDeDivisores = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nDigite um n�mero para verificar se � primo:");
		int numero = sc.nextInt();
		
		for (int i = 2; i < numero; i++) {
			if (numero % i==0) {
				contadorDeDivisores++;
			}
		}
		
		if(contadorDeDivisores == 0) {
			System.out.println("\nO n�mero "+ numero + " � primo");
		}else {
			System.out.println("\nO numero "+ numero + " n�o � primo");
		}
		sc.close();
	}
}
