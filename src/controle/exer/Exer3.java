package controle.exer;

import java.util.Scanner;

public class Exer3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite a primeira nota");
	double nota1 = sc.nextDouble();
	System.out.println("Digite a segunda nota");
	double nota2 = sc.nextDouble();
	double media = (nota1+nota2)/2;
	if (media>=7.0) {
		System.out.println("Aprovado");
	}else if(media<=6.9 && media >4.0){
		System.out.println("Recupera��o");
	}else {
		System.out.println("Reprovado");
	}
	
	
	
	
	sc.close();
}
}
