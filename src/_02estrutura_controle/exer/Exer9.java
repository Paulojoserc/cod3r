package _02estrutura_controle.exer;

import java.util.Scanner;

public class Exer9 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int maiorValor = 0;
	int contador =0;
	
	do {
		System.out.println("\nDigite um número: ");
		int valor = sc.nextInt();
		
		if (valor > maiorValor) {
			maiorValor=valor;
		}
		contador++;
	}while(contador !=10);
	System.out.println("O maior valor foi: "+maiorValor);
	
	sc.close();
}
}
