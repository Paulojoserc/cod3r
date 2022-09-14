package controle.desafio;

import java.util.Scanner;

public class DesafioDiaSemana {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Digite o nome do dia: ");
	
	String dia = sc.next();
	
	if(dia.equalsIgnoreCase("Domingo")) {
		System.out.println("1º");
	}else if (dia.equalsIgnoreCase("Segunda")) {
		System.out.println("2º");
	}else if (dia.equalsIgnoreCase("Terça")|| (dia.equalsIgnoreCase("Terca"))) {
		System.out.println("3º");
	}else if (dia.equalsIgnoreCase("Quarta")) {
		System.out.println("4º");
	}else if (dia.equalsIgnoreCase("Quinta")) {
		System.out.println("5º");
	}else if (dia.equalsIgnoreCase("Sexta")) {
		System.out.println("6º");
	}else if (dia.equalsIgnoreCase("Sabado")|| (dia.equalsIgnoreCase("Sábado"))) {
		System.out.println("7º");
	}else {
		System.out.println("Não é dia da Semana");
	}
	sc.close();
}
}
