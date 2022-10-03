package oo.heranca.desafio;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual;
	private int delta = 5;
	
	public Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelera() {
		if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual =  VELOCIDADE_MAXIMA;
		}else {
			velocidadeAtual += getDelta();
		}
	}

	public void freia() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + " KM/h";
	}
}