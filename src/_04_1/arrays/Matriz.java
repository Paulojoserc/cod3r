package _04_1.arrays;


import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Matriz {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner  sc = new Scanner(System.in);
	
	System.out.println("Digite a quantidade de Alunos");
	int quantAluno = sc.nextInt();
	System.out.println("Digite a quantidade de notas");
	int quantNotas = sc.nextInt();
	
	double[][] notasDaTurma = new double [quantAluno][quantNotas];
	
	double total = 0;
	
	for(int a = 0; a < notasDaTurma.length; a++) {
		for (int n = 0; n < notasDaTurma.length; n++) {
			System.out.printf("Informe a nota %d do aluno %d: ", n+1, a+1);
			notasDaTurma[a][n]= sc.nextDouble();
			total+= notasDaTurma[a][n];
		}
	}
	double media = total / (quantAluno * quantNotas);
	System.out.println("Media da turma é " +media);
	
	for (double[] notasDoAluno : notasDaTurma) {
		System.out.println(Arrays.toString(notasDoAluno));
	}
	
	
	sc.close();
}
}
