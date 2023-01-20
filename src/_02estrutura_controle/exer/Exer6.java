package _02estrutura_controle.exer;

import java.util.Random;
import java.util.Scanner;

public class Exer6 {
	/**
	 * Jogo da adivinhacÌ§aÌƒo: Tentar adivinhar um nuÌ�mero entre 0 - 100. Armazene
	 * um nuÌ�mero aleatoÌ�rio em uma variaÌ�vel. O Jogador tem 10 tentativas para
	 * adivinhar o nuÌ�mero gerado. Ao final de cada tentativa, imprima a quantidade
	 * de tentativas restantes, e imprima se o nuÌ�mero inserido eÌ� maior ou menor do
	 * que o nuÌ�mero armazenado.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int continuar;
		int numerSorteado;
		int tentativas;
		int numero;
		
		do {
			System.out.println("Sorteando nÃºmero entre 0 e 100...\n");
			Random numeroAleatorio = new Random();
			numerSorteado = numeroAleatorio.nextInt(101);
			
			System.out.println("ComeÃ§ou o jogo! Sera que consegue me vencer?");
			tentativas = 0;
			
			do {
				tentativas++;
				System.out.printf("Tentativa %d: ", tentativas);
				numero = sc.nextInt();
				if (numero > numerSorteado) {
					System.out.printf("\nO nÃºmero sorteado Ã© menor que %d\n\n", numero);
				}else if(numero<numerSorteado){
					System.out.printf("\nO nÃºmero sorteado Ã© maior que %d\n\n", numero);
				}else {
					System.out.printf("\nParabÃªns! VocÃª acertou o nÃºmero em %d tentativas!\n\n", tentativas);
				}
			}while (numero != numerSorteado);
			
			System.out.println("Digite 0 para sair, ou qualquer outro nÃºmero para continuar:");
			continuar = sc.nextInt();
		}while(continuar !=0);
		
		sc.close();
	}
}
