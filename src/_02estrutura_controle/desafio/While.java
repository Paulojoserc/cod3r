package _02estrutura_controle.desafio;

import java.util.Scanner;

public class While {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String comando = sc.next();
	while (comando.equalsIgnoreCase("sair")) {
		System.out.println("Digitou: "+comando);
	}
	
	sc.close();
}
}
