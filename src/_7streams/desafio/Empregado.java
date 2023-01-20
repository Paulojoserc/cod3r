package _7streams.desafio;

public class Empregado {
private String nome;
private double salario;
private double quantDeAnos;
public Empregado(String nome, double salario, double quantDeAnos) {

	this.nome = nome;
	this.salario = salario;
	this.quantDeAnos = quantDeAnos;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}
public double getQuantDeAnos() {
	return quantDeAnos;
}
public void setQuantDeAnos(double quantDeAnos) {
	this.quantDeAnos = quantDeAnos;
}

public Double salarioTotal() {
	return salario * (1+quantDeAnos);
}
}
