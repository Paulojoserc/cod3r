package _02estrutura_controle.desafio;

import java.util.Scanner;

public class DesafioDiaSemana {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Digite o nome do dia: ");
	
	String dia = sc.next();
	
	if(dia.equalsIgnoreCase("Domingo")) {
		System.out.println("1�");
	}else if (dia.equalsIgnoreCase("Segunda")) {
		System.out.println("2�");
	}else if (dia.equalsIgnoreCase("Ter�a")|| (dia.equalsIgnoreCase("Terca"))) {
		System.out.println("3�");
	}else if (dia.equalsIgnoreCase("Quarta")) {
		System.out.println("4�");
	}else if (dia.equalsIgnoreCase("Quinta")) {
		System.out.println("5�");
	}else if (dia.equalsIgnoreCase("Sexta")) {
		System.out.println("6�");
	}else if (dia.equalsIgnoreCase("Sabado")|| (dia.equalsIgnoreCase("S�bado"))) {
		System.out.println("7�");
	}else {
		System.out.println("N�o � dia da Semana");
	}
	sc.close();
}
}
