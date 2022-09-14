package controle.exer;

import java.util.Scanner;
//Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
public class Exer1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um número");
	int num = sc.nextInt();
	
	if (num > 0 && num<=10) {
		if(num%2 == 0) {
			System.out.println("Número é par");
		}else {
			System.out.println("Número é impar");
		}
	}else {
		System.out.println("Número invalido");
	}
	
	
	sc.close();
}
}
