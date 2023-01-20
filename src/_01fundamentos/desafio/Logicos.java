package _01fundamentos.desafio;

import java.util.Scanner;

public class Logicos {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//Trabalho na terça (V ou F)
	//TRabalho na quinta (V ou F)
	
	// Se trabalha os dois dias vai compra uma tv de 50 polegas no fim de semana tomou sorvete
	// Se apenas uma der certo vai compra uma tv de 32 polegas tomou sorvete
	// caso nem um deu certo ficou com fome
	
	System.out.println("Você trabalhou terça");
	boolean ter = sc.nextBoolean();
	System.out.println("Você trabalhou quinta");
	boolean quin = sc.nextBoolean();
	
	
	boolean comprou50 = (ter && quin );
	
	boolean comprou32 = (ter ^ quin );
	
	boolean sorvete = (ter || quin);
	
	System.out.println("A familia comorpou a tv de 50 " + comprou50);
	System.out.println("A familia comprou a tv de 32 " + comprou32);
	System.out.println("A familia tomou sorvete " + sorvete);
	
	System.out.println("Mais saudável? "+ !sorvete);
	sc.close();
	
}
}
