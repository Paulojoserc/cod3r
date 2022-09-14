package classe;

import java.util.Scanner;

public class DataTeste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Data d1 = new Data();
		System.out.println("Digite o dia");
		d1.dia = sc.nextInt();
		
		System.out.println("Digite o mês");
		d1.mes = sc.nextInt();
		
		System.out.println("Digite o ano");
		d1.ano = sc.nextInt();
		
		var d2 = new Data(31,12,2020);
		
	
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println("A data é "+d1.dia+"/"+d1.mes+"/"+d1.ano);
		System.out.println(d2.obterDataFormatada());
		System.out.println(dataFormatada1);
		
		d1.imprinirDataFormatada();
		d2.imprinirDataFormatada();
		sc.close();
	}
}
