package _04_1arrays;

import java.util.Arrays;

public class Exercicio2 {
public static void main(String[] args) {
	double[] notasAlunoA = new double[3];
	notasAlunoA[0] = 7.9;
	notasAlunoA[1] = 8;
	notasAlunoA[2] = 6.7;

	System.out.println(Arrays.toString(notasAlunoA));
	System.out.println(notasAlunoA[0]);
	System.out.println(notasAlunoA[notasAlunoA.length -1]);
	//System.out.println(notasAlunoA[4]); Erro esta fora das dimenções do array 
	
	double totalAlunoA = 0;
	for (double notaAlunoA: notasAlunoA ) {
		System.out.print(totalAlunoA+= notaAlunoA);
	}
	System.out.println(totalAlunoA / notasAlunoA.length);
	System.out.println();
	final double notaArmazenada = 5.9;
	double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };
	
	double totalAlunoB = 0;
	for (double notaAlunoB: notasAlunoB) {
		System.out.println(totalAlunoB+= notaAlunoB );
		System.out.print(" ");
	}
	System.out.println(totalAlunoB /  notasAlunoB.length);
}
}

