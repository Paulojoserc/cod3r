package _5oo.encapsulamento;

public class Pessoa {
private int idade;
private String nome;
private String sobrenome;

public Pessoa(int idade) {
	setIdade(idade);
}

public Pessoa(String nome, String sobrenome, int idade ) {
	setNome(nome);
	setSobrenome(sobrenome);
	setIdade(idade);
	
}

public String getNome() {
	return nome;
}

public String getSobrenome() {
	return sobrenome;
}

public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}

public String getNomeCompleto() {
	return getNome() + " "+getSobrenome();
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getIdade() {
	return idade;
}
public void setIdade(int novaIdade) {
	novaIdade = Math.abs(novaIdade);
	if(novaIdade >=0 && novaIdade <=120) {
		this.idade = novaIdade;
	}
	
			
}

@Override
public String toString() {
	return "Olá eu sou o " + getNome() + ", e tenho " + getIdade() + " anos.";
}
}
