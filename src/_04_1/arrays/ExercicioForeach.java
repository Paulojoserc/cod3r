package _04_1.arrays;

import java.util.Arrays;

public class ExercicioForeach {
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
		for (double notaA : notasAlunoA) {
			totalAlunoA += notaA;
		}
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };
		
		double totalAlunoB = 0;
		for (double notaB : notasAlunoB) {
			totalAlunoB+= notaB;
		}
		System.out.println(totalAlunoB /  notasAlunoB.length);
	}
}
