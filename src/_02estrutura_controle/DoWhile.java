package _02estrutura_controle;

import java.util.Scanner;

public class DoWhile {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	String texte = "";
	do {
		System.out.println("Você precisa falar as palavras mágicas...");
		System.out.print("Quer sair? ");
		texte = sc.nextLine();
	}while(!texte.equalsIgnoreCase("por favor"));
	
	sc.close();
}
}
