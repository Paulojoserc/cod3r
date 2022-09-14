package controle.desafio;

import java.util.Scanner;

public class DesafioWhileNAlunos {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a quantidade de alunos");
	int nNumeroDeAlunos = sc.nextInt();
	
	int nNota =0;
	double nota = 0;
	double total = 0;
	
	while(nNota < nNumeroDeAlunos ) {
		System.out.println("Digite a nota");
		nota = sc.nextDouble();
		
		if (nota <= 10 && nota >=0) {
			total += nota;
			
			nNota++;	
		}
		
	}
	System.out.println("Qual foi o número de notas: "+nNota);
	System.out.printf("Media final: %.1f\n",total/nNota);
	sc.close();
}
}
