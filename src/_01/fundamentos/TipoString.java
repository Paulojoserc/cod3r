package _01.fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá Mundo".charAt(0));
		System.out.println("Olá Mundo".charAt(1));
		System.out.println("Olá Mundo".charAt(2));
		System.out.println("Olá Mundo".charAt(3));
		System.out.println("Olá Mundo".charAt(4));
		System.out.println("Olá Mundo".charAt(5));
		System.out.println("Olá Mundo".charAt(6));
		System.out.println("Olá Mundo".charAt(7));
		System.out.println("Olá Mundo".charAt(8));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toLowerCase().endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		String maisUmaFrase = "Nome: "+ nome + "\nSobrenome: "+ sobrenome + "\nIdade: "+idade + "\nSalario: "+ salario +"\n\n";
		System.out.println(maisUmaFrase);
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%,2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
		
		
		
		
		
	}
}
