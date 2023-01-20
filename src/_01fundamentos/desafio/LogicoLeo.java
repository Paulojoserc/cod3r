package _01fundamentos.desafio;

public class LogicoLeo {
	public static void main(String[] args) {

		boolean ter = true;
		boolean quin = true;

		boolean comprou50 = (ter && quin);

		boolean comprou32 = (ter ^ quin);

		boolean sorvete = (ter || quin);

		System.out.println("Comprou a TV 50\"?" + comprou50);
		System.out.println("Comprou a TV 50\"?" + comprou32);
		System.out.println("Comprou a TV 50\"?" + sorvete);

		System.out.println("Mais saudável? " + !sorvete);
	}

}
