package controle.exer;

import java.util.Scanner;
//Criar um programa informa se o ano atual � um ano bissexto;
public class Exer2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o ano");
	int ano = sc.nextInt();
	
	if (((ano%4 ==0) && (ano%100 !=0)) || (ano%400==0)) {
		System.out.println("O ano "+ano+" � bissexto ");
	}
	else {
		System.out.println("O ano "+ano+" n�o pe bissexto");
	}
			
	sc.close();
}
}
