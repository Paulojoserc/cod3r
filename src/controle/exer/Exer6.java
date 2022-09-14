package controle.exer;

import java.util.Random;
import java.util.Scanner;

public class Exer6 {
	/**
	 * Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene
	 * um número aleatório em uma variável. O Jogador tem 10 tentativas para
	 * adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade
	 * de tentativas restantes, e imprima se o número inserido é maior ou menor do
	 * que o número armazenado.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int continuar;
		int numerSorteado;
		int tentativas;
		int numero;
		
		do {
			System.out.println("Sorteando número entre 0 e 100...\n");
			Random numeroAleatorio = new Random();
			numerSorteado = numeroAleatorio.nextInt(101);
			
			System.out.println("Começou o jogo! Sera que consegue me vencer?");
			tentativas = 0;
			
			do {
				tentativas++;
				System.out.printf("Tentativa %d: ", tentativas);
				numero = sc.nextInt();
				if (numero > numerSorteado) {
					System.out.printf("\nO número sorteado é menor que %d\n\n", numero);
				}else if(numero<numerSorteado){
					System.out.printf("\nO número sorteado é maior que %d\n\n", numero);
				}else {
					System.out.printf("\nParabêns! Você acertou o número em %d tentativas!\n\n", tentativas);
				}
			}while (numero != numerSorteado);
			
			System.out.println("Digite 0 para sair, ou qualquer outro número para continuar:");
			continuar = sc.nextInt();
		}while(continuar !=0);
		
		sc.close();
	}
}
