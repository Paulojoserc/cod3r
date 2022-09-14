package arrays.desafio;

import java.util.Locale;
import java.util.Scanner;

public class notas {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Informe a quantidade de notas");
	
	int quantNotas = sc.nextInt();
	
	double[] notas = new double[quantNotas];
	
	for (int i = 0; i < quantNotas; i++) {
		System.out.println("Digite a nota "+(i+1)+": ");
		notas[i] = sc.nextDouble();
	}
	
	double somaNotas = 0;
	
	for (double nota : notas) {
		somaNotas += nota;
		
	}
	System.out.println();
	System.out.printf("A média é : %.2f",somaNotas/quantNotas);
	sc.close();
}
}
