package controle.exer;

import java.util.Scanner;
//Criar um programa que receba um n�mero e verifique se ele est� entre 0 e 10 e � par;
public class Exer1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um n�mero");
	int num = sc.nextInt();
	
	if (num > 0 && num<=10) {
		if(num%2 == 0) {
			System.out.println("N�mero � par");
		}else {
			System.out.println("N�mero � impar");
		}
	}else {
		System.out.println("N�mero invalido");
	}
	
	
	sc.close();
}
}
