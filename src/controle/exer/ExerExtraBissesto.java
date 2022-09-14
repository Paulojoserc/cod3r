package controle.exer;

import java.util.Scanner;

public class ExerExtraBissesto {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano");
		int ano = sc.nextInt();
		System.out.println("Digite o ultimo ano");
		int ultomoAno = sc.nextInt();
		int cont = 0;
		
		for(; ano <=ultomoAno;ano++) {
						
			if (((ano%4 ==0) && (ano%100 !=0)) || (ano%400==0)) {
				System.out.println("O ano "+ano+" é bissexto ");
				cont++;
			}
		}
		System.out.println("Qunatos anos são bissexto de "+cont);
		sc.close();
	}
	}

